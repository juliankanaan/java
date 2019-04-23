# Random (exclusive)

(int)(Math.random() * (max - min) + min);

# Scanner
```
Scanner input = new Scanner(System.in);
...prompt
String response = nextLine();
int response    = nextInt();
double response = nextDouble();
input.close();
```
### ArrayList
```
//Create ArrayList
ArrayList<Integer> list1 = new ArrayList<>();

// get element
list1.get(pos);

// other operators
.size();, .add("thing"); .add(pos, "thing");, remove(pos); contains(); 

// Converting to Array ( list1.toArray() )

Integer[] list2 = list1.toArray( new Integer[list1.size()] );

// Array to ArrayList ( Arrays.asList(x) )
ArrayList<Integer> list3 = new ArrayList<>( Arrays.asList(list2) );
```
### ArrayList helpers

```
// package = java.util.Collections....
// find max
java.util.Collections.max(arrList);

// shuffle
.shuffle(list2)

```
### Accessibility modifiers (methods or datatypes)

same class? same package? from a subclass? from a different package?

`protected` things in a public class can be accessed by any class in the same package, OR by any of its subclasses -- no matter the package.

`protected` = everything but a different package

`default`= same package, same class

`private` = only by same class


### Changing / Mutating strings
Strings can't be changed within OOP.

```
// create a new String object *of the same

String s2 = new String("Hi there");


```
### Foreach loop
for (datatype thing : things )
```
String[] things = {"one","two", "three"};

for (String thing : things){
  System.out.println(thing);
}

```
### String operators
`s1.replace("e", "u");`

```
String s = 'hi there';

public void splitAndPrint(){
  String[] partials = s.split(" "); // returns String array of each piece
  for (int i =0; i < partials.length; i++){

      System.out.println(partials[i]);

  }
// returns hi, there
```
`s1.equals(s2);` // true or dalse

## Converting datatypes
`int newVal = Integer.parseInt(origString); // string to integer`

`double newVal = Double.parseDouble(origString); // string to double`

`Character.getNumericValue(charNum); // char to integer`

## Integer to ASCII

`char asciiChar = (char)num;`

`a-z: 65-90`

# String object characteristics

`.length()`
`firstString.concat(secondString);` `String bothStrings = firstString + secondString; `
`theString.toUpperCase()` `theString.toLowerCase()`

```
String message = "hi";

message.charAt(0); // is 'hi
```
## Does xyz exist in string?
```
int pos = bigString.indexOf(searchPhrase);

```
# Helpful java.util.array things
```
java.util.Arrays.sort(numArr);

Sysytem.out.println(java.util.Arrays.toString(nums));
```

# Math functions
```
Math.pow(a, raised);

Math.sqrt(a);

Math.ceil(2.1) // returns 3.0

Math.floor(2.1) // returns 2.0

(int)Math.round( .5 )

min(a, b); max(a. b);

abs(a, b);
```
# printf
```
double km = 12.3
System.out.printf("&.2f KM "); // 12.30 KM (two decimals)
```

# Do-While loops
```
int i = 1;
do {
  System.out.println("hi");
  i++;
} while (i < 5);
```
