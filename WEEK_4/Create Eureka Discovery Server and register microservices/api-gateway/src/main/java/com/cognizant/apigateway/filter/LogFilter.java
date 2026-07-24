package main.java.com.cognizant.apigateway.filter;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogFilter {

    @Bean
    public GlobalFilter customFilter() {

        return (exchange, chain) -> {

            System.out.println("Request : " +
                    exchange.getRequest().getURI());

            return chain.filter(exchange);

        };

    }

}