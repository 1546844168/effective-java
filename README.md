      写出优秀的代码，是我所追求的
      				————江峰

第二章：创建和销毁对象

	1.产生对象时，切忌第一反应就是提供公有构造器,考虑使用静态工厂方法。
	2.重叠构造器模式，就是当属性比较多时，提供多个构造器，构造器参数依次增加。但是可读性比较差
	3.构建器模式：四个参数以上时，建议使用构建器模式
	4.比如一些工具类，我们并不想将这些类进行实例化，所以可以将这个类的无参构造器设置为private的，让外界访问不到，但是可以通过反射的方式进行强行访问。
	5.避免创建不必要的对象：如 String str = new String("hello");会创建两个对象，直接使用String str = "hello";就好了。 
	6.java支持自动装箱，拆箱。使用时要慎重，避免不必要的自动装箱拆箱。如int与Integer之间的使用就要注意，避免频繁的进行转换。
	7.消除过期的对象引用：java对于没用的对象会进行垃圾回收，但并不是说就不用考虑内存的事情了。
	8.如果是由类自己来管理内存，那么就应该小心了。一旦元素被释放掉，那么就应该讲元素的引用置为null;用完了之后不在用的对象一律置为null。
	9.避免使用终结方法finalizer来进行垃圾回收，因为java语言规范不仅不会保证终结方法会被及时的执行，而是不保证会被执行。
	    System.gc()和System.runFinalization()虽然增加了终结方法执行的机会，但是也不会保证一定会执行;

第三章：对于所有对象都通用的方法

        equals(),hashCode(),comparable()方法。；
    1.equals()方法要满足一致性，自反性，传递性
    2.hashCode()：覆盖equals就要覆盖hashCode()方法。
        equals方法相等hashCode方法的值需要相等。hashCode相等equals方法不一定相等。
    3.所有的子类都应该覆盖toString()方法。
    4.Cloneable接口是没有方法的。所有实现了Cloneable的方法都应该覆盖Object的clone方法。此方法会首先调用super.clone()，然后修正任何需要修正的域。
        不可变的类是不支持拷贝的。clone这里有点不大懂,一般情况下也不会用clone。缺点太多。
    5.Comparable接口：如果一个类，实现了Comparable接口，说明这个类实例具有内在的排序性质。

第四章：类和接口

    1.第一规则：尽可能的使每个类或成员不被外界访问。实例域不能是公有的。公有类永远都不应该暴露可变的域。
        final修饰的可变对象的引用：虽然引用本省不能被修改，但是它所引用的对象却可以被修改。
        设计： 公有类不应该含有公有域，除了静态公有域，但是静态公有域也应该确保修饰的引用是不可变对象。
    2.final修饰的类，这个类是不能被拓展（继承）的。为了防止粗心或者恶意的子类假装对象的状态已经改变，从而破坏类的不可变行为。
        final修饰的变量不会默认初始化。
    3.如何使类变成不可变的类：
        1.为了确保不可变性，类绝对不允许被子类化，需要用final修饰类。并用final修饰成员变量
        2.将类的所有的构造器都变成私有的，并用静态工厂方法来代替共有的构造器。并用final修饰成员变量
    4.许多不可变的类具有一个或多个非final的域，再第一次访问时，可以将结果缓存在域中，这种情况可以很好的工作，因为对象是不可变的，它的不可变性如果这些计算如果被再次执行，就会产生相同的结果。延迟初始化，String类就用到了。
    5.坚决不要为每个get方法编写一个相应的set方法。除非有很好的理由要让类变成可变的类，否则就应该是不可变的。
        如果类不能被做成不可变的，仍然应该限制它的可变性。降低对象可一存在的状态数。即使域成为final的。除非有令人信服的理由使域变成非final的。
    6.复合优于继承
       注意： 如果父类的构造函数中调用的方法被子类重写，那么调用的会是子类的方法。所以父类的构造器内最好不要调用子类重写的父类的方法。
    7.接口要优于抽象类 —————— 骨架类实现，是为了继承的目的而设计的。
    8.接口应该只用于来定义类型，不应该用来导出常量。
    9.用函数对象表示策略
    10.嵌套类有四种：
        1.静态成员类
        2.非静态成员类
        3.匿名类
        4.局部类
        除了静态成员类，替他三种统称为内部类。
        静态成员类和非静态成员类的区别：
            在没有外围类的实例的情况下，要想创建非静态成员类的实例是不可能的。
    11.如果声明成员类不要求访问外围实例，就要始终把statis修饰符放在它的声明中。如果省略了static修饰符，则每个实例都将额外的指向一个外围对象的引用，
        保存这个引用需要消耗时间和空间，并且不会被垃圾回收。
    12.有时候并不用写一个接口的实现，直接通过匿名内部类的方式来实现可能会更加方便。

