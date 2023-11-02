package operaciones_matrices;

public class L_Random extends Abstract_Menu{
    
    @Override
    
    public void Llenado(){
        
        
            if(m_1 > m_2){
    
    M_uno = new int [filas1][columnas1];
    
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas1; j++) {
                    
                    M_uno[i][j] = (int) (Math.random()* 9 );
                }
                
            }
            
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println(" Tu matriz 1 será: ");
                System.out.println("-------------------------------------------------");
                System.out.println("");
            
             for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas1; j++) {
                    
                    System.out.print(" [ " + M_uno[i][j] + " ] ");
                }
                
                 System.out.println("");
            }
                System.out.println("");
    
        }
            else{
            
               M_dos = new int [filas2][columnas2];
    
            for (int i = 0; i < filas2; i++) {
                for (int j = 0; j < columnas2; j++) {
                    
                    M_dos[i][j] = (int) (Math.random()* 9 );
                }
                
            }
            
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println(" Tu matriz 2 será: ");
                System.out.println("-------------------------------------------------");
                System.out.println("");
            
             for (int i = 0; i < filas2; i++) {
                for (int j = 0; j < columnas2; j++) {
                    
                    System.out.print(" [ " + M_dos[i][j] + " ] ");
                }
                
                 System.out.println("");
            }
                System.out.println("");
                
                Operaciones();
    
        }
        
        // Arreglo a la condición para que siempre se cumpla debido a que había una posibilidad de error. Seleccion[2][1]
        
        m_1 = 0;
        m_2 = 0;
    }
  
}
