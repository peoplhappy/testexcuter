package org.jtest.app.testexcuter.jmeter.file.dto;

public class CommonParam {
	private static final String TestplanUrl = "/testplan/TestPlan.html";
	private static final String ThreadGroupUrl = "/thread/ThreadGroup.html";
	private static final String ResponseassertionUrl = "/assertion/ResponseAssertion.html";
	private static final String ForeachControllerUrl = "/controller/ForeachController.html";
	private static final String ViewResultAsTreeUrl = "/result/ViewResultAsTree.html";
	private static final String HttpSamplerUrl = "/Sampler/HttpRequest.html";
	private static final String TestplanImageUrl = "/image/tree/applications-science-3.png";
	private static final String ThreadGroupImageUrl = "/image/tree/system-run-5.png";
	private static final String ResponseassertionImageUrl = "/image/tree/document-preview.png";
	private static final String ForeachControllerImageUrl = "/image/tree/view-list-tree-4.png";
	private static final String ViewResultAsTreeImageUrl = "/image/tree/office-chart-area.png";
	private static final String HttpSamplerImageUrl = "/image/tree/color-picker-grey.png";
	private static final String TestplanMenuName = "firstmenu";
	private static final String ThreadGroupMenuName = "secondmenu";
	private static final String ResponseassertionMenuName = "fourthmenu";
	private static final String ForeachControllerMenuName = "thirdmenu1";
	private static final String ViewResultAsTreeMenuName = "fourthmenu";
	private static final String HttpSamplerMenuName = "thirdmenu";
	
	
	public static String getUrl(String className) {

		switch (className) {
		case "org.apache.jmeter.testelement.TestPlan":
			return TestplanUrl;
		case "org.apache.jmeter.threads.ThreadGroup":
			return ThreadGroupUrl;
		case "org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy":
			return HttpSamplerUrl;
		case "org.apache.jmeter.reporters.ResultCollector":
			return ViewResultAsTreeUrl;
		case "org.apache.jmeter.control.ForeachController":
			return ForeachControllerUrl;
		default:
			return "";

		}

	}
	
	
	public static String getImageUrl(String className) {

		switch (className) {
		case "org.apache.jmeter.testelement.TestPlan":
			return TestplanImageUrl;
		case "org.apache.jmeter.threads.ThreadGroup":
			return ThreadGroupImageUrl;
		case "org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy":
			return HttpSamplerImageUrl;
		case "org.apache.jmeter.reporters.ResultCollector":
			return ViewResultAsTreeImageUrl;
		case "org.apache.jmeter.control.ForeachController":
			return ForeachControllerImageUrl;

		default:
			return "";

		}

	}
    
	
	public static String getMenuName(String className) {

		switch (className) {
		case "org.apache.jmeter.testelement.TestPlan":
			return TestplanMenuName;
		case "org.apache.jmeter.threads.ThreadGroup":
			return ThreadGroupMenuName;
		case "org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy":
			return HttpSamplerMenuName;
		case "org.apache.jmeter.reporters.ResultCollector":
			return ViewResultAsTreeMenuName;
		case "org.apache.jmeter.control.ForeachController":
			return ForeachControllerMenuName;
		default:
			return "";

		}

	}						
}
