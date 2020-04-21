package com.idaobin.restaurant.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Bean
    public HandlerInterceptor getInterceptor(){
        return new LoginHandlerInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //拦截所有接口，除了登录接口
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/*.do").excludePathPatterns("/login.do")
                .excludePathPatterns("/addUser.do").excludePathPatterns("/forgetPwd.do").excludePathPatterns("/emptyData.do");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //放行所有静态资源
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
