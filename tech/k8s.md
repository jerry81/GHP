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

## Vocabulary

pod - smallest deployable unit 

node - working machine/vm

