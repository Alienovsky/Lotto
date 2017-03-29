package com.kamil.domain.model;

import java.util.List;

public class LottoBet {

    private long id;
    private int amountOfCoveredNumbers = 0;
    private List<Integer> bet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAmountOfCoveredNumbers() {
        return amountOfCoveredNumbers;
    }

    public void setAmountOfCoveredNumbers(int amountOfCoveredNumbers) {
        this.amountOfCoveredNumbers = amountOfCoveredNumbers;
    }

    public List<Integer> getBet() {
        return bet;
    }

    public void setBet(List<Integer> bet) {
        this.bet = bet;
    }

    public void increaseAmountOfCoveredNumbers(){
        this.amountOfCoveredNumbers++;
    }
}
