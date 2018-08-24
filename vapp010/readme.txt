//...S.my.ini-----------------------------------------------------------------
# Save as "my.ini" in your MySQL installed directory (e.g. d:\myProject\mysql)
[mysqld]
# Run the server on this TCP port number
port=8888
#...mysql: unknown variable 'secure_file_priv=NULL'
#...https://geodatawrangler.lazym8.com/blog/2017/02/16/secure-file-priv
secure_file_priv=''
#...Specify character settings at server startup.
#..https://dev.mysql.com/doc/refman/5.7/en/charset-applications.html
#...https://stackoverflow.com/questions/25852239/collation-utf8-general-ci-is-not-valid-for-character-set-latin1
character-set-server=utf8
collation-server=utf8_general_ci
init-connect='SET NAMES utf8'
#...https://stackoverflow.com/questions/3513773/change-mysql-default-character-set-to-utf-8-in-my-cnf
init_connect='SET collation_connection = utf8_unicode_ci' 
skip-character-set-client-handshake
   
[client]
# MySQL client connects to the server running on this TCP port number
port=8888
//...E.my.ini-----------------------------------------------------------------

C:\ZEnv\mysql-5\bin>mysqld --console
C:\ZEnv\mysql-5\bin>mysql -u root -p

#...https://dev.mysql.com/doc/refman/5.7/en/charset-applications.html
mysql> create database spring_vue character set utf8 collate utf8_general_ci;

CREATE TABLE user (  
  id int(11) NOT NULL AUTO_INCREMENT,  
  user_name varchar(40) NOT NULL,  
  password varchar(255) NOT NULL,  
  PRIMARY KEY (id)  
);


insert  into user(user_name, password) values('joy','123456');  
insert  into user(user_name, password) values('wins','123456');  

select * from user;

GRANT ALL PRIVILEGES ON springvue.* TO 'joywins2'@'%' WITH GRANT OPTION;
flush privileges;


mysql> select host, user, password from mysql.user;
mysql> set password for 'root'@'127.0.0.1'=password('tiger');
mysql> set password for 'root'@'localhost'=password('tiger');
mysql> set password for 'root'@'::1'=password('tiger');
mysql> drop user ''@'localhost';
mysql> grant all on *.* to 'joywins2'@'localhost';
mysql> create database spring_vue character set utf8 collate utf8_general_ci;