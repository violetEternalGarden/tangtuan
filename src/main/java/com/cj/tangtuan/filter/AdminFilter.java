package com.cj.tangtuan.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class AdminFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {

        log.info("========================后端过滤器=====================");
        filterChain.doFilter(req, resp);
    }

    @Override
    public void destroy() {

    }
}