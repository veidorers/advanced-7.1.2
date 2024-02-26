package com.example.clientupdater.controller;

import com.example.clientupdater.feign.ClientServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/update")
public class UpdaterController {
    private final ClientServiceFeign clientServiceFeign;

    @Autowired
    public UpdaterController(ClientServiceFeign clientServiceFeign) {
        this.clientServiceFeign = clientServiceFeign;
    }


    @GetMapping
    public String getMessage() {
        return clientServiceFeign.getMessage();
    }
}
