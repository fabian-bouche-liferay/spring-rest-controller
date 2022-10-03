package com.liferay.samples.fbo.my.spring.activator;

import com.liferay.samples.fbo.my.spring.component.SpringRestServletComponent;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.servlet.Servlet;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class MyActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		
		Map<String, Object> applicationProperties = new HashMap<String, Object>();
		applicationProperties.put("osgi.http.whiteboard.context.path", "/");
		applicationProperties.put("osgi.http.whiteboard.servlet.pattern", "/service/api/*");
	
		Dictionary<String, ?> properties = new Hashtable<String, Object>(applicationProperties);

		this.myServletRegistration = context.registerService(Servlet.class, new SpringRestServletComponent(), properties);
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		myServletRegistration.unregister();		
	}
	
	private ServiceRegistration<Servlet> myServletRegistration;

}
