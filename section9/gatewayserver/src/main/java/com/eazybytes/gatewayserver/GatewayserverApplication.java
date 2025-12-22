package com.eazybytes.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

	@Bean
	public RouteLocator eazyBankRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route("eazybank-loans-service", route -> route.path("/eazybank/loans/**")
						.filters(filter -> filter.rewritePath("/eazybank/loans/(?<segment>.*)", "/$\\{segment}")
								.addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
						.uri("lb://LOANS"))
				.route("eazybank-accounts-service", route -> route.path("/eazybank/accounts/**")
						.filters(filter -> filter.rewritePath("/eazybank/accounts/(?<segment>.*)", "/$\\{segment}")
								.addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
						.uri("lb://ACCOUNTS"))
				.route("eazybank-cards-service", route -> route.path("/eazybank/cards/**")
						.filters(filter -> filter.rewritePath("/eazybank/cards/(?<segment>.*)", "/$\\{segment}")
								.addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
						.uri("lb://CARDS"))
				.build();
	}

}
