package net.v.prac.ws.config;

import net.v.prac.ws.service.AddService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

@Configuration
public class CxfWsConfig {

    @Resource
    private AddService addService;

    @Bean("cxfServletRegistration")
    public ServletRegistrationBean<CXFServlet> dispatcherServlet() {
        // 注册servlet 拦截/ws 开头的请求 如果不设置 默认为：/services/*
        return new ServletRegistrationBean<>(new CXFServlet(), "/ws/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /**
     * 发布endpoint
     * 地址：http://IP地址:端口号/ws/webService?wsdl
     */
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), addService);
        // 发布的地址
        endpoint.publish("/addService");
        return endpoint;
    }

}
