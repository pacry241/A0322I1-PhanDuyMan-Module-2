package ss12_java_collection_framework.bt.Java_Collection_Framework;

import java.util.Comparator;

public class SortUp implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
