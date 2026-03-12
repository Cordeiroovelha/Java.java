package OrientacaoAoObjeto.Product;

public class Product {
    private String id;
    private double value;
    private String name;
    
    
    public Product(String id, String name, double value) {
        this.id = id;
        this.value = value;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }    
    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }

    @Override
    public String toString(){
        return "Dados do produto [Id " + id + " nome " + name + " preço " + value + "] ";
    }

}
