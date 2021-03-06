package com.nanning.gateWay.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * 自定义路由过滤器
 * @author leo
 *
 */
public class MyRouter {
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		String httpUri = "http://httpbin.org:80";
		return builder
				.routes().route(
						p -> p.path("/get")
								.filters(f -> f.addRequestHeader("Hello", "World")).uri(
										httpUri))
				.route(p -> p.host("*.hystrix.com")
						.filters(f -> f.hystrix(config -> config.setName("mycmd").setFallbackUri("forward:/fallback")))
						.uri(httpUri))
				.build();
	}

}
