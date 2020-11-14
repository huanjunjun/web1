package demo1;

import java.io.IOException;

import javax.servlet.*;


public class servletdemo1 implements Servlet {
    
	//servlet 对象被实例化的时候就会执行
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.print("servletdemo1 初始化了");
	}
    //service 方法 ，任何一次请求都会执行他 并且只执行一次
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.print(" servletdemo1 服务了");
	}
	//当servlet 从服务移除，或者服务器关闭 会执行 并且只执行一次
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.print("servletdemo1销毁了！ ");
	}
	
	
	
	

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
  
}
