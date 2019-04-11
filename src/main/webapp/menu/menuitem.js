/**
 * 菜单物件定义
 */
function click_Fake() {
	console.log("hello world")
}

add_item = {
	text : '添加',
	click : click_Fake
}
open_item = {
	text : '打开...',
	click : click_Fake
}
combine_item = {
	text : '合并',
	click : click_Fake
}
selectassave_item = {
	text : '选中部分保存为...',
	click : click_Fake
}
help_item = {
	text : '帮助',
	click : click_Fake
}
enable_item = {
	text : '启用',
	click : click_Fake
}
disable_item = {
	text : '禁用',
	click : click_Fake
}
switch_item = {
	text : '切换',
	click : click_Fake
}
savenodeasimage_item = {
	text : '保存节点为图片',
	click : click_Fake
}
savescreenasimage_item = {
	text : '保存屏幕为图片',
	click : click_Fake
}
addresponsetime_item = {
	text : '为子线程添加响应时间',
	click : click_Fake
}
start_item = {
	text : '启动',
	click : click_Fake
}
nowaitstart_item = {
	text : '不停顿启动',
	click : click_Fake
}
validate_item = {
	text : '验证',
	click : click_Fake
}

cut_item = {
	text : '剪切',
	click : click_Fake
}

copy_item = {
	text : '复制',
	click : click_Fake
}
paste_item = {
	text : '粘贴',
	click : click_Fake
}
duplicate_item = {
	text : '复写',
	click : click_Fake
}
delete_item = {
	text : '删除',
	click : click_Fake
}
insertitem = {
	text : '插入上级',
	click : click_Fake
}
saveastestfragment_item = {
	text : '保存为测试片段',
	click : click_Fake
}
clear_item = {
	text : '清除',
	click : click_Fake
}
thread_item = {
	text : "线程(用户)",
	children : [ {
		text : "setUp线程组"
	}, {
		text : "tearDown线程组"
	}, {
		text : "线程组"
	}

	]
}
config_item = {
	text : "配置元件",
	children : [ {
		text : "csv数据文件设置"
	}, {
		text : "http信息头管理器"
	}, {
		text : "httpcookie管理器"
	}, {
		text : "http缓存管理器"
	}, {
		text : "http请求默认值"
	}, {
		line : true
	}, {
		text : "dns缓存管理器"
	}, {
		text : "ftp默认请求"
	}, {
		text : "http授权管理器"
	}, {
		text : "JDBC连接配置"
	}, {
		text : "Java默认请求"
	}, {
		text : "LDAP扩展请求默认值"
	}, {
		text : "LDAP默认请求"
	}, {
		text : "TCP取样器配置"
	}, {
		text : "密钥库配置"
	}, {
		text : "用户定义的变量"
	}, {
		text : "登录配置元件/素"
	}, {
		text : "简单配置元件"
	}, {
		text : "计数器"
	}, {
		text : "随机变量"
	}

	]
}

listen_item = {
	text : "监听器",
	children : [ {
		text : "察看结果树"
	}, {
		text : "汇总报告"
	}, {
		text : "聚合报告"
	}, {
		text : "后端监听器"
	}, {
		line : true
	}, {
		text : "JSR223 listener"
	}, {
		text : "保存响应到文件"
	}, {
		text : "响应时间图"
	}, {
		text : "图形结果"
	}, {
		text : "断言结果"
	}, {
		text : "比较断言可视化器"
	}, {
		text : "汇总图"
	}, {
		text : "生成概要结果"
	}, {
		text : "用表格察看结果"
	}, {
		text : "简单结果写入器"
	}, {
		text : "邮件观察仪"
	}, {
		text : "BeanShell listenr"
	} ]
}

timer_item = {
	text : "定时器",
	children : [ {
		text : "固定定时器"
	}, {
		text : "统一随机定时器"
	}, {
		text : "precise throughput timer"
	}, {
		text : "Constant throughput timer"
	}, {
		line : true
	}, {
		text : "JSR223 Timer"
	}, {
		text : "Synchronizing Timer"
	}, {
		text : "珀斯随机定时器"
	}, {
		text : "高斯随机定时器"
	}, {
		text : "BeanShell Timer"
	}]
}