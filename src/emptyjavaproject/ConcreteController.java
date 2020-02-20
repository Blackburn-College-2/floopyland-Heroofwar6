/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import com.pauliankline.floopyconnector.BaseHero;
import com.pauliankline.floopyconnector.GameBoard;
import com.pauliankline.floopyconnector.GameController;
import java.util.ArrayList;

/**
 *
 * @author cameron.shinall
 */
public class ConcreteController extends GameController {

    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard arg0, int arg1) {
        return this.createHeroes(arg0, arg1);
    }

    @Override
    public GameBoard mkGameBoard() {
        return this.mkGameBoard();
    }
    
}
