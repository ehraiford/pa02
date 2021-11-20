/*=============================================================================
| Assignment: pa02 - Calculating an 8, 16, or 32 bit
| checksum on an ASCII input file
|
| Author: Evan Raiford
| Language: Java
|
| To Compile: javac pa02.java
| gcc -o pa02 pa02.c
| g++ -o pa02 pa02.cpp
|
| To Execute: java -> java pa02 inputFile.txt 8
| or c++ -> ./pa02 inputFile.txt 8
| or c -> ./pa02 inputFile.txt 8
| where inputFile.txt is an ASCII input file
| and the number 8 could also be 16 or 32
| which are the valid checksum sizes, all
| other values are rejected with an error message
| and program termination
|
| Note: All input files are simple 8 bit ASCII input
|
| Class: CIS3360 - Security in Computing - Fall 2021
| Instructor: McAlpin
| Due Date: November 21st
|
+=============================================================================*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class pa01 {
    public static void main(String[] args) throws FileNotFoundException {
        File inText = new File(args[0]);
        int bitSize = String(args[1]);
        Scanner in = new Scanner(inText);
        String originalString = readData(in);

        System.out.println(originalString);
    }

    private static String readData(Scanner in) {
        String data = new String();
        while(in.hasNext()){
            data = data + in.next();
        }
        return data;
    }
}
/*=============================================================================
| I, Evan Raiford (ev316149) affirm that this program is
| entirely my own work and that I have neither developed my code together with
| any another person, nor copied any code from any other person, nor permitted
| my code to be copied or otherwise used by any other person, nor have I
| copied, modified, or otherwise used programs created by others. I acknowledge
| that any violation of the above terms will be treated as academic dishonesty.
+=============================================================================*/