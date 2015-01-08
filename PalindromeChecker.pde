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
  if (backwards.equals(simple)) {return true;}
  return false;
}

