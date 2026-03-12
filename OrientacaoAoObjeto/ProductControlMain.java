package OrientacaoAoObjeto;

import java.util.Scanner;

public class ProductControlMain {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductManager manager = new ProductManager();

    private static int menu() {
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("---- Controle de produtos ----");
        System.out.println("-------------Menu-------------");
        System.out.println("------------------------------");

        System.out.println("Opções");
        System.out.println("1- Registro de novo produto");
        System.out.println("2- modificar dados de produto");
        System.out.println("------------------------------");
        System.out.print("Selecione uma opçao: ");
        return scanner.nextInt();
    }

    private static void register() {
        System.out.println("Digite o nome: ");
        String name = scanner.nextLine();
        System.out.println("Digite Id: ");
        String id = scanner.nextLine();
        System.out.println("Digite o valor: ");
        double value = scanner.nextDouble();
        Product product = new Product(id, name, value);
        if(manager.saveProduct(product)){
            System.out.println("Produto registrado");
            System.out.println(manager.getProductList());
        }
        else
            System.out.println("Erro em registrar produto");
    }

    // colocar if de verificaçao duplicado fora do primeiro if
    private static void modify() {
        
        System.out.println("O que quer mudar? \n[1] - nome  \n[2] - valor");
        int opt = scanner.nextInt();
        System.out.println("Qual o Id:");
        String id = scanner.nextLine();
        if(opt == 1){
            System.out.println("Qual o novo nome: ");
            String newName = scanner.nextLine();

            if(manager.updateName(id, newName)){
                System.out.println("Data update");
            }else
                System.out.println("Error in update");

        }else{
            System.out.println("Qual o novo valor: ");
            double newValue = scanner.nextDouble();
            if(manager.updateValue(id, newValue)){
                System.out.println("Data update");
            }else
                System.out.println("Error in update");
        }
    }

    public static void main(String[] args) {
        int option;
        option = menu();
        scanner.nextLine();

        switch (option) {
            case 1:
                register();
                break;
            case 2:
                modify();
                break;
            default:
                break;
        }
    }


}
