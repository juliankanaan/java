## Creating a custom exception

Exceptions are objects. Created with non-static classes and initialized on the fly w/ `throw new CustomException(args)`. They can validate class constructors (creating objects), or methods.

One: Extend the Exception class, construct it, using the args of `super()` to put in errors

```
public class NewException extends Exception{
  String message; // data type since we want varying NewException objects

  public NewException(String message){
    super("Error: " + message); // pass or don't pass an arg here, who cares
    this.message = message; // save string to object
  }
}

```


Two: Indicate to the relevant class constructor / method that the exception might be thrown

```

public class NewClass {
  datatype args;

  public NewClass(args) throws NewException {
    if (argsDontDoAThingIwant){

      throw new NewException("Cant construct like that, hombre");

    } else {
      this.args = args; // it's gucci
    }
  }
}
```

Three: use try-and-catch when actually creating those objects. sysOut the entire exception object itself

```
public static void main(String[] args) {
  try {
    NewClass(badArgs); // throws an error
    NewClass(goodArgs); // all good
  } catch (NewException e) {
    System.out.println(e); // "Cant construct like that, hombre"
  }
}

```
