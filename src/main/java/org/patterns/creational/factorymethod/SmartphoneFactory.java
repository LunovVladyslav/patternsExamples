package org.patterns.creational.factorymethod;

import org.patterns.creational.factorymethod.objects.Product;
import org.patterns.creational.factorymethod.objects.Smartphone;

public class SmartphoneFactory implements ProductFactory{
    @Override
    public Product createProduct(String brand, int price) {
        return new Smartphone(brand, price);
    }
}
