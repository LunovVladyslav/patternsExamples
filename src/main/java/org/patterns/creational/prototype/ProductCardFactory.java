package org.patterns.creational.prototype;

public class ProductCardFactory {
    ProductCard productCard;

    public ProductCardFactory(ProductCard productCard) {
        this.productCard = productCard;
    }

    public void setProductCard(ProductCard productCard) {
        this.productCard = productCard;
    }

    ProductCard copyProductCard() {
        return (ProductCard) productCard.copy();
    }
}
