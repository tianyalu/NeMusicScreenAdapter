## NeMusicScreenAdapter 网易云音乐屏幕适配方案
### 思路：
以固定设计稿为模板（如1080*1920），然后根据目标手机屏幕宽高计算缩放比，然后设置到具体的View上
1. 复写主要容器类-->不够雅观，每个布局都要用自定义的容器  
2. 采用工具类对指定的View设置（推荐）-->代码侵入性强，但影响范围小  
### 其他方式对比：  
![image](https://github.com/tianyalu/NeMusicScreenAdapter/blob/master/show/percent.png)  
![image](https://github.com/tianyalu/NeMusicScreenAdapter/blob/master/show/qualifier.png)  
### 演示示例： 
![image](https://github.com/tianyalu/NeMusicScreenAdapter/blob/master/show/show.png)  



