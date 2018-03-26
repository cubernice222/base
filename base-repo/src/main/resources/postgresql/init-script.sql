CREATE TABLE t_base_country(
  country_id SERIAL4 PRIMARY KEY NOT NULL , -- SERIAL4不但会生成主键,而且不需要insert into 带列
  letter2 VARCHAR(2) NOT NULL ,
  letter3 VARCHAR(3) NOT NULL ,
  numeric VARCHAR(3) NOT NULL ,
  ISO3166_2 VARCHAR(2) NOT NULL ,
  country_en VARCHAR(256) NOT NULL ,
  country_cn VARCHAR(256) NOT NULL ,
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);
 CREATE TABLE t_base_currency(
  currency_id SERIAL4 PRIMARY KEY NOT NULL ,
  alpha_code VARCHAR(6) NOT NULL ,
  number_code VARCHAR(6) NOT NULL ,
  minor_unit INT ,
  symbol_currency VARCHAR(6),
  locale_message VARCHAR(32),
  zh_cn_name VARCHAR(64),
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);
CREATE TABLE t_base_catalog(
  catalog_id SERIAL4 PRIMARY KEY NOT NULL ,
  catalog_name VARCHAR(256),
  catalog_alias VARCHAR(256),
  catalog_desc varchar(1024),
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);
CREATE TABLE t_base_catalog_item(
  catalog_item_id SERIAL4 PRIMARY KEY NOT NULL ,
  catalog_id INT,
  item_name VARCHAR(256),
  item_value varchar(1024),
  item_desc varchar(2048),
  item_position INT,
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);
CREATE TABLE t_base_country_group(
  group_item_id SERIAL4 PRIMARY KEY NOT NULL ,
  catalog_item_id INT,
  country_id INT,
  group_index INT,
  status VARCHAR(2),
  operator VARCHAR(64),
  update_time TIMESTAMP WITHOUT TIME ZONE,
  create_time TIMESTAMP WITHOUT TIME ZONE
);
