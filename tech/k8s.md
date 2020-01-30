[Go Home](../README.md)

## Kubectl Reference

kubectl create -f 
creates file (json or yaml)

kubectl config view 
shows users: - "name"

logs -f <pod id> 
  streams logs from pod to terminal
  
run 
  spawns new container 

exec <pod id> -it -- bash 
  (why an orphaned --)? 
interactive shell in pod

example kubectl exec frame-recommendation-6cb557b789-bgb8x -it -- bash

## Kubernetes Secrets
place to store and manage sensitive info such as passwords or tokens 

to create secret, first have the secret in a file.

echo -n 'admin' > ./username.txt
echo -n '1f2d1e2e67df' > ./password.txt

## Controllers

daemonset - one pod per node, used to monitor each node 

deployment: declarative updates for pods and replicasets 

stateful set - used for persistent storage and network identifiers 

replicaSet - set of identical pods 

job - like cronjob but runs only once 

## Logging 

"kubectl logs" is actually getting the collected logs from std.out and std.error that are stored in memory (not file) as a buffer.
This buffer can then be read by datadog

## Vocabulary

pod - smallest deployable unit 

service - logical set of pods 

fungible - mutually interchangable 

volume (docker also has them) - a directory or disk on a container 
configMap is a type of volume - way to inject a config into a pod 
also lots of plugins to other storage services

namespace - way to divide cluster resources between users 

node - working machine/vm

PLEG - pod lifecycle event generator - automatically starts and restarts containers to reach a "desired state"

kubelet - non-master process that communicates with master 

kube-proxy - non-master process that handles networking on the node 


