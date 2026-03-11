package OrientacaoAoObjeto;

import java.util.Scanner;

public class PeopleControlMain {

    private static Scanner scanner = new Scanner(System.in);

    public static int menu(){
        System.out.println("---------------------------");
        System.out.println("-- People Manager System --");
        System.out.println("---------------------------");
        System.out.println("------- Option Menu -------");
        System.out.println("1 - Sign In");
        System.out.println("2 - Search Id");
        System.out.println("3 - Refresh");
        System.out.println("4 - Remove");
        System.out.println("5 - Exist ");
        return scanner.nextInt();
    }

    public static Person readData(){
        System.out.println("Type the name: ");
        String name = scanner.nextLine();
        System.out.println("Type the Id: ");
        String Id = scanner.nextLine();
        return new Person(name, Id);
    }

    public static void main(String[] args) {
        PeopleManager manager = new PeopleManager();
        Person person;
        int option;
        
        do {
            option = menu();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    person = readData();
                    if(manager.save(person)){
                        System.out.println("Sign In complete");
                        System.out.println(manager.getPeopleList());
                    }
                    else
                        System.out.println("Error in Sign In");
                    break;
                }
                default:
                    break;
            }

        } while (option != 5);
    }
}
