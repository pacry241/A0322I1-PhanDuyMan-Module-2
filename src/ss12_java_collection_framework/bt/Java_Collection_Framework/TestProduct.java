package ss12_java_collection_framework.bt.Java_Collection_Framework;

public class TestProduct {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.addProduct(new Product("Kẹo",12));
        productManager.addProduct(new Product("Bánh ngọt",54));
        productManager.addProduct(new Product("Nước lọc",13));
        productManager.displayProduct();
        productManager.removeProduct(3);
        productManager.editProduct(12,9999);
        productManager.editProduct(1,"Chuot");
        productManager.editProduct(2,123456,"PC");
        productManager.displayProduct();
        productManager.findByName("Chuot");
        System.out.println("After sort ASC");
        productManager.sortUp();
        productManager.displayProduct();
        System.out.println("After sort DESC");
        productManager.sortDown();
        productManager.displayProduct();

    }
}
