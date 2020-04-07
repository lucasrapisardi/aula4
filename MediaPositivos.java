import javax.swing.JOptionPane;

public class MediaPositivos {
   public static void main (String ... args){
      
        int contador = 0;
        int numeros = 0;
        
         /*while (numeros >=0){
         numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite números positivos. Números negativos encerram a contagem "));
         contador++;
         
         int total = numeros + numeros;
         double media = total/contador;
         System.out.println(media);
        }*/
        
        do {
         numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite números positivos. Números negativos encerram a contagem "));
         contador++;
         int soma = numeros + numeros;
        }   while (numeros>0);
                
                 double media = soma/contador;
         System.out.println(media);
   }
}