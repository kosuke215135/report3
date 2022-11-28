package jp.ac.uryukyu.ie.e215135;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    @Test void attackWithWeponSkillTest(){
        int defaultattack = 100;
        Warrior demoHero = new Warrior("デモ勇者", 100, defaultattack);
        Enemy slime = new Enemy("スライムもどき", 1000, 1);
        for(int count=0; count<3; count++){
            int beforehitPoint = slime.hitPoint; 
            demoHero.attackWithWeponSkill(slime);
            int damage = beforehitPoint - slime.hitPoint;
            assertEquals(defaultattack*1.5, damage);
        }
    }
}
