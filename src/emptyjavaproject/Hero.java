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
        int gox = location.x;
        int goy = location.y;
        while (!move) {
            if (change == 1) {
                if (gox++ <= gameboard.getWidth() - 1 && gox++ >= 0) {
                    gameboard.getGameSquare(location).removeHero(this);
                    location.x++;
                }
            } else if (change == 2) {
                if (gox-- <= gameboard.getWidth() - 1 && gox-- >= 0) {
                    gameboard.getGameSquare(location).removeHero(this);
                    location.x--;
                }
            } else if (change == 3) {
                if (goy++ <= gameboard.getHeight() - 1 && goy++ >= 0) {
                    gameboard.getGameSquare(location).removeHero(this);
                    location.y++;
                }
            } else if (change == 4) {
                if (goy-- <= gameboard.getHeight() - 1 && goy-- >= 0) {
                    gameboard.getGameSquare(location).removeHero(this);
                    location.y--;
                }
            }
            if (location.x < 0||location.x>gameboard.getHeight()-1) {
                change = (int) ((Math.random() * 4) + 1);
            } else if(location.y<0||location.y>gameboard.getWidth()-1){
                change = (int) ((Math.random()*4)+1);
            }else{
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
