/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 992005923
 */
import java.util.Random;
public class SlotMachine {

    public SlotMachine(){
    }

    public String random(){
        Random randNum = new Random();
        int r = randNum.nextInt(6);
        String slot = "";
        
        switch (r) {
            case 0:
                slot = "Cherries";
                break;
            case 1:
                slot = "Oranges";
                break;
            case 2:
                slot = "Plums";
                break;
            case 3:
                slot = "Bells";
                break;
            case 4:
                slot = "Melons";
                break;
            case 5:
                slot = "Bars";
                break;
            default:
                break;
        }
        return slot;
    }
}
