package com.mycompany.trainersbean.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
// auto einai to antistoixo dispatcher-servlet.xml

public class TrainersBeanInitializer implements WebApplicationInitializer {
        
	public void onStartup(ServletContext container) throws ServletException {

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(TrainersBeanConfiguration.class);
		ctx.setServletContext(container);
                
               
		ServletRegistration.Dynamic servlet = container.addServlet(
				"dispatcher", new DispatcherServlet(ctx));
                
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
