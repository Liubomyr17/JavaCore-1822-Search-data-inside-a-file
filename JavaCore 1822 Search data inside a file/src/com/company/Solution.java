package com.company;

/*
1822 Search data inside a file

Read the file name from the console.
Find in the file information that relates to the given id and display it on the screen in the form in which it is written in the file.
The program starts with one parameter: id (int).
Close streams.
The data in the file is separated by a space and stored in the following sequence:
id productName price quantity
where id is int.
productName - product name, may contain spaces, String.
price - price, double.
quantity - quantity, int.
Information for each product is stored on a separate line.

Requirements:
1. The program should read the file name from the console.
2. Create a read stream for the file.
3. The program should find in the file and display information about the id, which is transmitted by the first parameter.
4. The stream to read from the file must be closed.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedReader f = new BufferedReader(new FileReader(br.readLine()));
       br.close();
       while(f.ready()) {
           String s = f.readLine();
           if(s.startsWith(args[0]))
               System.out.println(s);
       }
       f.close();
    }
}





