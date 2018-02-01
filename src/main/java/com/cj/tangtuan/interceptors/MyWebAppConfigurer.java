package com.cj.tangtuan.interceptors;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置，相当于web.xml
 */

@Configuration
@EnableWebMvc
@ComponentScan
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

    private ApplicationContext applicationContext;

    public MyWebAppConfigurer(){
        super();
    }

    //重写addResourceHandlers（）后，/static/、/templates/ 下的静态资源可以访问了
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/templates/");

        super.addResourceHandlers(registry);
    }

//    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截（传入字符串数组）
        registry.addInterceptor(new AdminInterceptors()).addPathPatterns("/admin/**");
        registry.addInterceptor(new UserInterceptors()).addPathPatterns("/user/**");
        super.addInterceptors(registry);
    }

}