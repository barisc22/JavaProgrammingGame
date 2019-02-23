import java.io.FileOutputStream;
import java.io.PrintStream;
public class TheCode {
public static void main(String[] args) {
try{

PrintStream out = new PrintStream(new FileOutputStream("outputOfCode.txt"));
System.setOut(out);
String s = "David";
System.out.println("Hello " + s + "! How are you?");
}catch(Exception e){System.out.println();}
}}