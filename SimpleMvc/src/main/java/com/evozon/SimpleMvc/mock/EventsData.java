package com.evozon.SimpleMvc.mock;

import com.evozon.SimpleMvc.model.Centroid;
import com.evozon.SimpleMvc.model.Cluster;
import com.evozon.SimpleMvc.model.StationingEvent;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by toderici_dan on 20.07.2017.
 */
@Service
public class EventsData {
    public List<StationingEvent> generateRandomEvents(int numberOfEvents, Centroid center) {
        List<StationingEvent> events = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < numberOfEvents; i++) {
            int carId = random.nextInt(100 + 1 - 1) + 1;
            double randomLat = center.getLatitude() + (center.getLatitude()+0.6 - center.getLatitude()) * random.nextDouble();
            double randomLongitude = center.getLongitude() + (center.getLongitude()+0.5 - center.getLongitude()) * random.nextDouble();
            long time = (random.nextInt(100 + 1 - 1) + 1) * 100;
            events.add(new StationingEvent(carId, randomLat, randomLongitude, time));
        }
        return events;
    }

    public List<StationingEvent> getStationingEventForCluster(int number,Cluster cluster){
        return generateRandomEvents(number, cluster.getCenter());
    }
}
