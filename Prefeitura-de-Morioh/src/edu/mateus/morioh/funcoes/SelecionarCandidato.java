package edu.mateus.morioh.funcoes;

import edu.mateus.morioh.modelos.Candidato;
import edu.mateus.morioh.modelos.Concurso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SelecionarCandidato {
    // ArrayList para armazenar e listar candidatos.
    static ArrayList<String> candidatosSelecionadosLista = new ArrayList<>();

    public static void selecionarCandidatos(ArrayList<Candidato> listaDeCandidatos, Concurso helpDesk) {
        int candidatosSelecionados = 0;

        // Embaralha a lista de candidatos
        Collections.shuffle(listaDeCandidatos);

        for (Candidato candidato : listaDeCandidatos) {
            if (candidatosSelecionados >= 5) {
                break;
            }

            if (helpDesk.getSalarioBase() > candidato.getSalarioPretendido()) {
                System.out.println("O candidado " + candidato.getNome() + " foi selecionado para vaga! \n");
                candidatosSelecionadosLista.add(candidato.getNome());
                candidatosSelecionados++;
            }
        }
        System.out.print("\n");
    }

    public static void listarCandidatos() {
        if (candidatosSelecionadosLista.size() == 0) {
            System.out.println("Ninguém foi escolhido para a vaga ainda.");
        } else {
            for (String candidato : candidatosSelecionadosLista) {
                System.out.println(candidato + " foi selecionado.");
            }
        }
    }

    public static void ligarCandidato() {
        int tocou = 0;

        if (candidatosSelecionadosLista.size() == 0) {
            System.out.println("Ninguém foi escolhido para a vaga ainda.");
        } else {
            for (String candidato : candidatosSelecionadosLista) {
                tocou = 0;
                System.out.println("Ligando para " + candidato);
                do {
                    if (tocou != 3) {
                        System.out.println("Tocando...");
                        tocou++;
                    } else {
                        System.out.println("Não conseguimos contato com o candidato(a) " + candidato);
                        break;
                    }
                } while (verificarLigacao(candidato, tocou));
                System.out.print("\n");
            }
        }
    }

    private static boolean verificarLigacao(String candidato, int tocou) {
        // Uma variável boolean que irá receber o valor 'true' quando for gerado o número 1...
        boolean atendeu = new Random().nextInt(3) == 1;
        // System.out.println("Atendeu? " + atendeu);

        if (atendeu) {
            System.out.println("O candidato(a) " + candidato + " atendeu o telefone depois de " + tocou +
                    " tentativas");
        }

        // Enquanto verificarLigacao() for true, o do-while continua a rodar...
        // Quando a variável 'tocou' for true, a negação retorna um false para o while, encerrando a operação...
        return !atendeu;
    }
}
