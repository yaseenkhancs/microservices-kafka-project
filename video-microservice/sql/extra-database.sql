create database db2

grant all privileges on extra_database.* to 'mydo'@'%' identified by 'mydosecret'

create database db3

grant all privileges on extra_database.* to 'threedo'@'%' identified by 'threedosecret'