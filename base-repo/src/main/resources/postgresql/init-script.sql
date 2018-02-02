create TABLE currency(
  id INT PRIMARY KEY NOT NULL ,
  alpha_code VARCHAR(6) NOT NULL ,
  number_code VARCHAR(6) NOT NULL ,
  minor_unit INT ,
  symbol_currency VARCHAR(6),
  locale_message VARCHAR(32),
  zh_cn_name VARCHAR(64),
  status VARCHAR(2),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);

CREATE TABLE country(
  id INT PRIMARY KEY NOT NULL ,
  letter2 VARCHAR(2) NOT NULL ,
  letter3 VARCHAR(3) NOT NULL ,
  numeric VARCHAR(3) NOT NULL ,
  ISO3166_2 VARCHAR(2) NOT NULL ,
  country_en VARCHAR(256) NOT NULL ,
  country_cn VARCHAR(256) NOT NULL ,
  status VARCHAR(2),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);