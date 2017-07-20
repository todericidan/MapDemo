package com.evozon.SimpleMvc.controller;

import com.evozon.SimpleMvc.mock.ClustersData;
import com.evozon.SimpleMvc.mock.EventsData;
import com.evozon.SimpleMvc.model.Cluster;
import com.evozon.SimpleMvc.model.StationingEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by toderici_dan on 20.07.2017.
 */

@RestController
@CrossOrigin
public class DataController {

    private EventsData eventsData = new EventsData();
    private ClustersData clustersData = new ClustersData();

    @RequestMapping(value ="/data/{nb}",method = RequestMethod.GET)
    public List<Cluster> getClusters(@PathVariable("nb") int nb){
        return clustersData.generateRandomClusters(nb);
    }





}
