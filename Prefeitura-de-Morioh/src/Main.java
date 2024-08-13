import edu.mateus.morioh.funcoes.AnalisarCandidatos;
import edu.mateus.morioh.funcoes.PressioneQualquerTeclaParaContinuar;
import edu.mateus.morioh.funcoes.SelecionarCandidato;
import edu.mateus.morioh.modelos.Candidato;
import edu.mateus.morioh.modelos.Concurso;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Concurso helpDesk = new Concurso("HelpDesk", 2000);
        ArrayList<Candidato> listaDeCandidatos = new ArrayList<>();

        listaDeCandidatos.add(new Candidato("Mateus Simões", 2000));
        listaDeCandidatos.add(new Candidato("João Ferreira", 1500));
        listaDeCandidatos.add(new Candidato("Pedro Fernandes", 5000));
        listaDeCandidatos.add(new Candidato("Arya Stark", 1850));
        listaDeCandidatos.add(new Candidato("Giorno Giovana", 1380));
        listaDeCandidatos.add(new Candidato("Luke Skywalker", 1600));
        listaDeCandidatos.add(new Candidato("Álvaro Messias", 1900));
        listaDeCandidatos.add(new Candidato("Carlos Henrique", 1900));
        listaDeCandidatos.add(new Candidato("Pedro Pascal", 2300));
        listaDeCandidatos.add(new Candidato("Felipe Smith", 1200));

        // Main --------------------------------------------------------------------------------------------------------
        boolean continuar = true;
        while (continuar == true) {
            System.out.println("| 1. Para ver lista dos candidatos | 2. Gerar candidatos | 3. Listar candidatos | " +
                    "4. Ligar candidatos |");
            try {
                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        /*
                         *  ArrayList é uma váriavel local do método "main", passamos a lista como parâmetro para que
                         * um método de fora possa trabalhar com a lista.
                         */
                        AnalisarCandidatos.analisarCandidatos(listaDeCandidatos, helpDesk);
                        break;

                    case 2:
                        SelecionarCandidato.selecionarCandidatos(listaDeCandidatos, helpDesk);
                        break;

                    case 3:
                        SelecionarCandidato.listarCandidatos();
                        break;

                    case 4:
                        SelecionarCandidato.ligarCandidato();
                        break;

                    default:
                        System.out.println("Selecione uma opção válida!");
                        break;
                }
            } catch (InputMismatchException exception) {
                System.err.println("Digite um NÚMERO!");
                scanner.next(); // Impede que o programa rode loucamente exibindo a menssagem de erro.
            }
        }
        scanner.close();
    }
}
