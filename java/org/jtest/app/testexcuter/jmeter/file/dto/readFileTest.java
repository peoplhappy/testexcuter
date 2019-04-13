package org.jtest.app.testexcuter.jmeter.file.dto;

import java.io.File;
import java.io.IOException;

import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.services.FileServer;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

/**
 * 测试读取jmx文件
 * @author win10
 *
 */
public class readFileTest {
    
	
	public static void main(String[] args){
		JMeterUtils.loadJMeterProperties("jmeter.properties");
		JMeterUtils.setJMeterHome(System.getProperty("user.dir"));
		String path="F:\\code soft\\测试工具\\Response Assertion.jmx";
		File f=new File(path);
		//FileServer.getFileServer().setBaseForScript(f);
		
		
		
        try {
			HashTree tree = SaveService.loadTree(f);
			System.out.println(123);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
