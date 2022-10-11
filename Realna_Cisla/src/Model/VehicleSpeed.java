package Model;

import java.time.Duration;
import java.time.LocalTime;


public class VehicleSpeed { //úloha 9

    public static void Calculate(int max_speed, double distance, LocalTime start_time, LocalTime stop_time){
        var duration = Duration.between(start_time, stop_time);
        double duration_seconds = duration.toSeconds();
        distance *= 1000;

        double average_speed = (distance/duration_seconds) * 3.6;
        boolean over_speed_limit = (average_speed > max_speed) ? true : false;

        System.out.println("Řidič jel rychlostí: " + average_speed + (over_speed_limit ? " překročil" : " nepřekročil") +" limit");

    }
}
