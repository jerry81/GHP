[Go Home](../README.md)

## Kubectl Reference

kubectl create -f 
creates file (json or yaml)


## Kubernetes Secrets
place to store and manage sensitive info such as passwords or tokens 

to create secret, first have the secret in a file.

echo -n 'admin' > ./username.txt
echo -n '1f2d1e2e67df' > ./password.txt
