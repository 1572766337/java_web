package web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo1 implements Filter {

	/*
	 * filter�ڿ����еĳ���Ӧ�ã�
	 * 1.filter����Ŀ����Դִ��֮ǰ������Ȩ�޼�飬����û�����Ȩ�ޣ�����Ȩ������У���û�У���ܾ�����
	 * 2.filter���Է���֮ǰ����request��response����Ԥ�����Ӷ�ʵ��һЩȫ���Ե����á�
	 * 3.filter�ڷ���֮�󣬿��Բ���Ŀ����Դ��������Ӷ����������������ѹ������������
	 */
	

	private FilterConfig config;
	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		String value = this.config.getInitParameter("xxx");
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		System.out.println("servletDemo1֮ǰ");
		
		
		chain.doFilter(request, response);  //����
		
		
		System.out.println("servletDemo1֮��!!");
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("filter�������ˣ���");
		this.config = filterConfig;
	}
	
	public void destroy() {
		System.out.println("filter�������ˣ���");

	}

}
