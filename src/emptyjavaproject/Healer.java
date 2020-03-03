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
public class Healer extends Hero{
    public Healer (GameBoard game, Point point){
        super(game, point);
        color = "blue";
        maxHp = 500;
        maxDamage = 100;
    }
    
    
}
