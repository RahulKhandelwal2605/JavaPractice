package com.ghostick.interviewPrep;

import java.util.List;

public class CloudJump {
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps = 0;
        int currentCloud = 0;

        while (currentCloud < c.size() - 1) {
            // Check if jumping two clouds is safe
            if (currentCloud + 2 < c.size() && c.get(currentCloud + 2) == 0) {
                currentCloud += 2;
            } else {
                // Jump one cloud
                currentCloud += 1;
            }

            jumps++;
        }

        return jumps;
    }
}
