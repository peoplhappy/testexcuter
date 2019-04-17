package org.jtest.app.testexcuter.jmeter.file.dto;

public class UrlParam {
	private static final String TestplanUrl = "/testplan/TestPlan.html";
	private static final String ThreadGroupUrl = "/thread/ThreadGroup.html";
	private static final String ResponseassertionUrl = "/assertion/ResponseAssertion.html";
	private static final String ForeachControllerUrl = "/controller/ForeachController.html";
	private static final String ViewResultAsTreeUrl = "/result/ViewResultAsTree.html";
	private static final String HttpSamplerUrl = "/Sampler/HttpRequest.html";

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

		default:
			return "";

		}

	}

}
