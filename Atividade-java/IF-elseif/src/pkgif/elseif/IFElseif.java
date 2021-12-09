package pkgif.elseif;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IFElseif {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);;
        
        System.out.println("Escolha uma opção");
        System.out.println("1 - IMC completo");
        System.out.println("2 - messes");
        System.out.println("3 - Dias da semana");
        System.out.println("4 - Animais");
        
        int num = in.nextInt();
        
        
        switch (num){
            case 1:
                float altura, calc, peso;
                //Entrada
                System.out.println("Vamos calcular o seu IMC.");
                System.out.println("Para começar informe o seu peso:");
                peso = in.nextFloat();
                System.out.println("Agora a sua altura:");
                altura = in.nextFloat();
                
                //Processamento 
                calc = peso / (altura * altura );
                System.out.println(calc);
                
                //Saida
                if( calc < 18.5  ){
                    System.out.println("você esta abaoxo do peso" );
                }else if (calc >= 18.5 && calc <= 24.9) {
                    System.out.println("Você esta no pesso normal");
                }else if ( calc >= 25 && calc <= 29.9 ) {
                    System.out.println("Você esta com sobrepeso");
                }else if ( calc >= 30 && calc <= 34.9){
                    System.out.println("Voce esta com obesidade grau 1");
                }else if ( calc >= 35 && calc <= 39.9) {
                    System.out.println("Você tem obesidade grau 2");
                }else if ( calc >= 40) {
                    System.out.println("Você tem obesidade grau 3 ou mórbida" );
                }
                break;    
            case 2:
                int escolha;
                
                //Entrada 
                System.out.println("Informe um numero de 1 a 12 ");
                escolha = in.nextInt();
                
                //Processamento
                if (escolha == 1) {
                    System.out.println("O mes escolhido foi janeiro");
                }else if ( escolha == 2 ) {
                    System.out.println("O mes escolhido foi fevereiro");
                }else if ( escolha == 3 ) {
                    System.out.println("O mes escolhido foi março");
                }else if ( escolha == 4 ) {
                    System.out.println("O mes escolhido foi abril");
                }else if ( escolha == 5 ) {
                    System.out.println("O mes escolhido foi maio");
                }else if ( escolha == 6 ) {
                    System.out.println("O mes escolhido foi junho");
                }else if ( escolha == 7 ) {
                    System.out.println("O mes escolhido foi julho");
                }else if ( escolha == 8 ) {
                    System.out.println("O mes escolhido foi agoesto");
                }else if ( escolha == 9 ) {
                    System.out.println("O mes escolhido foi setembro");
                }else if ( escolha == 10 ) {
                    System.out.println("O mes escolhido foi outubro");
                }else if ( escolha == 11 ) {
                    System.out.println("O mes escolhido foi novembro");
                }else if ( escolha == 12 ) {
                    System.out.println("O mes escolhido foi dezembro");
                }else {
                    System.out.println("Numero invalido");
                }
                break;
               case 3:
                int semana;
                
                //Entrada 
                System.out.println("Informe um numero de 1 a 12 ");
                semana = in.nextInt();
                
                //Processamento
                if (semana == 1) {
                    System.out.println("O dia escolhido foi segunda");
                }else if ( semana == 2 ) {
                    System.out.println("O dia escolhido foi terça");
                }else if ( semana == 3 ) {
                    System.out.println("O dia escolhido foi quarta");
                }else if ( semana == 4 ) {
                    System.out.println("O dia escolhido foi quinta");
                }else if ( semana == 5 ) {
                    System.out.println("O dia escolhido foi sexta");
                }else if ( semana == 6 ) {
                    System.out.println("O dia escolhido foi sabado");
                }else if ( semana == 7 ) {
                    System.out.println("O dia escolhido foi domingo");
                }
                break;
               case 4:
                   
                    //Entradas
                   System.out.println("Escreva o animal escolhiddo, opções validas;");
                   System.out.println("1 - Gato");
                   System.out.println("2 - Cachorro");
                   System.out.println("3 - Passaro");
                   System.out.println("4 - Coelho");
                   int esc = in.nextInt();
                   
                   
                   //Processamento
                   if ( esc == 1) {
                       System.out.println("Cat");
                   }else if ( esc == 2) {
                       System.out.println("Dog");
                   }else if ( esc == 3) {
                       System.out.println("Brid");
                   }else if ( esc == 4) {
                       System.out.println("Bunny");
                   }else {
                       System.out.println("opção invalida");
                   }

        }
    }
    
}
