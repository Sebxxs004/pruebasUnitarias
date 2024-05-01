/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package clases;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }

    @Test
    public void testGetNumero1() {
        System.out.println("getNumero1");
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.getNumero1();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNumero1() {
        System.out.println("setNumero1");
        int numero1 = 0;
        Operaciones instance = new Operaciones();
        instance.setNumero1(numero1);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNumero2() {
        System.out.println("getNumero2");
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.getNumero2();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNumero2() {
        System.out.println("setNumero2");
        int numero2 = 0;
        Operaciones instance = new Operaciones();
        instance.setNumero2(numero2);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Operaciones instance = new Operaciones();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        int n1 = 0;
        int n2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.suma(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        int n1 = 0;
        int n2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.resta(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMult() {
        System.out.println("mult");
        int n1 = 0;
        int n2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.mult(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDiv() {
        System.out.println("div");
        int n1 = 0;
        int n2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.div(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPorc() {
        System.out.println("porc");
        int n1 = 0;
        int n2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.porc(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPot() {
        System.out.println("pot");
        int n1 = 0;
        int n2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.pot(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
