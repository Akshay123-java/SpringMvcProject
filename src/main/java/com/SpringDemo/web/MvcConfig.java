package com.SpringDemo.web;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configurable 
@EnableWebMvc
@ComponentScan("com.SpringDemo.web")
public class MvcConfig  extends WebMvcConfigurerAdapter{
	
	

}
