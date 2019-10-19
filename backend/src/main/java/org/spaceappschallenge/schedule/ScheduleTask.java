package org.spaceappschallenge.schedule;

import org.spaceappschallenge.models.OutgoingMessage;
import org.spaceappschallenge.services.LocationsService;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ScheduleTask {

    @Resource
    private SimpMessagingTemplate template;

    @Resource
    private LocationsService locationsService;

    @Scheduled(fixedRate = 5000)
    public void sendLocations() {
        //TODO process provided lock is open
        this.template.convertAndSend("/nuclear/explosion", new OutgoingMessage());
    }
}
