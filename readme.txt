spring xml���ñ�ǩ���
<!-- ָ��������� �ڶ�bean���ж���ʱ������ʹ��id������ָ������֮�⣬Ϊ���ṩ������ƣ�����ʹ��alias��ǩ��ָ���� --> 
<alias name="" alias=""/>	

<!-- applicationContext.xml�ļ���ʹ��import�ķ�ʽ������ģ�������ļ� -->	
<import resource=""/>	

<!-- ������ -->	
<bean></bean>

<!--�ڻ���������ʽ����Spring�������ļ��У�����ܻ����<context:annotation-config/>����һ�����ã�����������ʽ���� Spring ����ע��
AutowiredAnnotationBeanPostProcessor��CommonAnnotationBeanPostProcessor��
PersistenceAnnotationBeanPostProcessor �Լ� RequiredAnnotationBeanPostProcessor �� 4 ��BeanPostProcessor��
ע����4�� BeanPostProcessor�����ã�����Ϊ�����ϵͳ�ܹ�ʶ����Ӧ��ע�⡣ -->
<context:annotation-config></context:annotation-config>

<!-- Spring 2.5�����˸�����ͻ�ע��(stereotype annotations)�� @Component��@Service�� @Controller��@Component��������Spring���������ͨ����ʽ�� -->
<context:component-scan base-package=""></context:component-scan>	

<!-- ֻҪ������ApplicationContext��ApplicationContext�е��κ�Bean����ʵ��LoadTimeWearveAware���Ӷ�����load-time weaver ʵ�������á�
��Spring ��JPAһ��ʹ���Ǻ����õġ�����load-time weaving����JPA ��ת���Ǻܱ�Ҫ�ġ� -->
<context:load-time-weaver/>

<!-- pringͨ��annotationע��ע��MBean��JMXʵ�ּ��java����״̬ -->
<context:mbean-export/>

<!-- ��<context:property-override location="..."/> //�������Զ�����properties�ļ��ж�������Ը���spring�����ļ���ͬ��������ֵ�� -->
<context:property-override/>

<!-- ��Ҫ��spring�������ļ�������һ�䣺<context:property-placeholder location="classpath:jdbc.properties"/> ���ɣ�����locationֵΪ���������ļ���λ�ã����������ļ�ͨ������srcĿ¼�£������������ļ��ĸ�ʽ��javaͨ�õĲ��������ļ���ͬ������ֵ�Ե���ʽ�� -->
<context:property-placeholder/>

<!-- -->
<context:spring-configured>
</context:spring-configured>

<!-- �����õ�javabean��������Ϣ
<description></description>
-->

    <!-- ����spring mvc ע��-->  
    <mvc:annotation-driven>   
    </mvc:annotation-driven>  
      
    <!-- �Զ�ɨ��İ��� ��ʹSpring֧���Զ�����������ע���Controller-->  
    <context:component-scan base-package="com.alibaba.controller" />  
    <context:component-scan base-package="com.alibaba.service"/>  
      
      
    <!-- ��ͼ������:������ת���ļ���ǰ��׺ -->    
    <bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">    
        <property name="prefix" value="/WEB-INF/jsp/" />    
        <property name="suffix" value=".jsp" />  <!--��Ϊ��,����ʵ�����ѵ�������չ����ѡ����ͼ��������߼�  -->  
    </bean>    
  
    <!--����������, ���������,˳��ִ�� -->   
    <mvc:interceptors>    
        <mvc:interceptor>    
            <!-- ƥ�����url·��  -->  
            <mvc:mapping path="/" />  
            <mvc:mapping path="/user/**" />  
            <mvc:mapping path="/test/**" />  
              
            <bean class="com.alibaba.interceptor.CommonInterceptor"></bean>    
        </mvc:interceptor>  
        <!-- �����ö��������ʱ���Ȱ�˳�����preHandle������Ȼ���������ÿ����������postHandle��afterCompletion���� -->  
    </mvc:interceptors>  