/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto2;

import Rectangulo.Rectangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author Gestion Humana
 */
public class Punto2 {

    public static void main(String[] args) {
        int x1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa x1:"));
        int y1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa y1:"));
        int x2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa x2:"));
        int y2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa y2:"));

        Rectangulo r = new Rectangulo(x1, y1, x2, y2);
        JOptionPane.showMessageDialog(null, "Rectángulo creado: " + r.toString());

        JOptionPane.showMessageDialog(null, "Área: " + r.calcularArea());

        double factor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el factor de escala (ej. 1.5 o 0.5):"));
        r.escalar(factor);
        JOptionPane.showMessageDialog(null, "Rectángulo escalado: " + r.toString());

        int px = Integer.parseInt(JOptionPane.showInputDialog("Ingresa x del punto:"));
        int py = Integer.parseInt(JOptionPane.showInputDialog("Ingresa y del punto:"));

        if (r.contienePunto(px, py)) {
            JOptionPane.showMessageDialog(null, "El punto está DENTRO del rectángulo.");
        } else {
            JOptionPane.showMessageDialog(null, "El punto está FUERA del rectángulo.");
        }

        String direccion = JOptionPane.showInputDialog("¿Quieres mover horizontal o vertical?");
        int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas unidades deseas mover?"));

        if (direccion.equalsIgnoreCase("horizontal")) {
            r.moverHorizontal(unidades);
        } else if (direccion.equalsIgnoreCase("vertical")) {
            r.moverVertical(unidades);
        } else {
            JOptionPane.showMessageDialog(null, "Opción no válida.");
        }

        JOptionPane.showMessageDialog(null, "Rectángulo final: " + r.toString());
    }
}
