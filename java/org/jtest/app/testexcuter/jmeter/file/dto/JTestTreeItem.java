package org.jtest.app.testexcuter.jmeter.file.dto;

/**
 * 返回jmeter的树节点
 * 
 * @author win10
 *
 */
public class JTestTreeItem<T> {

	private int pid;// 父节点id，为0为根节点
	private T content;// 内容
	private int id;// 自身节点id
	private String text;// 前台的显示名称
	private String url;// 跳转url
	private String className;// element的类

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
