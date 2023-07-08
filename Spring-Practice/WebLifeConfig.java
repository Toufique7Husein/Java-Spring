package life.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebLifeConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext wac = new AnnotationConfigWebApplicationContext();		
		wac.register(ApplicationConfig.class);
		// TODO Auto-generated method stub
		DispatcherServlet dServlet =new DispatcherServlet(wac);
		
		System.out.println("I am in");
		ServletRegistration.Dynamic servlet = servletContext.addServlet("MyDS", dServlet);
	//	dServlet.setLoadOnstratup =dServlet 
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
