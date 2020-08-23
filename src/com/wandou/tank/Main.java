package com.wandou.tank;

/**
 * @author liming
 * @date 2020/8/22
 * @description
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();
        while (true) {
            tankFrame.repaint();
            Thread.sleep(50);
        }
    }
}
