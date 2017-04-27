package com.bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lukman on 4/24/17.
 */
public class TCG {
    private Player playerSigma;
    private Player playerAlpha;

    public void TCG() {
        playerSigma = new Player("rho first");
        playerAlpha = new Player("sigma loser");

    }

    public Player chooseRandomPlayer() {
        List<Player> players = Arrays.asList(playerAlpha, playerSigma);
        Collections.shuffle(players);
        return players.get(0);
    }

    public void start() {

    }



    public void stop() {

    }

}
