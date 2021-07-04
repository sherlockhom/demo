# demo

springboot基础项目
***表示重要

1、项目结构
    aop——实现相关通知
    config——创建配置类
    filter——过滤器，实现过滤操作
    interceptor——拦截器，主要进行登录拦截
    listener——监听器
    model——模型层，存放实体类
    ***controller——控制层，实现路径匹配
    ***service——业务层，实现业务处理
    ***mapper——数据操作层，实现对数据库的增删改查操作
2、测试
    tomcat配置:端口为8085
    登录（post请求）：http://localhost:8085/demo/loginIn?name=dingxu&password=123456
    查询所有学生信息（post请求）：http://localhost:8085/demo/student/selectAll
    查询单个学生信息（post请求）：http://localhost:8085/demo/student/getStudent/{id}
    添加学生信息（post请求）：http://localhost:8085/demo/student/add?id=7&age=12&name=awqe
    删除学生信息（delete请求）：http://localhost:8085/demo/student/delete/{id}
    修改学生信息（post请求）：http://localhost:8085/demo/student/modify?id=7&age=22&name=asdas
    