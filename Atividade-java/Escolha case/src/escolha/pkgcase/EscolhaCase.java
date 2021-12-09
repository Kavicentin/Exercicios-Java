package escolha.pkgcase;

import java.util.Scanner;

public class EscolhaCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Escolha uma opção");
        System.out.println("1 - Meses");
        System.out.println("2 - Ver a resolução da tela");
        System.out.println("3 - Ver o idioma do sistema");
        int num = in.nextInt();
          
                
        switch (num) {
            case 1: 
                System.out.println("Escolha o mês");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                System.out.println("5");
                System.out.println("6");
                System.out.println("7");
                System.out.println("8");
                System.out.println("9");
                System.out.println("10");
                System.out.println("11");
                System.out.println("12");
             
             int numm = in.nextInt();
             
             switch (numm) {
                 case 1:
                     System.out.println("Janeiro");
                     break;
                     
                 case 2:
                     System.out.println("Feverreiro");
                     
                     break;
                     
                 case 3:
                     System.out.println("Março");
                     
                     break;
                     
                 case 4:
                     System.out.println("Abril");
                     
                     break;
                     
                 case 5:
                     System.out.println("Maio");
                     
                     break;
                 case 6:
                     System.out.println("Junho");
                     
                     break;
                 case 7:
                     System.out.println("Julho");
                     
                     break;
                 case 8:
                     System.out.println("Agosto");
                     
                     break;
                 case 9:
                     System.out.println("Setembro");
                     
                     break;
                 case 10:
                     System.out.println("Outubro");
                     
                     break;
                 case 11:
                     System.out.println("Novembro");
                     
                     break;
                 case 12:
                     System.out.println("Dezembro");
                     
                     break;
             }
            case 2:
                System.out.println("Escolha o dia");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                System.out.println("5");
                System.out.println("6");
                System.out.println("7");
                
                int nuum = in.nextInt();
                switch (nuum) {
                    case 1:
                        System.out.println("Domingo");
                        
                        break;
                    case 2:
                        System.out.println("Segunda");
                        
                        break;
                    case 3:
                        System.out.println("Terça");
                        
                        break;
                    case 4:
                        System.out.println("Quarta");
                        
                        break;
                    case 5:
                        System.out.println("Quinta");
                        
                        break;
                    case 6:
                        System.out.println("Sexta");
                        
                        break;
                    case 7:
                        System.out.println("Sabado");
                        
                        break;
                }
            case 3:
                System.out.println("Escolha um animal");
                System.out.println("1 - Gato");
                System.out.println("2 - Cachorro");
                System.out.println("3 - Cavalo");
                System.out.println("4 - porco");
                
                int escolha = in.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Cat");
                        
                        break;
                    case 2:
                        System.out.println("Dog");
                        
                        break;
                    case 3:
                        System.out.println("Hourse");
                        
                        break;
                    case 4:
                        System.out.println("Pig");
                        
                        break;
                }
                
        }
    }
    
}
