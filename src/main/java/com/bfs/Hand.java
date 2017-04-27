package com.bfs;


public class Hand {
    private Card[] cards = new Card[0];

    public Hand() {}

    public void setCards(Card[] dealedCards) {
        cards = dealedCards;
    }
    public Card[] getCards() {
        return cards;
    }
}
