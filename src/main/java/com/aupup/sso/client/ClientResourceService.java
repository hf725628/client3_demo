package com.aupup.sso.client;

import com.aupup.client.api.ResourceAccessService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientResourceService implements ResourceAccessService {
    @Override
    public List<String> getWhiteList() {
        List<String> paths = new ArrayList<>(300);
        for(int i=0;i<300;i++){
            paths.add("/abc"+i);
        }
        return paths;
    }
}
