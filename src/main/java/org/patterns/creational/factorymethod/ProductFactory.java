package org.patterns.creational.factorymethod;

import org.patterns.creational.factorymethod.objects.Product;

public interface ProductFactory {
    Product createProduct(String brand, int price);
}
