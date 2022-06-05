# <center>教师管理系统
## 项目结构
### 1.代码层结构
根目录：top.imengying.tms
#### 1.1启动类
TmsApplication.java
#### 1.2前端控制器(Controller)
#### 1.3数据接口访问层(Dao)
#### 1.4实体类(Entity)
#### 1.5数据服务层
##### 
* 数据服务层接口(Service)
##### 
* 数据服务接口实现层(ServiceImpl)
### 2.资源文件结构
根目录：src/main/resources
#### 2.1配置文件
* application.yml
#### 2.2静态资源目录
##### static：用于存放css、js和图片资源
##### static/mapper：用于存放mybatis映射文件
* User.xml
* Class.xml
* College.xml
* Project.xml
* Teacher.xml
## 数据库设计
### user表
| username | password | permission | tid |
|:--------:|:--------:|:----------:| :---: |
|   用户名    |    密码    |     权限     | 教工号 |
### teacher表
| tid | tName | tSex | tAddress | tPhone |
| :---: | :---: | :---: | :---: | :---: |
 | 教工号 | 姓名 | 性别 | 地址 | 手机号 |
### project表
|  pid  | tid | pName | pExpense |
|:-----:| :---: | :----: |:-----:|
| 项目编号  | 教工号 | 项目名称 | 项目基金 |
### class表
| cid  | tid | cName |
|:----:| :---: | :---: |
| 课程编号 | 教工号 | 课程名称 |
### college表
| coid | tid | coName |
|:----:| :---: | :---: |
| 学院编号 | 教工号 | 学院名称 |