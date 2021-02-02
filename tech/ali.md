[Home](../README.md)

## Often Used features 

For managing database using a nice GUI, can go to Data Management 

object storage service for managing and serving up files

elastic container service -> instances to see all pods (filtered by geography)
buildkite agents are in hong kong 
3 api hosting servers in shanghai 

elastic container instance

## Resource overview 

4 ecs instances 

12 oss buckets

1 apsaraDB RDBMS instance 

## terraaform 

every terraform file has a 
backend "oss" which puts terraform files into a bucket 

also has 
provider "alicloud"

### OSS

each OSS bucket defined in Global/OSS/main.tf
  with a resource declaration, second label being the bucket name 
    acl set here to private or public-read
    some have encryption with server_side_encryption_rule
    
### RAM

managed in Global/RAM
access keys folder has git keys
all users defined with main.tf
  resource "alicloud_ram_user" <username> 
    name, display_name, and comments defined 
 group membership defined with "alicloud_ram_group_membership" resources

access keys provided for some users

### K8S

k8s/CEN/main
  defines alicloud_cen_instance_attachment called k8s
    instance_id, child_instance_id, region_id
    
k8s/container service/main.tf
  managed kumbernetes resource (but commented out)
  
### CI
  ECS
    defines resource alicloud_instance for buildkite agent
      image_id (docker image)
      instance type - preset VM
      security_groups - for access management
      instance_name
      disk size
      charge - prepaid
      vswitch_id - reads from remote_state.vpc.outputs
      user_data - points to a script file
        ali login info, s3 login info, github login info, buildkite api token
      apt gets docker, buildkite
      curls a couple tools
      then uses systemctl to start the buildkite agents
    defines EIP resource for CI 
      charge_type - pay by traffic
      bandwidth
      name 
    defines EIP association resource 
      allocation_id
      instance_id
  VPC
    defines alicloud_vpc ci_vpc resource
    and alicloud_vswitch that accompanies it 
    
### MongoDB (and redis and Postgres)
  CEN - resource cen_instance_attachment "mongodb"
    instance_id (taken from output cen.cen_instance_id)
    child_instance_id (taken from output vpc.outputs.mongodb_vpc_id)
    child_instance_region shanghai
  MongoDB - resource "alicloud_mongodb_instance" "mongodb"
    storage size
    vm template
    vswitch_id - vpc.outputs.mongodb_switch_id
    account info 
    backup periods 
    payment - prepaid
    when to maintain 
  VPC - resource alicloud_vpc called mongodb_vpc
    and alicloud_vswitch "mongodb_vswitch"
    
 Postgres has alicloud_db_instance 
 vs
 Services/CoreAPI has alicloud_db_database "core_api"

## definitions

Apsara - Ali's online db service 

ACK cluster - Aliyun container service for kubernetes 
we run 1 ACK cluster - standard managed kubernetes 
  running 3 nodes 

Elastic computing - concept in cloud - resources easily scaled up and down 
scale processing power, storage, bandwidth, etc
we have 3 ECS disks 

SLB - server load balancer
we have 2 SLB/ELBs both for k8s clusters 
slbs have 2 certificates associated with them
  have domain name, name is optivisioncare.cn, ssl certificates 

VPC - virtual private cloud - isolated virtual network 
control ip address range 
  VSwitch - network device - creates subnets in VPC - given a block of IPs
  one vswitch per api host, one for mongodb, one for redis, one for postgres, one for b-staging? 
one VPC for each db, one for staging, and one for staging-b
VPCs bound to CENs
we have 2 vpcs in HK, one for vpc staging, and one for buildkite

Route tables - used by VSwitches 
hk has 2 vpc route tables and 2 vswitches

we have 1 replicaset, which is under apsara for mongodb
replicaset - k8s concept that ensures a certain number of identical pods are running at the same time
rs is configured with a yaml 

3 ECS Instances - 3 k8s workers 
hk has 1 ECS instance for buildkite agent 

1 cloud assistant - which is a script that runs shell commands
we have one which does systemctl stop kubelet.service
  
security groups - one group for k8s nodes, alicloud, sg, redis, postgres, and b-staging

CEN - cloud enterprise network - facilitates comms between VPCs

EIP - elastic IP - static IPv4 addresses for cloud computing 
associated with cloud account 
makes it reachable from internet 
we have 3 EIPs - pay by traffic 
  2 NAT gateways - network address translation - connect intranet to extranet (internet)
  1 SLB instance - load balancer
  
we have 2 NAT gateways - 1 for vpc staging and one for b-staging-vpc 

CBWP - common bandwidth package used with EIP

ENI - elastic network interface - virtual network card 
  5 enis in shanghai, each given private ip address, associated with vpc/vswitch, mac address, geographical location
  1 eni in HK
  
managed kubernetes - services vary from provider to provider 
e.g. canonical manages entire cluster for you
e.g. AWS EKS - just provides k8s environmenbt (not very managed)

systemctl - control service manager and systemd

systemd - software suite for linux

