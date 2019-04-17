package org.jtest.app.testexcuter.jmeter.file.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import org.jtest.app.testexcuter.jmeter.file.dto.JTestTree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JmeterFileController {

	@GetMapping("/tree/getjmetertree")
	public JTestTree getJmeterTree(@RequestParam(value = "filepath") String filepath) {
		JMeterUtils.loadJMeterProperties("jmeter.properties");
		JMeterUtils.setJMeterHome(System.getProperty("user.dir"));	
		HashTree tree=null;
		JTestTree testtree=null;
		try {
			File f = new File(filepath);
			tree = SaveService.loadTree(f);
			testtree = new JTestTree(tree);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return testtree;
	}
}
