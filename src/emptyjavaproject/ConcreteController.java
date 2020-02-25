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
    GameBoard halo;
    int numOfHeros;
    
    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard arg0, int arg1) {
        halo = arg0;
        numOfHeros = arg1;
        ArrayList<BaseHero> herrro = new ArrayList<>();
        for (int i = 0; i < numOfHeros; i++) {
            herrro.add(new Hero(halo,new Point(0,1)));
        }
        return herrro;
        
    }

    @Override
    public GameBoard mkGameBoard() {
        GameBoard halo = new GameBoard();
        return halo;
    }
    
}
