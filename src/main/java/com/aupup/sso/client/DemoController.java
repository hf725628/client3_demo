package com.aupup.sso.client;


import com.aupup.auth.client.JwtLoginUserComponent;
import com.aupup.base.model.LoginUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;


@Slf4j
@RestController
public class DemoController {
    @Autowired
    private JwtLoginUserComponent jwtLoginUserComponent;

    @GetMapping("/user")
    public Mono<Object> index(@AuthenticationPrincipal(expression = "loginUser") LoginUser loginUser) {
            return Mono.just(loginUser);
//        return loginUser.map(e->{
////            Map<String,Object> principal = e.getAttribute("principal");
////            List<Object> authorities = (List<Object>) principal.get("authorities");
////            Map<String,Object> authority = (Map<String, Object>) authorities.get(0);
////            Map<String,Object> attributes = (Map<String, Object>) authority.get("attributes");
////            return attributes.get("loginUser");
//            return e;
//        });
    }
    //jwt请求头获取当前用户
    @GetMapping("/user1")
    public Mono<Object> index(ServerHttpRequest request) {
        return Mono.just(jwtLoginUserComponent.getCurrentUser(request));
    }
}
