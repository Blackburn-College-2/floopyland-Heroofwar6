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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String enemy() {
        return "HERO";
    }

    @Override
    public void gameTickAction(long arg0) {
        if (location.y <= gameboard.getHeight()-1 && location.x + 1 <= gameboard.getWidth()-1) {
            gameboard.getGameSquare(location).removeHero(this);
            location.x++;
            gameboard.getGameSquare(location).addHero(this);
        }
    }

    @Override
    protected void die() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isDead() {
        //change this
        return false;
    }

}
