package com.evozon.SimpleMvc.mock;

import com.evozon.SimpleMvc.model.Centroid;
import com.evozon.SimpleMvc.model.Cluster;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by toderici_dan on 20.07.2017.
 */
public class ClustersData {

    public List<Cluster> generateRandomClusters(int numberOfClusters) {
        List<Cluster> clusters = new LinkedList<>();
        Random random = new Random();
        int id=0;
        for (int i = 0; i < numberOfClusters; i++) {
            id+=1;
            double randomLat = 45.0000 + (46.700 - 45.000) * random.nextDouble();
            double randomLongitude = 23.000 + (24.500 - 23.000) * random.nextDouble();
            int radius = (random.nextInt(100 + 1 - 1) + 1) * 100;
            clusters.add(new Cluster(id,new Centroid(randomLat,randomLongitude),radius));
        }
        return clusters;
    }



}
