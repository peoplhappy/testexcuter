package org.jtest.app.testexcuter.jmeter.file.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.jmeter.JMeter;
import org.apache.jmeter.exceptions.IllegalUserActionException;
import org.apache.jmeter.plugin.PluginManager;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import org.apache.jorphan.collections.ListedHashTree;
import org.jtest.app.testexcuter.jmeter.file.dto.JTestTree;
import org.jtest.app.testexcuter.jmeter.util.JMeterUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class JmeterFileController {
	private Gson gson = new Gson();

	/**
	 * 读取树形结构
	 * 
	 * @param filepath
	 * @return
	 */
	@GetMapping("/tree/getjmetertree")
	public String getJmeterTree(@RequestParam(value = "filepath") String filepath) {
		JMeterUtils.loadJMeterProperties("jmeter.properties");
		JMeterUtils.setJMeterHome(System.getProperty("user.dir"));
		HashTree tree = null;
		JTestTree testtree = null;
		try {
			File f = new File(filepath);
			tree = SaveService.loadTree(f);
			testtree = new JTestTree(tree);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return gson.toJson(testtree, JTestTree.class);
	}

	/**
	 * 存储树形接口到文件
	 * 
	 * @param filepath
	 * @param tree
	 * @return
	 */
	@PostMapping("/tree/savejmetertree")
	public boolean saveJmeterTree(String filepath, JTestTree tree) {
		JMeterUtils.loadJMeterProperties("jmeter.properties");
		JMeterUtils.setJMeterHome(System.getProperty("user.dir"));
		boolean flag = true;
		try {
			HashTree newtree = new ListedHashTree();
			JMeterUtil.getHashTreeFromJTestTree(newtree, tree, 0);
			SaveService.saveTree(newtree, new FileOutputStream(new File(filepath)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}

		return flag;
	}

	@GetMapping("/tree/runjmeter")
	public boolean runJmeter(@RequestParam(value = "filepath")String filepath) throws IllegalUserActionException {
		System.setProperty("JMeter.NonGui", "true");// $NON-NLS-1$
		JMeter driver = new JMeter();// TODO - why does it create a new
										// instance?
		

		PluginManager.install(driver, false);

		String remoteHostsString = null;
//		if (remoteStart != null) {
//			remoteHostsString = remoteStart.getArgument();
//			if (remoteHostsString == null) {
//				remoteHostsString = JMeterUtils.getPropDefault("remote_hosts", //$NON-NLS-1$
//						"127.0.0.1");// NOSONAR $NON-NLS-1$
//			}
//		}
		if (filepath == null) {
			throw new IllegalUserActionException("Non-GUI runs require a test plan");
		}
		driver.runNonGui(filepath, "D:\\1.jtl", false, remoteHostsString, false);

		return false;
	}

}
