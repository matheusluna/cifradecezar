/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.entidade;

/**
 *
 * @author mathe
 */
public class Cifra {
    public static String criptografa(String msg, int chave){
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] alfabeto2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
            "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"};
        String crip = "";
        for(int i = 0; i < msg.length(); i++){
            if(msg.substring(i, i+1).equals(" ")){
                crip += " ";
            }else{
                for(int j = 0; j < alfabeto.length; j++){
                    if(msg.substring(i, i+1).toUpperCase().equals(alfabeto[j])){
                        int cont = 0;
                        if(j+chave >= alfabeto.length){
                            cont = (j+chave)-alfabeto.length;
                        }else{
                            cont = j+chave;
                        }
                        crip += alfabeto[cont]+alfabeto2[cont];
                    }
                }
            }
        }
        return crip;
    }
    
    public static String descriptografa(String msg, int num){
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String crip = "";
        for(int i = 0; i < msg.length(); i++){
            if(msg.substring(i, i+1).equals(" ")){
                crip += " ";
            }else{
                for(int j = 0; j < alfabeto.length; j++){
                    if(msg.substring(i, i+1).toUpperCase().equals(alfabeto[j])){
                        int cont = 0;
                        if(j-num < 0){
                            cont = (j-num)+alfabeto.length;
                        }else{
                            cont = j-num;
                        }
                        crip += alfabeto[cont];
                    }
                }
            }
        }
        return crip;
    }
}
