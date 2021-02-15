/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brokertool;

import javax.swing.JFrame;

/**
 *
 * @author sangwon
 */
public class BrokerTool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JFrame.setDefaultLookAndFeelDecorated(true);
         new BrokerUi().setVisible(true);
    }
    
}
