/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.caf82.lectures.lecture02;

/**
 *
 * @author alex
 */
public class MathService {
    
  public static double dotProduct(double[] a, double[] b){
      double result = 0;
      for (int i = 0; i<a.length; i++) {
          result +=a[i]*b[i];
      }
     
      return result;
  }  
  
  public static double sigmoid(double x){
      double sigm;
      sigm = 1/(1+Math.exp(-x));
      return sigm;
  }
  
  public static double sigmoid (double[] x, double[] w) {
      double sigm;
      double z;
      z = dotProduct(x,w);
      sigm = sigmoid(z);
      return sigm;
  }
  
}