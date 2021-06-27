#电子书表
drop table if exists `ebook`;
create table `ebook`(
    `id` bigint not null comment 'id',
    `username` varchar(50) comment '名称',
    `category1_id` bigint comment '分类1',
    `category2_id` bigint comment '分类2',
    `description` varchar(200) comment '描述',
    `cover` varchar(200) comment '分娩',
    `doc_count` int comment '文档书',
    `view_count` int comment '阅读数',
    `vote_count` int comment '点赞数',
    primary key(`id`)
) engine=innodb default charset=utf8mb4 comment='电子书';

insert into `ebook` (id,username,description) values (1,'黑客是怎样炼成的','黑客进行时');
select * from wikidev.ebook;