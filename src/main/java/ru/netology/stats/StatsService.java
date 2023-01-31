package ru.netology.stats;

public class StatsService {


public int salesAmount(int[] amount) {
    int sum = 0;
    for (int i; i < amount.length; i++) {
        sum = sum + amount[i];
    }
    return sum;
}
}