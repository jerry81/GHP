[Go Home](../index.md)

1 email address per app id 

<view> similar to <div>

declaring a function in index.js
createPost: function() { 
}

bindTag to set click event handler on button 
wx.cloud.callFunction({
  name: '...',
  data: {
  },
  success: (res) => {
  }
}

define cloud function 
right click on cloud backend and choose add function 
there is gui similar to postman to define these 

provides cloud database 

async await supported 

<scroll-view> provided OOTB 
wx:for="{{...}}"/>

<image src..> (not <img>)
<text>

class="" like css

wxcss - rpx - 700 is width of screen no matter how big screen actually is so it is a relative value 

display flex supported 

"json database"

step 1: registration 
must be able to read chinese 
need a chinese person 
need certification to publish 
add developers 
management dashboard publishes 
wechat ide - preview and simulate app 
preview on phone 
master wechat IDE with tutorial 
pages folder folders with js, json, wmxl, wxcss files 
step 2.  structure of quickstart
app.json - settings (like router)
  - pages - like router 
  - window - 
  - tabBar if you want to add tabs 
    - list - controls the tabs info and ordering
app.wxss stylesheet 
app.js 
3.  lifecycle: 
  onlaunch 
  onLoad 
  onShow 
  onUnload, onReady, onHide 
  
can use console log anywhere 
