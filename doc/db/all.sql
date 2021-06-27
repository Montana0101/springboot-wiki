select * from wiki.test;
insert into test (username,password) values ('菲娜11','20191108');

drop table if exists `demo`;
create table `demo` (
	`id` bigint not null comment  'id',
    `username` varchar(50) comment '名称',
    `password` varchar(50) comment '密码',
    primary key (`id`)
) engine=innodb default charset=utf8mb4 comment = '测试';