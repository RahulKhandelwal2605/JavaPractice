package com.ghostick.interviewPrep;
import java.util.HashMap;
import java.util.Map;

public class MatchingSocks {

    public int getMatchingSocksCount() {
        int[] sample = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 1, 2, 3, 1};
        int pairs = 0;
        HashMap<Integer, Integer> sockNoOfSocksMap = new HashMap<>();
        for (int sock : sample) {
            if (sockNoOfSocksMap.containsKey(sock)) {
                int addedSock = sockNoOfSocksMap.get(sock) + 1;
                sockNoOfSocksMap.put(sock, addedSock);
            } else {
                sockNoOfSocksMap.put(sock, sockNoOfSocksMap.getOrDefault(sock, 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : sockNoOfSocksMap.entrySet()) {
            Integer noOfSocks = entry.getValue();
            if (noOfSocks % 2 == 0) {
                pairs = pairs + noOfSocks / 2;
            } else {
                noOfSocks = noOfSocks - noOfSocks % 2;
                pairs = pairs + noOfSocks / 2;
            }
        }
        return pairs;
    }
}
