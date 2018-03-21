package com.hc.daedalus.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class testFilter implements Filter{

	public void destroy() {
		System.out.println("过滤器 destory");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		
		System.out.println("过滤器start dofilter");
		arg2.doFilter(arg0, arg1);
		System.out.println("过滤器end dofilter");
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("过滤器 init");
	}
}

