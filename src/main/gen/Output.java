package main.gen;

import org.w3c.dom.*;import static main.gen.Functions.*;


public class Output {
  public static void main(String[] args) {

int a = 1;

String yes = "caseOne";

String str = "caseTwo";

String def = "defaultCase";

switch (yes) {

case "caseOne":

System.out.println(yes);

break;

case "caseONO":

System.out.println(str);

break;

default: 

System.out.println(def);

break;
}
{

int b = a + 10;
System.out.println(b);

}
System.out.println(b);
	}
}
