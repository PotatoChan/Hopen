# Hopen

Hopen 女蜗，人类的缔造者，代码界的造轮者。

负责为Android App提供组件，如Loading组件、上拉加载下拉刷新组件、动画特效等。



[TOC]

## 一、Loading组件



目前放置了两个Loading效果，如图![Loading组件](img/loading.png)

Loading的类型在Hopen框架中以HProgressType（enum类型）区分，目前有

`HPProgressType.PointProgress` 和 `HPProgressType.PointCircleProgress`



具体使用方式如下：

```java
HProgress progress = HProgress.createDialog(MainActivity.this,HProgressType.PointProgress);
progress.show();
```





## 二、HListView 下拉刷新（开发中）





## 三、HScrollView 滚动视图（开发中）







