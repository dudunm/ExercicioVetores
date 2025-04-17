package com.mycompany.vetores;

public class Vetores {

    public static void main(String[] args) {
        
        String nomes[ ] = new String[3];
        nomes[0] = "Unisul";
        nomes[1] = "Aluno";
        nomes[2] = "Sistema";
        for(int i = 0; i < 3; i++) {
            System.out.println("o nome na posição "+i+ " é "+ nomes[i] );
        }
    }
}
