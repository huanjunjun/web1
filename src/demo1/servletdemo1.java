package demo1;

import java.io.IOException;

import javax.servlet.*;


public class servletdemo1 implements Servlet {
    
	//servlet ����ʵ������ʱ��ͻ�ִ��
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.print("servletdemo1 ��ʼ����");
	}
    //service ���� ���κ�һ�����󶼻�ִ���� ����ִֻ��һ��
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.print(" servletdemo1 ������");
	}
	//��servlet �ӷ����Ƴ������߷������ر� ��ִ�� ����ִֻ��һ��
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.print("servletdemo1�����ˣ� ");
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
