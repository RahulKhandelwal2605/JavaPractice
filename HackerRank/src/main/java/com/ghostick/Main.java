package com.ghostick;

import com.ghostick.interviewPrep.CloudJump;
import com.ghostick.interviewPrep.CountingLetterA;
import com.ghostick.interviewPrep.MatchingSocks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MatchingSocks matchingSocks = new MatchingSocks();
        System.out.println("Matching Socks");
        System.out.println(matchingSocks.getMatchingSocksCount());
        CountingLetterA countingLetterA = new CountingLetterA();
        System.out.println("Count of A : " + countingLetterA.countA("a", 1000000000000L));
        System.out.println("Cloud Jumps : " + CloudJump.jumpingOnClouds(Arrays.asList(0,1,0,0,0,1,0)));
    }
}