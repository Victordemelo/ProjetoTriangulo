/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author victo
 */
import java.util.Scanner;
import model.Triangulo;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Triangulo trill = new Triangulo();
        
        System.out.println("Triangulo:" + trill);
        
        System.out.println("Digite a base: ");
        trill.setBase(leitor.nextDouble());
        
        System.out.println("Digite a Altura: ");
        trill.setAltura(leitor.nextDouble());
        
        System.out.println("A area é: " + trill.getArea());
    }
}
