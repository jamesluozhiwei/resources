# resources
资源仓库
# live2dw的使用 导入
在页面导入<script src="live2dw/lib/L2Dwidget.min.js"></script>
# 初始化代码 注意路径别写错了就行
    L2Dwidget.init({
				pluginRootPath: "live2dw/",//资源root路径
				pluginJsPath: "lib/",//js相对root的路径
				pluginModelPath: "assets/",//模型相对root的路径
				tagMode: !1,
				debug: !1,
				model: {
					scale: 2,
					jsonPath: "live2dw/assets/asuna_33.model.json"
				},
				display: {
					position: "left",//定位
					width: 130,//宽度
					height: 210,//高度
					hOffset: -40,//左右
					vOffset: 0//上下
				},
				mobile: {
					show: !1
				},
				log: !1
			});
