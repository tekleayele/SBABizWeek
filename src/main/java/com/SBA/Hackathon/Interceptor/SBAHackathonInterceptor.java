package com.SBA.Hackathon.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class SBAHackathonInterceptor implements HandlerInterceptor{

    public boolean preHandle(HttpServletRequest request,HttpServletResponse  response){
        return true;
    }
}
