DROP TABLE IF EXISTS cat_food CASCADE;
DROP TABLE IF EXISTS cat_food_ingredients CASCADE;
DROP TABLE IF EXISTS ingredient CASCADE;
DROP TABLE IF EXISTS company CASCADE;
DROP TABLE IF EXISTS issue CASCADE;
DROP TABLE IF EXISTS issue_target_products CASCADE;

CREATE TABLE cat_food
(
    id                BIGINT NOT NULL,
    energy_per100g    DOUBLE,
    activity_level    INTEGER,
    allergy_warning   INTEGER,
    formula           VARCHAR(255),
    ingredients_score DOUBLE,
    packaging_size    DOUBLE,
    process           INTEGER,
    target_age        INTEGER,
    texture           INTEGER,
    importer_id       BIGINT,
    manufacturer_id   BIGINT,
    PRIMARY KEY (id)
);

CREATE TABLE cat_food_ingredients
(
    cat_food_id    BIGINT NOT NULL,
    ingredients_id BIGINT NOT NULL
);

CREATE TABLE ingredient
(
    id            BIGINT NOT NULL,
    allergy_level INTEGER,
    level         INTEGER,
    name          VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE company
(
    id           BIGINT generated by default as identity,
    country      VARCHAR(255),
    english_name VARCHAR(255),
    korean_name  VARCHAR(255),
    logo_image   VARCHAR(255),
    social_score DOUBLE,
    PRIMARY KEY (id)
);

CREATE TABLE issue
(
    id          BIGINT NOT NULL,
    reason      VARCHAR(255),
    reported_at timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE issue_target_products
(
    issue_id           BIGINT NOT NULL,
    target_products_id BIGINT NOT NULL
);