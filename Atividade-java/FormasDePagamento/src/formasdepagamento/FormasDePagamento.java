
package formasdepagamento;

import java.util.Scanner;

public class FormasDePagamento {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);;
       
        float valorprod, valoravista, aCobrar, valorcard, calccard, doisx, calcdoisx, seisx, calcseisx;
        
        System.out.println("Para começarmos, informe o valor dos prodtos:");
        valorprod = in.nextFloat();
        
        System.out.println("Agora informe a forma de pagamento :");
        System.out.println("1 - À vista em dinheiro ou cheque - 15% de desconto");
        System.out.println("2 - À vista no cartão de crédito - 5% de desconto");
        System.out.println("3 - Em duas vezes - sem desconto/juros");
        System.out.println("4 - Em seis vezes - juros de 10%");
        
        int num = in.nextInt();
        
        
        switch (num){
            case 1:
                
                aCobrar = (float) (valorprod * 0.15);
                valoravista = valorprod - aCobrar;
                System.out.println("Com o desconto o produo vai ficar no valor de :" + valoravista);
                break;
            case 2:
                
                calccard = (float) (valorprod * 0.05);
                valorcard = valorprod - calccard;
                System.out.println("Com o desconto o produo vai ficar no valor de :" + valorcard);
                
                break;
            case 3:
                
                doisx = valorprod;
                System.out.println("Com o desconto o produo vai ficar no valor de :" + doisx);
                
                break;
                
            case 4:
                
                calcseisx = (float) (valorprod * 0.10);
                seisx = valorprod + calcseisx;
                System.out.println("Com o desconto o produo vai ficar no valor de :" + seisx);
        }
        
                
                
    }
    
}
