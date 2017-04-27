package com.bfs;


import java.util.stream.Stream;

public class Deck {
    private static final int TOTAL_CARDS = 20;
    private Card[] cards;

    public Deck() {
        cards = new Card[TOTAL_CARDS];
        init();
    }

    public Card[] getCards() {
        return cards;
    }

    private void init(){
        Stream.of(0,0,1,1,2,2,2,3,3,3,3,4,4,4,5,5,6,6,7,8)
                .forEach(cardValue -> addCard(new Card(cardValue)));

    }

    public void addCard(Card card) {
        for (int i = 0; i < TOTAL_CARDS; i++) {
            if (cards[i] == null) {
                cards[i] = card;
                break;
            }
        }
    }
}
