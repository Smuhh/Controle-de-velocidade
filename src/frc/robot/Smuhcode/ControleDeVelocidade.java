package frc.robot.Smuhcode;

import java.util.Scanner;

public class ControleDeVelocidade{

       public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

    //Variaveis
    double velocidade;
    boolean estaMovendo;

    //Pessoa vai olhar no painel e colocar a velocidade escolhida

    System.out.println("Qual a velocidade?(velocidade adequada:50%):  ");
    velocidade = entrada.nextDouble();

    System.out.println("a velocidade é de " + velocidade);


    //Vai Definir se a velocidade vai ser true ou false e se esta se movendo ou nao

     if (velocidade > 0){

       estaMovendo=(true);
        System.out.println(" e o robo está se movendo.");}
     else {

       estaMovendo=(false);
        System.out.println("e o robo não está se movendo.");

    }
        entrada.close();
    
    
}
}   
        
    
    
