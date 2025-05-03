CREATE TABLE product_variation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    color VARCHAR(50) NOT NULL,
    size FLOAT NOT NULL,
    stock INT NOT NULL DEFAULT 0,
    product_id BIGINT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(id)
); 