package org.jtest.app.testexcuter.jmeter.file.dto;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.JTree;
import javax.swing.tree.TreeNode;
import org.apache.jmeter.threads.ThreadGroup;

import org.apache.jmeter.engine.PreCompiler;
import org.apache.jmeter.exceptions.IllegalUserActionException;
import org.apache.jmeter.gui.TestPlanListener;
import org.apache.jmeter.gui.tree.JMeterTreeListener;
import org.apache.jmeter.gui.tree.JMeterTreeModel;
import org.apache.jmeter.gui.tree.JMeterTreeNode;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.services.FileServer;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.TestPlan;
import org.apache.jmeter.testelement.property.JMeterProperty;
import org.apache.jmeter.testelement.property.PropertyIterator;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

import com.google.gson.Gson;


/**
 * 测试读取jmx文件
 * 
 * @author win10
 *
 */
public class readFileTest {

	public static void main(String[] args) {
		JMeterUtils.loadJMeterProperties("jmeter.properties");
		JMeterUtils.setJMeterHome(System.getProperty("user.dir"));
		String path = "F:\\code soft\\测试工具\\Response Assertion.jmx";
		File f = new File(path);
		// FileServer.getFileServer().setBaseForScript(f);
        Gson gson=new Gson();
		try {
			HashTree tree = SaveService.loadTree(f);
			List<TestPlanListener> testPlanListeners = Collections.synchronizedList(new ArrayList<>());
			FileServer.getFileServer().setBasedir(path);
			testPlanListeners.stream().forEach(TestPlanListener::testPlanLoaded);
			JMeterTreeModel treeModel=new JMeterTreeModel();
			JMeterTreeListener treeLis = new JMeterTreeListener(treeModel);
			//HashTree hashTree = treeModel.addSubTree(tree, treeLis.getCurrentNode());
            JTestTree testtree=new JTestTree(tree);
//			LinkedList<Object> copyList = new LinkedList<>(tree.list());
	        for (Object o  : tree.list()) {
	        	HashTree item=tree.getTree(o);
	        	Class clz=o.getClass();
	        	System.out.println(o.getClass().getName());
	        	//System.out.println(gson.toJson(o,o.getClass()));
	        	for(Object os:item.list()){
	        		System.out.println(os.getClass().getName());
	        		//System.out.println(gson.toJson(os,os.getClass()));
		        	HashTree items=item.getTree(os);
	        		for(Object oss:items.list()){
	        			System.out.println(oss.getClass().getName());
	        			//System.out.println(gson.toJson(oss,oss.getClass()));
	        			HashTree itemss=items.getTree(oss);
	        			for(Object osss:itemss.list()){
	        				System.out.println(osss.getClass().getName());
	        				//System.out.println(gson.toJson(osss,osss.getClass()));
	        			}
	        		}
	        	}
	        }
			System.out.println(113);
			//JTestPlan testplan=treeModel.getTestPlan();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
