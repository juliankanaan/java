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
