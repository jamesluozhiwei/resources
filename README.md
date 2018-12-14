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

# mybatis逆向工程的使用
在generatorConfig.xml文件中配置好数据库连接信息以及要生成的数据表和代码存放位置之后
运行GeneratorSqlMapper.java的主方法
运行主方法之后刷新src目录即可看到生成的代码了~
如果再配置个mybatis的嵌套查询，封装一下结果集就更舒服了
