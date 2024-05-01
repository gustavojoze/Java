package DesafioControleFluxo.src;

import java.util.Scanner;

public class Contador {
public static void main(String[] args) {
 
Scanner sc1 = new Scanner(System.in);
System.out.println("Escolha o primeiro numero");
int primeiro = sc1.nextInt(); 
System.out.println("Escolha o segudo numero");
int segundo = sc1.nextInt();


    
    try{
      Contar(primeiro, segundo);
}
    catch(ParametrosInvalidosException e){
     System.out.println("O numero primeiro numero é maior que o segundo.");
}


    }


 static void Contar(int primeiro,int segundo) throws ParametrosInvalidosException{
    int contagem = segundo - primeiro;

    if(contagem<0)
    throw new ParametrosInvalidosException();
    else
     for(;primeiro<segundo;++primeiro){
       System.out.println("Numero:"+primeiro);
    
    }
}
}
