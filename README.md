## questions and answers system
这是问答社区项目的重构
## document
[spring 文档](https://spring.io/guides)|
[bootstrap 文档](https://www.bootcss.com/)|
[es 社区](https://elasticsearch.cn/)|
[Github Oath Doc](https://docs.github.com/en/free-pro-team@latest/developers/apps/building-oauth-apps)
## tools
[github](https://github.com/btoob/QAsys)
[Visual-paradigm](https://www.visual-paradigm.com)
## script
```sql
create table user(
    id int AUTO_INCREMENT primary key not null comment '用户编号',
    name varchar(50) default null comment '用户名',
    password varchar(50) default null comment '密码',
    email varchar(30) default null comment '邮箱',
    user_face varchar(255) default null comment '头像'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
## note
导入flyway依赖的同时必须导入mybatis的依赖，因为Flyway用到其中的数据库注解
## 运行 migrate 和 generator 的命令
```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```
## BUG
```text
1、tag标签暂时只能添加一个，后期需要改为数组
2、程序出错时应该要返回定制错误页面
3、应该加入spring security
4、questionDTO封装user的时候似乎需要重新整一个BaseResultMap
5、getUserQuestionsByPage与getAllQuestionsByPage(Integer page, Integer size)有重复代码抽取
6、问题查询逻辑貌似有重复，已经将所有问题封装成DTOs返回了，为何进入问题详情页面时再查一次？
```