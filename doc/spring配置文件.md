## spring配置文件
### Bean 标签
- Bean 标签基本设置  
用于配置对象由 Spring 来创建  
默认调用无参构造  
基本属性：  
  id 唯一标识  
  class Bean 全限定名称
  
- Bean 标签范围配置  
singleton   
  单例，核心文件加载时实例化配置的 Bean 对象
  应用加载创建，容器在对象就在，容器销毁就没  
prototype 多例  
  多个，调用 getBean() 方法，实例化 Bean
  使用对象创建新的实例对象
  对象被使用就一直存活，长时间不使用 GC 回收

request Web项目，对象放入 request 域中  
session Web项目，对象放入 session 域中  
global session  应用在 Portlet 环境  
- Bean 的生命周期配置
