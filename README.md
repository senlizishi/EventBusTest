## Guava Eventbus Test
用于测试 Guava Eventbus 的 Demo

![](https://images2015.cnblogs.com/blog/335784/201704/335784-20170425175621584-391763754.png)

### 消息丢失的场景
- 事件发布时，没有正确设置事件的发布模式。如果事件发布时使用了同步模式，那么发布事件的线程会等待所有订阅者都处理完事件后再继续执行。如果使用异步模式，则事件发布者会立即继续执行，而订阅者会在另外的线程中异步处理事件。如果事件处理较为耗时，而发布者在事件处理完成之前已经继续执行，那么事件就有可能被丢失。
- 订阅者没有正确处理事件。如果订阅者处理事件的代码出现了异常，那么事件就有可能被丢失。在这种情况下，您可以尝试添加异常处理代码，以便在出现异常时能够及时发现问题。
- Guava Eventbus 的线程池大小不够。如果您的应用中有大量的事件需要处理，而线程池大小不够，那么事件就有可能被丢失。在这种情况下，您可以尝试增大线程池的大小，或者使用 Executor 框架来管理线程池。


### 参考文章
- [EventBus Demo](https://www.cnblogs.com/crazymakercircle/p/17046275.html)
- [EventBus 深度解析](https://developer.aliyun.com/article/657112)
- [EventBus 消息丢失](https://juejin.cn/s/guava%20eventbus%20%E4%B8%A2%E5%A4%B1%E4%BF%A1%E6%81%AF)