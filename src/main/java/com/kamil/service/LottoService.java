package com.kamil.service;

import com.kamil.domain.LottoDto;
import com.kamil.domain.model.LottoBet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LottoService {


   public void deprecated(){
       ArrayList<Integer> wylosowane = new ArrayList<Integer>();
       int[] wylosowanyZbior = {2,8,14,16,18,46};

       for(int i=0; i<wylosowanyZbior.length; i++){
           wylosowane.add(wylosowanyZbior[i]);
       }

       ArrayList<ArrayList<Integer>> zaklady = new ArrayList<ArrayList<Integer>>();
       int[][] obstawionyLos ={
               {4,9,10,11,41,42},
               {3,8,15,19,21,44},
               {10,28,33,36,42,48},
               {2,24,27,38,46,47},
               {20,29,30,33,39,40}
       };

       for(int iloscObstawionych=0; iloscObstawionych<obstawionyLos.length; iloscObstawionych++){
           ArrayList<Integer> arrayList = new ArrayList<Integer>();
           for(int i=0; i<obstawionyLos[0].length; i++){
               arrayList.add(obstawionyLos[iloscObstawionych][i]);
           }
           zaklady.add(arrayList);
       }

       int liczbaZakladow = 0;

       for(ArrayList<Integer> zaklad : zaklady){
           int counter = 0;
           for(Integer liczba : zaklad){
               if(wylosowane.contains(liczba)){
                   counter++;
               }

           }
           liczbaZakladow++;
           System.out.println("Dla zakladu: "+liczbaZakladow+" trafionych: " + counter);

       }

       for(ArrayList<Integer> zaklad : zaklady){
           System.out.println(zaklad);
       }
   }


    public LottoDto calculateWins(LottoDto dto) {
        List<LottoBet> listWithBets = dto.getLotteryTicket();

        for(LottoBet lottoBet : listWithBets){
            for(Integer numberFromBet : lottoBet.getBet()){
                if(dto.getSelectedBet().contains(numberFromBet)){
                    lottoBet.increaseAmountOfCoveredNumbers();
                }
            }
        }

        return dto;
    }
}
