import model.Lista;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Lista de Tarefas\n");
        System.out.print("1.) Adicionar \n");
        System.out.print("2.) Marcar como feita \n");
        System.out.print("3.) Sair\n");
        System.out.print("\nSelecione uma opção: ");

        try{
            while (true) {
                choice = input.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.println("\nDigite a tarefa a ser adicionada: ");
                        String tarefa = input.nextLine();
                        if (!tarefa.isEmpty()) {
                            lista.addTarefa(tarefa);
                            System.out.println("\nAdicionado tarefa: " + tarefa + ".");
                        }
                    }
                    case 2 -> {
                        System.out.println("\nDigite o n° da tarefa feita: ");
                        int opcao = input.nextInt();
                        lista.getTarefa(opcao);
                        System.out.println("\nAdicionado tarefa: " + opcao + ".");
                    }
                    case 3 -> {
                        System.out.println("Saindo...");
                        System.exit(0);
                    }
                    default -> System.out.println("Opção invalida! Tente outra novamente.");
                }
                lista.getAllList();
            }
        }
        catch (Exception e){
            System.out.println("Exception : " + e);    
        }
    }
}