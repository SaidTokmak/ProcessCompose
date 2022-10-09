package com.said.processcompose.config;

import com.said.processcompose.filter.ValidationFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<ValidationFilter> validationFilter(){
        FilterRegistrationBean<ValidationFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new ValidationFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(2);
        return registrationBean;
    }
}
