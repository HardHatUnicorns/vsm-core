package pl.aogiri.vms.healthservice.service;

import com.github.theholywaffle.teamspeak3.api.VirtualServerStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.aogiri.vms.healthservice.dao.TeamspeakDAO;

@Service
public class HealthyService {

    @Autowired
    TeamspeakDAO dao;

    public VirtualServerStatus getHealth(){
        return dao.getStatus();
    }
}
