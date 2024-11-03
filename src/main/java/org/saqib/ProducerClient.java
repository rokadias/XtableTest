package org.saqib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.saqib.Coordinate;
import org.kobe.xbot.ClientLite.XTablesClient;

public class ProducerClient {
    public static void main(String[] args) {
        XTablesClient xclient = new XTablesClient(1735, false, 5, false);
        Coordinate coordinate = new Coordinate(5,5);
        List<Coordinate> coordinates = Collections.singletonList(coordinate);

        while (true) {
            xclient.executePutArray("target_waypoints", coordinates);
            try {
                Thread.sleep(5000);
            } catch(Exception e) {
            }
        }
    }
}
