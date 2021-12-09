package ifelse;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);;
        
        System.out.println("Escolha uma opção");
        System.out.println("1 - Maior numero");
        System.out.println("2 - Comprar ferraduras");
        System.out.println("3 - Forma de pagamento");
        System.out.println("4 - IMC por genero e altura");
        System.out.println("5 - IMC entre 18,5 e 25");
        System.out.println("6 - Validação de campos");
        
        int num = in.nextInt();
        
        
        switch (num){
            case 1:
                //variaveis
                int A, B;
                
                //Entrada
                System.out.println("Informe um numero:");
                A = in.nextInt();
                System.out.println("Agora imforme o segundo numero:");
                B = in.nextInt();
               
                //processamento
                if(A > B) {
                    System.out.println("Entre " + A + " e " + B);
                    System.out.println("O maior é o " + A);
                }else {
                    System.out.println("Entre " + A + " e " + B);
                    System.out.println("O maaior numero é o " + B);
                }
            case 2:
                int a, b, c;
                
                //Entrada
                System.out.println("Para começarmos, informe um numero:");
                a = in.nextInt();
                System.out.println("Agora informe o segundo numero:");
                b = in.nextInt();
                System.out.println("E por ultimo o terceiro numero:");
                c = in.nextInt();
                
                //Processamento
                if (a + b > c) {
                    System.out.println(a + " + " + b + " sao maiores que " + c);
                }else if( a + b == c){
                    System.out.println(a + " + " + b + " e " + c + " teem o mesmo valor");
                }else {
                    System.out.println(c + " é maior que " + a + " + " + b );
                }
                break;
            case 3:
                float valor, desc;
                
                //Entrada
                System.out.println("Qual o valor do produto ?");
                valor = in.nextFloat();
                System.out.println("Qual a forma de pagamento ?");
                System.out.println("1 - a vista ");
                System.out.println("2 - no cartão");
                
                int forma = in.nextInt();
                
                if ( forma == 1) {
                    float descvista;
                    desc = valor * 0.10F;
                    descvista = valor - desc;
                    
                    System.out.println("O valor final é de " + descvista + " reais");
                }else if (forma == 2) {
                    float desccard;
                    desc = valor * 0.05F;
                    desccard = valor - desc;
                    
                    System.out.println("O valor final é de " + desccard + " reais");
                }
                break;
            case 4:
                int genero ;
                float calculoaltura, altura;
                
                //Entrada 
                System.out.println("Antes de começarmos informe o seu genero");
                System.out.println("1 - Masculino");
                System.out.println("2 - Feminino");
                genero = in.nextInt();
                System.out.println("Agora informme a sua altura");
                altura = in.nextFloat();
                
                //Processo
                if(genero == 1){
                    calculoaltura = (72.7F * altura) - 58; 
                    System.out.println("O seu IMC é " + calculoaltura);
                } else if (genero == 2) {
                    calculoaltura = (62.1F * altura) - 44.7F; 
                    System.out.println("O seu IMC é " + calculoaltura);
                }else {
                    System.out.println("Opção invalida");
                }
                break;
            case 5:
                int peso;
                float alt, calc, min, max;
                
                //Entrada
                System.out.println("Informe o seu peso");
                peso = in.nextInt();
                System.out.println("Informe a sua altura");
                alt = in.nextFloat();
                
                //Processamento
                calc = (alt * alt) / 2;

                
                //Saida
                
                if( calc > 18.5 && calc < 25 ) {
                    System.out.println("O seu IMC esta entre 18,5 e 25");
                }else {
                    System.out.println("O seu IMC não esta entre 18,5 e 25");
                }
                break;
            case 6:
                
                //Entrada
                System.out.println("Para realizarmos o cadastro precisammos de algumas informações");
                System.out.println("Primeiro informe o seu nome :");
                String name = in.next();
                System.out.println("Agora informe o seu E-mail:");
                String email = in.next();
                System.out.println("Agora o seu CPF : ");
                String cpf = in.next();
                System.out.println("E por fim o seu RG :");
                String rg = in.next();
                
                //Processamento
                if ( name == null || email == null) {
                    System.out.println("Erro o campo n foi preencido corretamente");
                }else if ( cpf == null || rg == null) {
                    System.out.println("Erro o campo n foi preencido corretamente");
                }else {
                    System.out.println("Cadaastro realizaddo com sucesso.");
                }
                break;

    }
    }
}
