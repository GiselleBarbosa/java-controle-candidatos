package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // selecionaCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "GISELLE", "TIAGO", "MARCOS", "YAGO", "FELIPE" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento:");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº  " + (indice + 1) + " é o: " + candidatos[indice]);
        }

        System.out.println("forma abreviada de interação utilizando o FOR EACH");

        for (String candidato : candidatos ) {
            System.out.println("O candidato selecionado foi " + candidato );
        }
    }

    static void selecionaCandidatos() {
        String[] candidatos = { "GISELLE", "TIAGO", "MARCOS", "YAGO", "FELIPE", "MARIA", "TITO", "PAULO", "JULIA",
                "SANDRA" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato  " + candidato + " Solicitou este valor de salario: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");

        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");

        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }
}
