-- begin ESHOP_CUSTOMER
create table ESHOP_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FIRST_NAME varchar(255),
    SECOND_NAME varchar(255),
    TELEPHONE varchar(100) not null,
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end ESHOP_CUSTOMER
-- begin ESHOP_LINE_ITEM
create table ESHOP_LINE_ITEM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36) not null,
    QUANTITY integer not null,
    SUM_ decimal(19, 2),
    ORDER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ESHOP_LINE_ITEM
-- begin ESHOP_ITEM
create table ESHOP_ITEM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end ESHOP_ITEM
-- begin ESHOP_ORDER
create table ESHOP_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36) not null,
    ORDER_ID varchar(255),
    --
    primary key (ID)
)^
-- end ESHOP_ORDER
