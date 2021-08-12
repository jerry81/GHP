[Back home](../index.md)

# AWS freestyle learning using free trial

## LightSail

targeted towards developer - includes prebuilt images with dev software installed

## Lambda 

run functions without a server 

underlying infrastructure is abstracted and managed by AWS

expose lambda functions thru api 

free of charge to use, data transfer fees apply 

just write the code (which is like a controller function in a app framework)

## Elastic Beanstalk 

provides management for web applications

"dev only worries about uploading code"

load balancing, provisioning, security updates, 
scaling automatically handled

## S3 

Simple storage service 
similar to Ali OSS

## Aurora DB

SQL enterprise DB

## Dynamo

NoSQL database

create table steps
1.  note which region (us-east-1)
2.  create table button 
3.  note amazon resource name (arn:aws:dynamodb:us-east-1:659285663815:table/hw-db)

issue, does lambda have to be same server as dynamo db?

## IAM

Identity Access Management like RAM in ali 
permissions and roles 

example 
Lambda - Function - Configuration - Permissions - add inline policy - JSON
e.g. allows access to dynamo table 
{
"Version": "2012-10-17",
"Statement": [
    {
        "Sid": "VisualEditor0",
        "Effect": "Allow",
        "Action": [
            "dynamodb:PutItem",
            "dynamodb:DeleteItem",
            "dynamodb:GetItem",
            "dynamodb:Scan",
            "dynamodb:Query",
            "dynamodb:UpdateItem"
        ],
        "Resource": "YOUR-TABLE-ARN"
    }
    ]
}

## Elastic Kubernetes (EKS)

managed k8s, use k8s on cloud without needing to install k8s

## Redshift

data lake 

## Elastic Container Registry 

store manage share container images 
write code and save as docker image 
store on ECR 
deploy the image as container anywhere in AWS

## Full stack app (tutorial)

user -> aws amplify -> amzn API gateway -> AWS lambda -> Dynamo DB 

1.  create aws amplify html page
2.  create lambda function (simple json req and res)
3.  create api gateway rest api, hookup to lambda 
4.  create dynamo table
5.  grant lambda db permissions 

## AWS Amplify 

fully managed service - deploy host static web apps 
served by CDN 
built in CI/CD 
PR previews (staging)
domain setup
free HTTPS cert 
monitoring 

steps 
1.  connect to git repo 
2.  config build settings 
3.  deploy to CDN 

minimal app
1.  create index.html file
2.  zip the file
3.  drag and drop to upload
4.  hosted on amzn web server (domain generated)

## api gateway

rest and websocket apis available 

first stop for clients

has cache 

steps: 

1.  create api
2.  associate with lambda
3.  configure cors 
4.  deploy api 
5.  get invoke url:  https://czq9tfuq42.execute-api.us-east-1.amazonaws.com/dev
6.  test api with lightning bolt under resources

### definitions

Magento - Adobe Ecommerce platform 
drag and drop ui builder

LAMP linux apache mysql php/perl/python

MEAN mongo express angular node 

LEMP - nginx instead of apache 

EBS - elastic block storage

ARN - amazon resource name 

boto3 - AWS python Sdk

