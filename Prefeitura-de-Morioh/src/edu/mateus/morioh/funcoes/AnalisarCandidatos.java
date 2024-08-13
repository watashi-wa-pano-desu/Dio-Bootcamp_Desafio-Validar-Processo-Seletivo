package edu.mateus.morioh.funcoes;

import edu.mateus.morioh.modelos.Candidato;
import edu.mateus.morioh.modelos.Concurso;

import java.util.ArrayList;

public class AnalisarCandidatos {
    public static void analisarCandidatos(ArrayList<Candidato> listaDeCandidatos, Concurso helpDesk) {
        /*
         *  Laço 'for-each', usado para iterar sobre uma coleção / lista de elementos.
         *
         *  O que é iterar?
         *  O java irá pegar o primeiro objeto armazenado na 'listaDeCandidatos' e irá armazená-lo na variável
         * 'candidato', que é do tipo Candidato.
         *  Com isso o comando executa qualquer código que esteja dentro do bloco '{ }' usando o objeto que estiver
         * armazenado na variável candidato no momento.
         *  Depois disso, ele vai para o próximo objeto na lista e repete o processo. Isso continua até que todos os
         * objetos na lista tenham sido processados.
         */
        int candidatoAtual = 0;
        for (Candidato candidato : listaDeCandidatos) {
            candidatoAtual++;
            System.out.println("Candidato " + candidatoAtual + ": " + candidato.getNome());
            if (helpDesk.getSalarioBase() > candidato.getSalarioPretendido()) {
                System.out.println("Ligar para o candidato");
            } else if (helpDesk.getSalarioBase() == candidato.getSalarioPretendido()) {
                System.out.println("Ligar para o candidato com contra proposta");
            } else {
                System.out.println("Aguardando resultado dos demais candidatos");
            }
            System.out.print("\n");
        }
    }
}
