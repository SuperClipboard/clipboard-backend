CREATE DATABASE IF NOT EXISTS clipboard;
USE clipboard;

DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user
(
    id         INT(10)      NOT NULL AUTO_INCREMENT,
    email      VARCHAR(255) NOT NULL,
    salt       VARCHAR(255) NOT NULL,
    creator    VARCHAR(255) NOT NULL DEFAULT '',
    updater    VARCHAR(255) NOT NULL DEFAULT '',
    is_deleted TINYINT(2)   NOT NULL DEFAULT '0',
    created_on INT(10)      NOT NULL DEFAULT '0',
    updated_on INT(10)      NOT NULL DEFAULT '0',
    deleted_on INT(10)      NOT NULL DEFAULT '0',
    PRIMARY KEY (id),
    UNIQUE (email)
) CHARSET utf8mb4
  ENGINE = INNODB;

INSERT INTO t_user (email, salt)
VALUES ('admin@163.com', 'admin'),
       ('root@163.com', 'root');

DROP TABLE IF EXISTS t_clipboard_content;
CREATE TABLE t_clipboard_content
(
    id         BIGINT(20)   NOT NULL AUTO_INCREMENT,
    user_id    INT(10)      NOT NULL,
    content    MEDIUMTEXT   NOT NULL,
    creator    VARCHAR(255) NOT NULL DEFAULT '',
    is_deleted TINYINT(2)   NOT NULL DEFAULT '0',
    created_on INT(10)      NOT NULL DEFAULT '0',
    deleted_on INT(10)      NOT NULL DEFAULT '0',
    PRIMARY KEY (id)
) CHARSET utf8mb4
  ENGINE = INNODB;
