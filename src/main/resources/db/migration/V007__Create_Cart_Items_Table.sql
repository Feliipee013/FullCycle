CREATE TABLE car_items (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    quantity INT NOT NULL,
    subtotal FLOAT NOT NULL,
    cart_id BIGINT NOT NULL,
    product_variation_id BIGINT NOT NULL,
    FOREIGN KEY (cart_id) REFERENCES carts(id),
    FOREIGN KEY (product_variation_id) REFERENCES product_variation(id)
); 