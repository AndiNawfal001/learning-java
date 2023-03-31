package com.tutorial.oracle_academy;

import java.applet.Applet;
import java.awt.*;

class siswa extends Applet {
    private String nama = "default name";
    int umur;
    String color;

    // public void paint(Graphics g) {
    // Graphics2D g2 = (Graphics2D) g;
    // Rectangle testRectangle = new Rectangle(5, 10, 20, 30);
    // g2.draw(testRectangle);
    // }

    public void paint(Graphics g) {
        int[] xPoints = { 0, 40, 80 };
        int[] yPoints = { 50, 50, 50 };
        g.setColor(Color.blue);
        g.fillPolygon(xPoints, yPoints, 3);
        int[] x2Points = { 80, 160, 0 };
        int[] y2Points = { 50, 140, 140 };
        g.setColor(Color.black);
        g.fillPolygon(x2Points, y2Points, 3);
    }

    protected siswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        System.out.println(this.nama);
        System.out.println(this.umur);
    }

    public void setColor(String c) {
        this.color = c;
    }
}

public class section7 {
    public static void main(String[] args) {
        siswa aku;
        aku = new siswa("andi", 17);
    }

}
