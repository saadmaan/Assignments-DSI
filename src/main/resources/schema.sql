/**
 * Create database first (run manually)
 * CREATE DATABSE IF NOT EXISTS springboot;
 */
DROP TABLE IF EXISTS springboot.user;

CREATE TABLE springboot.user (
  email VARCHAR(45) NOT NULL,
  password VARCHAR(45) NULL,
  
PRIMARY KEY (email));