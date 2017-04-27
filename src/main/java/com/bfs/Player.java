package com.bfs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lukman on 4/24/17.
 */
public class Player {
    private String name;
    private Health health;
    private Deck deck;
    private Hand hand;
    private ManaSlot manaSlot;

    public Player(String name) {
        this.name = name;
        this.health = new Health();
        this.deck = new Deck();
        this.hand = new Hand();
    }

    public void dealCard() {
        List<Card> cards = Arrays.stream(deck.getCards()).collect(Collectors.toList());
        Collections.shuffle(cards);
        //hand.setCards(cards.subList(0,3));

    }

}
