package ss12_java_collection_framework.bt.Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    private ArrayList<Product> myArrayList = new ArrayList<>();

    public ProductManager() {
    }

    public void addProduct(Product product){
        myArrayList.add(product);
    }

    public void displayProduct(){
        for (Product product : this.myArrayList){
            System.out.println(product.toString());
        }
    }

    public void editProduct(int Id, double price){
        Product productEdit = null;
        for(Product product: myArrayList ){
            if(product.getId() == Id){
                productEdit = product;
                break;
            }
        }
        if(productEdit == null){
            System.out.println("No product have ID "+Id+" so no EDIT");
        }else{
            productEdit.setPrice(price);
        }
    }

    public void editProduct(int Id, String name){
        Product productEdit = null;
        for(Product product: myArrayList ){
            if(product.getId() == Id){
                productEdit = product;
                break;
            }
        }
        if(productEdit == null){
            System.out.println("No product have ID "+Id+" so no EDIT");
        }else{
            productEdit.setName(name);
        }
    }

    public void editProduct(int Id,double price, String name){
        Product productEdit = null;
        for(Product product: this.myArrayList ){
            if(product.getId() == Id){
                productEdit = product;
                break;
            }
        }

        if(productEdit == null){
            System.out.println("No product have ID "+Id+" so no EDIT");
        }else{
            productEdit.setName(name);
            productEdit.setPrice(price);
        }
    }

    public void removeProduct(int ID){
        int index = -1;
        for(Product Obj: this.myArrayList){
            index ++;
            if(Obj.getId() == ID){
                break;
            }
        }
        if(index == -1){
            System.out.println("No product have ID "+ID+" so no REMOVE");
        }else{
            myArrayList.remove(index);
        }
    }

    public void findByName(String name){
        Product productFind = null;
        for(Product Obj: this.myArrayList){
            if(Obj.getName().equals(name)){
                productFind = Obj;
                System.out.println("Product have name "+name+" is "+Obj.toString());
            }
        }
        if(productFind == null){
            System.out.println("No product is found");
        }
    }

    public void sortUp(){
        SortUp priceASC = new SortUp();
        Collections.sort(this.myArrayList,priceASC);
    }

    public void sortDown(){
        SortDown priceDESC = new SortDown();
        Collections.sort(this.myArrayList,priceDESC);
    }
}
