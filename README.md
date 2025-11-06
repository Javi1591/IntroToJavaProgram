# COP2251 – Java Assignment 1: AboutMe

A simple introductory Java console application that outputs formatted personal information and demonstrates arithmetic evaluation.  
This was the first assignment of the course and focuses on program structure, syntax, and console output.

## File Structure
nazario1and2/
└── nazario1/
    └── AboutMe.java

## Source Code Summary
File: AboutMe.java  
Package: nazario1  
Class: AboutMe  
Entry Point: public static void main(String[] args)  
The program prints four lines of information to the console:
1. The programmer’s full name.
2. Their favorite TV show.
3. Their high school and city.
4. The evaluated result of a numeric expression.

## Code Overview
// Nazario, Xavier  
// AboutMe.java  
// January 6, 2025 ©  
// Description: Program prints my name, favorite TV show, and my high school/city.  
// Also performs a mathematical operation and displays the result.

package nazario1;

public class AboutMe
{
    public static void main(String[] args)
    {
        System.out.println("Name: Xavier Nazario");
        System.out.println("Favorite TV Show: The Office");
        System.out.println("High School and City: Coral Reef Senior High, Miami, FL");

        double answer = (12.5 + 5.5 / 3) / (6.25 * 6 - 5.0);
        System.out.println("Result of expression (12.5 + 5.5 / 3) / (6.25 * 6 - 5.0) = " + answer);
    }
}

## Program Behavior
When executed, the program displays formatted output describing the author and prints the evaluated mathematical expression.

Example Console Output:
Name: Xavier Nazario  
Favorite TV Show: The Office  
High School and City: Coral Reef Senior High, Miami, FL  
Result of expression (12.5 + 5.5 / 3) / (6.25 * 6 - 5.0) = 0.38253968253968255

## Key Concepts Demonstrated
- Basic Program Structure: package, class, and main() method.  
- Console Output: Using System.out.println() to print text to the console.  
- Arithmetic Expressions: Demonstrates operator precedence and evaluation of a double expression.  
- Comments and Documentation: Proper use of header comments, descriptive inline notes, and consistent formatting.  
- Naming Conventions: Follows standard Java capitalization and file/class naming conventions.

## How to Compile and Run
Requirements:  
- Java Development Kit (JDK) 17 or later  
- Command line terminal or IDE (such as IntelliJ IDEA, Eclipse, or VS Code)

Commands:
javac nazario1/AboutMe.java  
java nazario1.AboutMe

## Expected Output
The program will print the lines exactly as shown in the example, followed by the numeric result of the expression.

## Author
Xavier Nazario © 2025  
Course: COP2251 – Java Programming  
GitHub: @Javi1591

## License
This project is licensed under the MIT License — see the LICENSE file for details.
