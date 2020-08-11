package com.remoteanwalt.application;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CamelRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("timer:hello?delay=-1&repeatCount=1")
                .setBody().constant("Hello World!")
                .to("log:hello");
    }
}
