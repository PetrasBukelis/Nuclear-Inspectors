package org.spaceappschallenge.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.spaceappschallenge.models.Explosion;
import org.spaceappschallenge.models.ExplosionRequest;
import org.spaceappschallenge.services.ExplosionService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class NuclearController {

    @Resource
    private ExplosionService explosionService;

    @MessageMapping("/explosion")
    @SendTo("/nuclear/explosion")
    public Explosion explosion(ExplosionRequest request) throws Exception {
        return explosionService.explote(request.getRem());
    }
}
