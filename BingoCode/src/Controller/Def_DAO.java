/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
    import java.util.Random;
    import View.Principal;
    
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
        View.Principal.num.setText(Integer.toString(numNormal[c0]));
        View.Principal.num1.setText(Integer.toString(numNormal[c1]));
        View.Principal.num2.setText(Integer.toString(numNormal[c2]));
        View.Principal.num3.setText(Integer.toString(numNormal[c3]));
        View.Principal.num4.setText(Integer.toString(numNormal[c4]));
        View.Principal.num5.setText(Integer.toString(numNormal[c5]));
        View.Principal.num6.setText(Integer.toString(numNormal[c6]));
        View.Principal.num7.setText(Integer.toString(numNormal[c7]));
        View.Principal.num8.setText(Integer.toString(numNormal[c8]));
        View.Principal.num9.setText(Integer.toString(numNormal[c9]));
        View.Principal.num10.setText(Integer.toString(numNormal[c10]));
        View.Principal.num11.setText(Integer.toString(numNormal[c11]));
        View.Principal.num12.setText(Integer.toString(numNormal[c12]));
        View.Principal.num13.setText(Integer.toString(numNormal[c13]));
        View.Principal.num14.setText(Integer.toString(numNormal[c14]));
        View.Principal.num15.setText(Integer.toString(numNormal[c15]));
        View.Principal.num16.setText(Integer.toString(numNormal[c16]));
        View.Principal.num17.setText(Integer.toString(numNormal[c17]));
        View.Principal.num18.setText(Integer.toString(numNormal[c18]));
        View.Principal.num19.setText(Integer.toString(numNormal[c19]));
        View.Principal.num20.setText(Integer.toString(numNormal[c20]));
        View.Principal.num21.setText(Integer.toString(numNormal[c21]));
        View.Principal.num22.setText(Integer.toString(numNormal[c22]));
        View.Principal.num23.setText(Integer.toString(numNormal[c23]));
        View.Principal.num24.setText(Integer.toString(numNormal[c24]));
        
        

        
    }
}

