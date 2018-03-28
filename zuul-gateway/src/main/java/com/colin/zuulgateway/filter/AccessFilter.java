package com.colin.zuulgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * created with IntelliJ IDEA.
 * author: zhy
 * date: 2018/3/27 0027
 * time: 上午 11:11
 * description:
 */
public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        System.out.println(String.format("send {} request to {}", request.getMethod(), request.getRequestURL().toString()));

        String accessToken = request.getHeader("accessToken");
        if (accessToken == null) {
            System.out.println("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("access token is empty");
            return null;
        }
        System.out.println("access token ok");
        return null;
    }
}
