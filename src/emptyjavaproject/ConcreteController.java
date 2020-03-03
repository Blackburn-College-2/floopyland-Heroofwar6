/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import com.pauliankline.floopyconnector.*;
import com.pauliankline.floopyconnector.GameBoard;
import com.pauliankline.floopyconnector.GameController;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author cameron.shinall
 */
public class ConcreteController extends GameController {
    
    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard gb, int quantity) {
        ArrayList<BaseHero> bh = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            //make random between heroes
            int l = (int)((Math.random()*quantity)+1);
            int x = (int)((Math.random()*gb.getWidth())-1);
            int y = (int)((Math.random()*gb.getHeight())-1);
            Hero h = null; //= new Hero(gb, new Point(x, y));
            if(l==1){
                h = new Healer(gb, new Point(x,y));
            }else if(l == 2){
                h = new Tanker(gb, new Point(x,y));
            }else if(l == 3){
                h = new Thief(gb, new Point(x,y));
            }else if(l== 4){
                h = new Ninja(gb, new Point(x,y));
            }else if(l==5){
                h = new Soldier(gb, new Point(x,y));
            }
            
            bh.add(h);
        }
        return bh;
        
    }

    @Override
    public GameBoard mkGameBoard() {
        GameBoard gb = new GameBoard();
        return gb;
        
    }
    
}
