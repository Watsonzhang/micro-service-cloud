package com.yunhe.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.yunhe.cloud.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import java.util.HashMap;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

@Component
public class GenerateTokenFilter extends ZuulFilter {

    @Value("${token.appKey}")
    private String appKey;


    @Autowired
    private TokenUtils tokenUtils;
    @Override
    public String filterType() {
        return PRE_TYPE ;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        HashMap<String, Object> map = new HashMap<>(16);
        map.put("appKey",appKey);
        RequestContext ctx = RequestContext.getCurrentContext();
        String token=tokenUtils.generateToken(map);
        ctx.addZuulRequestHeader("X_Auth_Token", token);
        return null;
    }
}
