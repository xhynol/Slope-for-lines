public class APLine
{
// variable for x coefficient
 private int a;
 
// variable for y coefficient 
 private int b;
 
// y intercept
 private int c;
 
 // sets the varibles
 public APLine(int a, int b, int c){
   this.a = a;
   this.b = b;
   this.c = c;
 }
 
 // returns the slope
 public double getSlope(){
   return (double)a/(b*-1);
   }
   
 // returns true if the coordinate are on the line   
 public boolean isOnLine(int x, int y){
 return (((a * x) + (b * y) + c) == 0); }
 
 // returns the equation in string format
 public String toString(){
   return a + "x + " + b + "y + " + c + " = 0";}

public static void main(String[]args){
// variable a is set to 1, variable is set to 2, variable c is set to 3
   APLine a = new APLine(1,2,3);
   
// prints the equation out   
   System.out.println(a);
   
// v is set to slope   
   double v = a.getSlope();
   
// prints v which is -.5
   System.out.println(v);
// w is set to if (1,-2) is on line x+ 2y +3 = 0   
   boolean w = a.isOnLine(1,-2);
//prints true because (1, -2) is on line x + 2y + 3 = 0
   System.out.println(w);
   
   APLine line1 = new APLine(5,4,-17);
   double slope1 = line1.getSlope(); //slope1 is assigned -1.25
   boolean onLine1 = line1.isOnLine(5,-2); //true because 5(5) + 4(-1) + (-17) = 0
   System.out.println(line1 + " had a slope of " + slope1 + ".  (5, -2) is on line. " + onLine1);
   
   
   APLine line2 = new APLine(-25,40,30);
   double slope2 = line2.getSlope(); //slope2 is assigned .625
   boolean onLine2 = line2.isOnLine(5,-2); //false because -25(5) + 40(-2) + 30 != 0
   System.out.println(line2 + " had a slope of " + slope2 + ".  (5, -2) is on line. " + onLine2);

}
}