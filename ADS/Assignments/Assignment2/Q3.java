public class Q3 {
    public static void main(String[] args) {
        String str="Hello World";
        str=str.replaceAll("\\s", "");
        System.out.println(str);
        //[\\\s] unicode value \\s is a shorthand character class that matches any whitespace character, 
        //including spaces, tabs, and newline characters. It is commonly used in methods like replaceAll() 
        //to identify and replace all whitespace characters in a string.
    }
}
