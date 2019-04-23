/**
 * 定义各个menu组件
 */

function getTopmenu() {
	TestPlan_AddItem = add_item
	TestPlan_AddItem["children"] = [ thread_item, {
		line : true
	}, config_item, listen_item, {
		line : true
	}, timer_item, {
		line : true
	}, pre_item, post_item, assertion_item, {
		line : true
	}, testfrag_item, nottestfrag_item ]
	return $.ligerMenu({
		top : 100,
		left : 100,
		width : 200,
		items : [ TestPlan_AddItem, {
			line : true
		}, paste_item, {
			line : true
		}, open_item, combine_item, selectassave_item, {
			line : true
		}, savenodeasimage_item, savescreenasimage_item, {
			line : true
		}, enable_item, disable_item, switch_item, {
			line : true
		}, help_item ]
	});
}

function getSecondMenu() {
	sampler_AddItem = add_item
	sampler_AddItem["children"] = [ sampler_item, {
		line : true
	}, logic_item,{
		line : true
	}, pre_item, post_item, assertion_item, {
		line : true
	}, timer_item,{
		line : true
	}, testfrag_item,{
		line : true
	},config_item,listen_item]
	return $.ligerMenu({
		top : 100,
		left : 100,
		width : 200,
		items : [ sampler_AddItem, {
			line : true
		},addresponsetime_item,start_item,nowaitstart_item,validate_item, {
			line : true
		},cut_item,copy_item,paste_item,duplicate_item,delete_item,{
			line : true
		}, open_item, combine_item, selectassave_item, {
			line : true
		}, savenodeasimage_item, savescreenasimage_item, {
			line : true
		}, enable_item, disable_item, switch_item, {
			line : true
		}, help_item ]
	});
}

function getThirdMenu() {
	sampler_AddItem = add_item
	sampler_AddItem["children"] = [ assertion_item, {
		line : true
	}, timer_item,{
		line : true
	}, pre_item, post_item,{
		line : true
	}, config_item,listen_item]
	return $.ligerMenu({
		top : 100,
		left : 100,
		width : 200,
		items : [ sampler_AddItem,insertitem,{
			line : true
		},cut_item,copy_item,paste_item,duplicate_item,delete_item,{
			line : true
		}, open_item, combine_item, selectassave_item,saveastestfragment_item,{
			line : true
		}, savenodeasimage_item, savescreenasimage_item, {
			line : true
		}, enable_item, disable_item, switch_item, {
			line : true
		}, help_item ]
	});
}

function getThird1Menu() {
	sampler_AddItem = add_item
	sampler_AddItem["children"] = [ sampler_item, {
		line : true
	}, logic_item,{
		line : true
	}, pre_item, post_item, assertion_item, {
		line : true
	}, timer_item,{
		line : true
	}, config_item,listen_item]
	return $.ligerMenu({
		top : 100,
		left : 100,
		width : 200,
		items : [ sampler_AddItem,insertitem, {
			line : true
		},addresponsetime_item,start_item,nowaitstart_item,validate_item, {
			line : true
		},cut_item,copy_item,paste_item,duplicate_item,delete_item,{
			line : true
		}, open_item, combine_item, selectassave_item, {
			line : true
		}, savenodeasimage_item, savescreenasimage_item, {
			line : true
		}, enable_item, disable_item, switch_item, {
			line : true
		}, help_item ]
	});
}
function getForthMenu() {
	return $.ligerMenu({
		top : 100,
		left : 100,
		width : 200,
		items : [ clear_item,{
			line : true
		},cut_item,copy_item,paste_item,duplicate_item,delete_item,{
			line : true
		}, open_item, combine_item, selectassave_item,saveastestfragment_item,{
			line : true
		}, savenodeasimage_item, savescreenasimage_item, {
			line : true
		}, enable_item, disable_item, switch_item, {
			line : true
		}, help_item ]
	});
}


