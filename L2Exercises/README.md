# 2. OOP - Best Practices

## Presentations

* [Java OOP - Best Practices](https://drive.google.com/open?id=1Z5LSyOsua7J4KXqGwwyHq0QjnvRbprcGO9zuA-8MJ6k)


## Exercise 2.1

Define a class Person with properties id, firstName, and familyName. The method personalDetails() of Person returns the full name. Define a class Student that inherits from Person. The Student has a grade. It overrides the personalDetails() method, which in addition to the full name returns the grade. Define a class Worker that inherits from Person. The worker has the properties dailyWage and workWours. Also, implement a method getHourlyWage(), which calculates the earnings per hour, based on the daily wage and the hours worked. The personalDetails() implementation of the Worker class returns all the relevant information. Create a HumanResources class, that has a list of Person objects. It has methods to add and remove Person objects. When a person is added, a unique ID is assigned to that person. The HumanResources class has also a generateReport() method, that prints the personal details of all contained Person objects. Write a program, that adds several Student and Worker objects to the HumanResources class, then call the generateReport() method. Create an UML class diagram that reflects the classes in the problem.

* [Exercise 2.1 and OOP discussion video](https://drive.google.com/open?id=1Xp6RIUt1qCvgFJXapRuW9q70d7T52F_SoA)
* [Diagram](src/demos/Exercise%202.1%20Diagram.png)
* [Demo code](src/demos)

## Exercise 2.2

Define an interface Shape with three methods: calculatePerimeter(), calculateSurface(), and shapeDetails(). Define two classes, Rectangle and Circle, that implement Shape. The rectangle needs to have the properties width and height. The Circle needs to have a property radius. Both the Circle and the Rectangle need to have implementation of the calculatePerimeter() and calculateSurface() methods, that do the calculation according to the formula for the specific shape. The classes also need to have an implementation of the shapeDetails() method, that returns a string, containing the shape type, the corresponding properties, the calculated perimeter and surface. Define a ShapeInventory class, that holds a List of Shapes. It has a displayInventory() method, that calls the shapeDetails() methods of all the Shape objects that it holds and prints them. Also, create methods to add and remove shapes to the ShapeInventory. Write a program, that creates several Rectangles and Circle objects with different sizes and adds them to the ShapeInventory, then call the displayInventory method. Create an UML class diagram that reflects the classes in the problem.

## Exercise 2.3 - Optional

Read the following chapter (in Bulgarian) about the best practices in writing code:

[Writing quality code](https://introprogramming.info/intro-java-book/read-online/glava21-kachestven-programen-kod/)

## Exercise 2.4 - Optional

For those that like to dig a little deeper, here is some info about the design patterns that we mentioned in class. Here is the link to the wikipedia article about the original book. Inside that article are the links to the individual patterns. In my view the ones, that are most often used and are worth checking are: Factory method, Singleton, Adapter, Facade, Proxy, Observer, State.

[Design Patterns - Wikipedia](https://en.wikipedia.org/wiki/Design_Patterns)