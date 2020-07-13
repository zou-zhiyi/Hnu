# Hnu
the first web project

实现了score和student两个数据的增删改查,score和student通过字段stuNo关联<br>
使用springboot+mybatis+mysql,mysql版本为8.0.20<br><br>
在路径/src/main/resources中，application.properties内存放了数据库的相关信息，可用过修改相关信息修改项目连接的数据库<br><br>
在路径/src/main/java/com/zzy/springboot中，有四个包，分别为：po、mapper、service、controller;以及一个springboot的主程序<br><br>
po包存放的是score和student的实例、mapper存放的是scoremapper和studentmapper的接口和xml文件。该处两个包内的数据是由mybatis逆向工程生成的<br><br>
由于我对mySQL的语言还不够熟练，所以采用逆向工程的方式实现,逆向工程的xml文件在springboot包中<br><br>
service包内有service_interface接口和serviceImpl，serviceImpl实现了service_interface接口中的方法<br><br>
之后在controller中就可以调用service_interface中的方法，实现对数据的增删改查<br><br>
controller中有Studentcontroller和ScoreController，二者分别管理对student和score的操作<br><br>
controller只会调用service中的方法<br><br>
在路径/project1/src/main/webapp/WEB-INF/jsp中，存放所有页面的jsp文件<br><br>
