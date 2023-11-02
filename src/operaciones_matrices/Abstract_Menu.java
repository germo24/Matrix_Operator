package operaciones_matrices;

import java.util.Scanner;

public abstract class Abstract_Menu {

    Scanner entrada = new Scanner(System.in);
    protected static int M_uno[][], M_dos[][], M_resultado[][], filas1, filas2, columnas1, columnas2, m_1, m_2, opciones, m_p;

    public void Interfaz() {

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" Bienvenido al calculador de matrices, llenarás 2 matrices y luego seleccionarás la operación que desees realizar: ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println(" Qué dimensiones tendra tu matriz 1? ");
        System.out.println(" Filas: ");
        filas1 = entrada.nextInt();

        System.out.println(" Columnas: ");
        columnas1 = entrada.nextInt();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println(" Qué dimensiones tendra tu matriz 2? ");
        System.out.println(" Filas: ");
        filas2 = entrada.nextInt();

        System.out.println(" Columnas: ");
        columnas2 = entrada.nextInt();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        if (filas1 <= 0 | filas2 <= 0 | columnas1 <= 0 | columnas2 <= 0) {

            System.err.println(" Uno o más elementos posee un numero invalido en la definicón de filas y columnas");
            System.out.println("");
            System.out.println("");

            Interfaz();
            
        } else {

            O_Llenado();
        }
    }

    public void O_Llenado() {

        System.out.println("");
        System.out.println(" Prefieres llenar la matriz 1 o completarla aleatoriamente: ");
        System.out.println(" 1. Completado manual");
        System.out.println(" 2. Completado aleatorio");
        m_1 = entrada.nextInt();

        switch (m_1) {

            case 1:
                Abstract_Menu mensajero1 = new L_Manual();
                mensajero1.Llenado();
                break;

            case 2:
                Abstract_Menu mensajero2 = new L_Random();
                mensajero2.Llenado();
                break;

            default:

                System.out.println(" Opción seleccionada inexistente, intente de nuevo");
                System.out.println("");
                O_Llenado();

                break;

        }

        System.out.println("");
        System.out.println(" Prefieres llenar la matriz 2 o completarla aleatoriamente: ");
        System.out.println(" 1. Completado manual");
        System.out.println(" 2. Completado aleatorio");
        m_2 = entrada.nextInt();

        switch (m_2) {

            case 1:
                Abstract_Menu mensajero1 = new L_Manual();
                mensajero1.Llenado();
                break;

            case 2:
                Abstract_Menu mensajero2 = new L_Random();
                mensajero2.Llenado();
                break;

            default:

                System.out.println(" Opción seleccionada inexistente, intente de nuevo");
                O_Llenado();

                break;

        }

    }

    public abstract void Llenado();

    public void Operaciones() {

        System.out.println(" Qué operación desea realizar? ");
        System.out.println(" 1. Suma");
        System.out.println(" 2. Resta");
        System.out.println(" 3. Multiplicación");
        opciones = entrada.nextInt();

        switch (opciones) {

            case 1:

                if (filas1 != filas2 | columnas1 != columnas2) {

                    System.err.println(" MATRIZ INDEFINIDA - Es imposible realizar está operación debido a que las filas o columnas de una matriz son distintas");

                } else {

                    M_resultado = new int[filas1][columnas1];
                    Suma();
                }

                break;

            case 2:

                if (filas1 != filas2 | columnas1 != columnas2) {

                    System.err.println(" MATRIZ INDEFINIDA - Es imposible realizar está operación debido a que las filas o columnas de una matriz son distintas");

                } else {

                    M_resultado = new int[filas1][columnas1];
                    Resta();
                }

                break;

            case 3:

                if (columnas1 != filas2) {

                    System.err.println(" MATRIZ INDEFINIDA - Es imposible realizar está operación debido a que las filas de la primer matriz son distintas a las columnas de la segunda");

                } else {

                    M_resultado = new int[filas1][columnas2];
                    Multiplicacion();

                }
                break;

            default:

                System.out.println(" La opción seleccionada es inexistente, intenta de nuevo");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");

                Operaciones();
                break;

        }

    }

