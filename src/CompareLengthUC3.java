package Com.Bridgelab.LineComparision;

public class CompareLengthUC3 {
public static void main(String args[]){

int x1=4,y1=4,x2=7,y2=7;
int a1=2,b1=2,a2=8,b2=8;

//Calculating length
Double length1 =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
Double length2 =  Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2) * 1.0);
int compare = length1.compareTo(length2);
switch(compare){
case 1: System.out.println("Line-1 is Greater than Line-2");break;
case 0: System.out.println("Line-1 is Equal to Line-2");break;
case -1: System.out.println("Line-1 is less than Line-2");

		}
			}

		}

