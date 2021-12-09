package repetidor;

import java.util.Scanner;

public class Repetidor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Escolha uma opção");
        System.out.println("1 - 7 Guilhermes");
        System.out.println("2 - 0 a 20");
        System.out.println("3 - Ver o idioma do sistema");
        System.out.println("4 - Tabuada");
        System.out.println("5 - Soma");
        System.out.println("6 - Nome ");
        System.out.println("7 - Fatorial");
        
        int num = in.nextInt();
        switch (num ){
            case 1:
                int i=1;  
                while(i<=7){  
                    System.out.println(i + " Guilherme");  
                i++;  
                } 
                break;
            case 2:
                int n = 1;
                while(n<=20){  
                    System.out.println( n );  
                n++;  
                }
                break;
            case 3:
                Scanner input = new Scanner(System.in);
                String nome, a;

                System.out.println("Digite o seu nome: ");
                nome = input.nextLine();

                for (int o = 0; o <= 15; ) {
                    System.out.println(nome);
                    o++;
                }
                break;
            case 4:
                int um, calc;
                System.out.println("Insira um numero");
                um = in.nextInt();
                
                for (int t = 0; t <= 10; ) {
                    calc = t * um;
                    System.out.println( um + "x" + t + "=" + calc );  
                    t++;  
                }
                break;
            case 5:
                int one, dois, calculo, cont;
                
                   do{  
     
                       System.out.println("Informe o primeiro numero"); 
                       one = in.nextInt();
                       System.out.println("Agora o segundo");
                       dois = in.nextInt();
                       calculo = one + dois;
                       System.out.println("O resultado da some é :" + calculo);
                       System.out.println("Gostaria de fazer outra soma ?");
                       System.out.println("1 -Sim");
                       System.out.println("2 - Não");
                       cont = in.nextInt();
                       
                   }while(cont==1);{}
                break;
            case 6:
                String nom;
                int dnovo = 0;
                do{  
                    if(dnovo == 1){
                        System.out.println("Nome invalido, tente novamente");
                        System.out.println("Informe o seu nome"); 
                        nom = in.next();
                    }else {
                        System.out.println("Informe o seu nome"); 
                        nom = in.next();
                    }
                        
                        if(nom == null){
                            dnovo = 1;
                        }else {
                            dnovo = 0;
                        }
                   }while(dnovo==1);{}
                break;
            case 7:
                Scanner ent = new Scanner(System.in);
        int mun, fat = 1;
        int tnoc = 1;

        do{
            System.out.println("Digite um nº");
            mun = ent.nextInt();
            
            for(int r = 1;r <= mun; r++){
                fat = fat * r;
            }
            
            System.out.println("!" + mun + " = " + fat);
            tnoc++;
            
       }while(tnoc < 2);

            }
       }
    }

         
    
    

