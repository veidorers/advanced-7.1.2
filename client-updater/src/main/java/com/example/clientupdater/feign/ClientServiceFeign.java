package com.example.clientupdater.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-service")
public interface ClientServiceFeign {
    @GetMapping("/api/client/something")
    String getMessage();
}
