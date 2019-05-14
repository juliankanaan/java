## Visibility

`private` methods are not accessible to subclasses -- so cannot be overridden
-> corollary: an attempt to override a private parent method will make two **unrelated methods**.

subclasses cannot undermine parent class visibility
-> overriding a public parent method? Must be public too.

## Casting

Got a method for two objects, but both use the method differently? Cast them onto
the *Object* object, then use `instanceof` to check & handle differently. 

ie. a Circle object, and a Square object & wanting to use getDescription()

-> initialize using generic Object data type (watch this weird syntax)
`Object circle1 = new Circle(args)`
`Object square1 = new Square(args)`

-> wrap it in a function that accepts a generic Object
`public static void getDescription(Object object)`

-> check which kind of object it is, and handle them differently
```
if (object instanceof Circle) {
  // yo this is a circle.
} elseif (object instanceof Square){
  // its a square. do something else
}

```
