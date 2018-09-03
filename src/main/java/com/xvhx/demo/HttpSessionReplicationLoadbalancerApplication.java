package com.xvhx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class HttpSessionReplicationLoadbalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpSessionReplicationLoadbalancerApplication.class, args);
	}
}
