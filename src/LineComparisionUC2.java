package Com.Bridgelab.LineComparision;

public class LineComparisionUC2 {
public static void main(String args[]){

int x1=5,y1=4,x2=7,y2=2;
int a1=6,b1=4,a2=7,b2=2;
//Calculating distance
double distance1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
double distance2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2) * 1.0);

String d1 = Double.toString(distance1);
String d2 = Double.toString(distance2);
boolean compare = (d1.equals(d2));

if(compare == true ){

System.out.println("Line-1 is Equal to Line-2");
 }
else {
System.out.println("Line-1 is not Equal to Line-2");
  }
		}
}
