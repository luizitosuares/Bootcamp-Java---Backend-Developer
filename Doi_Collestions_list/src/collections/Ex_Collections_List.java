package collections;

import java.util.ArrayList;
import java.util.Collections;

class Ex_Collections_List {

    public static void main(String[] args) {
        // 1 - Criar a lista e adicionar as sete notas
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.6);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(6.5);
        notas.add(6.0);
        
        // Imprime a lista de notas
        System.out.println("Notas: " + notas);
   
    // 2 - Exiba o indica da nota 5
        
        
        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(9.6));
    
    
    // 3 - Adicione na lista a nota 8.1 na posição 4
        
        notas.add(4, 8.1);
        
        System.out.println("Sua nova lista é " + notas);
    

   // 4 - Substitua a nota 6.5 por 9.8
        
        notas.set(notas.indexOf(6.5), 9.8);
        
        System.out.println("Sua lista atualizada é:" + notas );
    
        
        // 5 - Confira se a nota 5 está na lista
        
        
        System.out.println("Verificar se uma nota está na lista : " + notas.contains(1.8));
    
        
        // 6 - Exiba a terceira nota adcionada 
        
        System.out.println("Exiba a terceira nota adcionada: " + notas.get(2));
    
    
    // 7 - Exiba a menor nota
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
    
        
        // 8 - Exiba a maior nota
        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
        
        // 9 - Exiba a soma dos valores
        
        
       // ???
        
        
        // 10
        
    }
}


