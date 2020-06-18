# Java8Repo
Java8Repo
Useful link https://www.javamadesoeasy.com/2017/10/what-are-method-references-in-java-8.html
1) What are Method references in java 8?
Ans) We use Lambda expressions to replace anonymous methods in java 8. 

But at times, a lambda expression does nothing but call an existing method. 
In such cases, it's better to refer to the existing method by name. 
Method references enables us to do that.

Method references are easy-to-read lambda expressions for methods that already have a name.
Advantages :- 
Method references make code easy to read, and more clean in java 8.
We can group all relevant code in a static method, and create a reference to that static method instead.
So, we can avoid using bulky anonymous inner class or even lambda expression.
Types of Method References :- 
There are 4 types of Method reference in Java 8 >
reference to static method  - 
ContainingClass::staticMethodName
Reference to an instance method of a particular object - 
containingObject::instanceMethodName
Reference to an instance method of an arbitrary object of a particular type - 
ContainingType::methodName
Reference to a constructor - 
ClassName::new

What is Lambda Expression in Java8 ? 
we can write lambda expression to replace the anonymous inner class.
lambda expression make code very neat and clean.
lambda expression are very to read. So, they make code more readable.
