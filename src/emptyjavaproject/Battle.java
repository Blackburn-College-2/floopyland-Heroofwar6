/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author cameron.shinall
 */
public class Battle {
    private Hero hero;
    public Battle(Hero hero){
        this.hero = hero;
    }
    public boolean isBattling(){
        if(this.hero.isInBattle()){
            return true;
        }
        return false;
    }
    public void fight(){
        if(this.isBattling()){
            this.hero.enemy();
        }
    }
}
