package com.eldorado.zuulserver.filter;

import javax.servlet.http.*;


import org.apache.log4j.Logger;
import org.slf4j.*;
import org.springframework.stereotype.Component;

import com.eldorado.zuulserver.config.LoggingConfig;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PostFilter extends ZuulFilter
{
	Logger log = LoggingConfig.getLog();
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
        log.info("PostFilter: " + String.format("response's content type is %s", response.getStatus()));
	    return null;
	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
