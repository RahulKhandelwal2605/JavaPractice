package com.ghostick.interviewPrep;

public class CountingLetterA {
    public long countA(String s, long n) {
        // Calculate the number of occurrences of 'a' in the original string
        long countInOriginal = s.chars().filter(ch -> ch == 'a').count();

        // Calculate the number of full repeats of the original string in the first n characters
        long repeats = n / s.length();

        // Calculate the number of remaining characters after the full repeats
        long remainingChars = n % s.length();

        // Calculate the number of occurrences of 'a' in the remaining characters
        long countInRemaining = s.substring(0, (int) remainingChars).chars().filter(ch -> ch == 'a').count();

        // Calculate the total count of 'a' in the first n characters
        return countInOriginal * repeats + countInRemaining;
    }
}
