You can read, write, and get data about files using java's `java.io.File` class

## About
Reading, writing files in Java takes the combination of the `File, Scanner, & PrintWriter` classes.  

Both Scanner & PrintWriter interact with a File object, so start here:
`java.io.File fileObj = new java.io.File("..pathToFile.txt");` creates a File object.

### Writing
Create a file to write to:

`java.io.PrintWriter outputFile = new java.io.PrintWriter(fileObj);`

Write stuff to it:

```
outputFile.print("Hi there.");
outputFile.print(90000);
int[] arr = {1,2,3,4};
// even handles arrays
outputFile.print(arr);
```

Close it up:
`outputFile.close();``

## Reading
Pass a File object to the Scanner class to start

NOTE: make sure the method this occurs in `throws Exception`

`Scanner inputFile = new Scanner(fileObj);`

You read it line by line where inside the loop you capture the different words:
```
while (inputFile.hasNext()){ // while a line of data exists...

}
```
