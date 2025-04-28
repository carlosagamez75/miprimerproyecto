/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangulo;

/**
 *
 * @author Gestion Humana
 */
public class Rectangulo {
    private int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int calcularArea() {
        int base = Math.abs(x2 - x1);
        int altura = Math.abs(y2 - y1);
        return base * altura;
    }

    public void escalar(double factor) {
        x2 = x1 + (int)((x2 - x1) * factor);
        y2 = y1 + (int)((y2 - y1) * factor);
    }

    public boolean contienePunto(int x, int y) {
        int minX = Math.min(x1, x2);
        int maxX = Math.max(x1, x2);
        int minY = Math.min(y1, y2);
        int maxY = Math.max(y1, y2);
        return (x >= minX && x <= maxX) && (y >= minY && y <= maxY);
    }

    public void moverHorizontal(int unidades) {
        x1 = x1 + unidades;
        x2 = x2 + unidades;
    }

    public void moverVertical(int unidades) {
        y1 = y1 + unidades;
        y2 = y2 + unidades;
    }

    public String toString() {
        return "Desde (" + x1 + ", " + y1 + ") hasta (" + x2 + ", " + y2 + ")";
    }
}
