package requestdemo1;

import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class requestdemo2
 */
public class requestdemo2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String usernameString=request.getParameter("username");
//		String passwordString=request.getParameter("password");
//		String sexString=request.getParameter("sex");
//		String cityString=request.getParameter("city");
//		String [] hobbyStrings=request.getParameterValues("hobby");
		
//		request.setCharacterEncoding("UTF-8");
//		System.out.println("username:"+usernameString);
//		System.out.println("password:"+passwordString);
//		System.out.println("sex:" + sexString);
//		System.out.println("city:" + cityString);
//		System.out.println("hobby:" + Arrays.toString(hobbyStrings));
//		System.out.println("info:" + infoString);
		/**
		 * get��ʽ���벻��ͨ�����ñ��뷽ʽ�����
		 * get��ʽ�ύ�������������е�url���棬�ڵ�ַ������ʵ���Ѿ�����url������
		 * 
		 * �����ʽ���Ƚ����뵽request��������������iso-859-1�ķ�ʽ��ȡ
		 * ����uft-8�ķ�ʽ����
		 * 
		 */
		String infoString=request.getParameter("info");
		String valueString=new String(infoString.getBytes("ISO-8859-1"),"UTF-8");
		
		
		
		
		
		Map<String, String[]> map=request.getParameterMap();
		for( String key : map.keySet() )
		{
			String[] value=map.get(key);
			System.out.println(key + "   "+ Arrays.toString(value));
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
