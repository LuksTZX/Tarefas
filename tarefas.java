import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> tarefas = new ArrayList<>();

    public static int lerInt() {
        while (true) {
            try {
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas numeros!");
                sc.nextLine();
            }
        }
    }

    public static void listar() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + " - " + tarefas.get(i));
        }
    }

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1 - Adicionar, 2 - Listar, 3 - Remover, 4 - Sair");
            opcao = lerInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual tarefa voce quer adicionar?");
                    String tarefa = sc.nextLine().trim();
                    if (tarefa.isEmpty()) {
                        System.out.println("A tarefa nao pode ser vazia!");
                    } else {
                        tarefas.add(tarefa);
                        System.out.println("Tarefa adicionada!");
                    }
                    break;

                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Sua lista de tarefas está vazia");
                    } else {
                        listar();
                    }
                    break;

                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há itens para remover");
                    } else {
                        listar();
                        System.out.println("Digite o numero da tarefa: ");
                        int numero = lerInt();
                        if (numero < 1 || numero > tarefas.size()) {
                            System.out.println("Numero invalido");
                        } else {
                            tarefas.remove(numero - 1);
                            System.out.println("Tarefa removida");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo.........");
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (opcao != 4);
    }
}