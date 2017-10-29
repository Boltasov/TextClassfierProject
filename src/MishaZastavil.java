/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alex
 */
public class MishaZastavil {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println(1000/val);
        } catch (InputMismatchException  e)   {
            System.out.println("Поймали ошибку !"); 
        
        } catch (ArithmeticException e)   {
            System.out.println("Поймали ошибку!"); }
        finally {
            System.out.println("Всегда");
        }
    }
}
