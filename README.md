# microservices-springboot-scaffolding
![Spring Boot 2.7.3](https://img.shields.io/badge/Spring%20Boot-2.7.3-brightgreen)
![MyBatis 3.5.4](https://img.shields.io/badge/MyBatis-3.3.2-9cf)
![MyBatis Plus 3.3.2](https://img.shields.io/badge/MyBatis%20Plus-3.3.2-f669b4)
![JUnit5](https://img.shields.io/badge/JUnit5-blue.svg)
![JaCoCo](https://img.shields.io/badge/JaCoCo-green.svg)
![Spotless](https://img.shields.io/badge/Spotless-yellow.svg)


代码格式化
```
mvn clean spotless:apply
```

生成覆盖率报告
在microservices-jacoco-coverage中添加要统计的模块，然后执行命令
```
mvn clean install
```
在microservices-jacoco-coverage/target/site/jacoco-aggregate/index.html查看合并的报告。