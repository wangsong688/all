synchronized:自动挡
lock：手动挡

https://pic1.zhimg.com/v2-ddb71ab0b68d65ae70244bfdeb0d6704_r.jpg

local：3个实现
ReentrantLock:重入锁
ReadLock：读锁
WriteLock：写锁




synchronized:上锁就是改变对象头
对象头：？
java对象布局？
java对象由什么组成？
    对象头
        对象自身运行时的数据【Mark Word】hashcode、锁状态标识、线程持有的锁、偏向线程ID、偏向时间戳、GC分代年龄。
        类型指针
    实例数据
    对齐填充
对象存在堆上！
对象在堆上需要分配多大的内存？
    属性：java对象的实例数据
    对象头 
