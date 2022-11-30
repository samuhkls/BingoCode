/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
    import java.util.Random;
    import View.Principal;
import static View.Principal.nu1;
import static View.Principal.nu2;
import static View.Principal.nu3;
import static View.Principal.nu4;
import static View.Principal.nu5;
import static View.Principal.nu6;
import static View.Principal.nu7;
import static View.Principal.nu8;
import static View.Principal.nu9;
import static View.Principal.princ;
import static View.Principal.sos;
    
/**
 *
 * @author Samth
 */
public class Def_DAO {
    // variaveis
    public static int numLivre;

    /**
     *
     */
    public static int numNormal[]=new int[24];
    public static int j=0,c0=0,c1=1,c2=2,c3=3,c4=4, c5 = 5, c6 = 6, c7 = 7, c8 = 8,
            c9 = 9, c10 = 10, c11= 11, c12= 12, c13 = 13, c14= 14, c15 = 15, 
            c16 = 16, c17 = 17, c18 = 18, c19 = 19, c20 = 20, c21 = 21, c22 = 22,
            c23= 23, c24= 24;
    public static int numero;
    public static int i = 0;
    
    
    public static int Sorteia(){      
        Random random = new Random();
        numero = random.nextInt(100);
        return numero; 
    }
    public static void Armazena(int numero){
        
            numNormal[j]=numero;
            j++;
            if(j==24){
                j=0;
            }
            c0++; c1++; c2++; c3++; c4++; c5++; c6++; c7++; c8++; c9++; 
            c10++; c11++; c12++; c13++; c14++; c15++; c16++; c17++; c18++; c19++;
            c20++; c21++; c22++; c23++; c24++;
                        
            if(c0==25){
                c0=0;
            }
            if(c1==25){
                c1=0;
            }
            if(c2==25){
                c2=0;
            }
            if(c3==25){
                c3=0;
            }
            if(c4==25){
                c4=0;
            }
    }
    public static void Mostra(){
       i= i+1;
       
       Random random = new Random();
       numero = random.nextInt(100);
       
       String Teste = Integer.toString(numero);
       String Tudo = sos.getText();
       princ.setText(Teste);
       
       sos.setText(Teste+"   "+Tudo);
       
       switch (i) {

        case 1:
            nu1.setText(Teste);

// bloco de código que será executado

        break;

        case 2:

            nu2.setText(Teste);
// bloco de código que será executado

        break;

        case 3:

            nu3.setText(Teste);
// bloco de código que será executado

        break;
        case 4:

            nu4.setText(Teste);
// bloco de código que será executado

        break;

        case 5:

            nu5.setText(Teste);
// bloco de código que será executado

        break;

        case 6:

            nu6.setText(Teste);
// bloco de código que será executado

        break;
        case 7:

            nu7.setText(Teste);
// bloco de código que será executado

        break;

        case 8:

            nu8.setText(Teste);
// bloco de código que será executado

        break;

        case 9:

            nu9.setText(Teste);
// bloco de código que será executado

        break;
       

        default:

// bloco de código que será executado se nenhum dos cases for aceito

}
       
       

        
    }
}

