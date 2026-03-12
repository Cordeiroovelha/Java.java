package OrientacaoAoObjeto.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductList(){
        return productList;
    }

    public boolean saveProduct(Product product){
        if(product != null){
            productList.add(product);
            return true;
        }
        return false;
    }

    public Product search(String id){
        for(Product product: productList){
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    // não sei se é a forma mais otimizada criar duas funçoes
    public boolean updateName(String id, String newName){
        Product product = search(id);
        if(product != null){
            int index = productList.indexOf(product);
            if(index != -1){
                product.setName(newName);
                productList.set(index, product);
                return true;
            }
        }
        return false;
    }

    public boolean updateValue(String id, double newValue){
        Product product = search(id);
        if(product != null){
            int index = productList.indexOf(product);
            if(index != -1){
                product.setValue(newValue);
                productList.set(index, product);
                return true;
            }
        }
        return false;
    }
}
