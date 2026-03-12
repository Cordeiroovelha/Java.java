package OrientacaoAoObjeto.People;

import java.util.Scanner;

public class PeopleControlMain {

    private static Scanner scanner = new Scanner(System.in);
    private static PeopleManager manager = new PeopleManager();

    public static int menu(){
        System.out.println("---------------------------");
        System.out.println("-- People Manager System --");
        System.out.println("---------------------------");
        System.out.println("------- Option Menu -------");
        System.out.println("1 - Sign In");
        System.out.println("2 - Search Id");
        System.out.println("3 - Update Name");
        System.out.println("4 - Remove");
        System.out.println("5 - Exist ");
        return scanner.nextInt();
    }

    public static void register(){
        System.out.println("Type the name: ");
        String name = scanner.nextLine();
        System.out.println("Type the Id: ");
        String id = scanner.nextLine();
        Person person = new Person(name, id);
        if(manager.save(person)){
            System.out.println("Sign In complete");
            System.out.println(manager.getPeopleList());
        }
        else
            System.out.println("Error in Sign In");
    }

    private static void search() {
        System.out.println("Type de Id to search: ");
        String id = scanner.nextLine();
        Person person = manager.search(id);
        if(person != null){
            System.out.println("Person find:");
            System.out.println(person);
        }else
            System.out.println("Person not found, try other");
    }

    private static void update() {
        System.out.println("What's the Id:");
        String id = scanner.nextLine();
        System.out.println("What's the new Name: ");
        String newName = scanner.nextLine();
        if(manager.update(id, newName)){
            System.out.println("Data update");
        }else
            System.out.println("Error in update");
    }

    private static void remove() {
        System.out.println("What's the Id: ");
        String id = scanner.nextLine();
        if(manager.remove(id)){
            System.out.println("Person remove");
        }else
            System.out.println("Person not found");
    }

    public static void main(String[] args) {
        int option;
        
        do {
            option = menu();
            scanner.nextLine(); // limpesa de buffer

            switch (option) {
                case 1: {
                    register();
                    break;
                }
                case 2: {
                    search();
                    break;
                }
                case 3: {
                    update();
                    break;
                }
                case 4: {
                    remove();
                    break;
                }
                case 5: {
                    System.out.println("Bye Bye, see you next time!");
                    break;
                }
                default : {
                System.out.println("Opção invalida, tente novamente"); 
                break;
                }
            }
            System.out.println("Press <enter> to continue");
            scanner.nextLine();
        } while (option != 5);
    }

        
}
