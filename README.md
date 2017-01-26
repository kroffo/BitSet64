# BitSet64
An interface to add, remove and query a set containing (or not) numbers 0 through 63.

The set used is a custom bit set made using a long. This set will flip the bits of the entered number mod 64.
The corresponding bit will be 1 when the number mod 64 is in the set, and 0 when it is not.

## Running the Program
This is a swing application. Compile the code as normal, but run the code from the package directory. From the root directory, you can just enter the following:

```
cd BitSet/src
javac bitset/*.java
java bitset.Display.java
```
