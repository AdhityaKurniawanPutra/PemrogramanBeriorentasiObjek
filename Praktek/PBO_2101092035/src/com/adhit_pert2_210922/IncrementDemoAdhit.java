/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adhit_pert2_210922;

/**
 *
 * @author ACER
 */
public class IncrementDemoAdhit {
 public static void main(String[] args){
        int i = 10;
        int j = 3;
        int k = 0;
        
        k = j++ +i;
      
        System.out.println("k :" + k);
        System.out.println("j :" + j);
    }
}