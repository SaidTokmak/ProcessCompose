package com.said.processcompose.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class ValidationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        servletRequest.getParameterMap();
        String url = request.getRequestURL().toString();
        String queryString = request.getQueryString();
        String uri = request.getRequestURI();
        System.out.println("[Filter][HttpServletRequest] Request url: " + url + " queryString: " +
                 queryString + " URI: " + uri);
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
