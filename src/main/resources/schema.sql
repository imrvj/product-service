CREATE TABLE IF NOT EXISTS product_entity (
    product_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    weight INT,
    expiry VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS product_review_entity (
    product_id INT PRIMARY KEY,
    author VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    content VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS user_details (
    user_id INT PRIMARY KEY,
    description VARCHAR(255),
    content VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS postman_details (
    token VARCHAR(255) PRIMARY KEY,
    hostpostman VARCHAR(255),
    cookiepostman VARCHAR(255),
    urlpostman VARCHAR(255)
);
