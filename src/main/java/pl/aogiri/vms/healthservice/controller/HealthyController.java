package pl.aogiri.vms.healthservice.controller;

import com.github.theholywaffle.teamspeak3.api.VirtualServerStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.aogiri.vms.healthservice.service.HealthyService;

@RestController
public class HealthyController {

    @Autowired
    HealthyService service;

    @GetMapping("/")
    public ResponseEntity<VirtualServerStatus> getHealth(){
        return ResponseEntity.ok(service.getHealth());
    }

    @GetMapping("/health")
    public ResponseEntity<Object> getHealthService(){
        return ResponseEntity.ok().build();
    }
}
