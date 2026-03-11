package OrientacaoAoObjeto;

import java.util.ArrayList;
import java.util.List;

public class PeopleManager {
    private List<Person> peopleList;

    public PeopleManager() {
        peopleList = new ArrayList<>();
    }

    public List<Person> getPeopleList(){
        return peopleList;
    }

    public boolean save(Person person){
        if(person != null){
            peopleList.add(person);
            return true;
        }
        return false;
    }

    public Person search(String id){
        for(Person person: peopleList){ // for aprimorado para coleções
            if(person.getId().equals(id)){ // para comparação de strings tem que usar .equals
                return person;
            }
        }
        return null;
    }

    public boolean update(String id, String newName){
        Person person = search(id);
        if(person != null){
            int index = peopleList.indexOf(person);
            if(index != -1){
                person.setName(newName);
                peopleList.set(index, person);
                return true;
            }
        }
            return false;
    }


    public boolean remove(String id){
        Person person = search(id);
        if(person != null){
            peopleList.remove(person);
            return true;
        }
        return false;
    }
}
