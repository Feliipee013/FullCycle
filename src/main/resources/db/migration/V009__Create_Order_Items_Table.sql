CREATE TABLE order_items (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    quantity INT NOT NULL,
    subtotal FLOAT NOT NULL,
    order_id BIGINT NOT NULL,
    product_variation_id BIGINT NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (product_variation_id) REFERENCES product_variation(id)
); 