package Lesson1;


    import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;


    public class Prjmougolnik extends JFrame {
        private static final long serialVersionUID = 1L;
        private int hght;

        /**
         *
         */
        public Prjmougolnik() {
            super("Лабораторна робота №1 Гринюк А.М.");
            setSize(700, 500);
            setVisible(true);
        }

        @Override
        public void paint(Graphics g) {

            Graphics2D gr2d = (Graphics2D) g;
            gr2d.setBackground(Color.green);

            gr2d.setColor(Color.red);
            gr2d.fillRect(200, 50, 100, hght);

        }

        public static void main(String args[]) {
            Prjmougolnik app = new Prjmougolnik();
        }
    }

