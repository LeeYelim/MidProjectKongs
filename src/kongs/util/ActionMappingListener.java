package kongs.util;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import kongs.controller.Action;

/**
 * Application Lifecycle Listener implementation class ActionMappingListener
 *
 */
@WebListener
public class ActionMappingListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { }
    public void contextInitialized(ServletContextEvent e)  { 
    	// 1. proerties ���� �о map�� ����
    	ServletContext application = e.getServletContext();
    	
    	// �ʱ� �Ű�����
    	String fileName = application.getInitParameter("fileName");
    	
    	// properties ���� �б�
    	ResourceBundle rb = ResourceBundle.getBundle("/kongs/util/"+fileName); // classes������ �������� properties�� ��θ�!-Ȯ���� ����
    	
    	// key�� �ش��ϴ� value ��ü�� �����
    	Map<String, Action> map = new HashMap<>();
    	for(String key : rb.keySet()) {
    		String className = rb.getString(key);
    		try {
				Action ac = (Action)Class.forName(className).newInstance();
				map.put(key, ac);
			} catch (Exception ex) {
				ex.printStackTrace();
			} 
    	}
    	// application�� ����
    	application.setAttribute("map", map);
    }
	
}










