package pl.aogiri.vms.healthservice.dao;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.VirtualServerStatus;
import org.springframework.stereotype.Repository;

@Repository
public class TeamspeakDAO {

    public VirtualServerStatus getStatus(){
        final TS3Config config = new TS3Config();
        config.setHost("ts.aogiri.pl");

        final TS3Query query = new TS3Query(config);
        query.connect();

        final TS3Api api = query.getApi();
        api.selectVirtualServerById(1);
        try{
            return api.getServerInfo().getStatus();
        }finally {
            query.exit();
        }
    }
}