    public void Suma() {

        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {

                M_resultado[i][j] = M_uno[i][j] + M_dos[i][j];

            }

        }

        Imprimir_S_R();

    }

    public void Resta() {

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {

                M_resultado[i][j] = M_uno[i][j] - M_dos[i][j];

            }
        }

        Imprimir_S_R();

    }

    public void Multiplicacion() {

        for (int i = 0; i < M_uno.length; i++) {

            for (int k = 0; k < M_dos[0].length; k++) {

                for (int j = 0; j < M_uno[0].length; j++) {

                    int temp_var = M_uno[i][j] * M_dos[j][k];

                    M_resultado[i][k] = temp_var + M_resultado[i][k];
                }
            }

        }

        Imprimir_M();

    }

    public void Imprimir_S_R() {

        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" La operación es: ");
        System.out.println("-------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {

                System.out.print(" [ " + M_uno[i][j] + " ]");

            }

            if (i == filas1 / 2 | i == (filas1 / 2) + 0.5) {

                switch (opciones) {

                    case 1:

                        System.out.print("    +    ");

                        break;

                    case 2:

                        System.out.print("    -    ");

                        break;

                }

            } else {

                System.out.print("         ");
            }

            for (int j = 0; j < columnas2; j++) {

                System.out.print(" [ " + M_dos[i][j] + " ]");

            }

            if (i == filas1 / 2 | i == (filas1 / 2) + 0.5) {

                System.out.print("    =    ");

            } else {

                System.out.print("         ");
            }

            for (int j = 0; j < columnas1; j++) {

                System.out.print(" [ " + M_resultado[i][j] + " ]");

            }

            System.out.println("");

        }
        System.out.println("");
    }

    public void Imprimir_M() {
 
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" La operación es: ");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        
        if (M_dos.length >= M_uno.length) {

            for (int j = 0; j < M_dos.length; j++) {

                if (j < M_uno.length) {

                    for (int i = 0; i < M_uno[0].length; i++) {

                        System.out.print(" [ " + M_uno[j][i] + " ] ");
                    }

                    if (j == filas2 / 2 | j == (filas2 / 2) + 0.5) {

                        System.out.print("   +    ");

                    } else {

                        System.out.print("        ");

                    }

                } else {

                    // Espaciado de la primer a la segunda matriz.
                    
                            for(int i = 0; columnas1 > i; i++){
                                
                            System.out.print("       ");
                            }
                            System.out.print("        ");
                           
                    
                }

                for (int k = 0; k < M_dos[0].length; k++) {

                    System.out.print(" [ " + M_dos[j][k] + " ] ");

                }

                if (j == filas2 / 2 | j == (filas2 / 2) + 0.5) {

                    System.out.print("   =    ");

                } else {

                    System.out.print("        ");

                }

                if (j < M_resultado.length) {

                    for (int k = 0; k < M_resultado[0].length; k++) {

                        System.out.print(" [ " + M_resultado[j][k] + " ] ");

                    }
                }

                System.out.println("");
            }

        }
        
        else {

            for (int j = 0; j < M_uno.length; j++) {

                for (int k = 0; k < M_uno[0].length; k++) {

                    System.out.print(" [ " + M_uno[j][k] + " ] ");

                }

                if (j == filas1 / 2 | j == (filas1 / 2) + 0.5) {

                    System.out.print("   +    ");

                } else {

                    System.out.print("        ");

                }

                if (j < M_dos.length) {

                    for (int i = 0; i < M_dos[0].length; i++) {

                        System.out.print(" [ " + M_dos[j][i] + " ] ");
                    }

                    if (j == filas1 / 2 | j == (filas1 / 2) + 0.5) {

                        System.out.print("   =    ");

                    } else {

                        System.out.print("        ");

                    }

                } else {

                     // Espaciado de la segunda matriz a la resultante.
                    
                            for(int i = 0; columnas2 > i; i++){
                                
                            System.out.print("       ");
                            }
                            System.out.print("        ");
                           

                }

                if (j < M_resultado.length) {

                    for (int k = 0; k < M_resultado[0].length; k++) {

                        System.out.print(" [ " + M_resultado[j][k] + " ] ");

                    }
                }

                System.out.println("");
            }

        }
    }
}
