可以看到，执行clone之后，jvm开辟了一个新的地址489给大明，但是大明小明的每一个属性的地址完全一样
比如name：@510 address：486,同样大明小明的address的每一个页完全相同
1. 浅拷贝的对象,修改后影响原对象
2. 针对引用类型,浅拷贝复制的是对象引用。
   对于1当不改变引用时，所作修改同样符合。
