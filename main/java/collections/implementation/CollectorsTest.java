package main.java.collections.implementation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void main(String[] args){
        // test max by
        test_collectMaxBy();
    }


    private static void test_collectMaxBy(){
        class ProductItem{
            String name;
            double price;
            ProductItem(String name, double price){
                this.name = name;
                this.price = price;
            }
            double getPrice(){
                return price;
            }
        }
        ProductItem[] productItem = {new ProductItem("iPhone", 799.0), new ProductItem("Samsung", 150.5),
                                    new ProductItem("xiomi", 80)};
        ProductItem expensive = Arrays.stream(productItem).collect(Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(ProductItem::getPrice)), productItem1 -> productItem1.isPresent() ? productItem1.get() : null));
        System.out.println(expensive.name);
    }
}
