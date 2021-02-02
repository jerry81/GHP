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
