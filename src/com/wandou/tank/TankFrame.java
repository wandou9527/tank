package com.wandou.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author liming
 * @date 2020/8/22
 * @description
 */
public class TankFrame extends Frame {

    int x = 200, y = 200;

    public TankFrame() {
        setSize(800, 600);
        setResizable(false);
        setTitle("tank war");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        addKeyListener(new MyKeyListener());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        System.out.println("paint");
        g.fillRect(x, y, 50, 50);
//        x = x + 10;
//        y = y + 10;
    }


    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("key pressed: " + e);
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    x -= 10;
                    break;
                case KeyEvent.VK_RIGHT:
                    x += 10;
                    break;
                case KeyEvent.VK_UP:
                    y -= 10;
                    break;
                case KeyEvent.VK_DOWN:
                    y += 10;
                    break;
                default:
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released: " + e);
        }
    }
}
