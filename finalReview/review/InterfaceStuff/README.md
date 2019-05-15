
##Interfaces
Only contain abstract methods. No constructor. They just describe functions.
Data fields are static & final (ie. are not connected to object type [bc no object lol], and cannot be changed)

class implementers must eventually implement **all** the abstract methods created in previous Interfaces
that it implements

Often describes behavior for subclass objects

# Comparable Interface

A java.lang.* package containing a single method: `compareTo(Object obj)`

The non-prototype objects String, Integer, Number, & Date all implement this Interface
via override.

`ie. date1.compareTo(date2)` returns negative if 1 < 2, zero if equal, positive if greater


### Implementing Comparable in custom classes




### Sorting [java.utils.Arrays.sort(ComparableClass obj list)]
Useful for sorting any kind of object by any property (id, name, date, whatevs)

First, have a custom object class:
```
public class Rectangle {
  public Rectangle(double width, double height){
    .. assign these vars ..
  }
```

Create a CustomClass (implementing Comparable Interface):
```
public class Rectangle implements Comparable<RectangleComparable> {
  public Rectangle(double width, double height){
    .. assign these vars ..
  }
}
```

Hijack (override) compareTo() abstract method from Comparable (using -1, 0, 1 to tell it who takes precedence...)
NOTE: Watch the weird syntax for the ifs.. [if (genericCalc > obj.calc)...]
```
public int compareTo(Rectangle obj){ // sort by width here...
  if (width > obj.width ){
    return 1;
  }
  ... then 0, then -1
}

```
Finally, we can actually use this to sort by whatever now, if we have an array of our custom object

```
// create normal array & add stuff to it

Rectangle[] rectangles = {
              new Rectangle(2.1, 19.3),
              new Rectangle(1.8, 3.9),
              new Rectangle(5.2, 4.4),

              };
// now sort
java.util.Arrays.sort(rectangles); // rectangles[] is now sorted like we wanted

// now foreach this bad boy

for(Rectangle rectangle: rectangles) {
  syso(rectangle + " "); // will print them in order now
}
```
ArrayList style:
```
// create empty ArrayList to hold our Student objects
ArrayList<Student> students = new ArrayList<Student>();

// add to it

students.add( new Student("Julian", 3.2) );
students.add( new Student("Madi", 4.0) );
students.add( new Student("Mike", 1.9) );

// sort that shit

Collections.sort(students); // now ArrayList is sorted

for (Student student : students) {
  System.out.println(student.fullName + " " + student.gpa);

}
```
# Cloneable Interface
Create copies of instances of class objects.
-> copyObj.equals(origObj) is always true

Classes that implement Cloneable *must* override the clone() method

```
class Student implements Cloneable {

  // constructor for Student
  @override
  public Object clone() throws CloneNotSupportedException {
    try {
        return super.clone(); // all ya gotta do
    } catch (CloneNotSupportedException(e)){
        System.out.println(e);
    }
  }

  Student student1 = new Student("Julian", 3.2);
  Student copy = (Student)(student1.clone()); // cloned

}
```
Copy method? Just set copy = student1;
