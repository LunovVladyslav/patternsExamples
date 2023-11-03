package org.patterns.creational.factorymethod;

import org.patterns.creational.factorymethod.objects.Laptop;
import org.patterns.creational.factorymethod.objects.Product;

public class LaptopFactory implements ProductFactory{
    @Override
    public Product createProduct(String brand, int price) {
        return new Laptop(brand, price);
    }
}
