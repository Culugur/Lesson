package Igri;

import javax.swing.*;

public class Jframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame(/* название нашей игры */);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}
