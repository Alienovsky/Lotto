package com.kamil.domain;

import com.kamil.domain.model.LottoBet;

import java.util.List;

public class LottoDto {
    private List<LottoBet> LotteryTicket;
    private List<Integer> selectedBet;

    public List<LottoBet> getLotteryTicket() {
        return LotteryTicket;
    }

    public void setLotteryTicket(List<LottoBet> lotteryTicket) {
        LotteryTicket = lotteryTicket;
    }

    public List<Integer> getSelectedBet() {
        return selectedBet;
    }

    public void setSelectedBet(List<Integer> selectedBet) {
        this.selectedBet = selectedBet;
    }
}
