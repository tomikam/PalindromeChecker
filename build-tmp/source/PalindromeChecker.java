import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palidrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}
public boolean palindrome(String word)
{
  String simple = "";
  String backwards = "";
  for (int i = 0; i < word.length(); i ++) {
    String c = word.substring(i, i + 1);
    if (! (c.equals(" ") || c.equals(".") || c.equals(",") || c.equals("!") || c.equals("'")  )) {
      simple = simple + c.toLowerCase();
    }
  }
  for (int i = simple.length() - 1; i > -1; i -- ) {
    backwards = backwards + simple.substring(i, i + 1);
  } 
  //System.out.println("A: " + simple);
  //System.out.println("B: " + backwards);
  if (backwards.equals(simple)) {
    return true;
  }
  //Create a backwards string. 
  //Cut punctuation.
  //If backwards string equals forwards string, all ok. 
  
  return false;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
