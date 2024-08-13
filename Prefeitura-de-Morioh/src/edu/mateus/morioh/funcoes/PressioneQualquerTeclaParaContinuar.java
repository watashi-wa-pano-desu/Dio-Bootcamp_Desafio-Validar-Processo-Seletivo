package edu.mateus.morioh.funcoes;

import java.util.Scanner;

public class PressioneQualquerTeclaParaContinuar {
    public static void pressioneQualquerTeclaParaContinuar(Scanner scanner) {
        System.out.println(" Pressione qualquer tecla para continuar...");
        scanner.nextLine();
        scanner.close();
    }
}
