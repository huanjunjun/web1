package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletdemo2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		test1();
		test2();
	}
    
	private void test1() throws IOException {
		Properties properties=new Properties();
		String path=this.getServletContext().getRealPath("/WEB-INF/class/db.properties");
	    InputStream is=new  FileInputStream(path);
	    properties.load(is);
	    String driverClassNameString=properties.getProperty("driverClassName");
	    String username=properties.getProperty("username");
	    String password=properties.getProperty("password");
	    String url=properties.getProperty("url");
	    
	    System.out.println(driverClassNameString);
	    System.out.println(username);
	    System.out.println(password);
	    System.out.println(url);
	    
	}
	private void test2() throws IOException {
		Properties properties=new Properties();
		
		InputStream inputStream=this.getServletContext().getResourceAsStream("/WEB-INF/class/db.properties");
		
		properties.load(inputStream);
		
		String driverClassNameString=properties.getProperty("driverClassName");
	    String username=properties.getProperty("username");
	    String password=properties.getProperty("password");
	    String url=properties.getProperty("url");
	    
	    System.out.println(driverClassNameString);
	    System.out.println(username);
	    System.out.println(password);
	    System.out.println(url);
	    
		};
	   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
		//test2();
	}
       
}
