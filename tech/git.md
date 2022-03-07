[Go Back](../index.md)

# setting proxy

- why do it?  
- github is increasingly blocked by the GFW, and if you use a proxy server, you may need to reroute git cli to go through localhost's proxy server at the port made available by the vpn.

- how to do it?
- [ref](https://gist.github.com/evantoli/f8c23a37eb3558ab8765)

```console
git config --global http.proxy http://proxyUsername:proxyPassword@proxy.server.com:port
```

- replace http.proxy with https.proxy to complete both protocols' setups

- current settings
```console
http.proxy=http://127.0.0.1:4780
https.proxy=http://127.0.0.1:4780
```

- undo the proxy 
```console
git config --global --unset http.proxy
git config --global --unset http.https://domain.com.proxy

git config --global --unset http.sslVerify
git config --global --unset http.https://domain.com.sslVerify
```