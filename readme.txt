spring xml配置标签详解
<!-- 指定类的名称 在对bean进行定义时，除了使用id属性来指定名称之外，为了提供多个名称，可以使用alias标签来指定。 --> 
<alias name="" alias=""/>	

<!-- applicationContext.xml文件中使用import的方式导入有模块配置文件 -->	
<import resource=""/>	

<!-- 创建类 -->	
<bean></bean>

<!--在基于主机方式配置Spring的配置文件中，你可能会见到<context:annotation-config/>这样一条配置，他的作用是式地向 Spring 容器注册
AutowiredAnnotationBeanPostProcessor、CommonAnnotationBeanPostProcessor、
PersistenceAnnotationBeanPostProcessor 以及 RequiredAnnotationBeanPostProcessor 这 4 个BeanPostProcessor。
注册这4个 BeanPostProcessor的作用，就是为了你的系统能够识别相应的注解。 -->
<context:annotation-config></context:annotation-config>

<!-- Spring 2.5引入了更多典型化注解(stereotype annotations)： @Component、@Service和 @Controller。@Component是所有受Spring管理组件的通用形式； -->
<context:component-scan base-package=""></context:component-scan>	

<!-- 只要配置了ApplicationContext。ApplicationContext中的任何Bean可能实现LoadTimeWearveAware，从而接受load-time weaver 实例的引用。
与Spring 的JPA一起使用是很有用的。这里load-time weaving对于JPA 类转换是很必要的。 -->
<context:load-time-weaver/>

<!-- pring通过annotation注解注册MBean到JMX实现监控java运行状态 -->
<context:mbean-export/>

<!-- 　<context:property-override location="..."/> //这样会自动地用properties文件中定义的属性覆盖spring配置文件中同名的属性值。 -->
<context:property-override/>

<!-- 需要在spring的配置文件里添加一句：<context:property-placeholder location="classpath:jdbc.properties"/> 即可，这里location值为参数配置文件的位置，参数配置文件通常放在src目录下，而参数配置文件的格式跟java通用的参数配置文件相同，即键值对的形式， -->
<context:property-placeholder/>

<!-- -->
<context:spring-configured>
</context:spring-configured>

<!-- 所配置的javabean的描述信息
<description></description>
-->

    <!-- 启用spring mvc 注解-->  
    <mvc:annotation-driven>   
    </mvc:annotation-driven>  
      
    <!-- 自动扫描的包名 ，使Spring支持自动检测组件，如注解的Controller-->  
    <context:component-scan base-package="com.alibaba.controller" />  
    <context:component-scan base-package="com.alibaba.service"/>  
      
      
    <!-- 视图解析器:定义跳转的文件的前后缀 -->    
    <bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">    
        <property name="prefix" value="/WEB-INF/jsp/" />    
        <property name="suffix" value=".jsp" />  <!--可为空,方便实现自已的依据扩展名来选择视图解释类的逻辑  -->  
    </bean>    
  
    <!--配置拦截器, 多个拦截器,顺序执行 -->   
    <mvc:interceptors>    
        <mvc:interceptor>    
            <!-- 匹配的是url路径  -->  
            <mvc:mapping path="/" />  
            <mvc:mapping path="/user/**" />  
            <mvc:mapping path="/test/**" />  
              
            <bean class="com.alibaba.interceptor.CommonInterceptor"></bean>    
        </mvc:interceptor>  
        <!-- 当设置多个拦截器时，先按顺序调用preHandle方法，然后逆序调用每个拦截器的postHandle和afterCompletion方法 -->  
    </mvc:interceptors>  