package org.jtest.app.testexcuter.jmeter.file.dto;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

import com.google.gson.Gson;

/**
 * 用以存储测试资源
 * 
 * @author win10
 *
 */
public class JTestTree {
	private List<JTestTreeItem<?>> itemlist = new ArrayList<>();
	private Gson gson = new Gson();
	private int startIndex = 1;// 初始id为0

	/**
	 * 将hashtree转存为JTestTree
	 * 
	 * @param hashtree
	 */
	public JTestTree(HashTree hashtree) {
		try {
			traverse(hashtree,0);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 用以遍历
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public void traverse(HashTree hashtree, int pid) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if (hashtree.isEmpty()) {
			return;
		} else {
			for (Object o : hashtree.list()) {
				HashTree nexttree = hashtree.getTree(o);
				JTestTreeItem<Object> item = new JTestTreeItem();
				item.setContent(o);
				item.setId(startIndex);
				item.setPid(pid);
				item.setUrl(UrlParam.getUrl(o.getClass().getName()));
				item.setClassName(o.getClass().getName());
				Class clz = o.getClass();
				Method method = clz.getMethod("getName", null);
				Object name = method.invoke(o, null);
				item.setText(name.toString());
				itemlist.add(item);
				startIndex=startIndex+1;
				traverse(nexttree,item.getId());
				// item.setText(text);
			}
		}
	}

	public List<JTestTreeItem<?>> getItemlist() {
		return itemlist;
	}

	public void setItemlist(List<JTestTreeItem<?>> itemlist) {
		this.itemlist = itemlist;
	}
	/**
	 * 将tree重新存入文件
	 * @param path
	 */
	
	
}
