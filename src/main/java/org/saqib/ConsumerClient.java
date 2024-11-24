package org.saqib;

import java.util.ArrayList;

import org.saqib.Coordinate;
import org.kobe.xbot.ClientLite.XTablesClient;

public class ConsumerClient {
    public static void main(String[] args) {
        XTablesClient xclient = new XTablesClient();

        while (true) {
            Coordinate[] coordinates = xclient.getObject("target_waypoints", Coordinate[].class).complete();
            System.out.println("Printing out coordinates:");
            System.out.println(coordinates);
            try {
                Thread.sleep(5000);
            } catch(Exception e) {
            }
        }
    }
}
