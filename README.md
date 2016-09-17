# CollapsingToolbarLayout
<p>
<h3>CollapsingTabbarLayout 提供一个可以折叠的Toolbar</h3><br>
又是继承FrameLayout<br>
设置layout_scrollFlags可以控制里面的控件在响应layout_behavior<br>
事件做出相应的滚动事件(移除屏幕或固定在屏幕顶端)<br>
<h4>相关属性</h4>
&nbsp;&nbsp;contentScrim设置完全这折叠后的背景颜色<br>
&nbsp;&nbsp;extendTitleMarginStart设置扩张时候title向左填充的距离<br>
在子视图里设置<br>
&nbsp;&nbsp;layout_collapseMode折叠模式 两个值<br>
&nbsp;&nbsp;&nbsp;pin 完全收缩的时候还可以保留在屏幕上<br>
&nbsp;&nbsp;&nbsp;parallax实现视差滚动 通常和layout_ParapseParallaxMultiplier视差因子搭配使用<br>
&nbsp;&nbsp;layout_collapseParallaxMutiplier视差因子，值0到1<br>
ToolBar 折叠模式：pin<br>
*必须把title设置在cpllapsingTabbarLayout上，<br>
设置到Toolbar上不会显示，代码设置是setTitle()<br>
收缩时候title颜色setCollapsedTitleTextColor();颜色会自动过渡<br>
</p>
<image src="demo.gif">
