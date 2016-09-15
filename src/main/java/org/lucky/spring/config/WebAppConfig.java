package org.lucky.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
// @EnableWebMvc
public class WebAppConfig extends WebMvcConfigurerAdapter {
	// @Override
	// public void configureContentNegotiation(ContentNegotiationConfigurer
	// configurer) {
	// configurer.defaultContentType(MediaType.TEXT_HTML);
	// super.configureContentNegotiation(configurer);
	// }
	//
	// @Bean
	// public ViewResolver cnViewResolver(ContentNegotiationManager cnm) {
	// ContentNegotiatingViewResolver cnvr = new
	// ContentNegotiatingViewResolver();
	// cnvr.setContentNegotiationManager(cnm);
	// return cnvr;
	//
	// }
	//
	// @Bean
	// public ViewResolver beanNameViewResolver() {
	// return new BeanNameViewResolver();
	// }
	//
	// @Bean
	// public View customers() {
	// return new MappingJackson2JsonView();
	// }
}
