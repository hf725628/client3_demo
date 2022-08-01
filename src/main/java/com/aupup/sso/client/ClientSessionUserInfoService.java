package com.aupup.sso.client;

import com.aupup.base.model.LoginUser;
import com.aupup.client.api.SessionUserInfoService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class ClientSessionUserInfoService implements SessionUserInfoService
{

    /**
     * client custom attrs
     * @param loginUser
     * @return
     */
    @Override
    public LoginUser customAttrs(LoginUser loginUser){
        return loginUser;
    }

    /**
     *
     * @return
     */
    @Override
    public Map<String,Object> buildRoles(LoginUser loginUser){
        return Collections.EMPTY_MAP;
    }
}
