/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author sebas
 */
public class Operaciones {
    private int numero1, numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operaciones() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Operaciones{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    public int suma(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        return n2 + n1;
    }
    public int resta(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        return n2 - n1;
    }
    public int mult(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        return n2 * n1;
    }
    public int div(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        return n2 * n1;
    }
    public int porc(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        return n2 % n1;
    }
    public int pot(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        return (int) Math.pow(n1, n2);
    }
}
