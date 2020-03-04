/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import com.pauliankline.floopyconnector.BaseHero;
import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 *
 * @author cameron.shinall
 */
public class Hero extends BaseHero {

    public Hero(GameBoard game, Point point) {
        super(game, point);
        game.getGameSquare(point).addHero(this);
    }

    @Override
    public boolean isInBattle() {
        location.x++;
        if (gameboard.getGameSquare(location).heroesArePresent()) {
            location.x--;
            return true;
        }
        location.y++;
        if (gameboard.getGameSquare(location).heroesArePresent()) {
            location.y--;
            return true;
        }
        location.x--;
        if (gameboard.getGameSquare(location).heroesArePresent()) {
            location.x++;
            return true;
        }
        location.y--;
        if (gameboard.getGameSquare(location).heroesArePresent()) {
            location.y++;
            return true;
        }
        return false;
    }

    @Override
    public String enemy() {
        return "HERO";
    }

    @Override
    public void gameTickAction(long arg0) {

        int change = (int) ((Math.random() * 4) + 1);
        boolean move = false;
        while (!move) {

            if (change == 1) {
                if (location.x++ + 1 <= gameboard.getWidth() - 1) {
                    gameboard.getGameSquare(location).removeHero(this);
                    location.x++;
                }
            } else if (change == 2) {
                if (location.x-- + 1 <= gameboard.getWidth() - 1) {
                    gameboard.getGameSquare(location).removeHero(this);
                    location.x--;
                }
            } else if (change == 3) {
                if (location.y++ <= gameboard.getHeight() - 1) {
                    gameboard.getGameSquare(location).removeHero(this);
                    location.y++;
                }
            } else if (change == 4) {
                if (location.y-- <= gameboard.getHeight() - 1) {
                    gameboard.getGameSquare(location).removeHero(this);
                    location.y--;
                }
            }
            if (gameboard.getGameSquare(location).heroesArePresent()) {
                change = (int) ((Math.random() * 4) + 1);
            } else {
                move = true;
            }
        }

        gameboard.getGameSquare(location).addHero(this);
    }

    @Override
    protected void die() {
        if (this.isDead()) {
            gameboard.getGameSquare(location).removeHero(this);
        }
    }

    @Override
    public boolean isDead() {
        //change this
        if (hp == 0) {
            return true;
        } else {

            return false;
        }
    }

}
