package org.jtest.app.testexcuter.jmeter.file.dto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
import org.apache.jorphan.collections.ListedHashTree;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;


/**
 * 测试读取jmx文件
 * 
 * @author win10
 *
 */
public class readFileTest {
    private static HashTree hashtree=new ListedHashTree();
	public static void main(String[] args) {
		JMeterUtils.loadJMeterProperties("jmeter.properties");
		JMeterUtils.setJMeterHome(System.getProperty("user.dir"));
		String path = "F:\\code soft\\测试工具\\skynet.jmx";
		File f = new File(path);
		// FileServer.getFileServer().setBaseForScript(f);
        Gson gson=new Gson();
		try {
			HashTree tree = SaveService.loadTree(f);
			JTestTree testtree=new JTestTree(tree);
			//HashTree hashTree = treeModel.addSubTree(tree, treeLis.getCurrentNode());
//            JTestTree testtree=new JTestTree(tree);
//            Object content=testtree.getItemlist().get(0).getContent();
//            String className=testtree.getItemlist().get(0).getClassName();
//            HashTree newtree=new HashTree(content);
//            System.out.println(123);
            //String content=testtree.getItemlist().get(0).getContent();
            //String className=testtree.getItemlist().get(0).getClassName();
//            HashTree newtree=new HashTree(gson.fromJson(content, Class.forName(className)));
//			LinkedList<Object> copyList = new LinkedList<>(tree.list());
			getHashTreeFromJTestTree(hashtree,testtree,0);
			
			SaveService.saveTree(hashtree, new FileOutputStream(new File("D:\\1.jmx")));
			System.out.println(123);
			//JTestPlan testplan=treeModel.getTestPlan();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public static void getHashTreeFromJTestTree(HashTree subtree,JTestTree tree,int parentId){	
		for(JTestTreeItem<?> item:tree.getItemlist()){
			if(item.getPid()==parentId){
				subtree.set(item.getContent(),new ListedHashTree());
				getHashTreeFromJTestTree(subtree.getTree(item.getContent()),tree,item.getId());
			}
		}
	
	}
}