第五章：泛型

    1.请不要使用原生态类型：要使用泛型，使用List这样的原生态类型，会失掉类型安全性，但是使用List<Object>这样的参数化类型就不会。
        List<String>可以传递个类型List的参数，但不能传递给List<Object>的参数。
        无限制通配符类型? 如list<?>,
        所以：List<Object>是个参数化类型，表示可以包含任何对象类型的一个集合，List<?>则是一个通配符类型，表示只能包含某种未知对象类型的一个集合。而List是原生类型，不建议使用。
    2.消除非受检警告：要坚持住，要尽可能的消除每一个非受检警告。@SuppressWarnning注解：应该在尽可能小的范围内使用该注解，永远不要在整个类上使用该注解，
        非受检警告很重要，要尽可能想办法消除，如果实在消除不了，就使用@SuppressWarnning注解，同时把禁止该警告的原因写下来。
    3.列表优于数组:
        数组和泛型区别:
            1.数组是协变的，意思是：如果Sub是Super的子类型，那么Sub[]也是Super[]的子类型，泛型是不可协变的。意思是：如果Type1是Type的子类型，但List<Type1>不是List<Type2>的子类型。
            2.数组是具体化的，因此数组会在运行时才知道并检查他们的类型元素约束；
              而泛型是通过擦除来实现的，泛型只是在编译时强化他们的类型信息，并在运行时擦除他们的类型信息，擦除就是使泛型可以与没有使用泛型的代码任意进行互用。
    4.泛型是通过擦除实现的，List<Integer>运行时实例的运行类型只是List,List<String>[]运行时实例的运行类型只是List[], 擦除就是使泛型可以与没有使用泛型的代码随意进行互用。
    5.泛型没看完，还有三条没看。

第六章：枚举和注解

    1.枚举和注解没看，等第三版的出了在补上。
    
第七章：方法
    
    1.检验参数的有效性
        1.在方法执行它的任务之前，考虑参数有哪些限制，把这些限制写到文档中。并在方法的开头处检查他们的参数。养成习惯。
        2.对于非共有的方法，应该使用断言来检查他们的参数。
    2.必要时进行保护性拷贝：保护性拷贝是在检查参数的有效性之前进行的，并且有效性检查是针对拷贝之后的对象。而不是针对原始的对象。
    3.对于参数类型，要优先使用接口而不是类。即方法参数用接口。
    4.慎用重载方法： 要调用哪个重载方法是在编译时做出决定的。对于重载方法的选择是静态的，而对于被覆盖的方法的选择是动态的。        重写是机制，重载是例外。
    5.慎用可变参数：可变参数可支持零到多个参数。对可变参数进行重载时要在可变参数的方法内加一个单独的参数以防出现方法一样的情况。
    6.返回类型为数组和集合的方法没理由返回null，而不是返回一个零长度的数组或集合。
        也就是说长度为零时返回零长度的数组或集合，为null时返回null。
    7.为所有导出的API元素编写文档注释。注释应该是写这个API文档做了什么，而不是为什么这么做。还有前提条件和后置条件也应该写出来。
        不写注释是一种残忍。
    
第八章：通用程序设计
    
    1.将局部变量的作用域最小化：要是局部变量的作用域最小化，最有力的方法就是在第一次使用它的地方声明。几乎所有的局部变量都需要初始化。
        也可以通过使方法小而集中使局部变量的作用于最小化，也就是说一个方法不宜过于臃肿，将方法拆分。
    2.了解和使用类库：当你编写一个常见的方法时，可以查一下类库。或许类库中一种有了。类库中的性能会比自己写的好一些。
    3.基本类型优先于包装基本类型。
    3.当心字符串连接的性能：使用StringBuilder来代替String。
    4.通过接口引用对象：如果有合适的接口类型存在，那么对于参数，返回值，变量和域来说，就都应该使用接口类型进行声明。
    5.谨慎的进行优化：要努力编写好的程序而不是快的程序。
    
第九章：异常

第十章：并发
    
    1.同步访问共享的可变数据：关键字synchronized可以保证在同一时刻，只有一个线程执行同一个方法，或者一个代码块。
        1.Long 或 double 不是原子操作。
        2.为了在线程之间进行可靠的通信，也为了互斥访问，同步是必要的。归咎于java的内存模型。
        3.简而言之，当多个线程共享可变数据的时候，每个读或者写数据的线程都必须执行同步。
        4.如果线程之间只需要通信，而不需要互斥，那么可以考虑使用volatile。
    2.并发没看完，打算直接看java并发编程的书。
第十一章：序列化

    1.没看完，用到的时候再看吧，或者等第三版出了再看。

    
