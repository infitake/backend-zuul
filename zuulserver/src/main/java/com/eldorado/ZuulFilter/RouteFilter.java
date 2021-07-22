package com.eldorado.ZuulFilter;

import javax.servlet.http.*;

import org.apache.log4j.Logger;
import org.slf4j.*;
import org.springframework.stereotype.Component;

import com.eldorado.zuulserver.LoggingConfig;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class RouteFilter extends ZuulFilter
{
	Logger log = LoggingConfig.getLog();
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info("RouteFilter: " + String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
		return null;
	}

	@Override
	public String filterType() {
		return "route";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
