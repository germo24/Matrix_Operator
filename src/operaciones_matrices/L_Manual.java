package operaciones_matrices;

public class L_Manual extends Abstract_Menu {

    @Override

    public void Llenado() {

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println(" Bienvenido al llenador de variables, llenarás espacio por espacio yendo de mayor a menor");
        System.out.println("");

        if (m_1 > m_2) {

            M_uno = new int[filas1][columnas1];

            int contadorI = 0;
            int contadorJ = 0;
            int zero = 0;
            int ciclos = filas1 * columnas1;

            do {
                             
                for (int i = 0; i < filas1; i++) {
                    for (int j = 0; j < columnas1; j++) {
                               

                        if (j == contadorJ & i == contadorI) {

                            System.out.print(" [ * ] ");

                        } 
                        
                        else{

                            System.out.print(" [   ] ");

                        }

                    }

                    System.out.println("");
                    
                    }
         
                        System.out.println("");
                        System.out.println(" Fila: " + contadorI);
                        System.out.println("Columna: " + contadorJ);
                        System.out.println("");
                        System.out.println(" ------------------------- ");
                        System.out.println(" Ingresa la posición [ * ] ");
                        System.out.println(" ------------------------- ");  
                        M_uno[contadorI][contadorJ] = entrada.nextInt();
       
                        contadorJ++;
                        
                        if(contadorJ == columnas1){
                        
                        contadorJ = 0;
                        contadorI++;
                        }
                        
                        zero++;
 
            } while (zero != ciclos);
            
            
            
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(" Esta será su matriz 1: ");
            System.out.println("-------------------------------------------------");
            System.out.println("");
            
              for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas1; j++) {
                    
                    System.out.print(" [ " + M_uno[i][j] + " ] ");
                }
                
                 System.out.println("");
            }
            System.out.println("");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("");
        }
        
        else{
        
            
            M_dos = new int[filas2][columnas2];

            int contadorI = 0;
            int contadorJ = 0;
            int zero = 0;
            int ciclos = filas2 * columnas2;

            do {
                             
                for (int i = 0; i < filas2; i++) {
                    for (int j = 0; j < columnas2; j++) {
                               

                        if (j == contadorJ & i == contadorI) {

                            System.out.print(" [ * ] ");

                        } 
                        
                        else{

                            System.out.print(" [   ] ");

                        }

                    }

                    System.out.println("");
                    
                    }
         
                        System.out.println("");
                        System.out.println(" Fila: " + contadorI);
                        System.out.println("Columna: " + contadorJ);
                        System.out.println("");
                        System.out.println(" ------------------------- ");
                        System.out.println(" Ingresa la posición [ * ] ");
                        System.out.println(" ------------------------- ");  
                        M_dos[contadorI][contadorJ] = entrada.nextInt();
                        System.out.println("");       
                        
                        contadorJ++;
                        
                        if(contadorJ == columnas2){
                        
                        contadorJ = 0;
                        contadorI++;
                        }
                        
                        zero++;
 
            } while (zero != ciclos);
            
            
            
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(" Esta será su matriz 2: ");
            System.out.println("-------------------------------------------------");
            System.out.println("");
            
              for (int i = 0; i < filas2; i++) {
                for (int j = 0; j < columnas2; j++) {
                    
                    System.out.print(" [ " + M_dos[i][j] + " ] ");
                }
                
                 System.out.println("");
            }
            System.out.println("");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("");
        
        Operaciones();
        
        }

        // Arreglo a la condición para que siempre se cumpla debido a que había una posibilidad de error. Seleccion[2][1]
        
        m_1 = 0;
        m_2 = 0;
    }
}
