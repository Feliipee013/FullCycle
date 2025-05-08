CREATE TABLE promotions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    discount_percentage FLOAT NOT NULL,
    start_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    is_active BOOLEAN DEFAULT true,
    product_id_variation BIGINT NOT NULL,
    FOREIGN KEY (product_id_variation) REFERENCES product_variation(id)
); 