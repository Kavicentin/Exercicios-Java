
package hello;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Desafio {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);;
        
        System.out.println("Escolha uma opção");
        System.out.println("1 - Calcular área");
        System.out.println("2 - Comprar ferraduras");
        System.out.println("3 - Soma");
        System.out.println("4 - Média");
        System.out.println("5 - loja");
        System.out.println("6 - IMC basico");
        System.out.println("7 - Total economizado");
        System.out.println("8 - Total llitros");
        System.out.println("9 - Taboada");
        
        int num = in.nextInt();
        
        
        switch (num){
            case 1:
                // Declaração de varriaveis
                int b, h, area;
                //Entrada
                 System.out.println("Vamos calcular a área do retângulo!");
                 System.out.println("Primeiro informe qual é a medida da base do retângulo:");
                 b = in.nextInt();
                 System.out.println("Agora informe a altura do retângulo");
                 h = in.nextInt();
                //Processamento
                area = b * h;
                //Saida
                if(b == h) {
                    System.out.println("A área do quadrado é " + area + " Metros quadrados");
                } else {
                    System.out.println("A área do retângulo é " + area + " Metros quadrados");
                }
                break;
            case 2:
                // Declaração de varriaveis
                int f, cav;
                float valor, total;
                
                //Entrada
                System.out.println("Quantos cavalos prcisam de ferraduras ??");
                cav = in.nextInt();
                //processamento
                f = cav * 4;
                valor =  9.90f;
                total = valor * f;
                //Saida
                System.out.println("Você vai precisar de " + f + " ferraduras");
                System.out.println("E vai sair no valor de " + total + " Reais");
                break;
            case 3:
                // Declaração de varriaveis
                int B, A, soma;
                //Entrada
                System.out.println("Vamos fazer a soma !");
                System.out.println("Primeiro informe qual o primeiro numero da soma:");
                A = in.nextInt();
                System.out.println("Agora informe o segundo numero da soma:");
                B = in.nextInt();
                //Processamento
                soma = A + B;
                //Saida
                System.out.println("O resultado da soma é : " + soma);
                break;
            case 4:
                // Declaração de varriaveis
                int first, second, third, calcMedia, Total;
                //Entrada
                System.out.println("Vamos calcular a média!");
                System.out.println("Primeiro informe qual o primeiro numero :");
                first = in.nextInt();
                System.out.println("Agora informe o segundo numero:");
                second = in.nextInt();
                System.out.println("E por fim, informe o ultimo numero :");
                third = in.nextInt();
                
                //processamento
                calcMedia = first + second + third;
                Total = calcMedia / 3;
                //saida
                System.out.println("A media dos numeros que vc passou é de :" + Total);
                break;
            case 5:
                // Declaração de variaveis
                float precoprod, valorTotal, quant, porcent, valordesconto;
                DecimalFormat Decimal = new DecimalFormat("00.00");
                //entrada
                System.out.println("Quantos produtos você pegou ?");
                quant = in.nextFloat();
                
                //processamento
                porcent = 0.05F;
                precoprod = 1.99F;
                valordesconto = precoprod * quant * porcent ;
                valorTotal = precoprod * quant - valordesconto;

                //Saida
                System.out.println("O valor total da sua compra com 5% de desconto é de: " + Decimal.format(valorTotal));
                break;
            case 6:
                //Variaveis
                double peso, altura, imc, prep;
                DecimalFormat deci = new DecimalFormat("0.000");
                //Entrada 
                System.out.println("Para começar, preciso que informe a sua altura:");
                altura = in.nextDouble();
                System.out.println("Agora informe o seu peso:");
                peso = in.nextDouble();
                
                //processamento 
                prep = altura * altura;
                imc = prep / peso;
                     
                //Saida
                System.out.println("O seu IMC é de :" + deci.format(imc));
                break;
            case 7:
                // variaveis
                double um, rcinco, rdez, rvinte, rcinquenta, rumreal, totalmoedas, rum ,cinco, dez, vinte, cinquenta, umreal;
                DecimalFormat decimal = new DecimalFormat("0.00");
                //entrada
                System.out.println("Para começarmos vou precisar de algumas informaçoes !");
                System.out.println("Primeiro me informe a quantidade de moedas de 1 real:");
                umreal = in.nextDouble();
                System.out.println("Agora a quantidade de moedas de 50 centavos:");
                cinquenta = in.nextDouble();
                System.out.println("Agora as de 25 centavos:");
                vinte = in.nextDouble();
                System.out.println("Estamos quase acabando, agora vou precisar da quantidade de moedas de 10 centavos");
                dez = in.nextDouble();
                System.out.println("Agora de 5 centavos:");
                cinco = in.nextDouble();
                System.out.println("E por ultimo a quantidade de moedas de 1 centavo:");
                um = in.nextDouble();
                
                //Processaemtno 
                rum = um / 100;
                rcinco = cinco / 20;
                rdez = dez / 10;
                rvinte = vinte / 4;
                rcinquenta = cinquenta / 2;
                rumreal = umreal;
                
               totalmoedas = rcinco + rdez + rvinte + rcinquenta + rumreal + rum;
               
               
               //saida
               System.out.println("O tatal economizado é de: " + decimal.format(totalmoedas) + " reais");
               break;
            case 8:
                int lata, garrafa, garrafagrande, totallata, totalgarrafa, totalgarrafagrande;
                float totallitros, dividido;
                
                //Entrada
                System.out.println("Para começarmos preciso de algumas informações. Quantas latas vc gostaria de comprar ?");
                lata = in.nextInt();
                System.out.println("E quantas garrafas de 600ml ?");
                garrafa = in.nextInt();
                System.out.println("E por ultimo, quantas garrafas de 2 litros ?");
                garrafagrande = in.nextInt();
                
                //processamento
                totallata = lata * 350;
                totalgarrafa = garrafa * 600;
                totalgarrafagrande = garrafagrande * 2000;
                
                totallitros = totallata + totalgarrafa + totalgarrafagrande;
                dividido = totallitros / 1000;
                //Saida
                System.out.println(dividido);
                break;
            case 9:
                int tabum, tabdois, tabtres, tabqutro, tabcinco, tabseis, tabsete, taboito, tabnove, tabdez, numero;
                
                System.out.println("Informe um numero de 1 a 10 :");
                numero = in.nextInt();
                
                //Processamento
                
                if(numero == 1) {
                    int calc1, calc2, calc3, calc4, calc5, calc6, calc7, calc8, calc9, calc10;
                            calc1 = 1 * 1;
                            calc2 = 1 * 2;
                            calc3 = 1 * 3;
                            calc4 = 1 * 4;
                            calc5 = 1 * 5;
                            calc6 = 1 * 6;
                            calc7 = 1 * 7;
                            calc8 = 1 * 8;
                            calc9 = 1 * 9;
                            calc10 = 1 * 10;
                            
                            System.out.println("1 X 1 = " + calc1);
                            System.out.println("1 X 2 = " + calc2);
                            System.out.println("1 X 3 = " + calc3);
                            System.out.println("1 X 4 = " + calc4);
                            System.out.println("1 X 5 = " + calc5);
                            System.out.println("1 X 6 = " + calc6);
                            System.out.println("1 X 7 = " + calc7);
                            System.out.println("1 X 8 = " + calc8);
                            System.out.println("1 X 9 = " + calc9);
                            System.out.println("1 X 10 = " + calc10);
                            break;
                }else if(numero == 2) {
                    int calc0x1, calc0x2, calc0x3, calc0x4, calc0x5, calc0x6, calc0x7, calc0x8, calc0x9, calc0x10;
                    
                            calc0x1 = 2 * 1;
                            calc0x2 = 2 * 2;
                            calc0x3 = 2 * 3;
                            calc0x4 = 2 * 4;
                            calc0x5 = 2 * 5;
                            calc0x6 = 2 * 6;
                            calc0x7 = 2 * 7;
                            calc0x8 = 2 * 8;
                            calc0x9 = 2 * 9;
                            calc0x10 = 2 * 10;
                            
                            System.out.println("2 X 1 = " + calc0x1);
                            System.out.println("2 X 2 = " + calc0x2);
                            System.out.println("2 X 3 = " + calc0x3);
                            System.out.println("2 X 4 = " + calc0x4);
                            System.out.println("2 X 5 = " + calc0x5);
                            System.out.println("2 X 6 = " + calc0x6);
                            System.out.println("2 X 7 = " + calc0x7);
                            System.out.println("2 X 8 = " + calc0x8);
                            System.out.println("2 X 9 = " + calc0x9);
                            System.out.println("2 X 10 = " + calc0x10);
                }else if(numero == 3) {
                    int calc0x1, calc0x2, calc0x3, calc0x4, calc0x5, calc0x6, calc0x7, calc0x8, calc0x9, calc0x10;
                    
                            calc0x1 = 3 * 1;
                            calc0x2 = 3 * 2;
                            calc0x3 = 3 * 3;
                            calc0x4 = 3 * 4;
                            calc0x5 = 3 * 5;
                            calc0x6 = 3 * 6;
                            calc0x7 = 3 * 7;
                            calc0x8 = 3 * 8;
                            calc0x9 = 3 * 9;
                            calc0x10 = 3 * 10;
                            
                            System.out.println("3 X 1 = " + calc0x1);
                            System.out.println("3 X 2 = " + calc0x2);
                            System.out.println("3 X 3 = " + calc0x3);
                            System.out.println("3 X 4 = " + calc0x4);
                            System.out.println("3 X 5 = " + calc0x5);
                            System.out.println("3 X 6 = " + calc0x6);
                            System.out.println("3 X 7 = " + calc0x7);
                            System.out.println("3 X 8 = " + calc0x8);
                            System.out.println("3 X 9 = " + calc0x9);
                            System.out.println("3 X 10 = " + calc0x10);
                }else if(numero == 4) {
                    int calc0x1, calc0x2, calc0x3, calc0x4, calc0x5, calc0x6, calc0x7, calc0x8, calc0x9, calc0x10;
                    
                            calc0x1 = 4 * 1;
                            calc0x2 = 4 * 2;
                            calc0x3 = 4 * 3;
                            calc0x4 = 4 * 4;
                            calc0x5 = 4 * 5;
                            calc0x6 = 4 * 6;
                            calc0x7 = 4 * 7;
                            calc0x8 = 4 * 8;
                            calc0x9 = 4 * 9;
                            calc0x10 = 4 * 10;
                            
                            System.out.println("4 X 1 = " + calc0x1);
                            System.out.println("4 X 2 = " + calc0x2);
                            System.out.println("4 X 3 = " + calc0x3);
                            System.out.println("4 X 4 = " + calc0x4);
                            System.out.println("4 X 5 = " + calc0x5);
                            System.out.println("4 X 6 = " + calc0x6);
                            System.out.println("4 X 7 = " + calc0x7);
                            System.out.println("4 X 8 = " + calc0x8);
                            System.out.println("4 X 9 = " + calc0x9);
                            System.out.println("4 X 10 = " + calc0x10);
                }else if(numero == 5) {
                    int calc0x1, calc0x2, calc0x3, calc0x4, calc0x5, calc0x6, calc0x7, calc0x8, calc0x9, calc0x10;
                    
                            calc0x1 = 5 * 1;
                            calc0x2 = 5 * 2;
                            calc0x3 = 5 * 3;
                            calc0x4 = 5 * 4;
                            calc0x5 = 5 * 5;
                            calc0x6 = 5 * 6;
                            calc0x7 = 5 * 7;
                            calc0x8 = 5 * 8;
                            calc0x9 = 5 * 9;
                            calc0x10 = 5 * 10;
                            
                            System.out.println("5 X 1 = " + calc0x1);
                            System.out.println("5 X 2 = " + calc0x2);
                            System.out.println("5 X 3 = " + calc0x3);
                            System.out.println("5 X 4 = " + calc0x4);
                            System.out.println("5 X 5 = " + calc0x5);
                            System.out.println("5 X 6 = " + calc0x6);
                            System.out.println("5 X 7 = " + calc0x7);
                            System.out.println("5 X 8 = " + calc0x8);
                            System.out.println("5 X 9 = " + calc0x9);
                            System.out.println("5 X 10 = " + calc0x10);
                }else if(numero == 6) {
                    int calc0x1, calc0x2, calc0x3, calc0x4, calc0x5, calc0x6, calc0x7, calc0x8, calc0x9, calc0x10;
                    
                            calc0x1 = 6 * 1;
                            calc0x2 = 6 * 2;
                            calc0x3 = 6 * 3;
                            calc0x4 = 6 * 4;
                            calc0x5 = 6 * 5;
                            calc0x6 = 6 * 6;
                            calc0x7 = 6 * 7;
                            calc0x8 = 6 * 8;
                            calc0x9 = 6 * 9;
                            calc0x10 = 6 * 10;
                            
                            System.out.println("6 X 1 = " + calc0x1);
                            System.out.println("6 X 2 = " + calc0x2);
                            System.out.println("6 X 3 = " + calc0x3);
                            System.out.println("6 X 4 = " + calc0x4);
                            System.out.println("6 X 5 = " + calc0x5);
                            System.out.println("6 X 6 = " + calc0x6);
                            System.out.println("6 X 7 = " + calc0x7);
                            System.out.println("6 X 8 = " + calc0x8);
                            System.out.println("6 X 9 = " + calc0x9);
                            System.out.println("6 X 10 = " + calc0x10);
                }
                else if(numero == 7) {
                    int calc0x1, calc0x2, calc0x3, calc0x4, calc0x5, calc0x6, calc0x7, calc0x8, calc0x9, calc0x10;
                    
                            calc0x1 = 7 * 1;
                            calc0x2 = 7 * 2;
                            calc0x3 = 7 * 3;
                            calc0x4 = 7 * 4;
                            calc0x5 = 7 * 5;
                            calc0x6 = 7 * 6;
                            calc0x7 = 7 * 7;
                            calc0x8 = 7 * 8;
                            calc0x9 = 7 * 9;
                            calc0x10 = 7 * 10;
                            
                            System.out.println("7 X 1 = " + calc0x1);
                            System.out.println("7 X 2 = " + calc0x2);
                            System.out.println("7 X 3 = " + calc0x3);
                            System.out.println("7 X 4 = " + calc0x4);
                            System.out.println("7 X 5 = " + calc0x5);
                            System.out.println("7 X 6 = " + calc0x6);
                            System.out.println("7 X 7 = " + calc0x7);
                            System.out.println("7 X 8 = " + calc0x8);
                            System.out.println("7 X 9 = " + calc0x9);
                            System.out.println("7 X 10 = " + calc0x10);
                }else if(numero == 8) {
                    int calc0x1, calc0x2, calc0x3, calc0x4, calc0x5, calc0x6, calc0x7, calc0x8, calc0x9, calc0x10;
                    
                            calc0x1 = 8 * 1;
                            calc0x2 = 8 * 2;
                            calc0x3 = 8 * 3;
                            calc0x4 = 8 * 4;
                            calc0x5 = 8 * 5;
                            calc0x6 = 8 * 6;
                            calc0x7 = 8 * 7;
                            calc0x8 = 8 * 8;
                            calc0x9 = 8 * 9;
                            calc0x10 = 8 * 10;
                            
                            System.out.println("8 X 1 = " + calc0x1);
                            System.out.println("8 X 2 = " + calc0x2);
                            System.out.println("8 X 3 = " + calc0x3);
                            System.out.println("8 X 4 = " + calc0x4);
                            System.out.println("8 X 5 = " + calc0x5);
                            System.out.println("8 X 6 = " + calc0x6);
                            System.out.println("8 X 7 = " + calc0x7);
                            System.out.println("8 X 8 = " + calc0x8);
                            System.out.println("8 X 9 = " + calc0x9);
                            System.out.println("8 X 10 = " + calc0x10);
                }else if(numero == 9) {
                    int calc0x1, calc0x2, calc0x3, calc0x4, calc0x5, calc0x6, calc0x7, calc0x8, calc0x9, calc0x10;
                    
                            calc0x1 = 9 * 1;
                            calc0x2 = 9 * 2;
                            calc0x3 = 9 * 3;
                            calc0x4 = 9 * 4;
                            calc0x5 = 9 * 5;
                            calc0x6 = 9  * 6;
                            calc0x7 = 9 * 7;
                            calc0x8 = 9 * 8;
                            calc0x9 = 9 * 9;
                            calc0x10 = 9 * 10;
                            
                            System.out.println("9 X 1 = " + calc0x1);
                            System.out.println("9 X 2 = " + calc0x2);
                            System.out.println("9 X 3 = " + calc0x3);
                            System.out.println("9 X 4 = " + calc0x4);
                            System.out.println("9 X 5 = " + calc0x5);
                            System.out.println("9 X 6 = " + calc0x6);
                            System.out.println("9 X 7 = " + calc0x7);
                            System.out.println("9 X 8 = " + calc0x8);
                            System.out.println("9 X 9 = " + calc0x9);
                            System.out.println("9 X 10 = " + calc0x10);
                }else if(numero == 10) {
                    int calc0x1, calc0x2, calc0x3, calc0x4, calc0x5, calc0x6, calc0x7, calc0x8, calc0x9, calc0x10;
                    
                            calc0x1 = 10 * 1;
                            calc0x2 = 10 * 2;
                            calc0x3 = 10 * 3;
                            calc0x4 = 10 * 4;
                            calc0x5 = 10 * 5;
                            calc0x6 = 10 * 6;
                            calc0x7 = 10 * 7;
                            calc0x8 = 10 * 8;
                            calc0x9 = 10 * 9;
                            calc0x10 = 10 * 10;
                            
                            System.out.println("10 X 1 = " + calc0x1);
                            System.out.println("10 X 2 = " + calc0x2);
                            System.out.println("10 X 3 = " + calc0x3);
                            System.out.println("10 X 4 = " + calc0x4);
                            System.out.println("10 X 5 = " + calc0x5);
                            System.out.println("10 X 6 = " + calc0x6);
                            System.out.println("10 X 7 = " + calc0x7);
                            System.out.println("10 X 8 = " + calc0x8);
                            System.out.println("10 X 9 = " + calc0x9);
                            System.out.println("10 X 10 = " + calc0x10);
                }else {
                    System.out.println("Numero invalido");
                }
                break;
        }
    }
}