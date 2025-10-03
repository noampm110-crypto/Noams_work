/*
תרגיל 1
import java.util.*;
public class variables1 {
    public static void main(String[] args) {
        int a;
        a = 5.8;
        System.out.println ("a=" + a);
    }
 }

 א.הפלט הוא a=5.
כאשר בהוראת הדפסה מופיע שם המשתנה, מודפס הערך שנמצא בתוך המשתנה.
ב.הודפס ERROR
ללא הוראת הצהרה התוכנית לא יכולה לקלוט ולשים ערכים במשתנים.
a=5.ג
ד.בתכנית יעשה שימוש במשתנה בשם a שיכול להכיל רק מספרים שלמים.
אם מציבים ב-a מספר לא שלם התוכנית לא תוכל לעבוד מכיוון שa מקבל רק מספרים שלמים.
 */

/*
תרגיל 2
import java.util.*;
public class variables2 {
    public static void main(String[] args){
        int a, b;
        a = 5;
        b=7;
        System.out.println ("a=" + a);
        System.out.println ("b=" + b);
        System.out.println ("a+b="+ (a+b));

    }
}
a=5
b=7
a+b=12
יש לרשום בינהיהם פסיק.
ניתן להדפיס גם תוצאות של פעולה חשבונית בין סוגריים.
 */

/*
תרגיל 3
import java.util.*;
public class Test_names {
   public static void main(String[] args){
       int very-good;
       very-good = 5;
       System.out.println ("7S=" + very-good);
   }
}
very_good=5
A=5
ERROR
T76=5
ERROR
verygood=5
ERROR
ERROR
שם של משתנה חייב להתחיל באות ולא במספר.
בשם של משתנה יכולים להופיע מספרים.
יש משמעות לאותיות גדולות ואותיות קטנות.

 */

/*
תרגיל 4
import java.util.*;
public class Numbers {
    public static void main(String[] args) {
        int first,second;
        first=10;
        second=100;
        System.out.println("first: "+first);
        System.out.println("second: "+second);
        System.out.println(first+second);
        System.out.println(first*second);
    }
}
*/

/*
 תרגיל 5 א.
import java.util.*;
public class variables5 {
    public static void main(String[] args){
        int num;
        num = 83;
        num = 90;
        System.out.println ("num is" + num);
    }
}
ב.ההצהרה המיותרת היא ההצהרה השנייה.
הסימן X כן נעלם.
 */

/*
תרגיל 6
נפלט יהיה:
n1=83
n2=80
n3=163
import java.util.*;
public class variables6 {
    public static void main(String[] args){
        int n1 , n2 , n3;
        n1 = 83;
        n2 = n1-3;
        n3 = n1+n2;
        System.out.println ("n1=" + n1);
        System.out.println ("n2=" + n2);
        System.out.println ("n3=" + n3);
    }
}
במשתנה n1 נמצא המספר: 83.
בשתנה n2 נמצא המספר: 80.
במשתנה n3 נמצא המספר: 163.
הערך להשמה יכול להיות מספר ויכול להיות תוצאה של חישוב בין מספר ומשתנה אחר, למשל n2=n1-3
או תוצאה של חישוב בין משתנים, למשל n3=n1+n2
 */

/*
תרגיל 7
נפלט יהיה:
num=-17
import java.util.*;
public class variables7 {
    public static void main(String[] args) {
        int num;
        num = 83;
        num=-17;
        System.out.println ("num=" + num);
    }
}
במשתנה num נמצא המספר 17-.
כאשר מכניסים ערך למשתנה, הערך הקודם נמחק ומתחלף בערך החדש.
 */

/*
תרגיל 8 א.
הפלט יהיה:
num=11
import java.util.*;
public class variables8 {
    public static void main(String[] args) {
        int num;
        num = 10;
        num= num+1;
        System.out.println ("num=" + num);
    }

}
במשתנה num נמצא המספר 11
מטרתה, להוסיף 1 לתוכן המשתנה num.
*/




 /*
 תרגיל 8 ב.
import java.util.*;
public class variables8 {
    public static void main(String[] args){
        int num;
        num = 10;
        num ++;
        System.out.println ("num=" + num);
    }
}
ההוראה ++num שקולה להוראה +1num = num
בשתיהן, מוסיפים 1 לתוכן של המשתנה num
*/

/*
תרגיל 9
הפלט יהיה:
x=10.א
y=10
z=10
import java.util.*;
public class variables9 {
    public static void main(String[] args) {
        int x , y , z;
        x = 10;
        y = x;
        z = x;
        System.out.println ("x=" + x);
        System.out.println ("y=" + y);
        System.out.println ("z=" + z);
    }
}
במשתנה x נמצא המספר 10
במשתנה y נמצא המספר 10
ובמשתנה z נמצא המספר 10
משמעות ההוראה y=x היא העברה של תוכן המשתנה  ל- y.
לאחר מכן, ב- x וב- y יש את אותו ערך(10).

ב.למשתנה X לא קורה כלום והוא נשאר עם אותו ערך שהיה מקודם.
 */

/*
תרגיל 10.
הפלט יהיה:
x=10000
y=4
import java.util.*;
public class variables10 {
    public static void main(String[] args) {
        int x , y ;
        x = 4;
        y = x;
        x = 10000;
        System.out.println ("x=" + x);
        System.out.println ("y=" + y);
    }
}
במשתנה x נמצא המספר 10000
במשתנה y נמצא המספר 4
לאחר ביצוע ההוראה ;x = y , אם משנים את הערך של x, הערך של y לא משתנה
מכיוון שמשנים את המשתנה X ולא את המשתנה Y אך Y עדיין שומר את הערך הקודם של X לפני ששינו אותו.
 */

/*
תרגיל 11
import java.util.*;
public class variables11 {
    public static void main(String[] args) {
        int side;
        side=10;
        System.out.println("the perimeter of the shape is: "+(side*4));
        System.out.println("the surface of the shape is: "+(side*side));
    }


}
*/

/*
תרגיל 12
import java.util.*;
public class variables12{
    public static void main(String[]args){
        int boys, girls,sum_of_students;
        boys=15;
        girls=12;
        sum_of_students=girls+boys;
        System.out.println("the number of the students in the class is: "+(sum_of_students));
        System.out.println("the number you need to add for a full class is: "+(42-sum_of_students));

    }
}
 */

/*
תרגיל 13
הפלט יהיה:
num=100
import java.util.*;
public class variables13{
    public static void main(String[]args){
        int num = 100;
        System.out.println ("num=" + num);
    }
}
במשתנה num נמצא המספר 100
 */

/*
 תרגיל 14 א
 הפלט יהיה:
num=101
x=100
import java.util.*;
public class variables14{
    public static void main(String[] args){
        int num = 100;
        int x = num++;
        System.out.println ("num=" + num);
        System.out.println ("x=" + x);
    }
}
x=num++; = x=num+1;
 */

/*
תרגיל 14 ב.
import java.util.*;
public class variables14{
    public static void main(String[]args){
        int num = 100;
        int x = ++num;
        System.out.println ("num=" + num);
        System.out.println ("x=" + x);
    }
}
x=++num; = num=num+1;
           x=num;

 */

/*
תרגיל 14 ג.
import java.util.*;
public class variables14{
    public static void main(String[] args){
        int num = 100;
        int x = --num;
        System.out.println ("num=" + num);
        System.out.println ("x=" + x);
    }
}
x=num--; = num=num-1;
           x=num+1;

x=--num; = num=num-1
           x=num
*/

/*
תרגיל 15
import java.util.Scanner;
public class FirstIOProg{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("enter int number");
        num=input.nextInt();
        System.out.println("num= "+num);
    }
}
קלט: 67
פלט:num= 67
ההוראה ;()nextInt.input היא הוראת קלט. משמעותה: קלוט מהמשתמש נתון
מטיפוס מספר שלם.
משמעות הביטוי ;()nextInt.input = num היא קליטת נתון מטיפוס INT והשמתו במשתנה.
 */

/*
תרגיל 16
import java.util.Scanner;
public class variables16{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter number");
        num1=input.nextInt();
        System.out.println("enter number");
        num2=input.nextInt();
        System.out.print(num2+" ");
        System.out.print(num1);
    }
}
 */

/*
תרגיל 17
import java.util.Scanner;
public class variables17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width;
        int length;
        System.out.println("enter length num");
        length = input.nextInt();
        System.out.println("enter width num");
        width = input.nextInt();
        System.out.println("the perimeter of the shape is: "+(2*(length+width)));
        System.out.println("the surface of the shape is: "+(length*width));
    }
}
 */

/*
תרגיל 18
import java.util.Scanner;
public class variables18{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("enter number");
        num1 = input.nextInt();
        System.out.print("enter number");
        num2=input.nextInt();
        System.out.print("enter number");
        num3=input.nextInt();
        System.out.println(num1);
        System.out.println(" "+num2);
        System.out.println("  "+num3);
        System.out.print("   "+num1);
        System.out.println(" "+num2);
        System.out.print("      "+num1);
        System.out.print(" "+num2);
        System.out.print(" "+num3);

    }
}
 */


 /*
 תרגיל 19 א.
import java.util.Scanner;
public class variables19{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int first_num, difference;
        System.out.println("enter the first number in the list");
        first_num=input.nextInt();
        System.out.println("enter the difference of the list");
        difference=input.nextInt();
        System.out.println("the third number in the list is:"+(first_num+difference*2));
        System.out.println("the fourth number in the list is:"+(first_num+difference*3));
        תרגיל 19 ב.
        System.out.println("the sum of the four  first numbers in the list is:"+(first_num+first_num+difference+first_num+difference*2+first_num+difference*3));
    }
}
  */

/*
תרגיל 20
import java.util.Scanner;
public class Change{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a; // first number;
        int b; // second number
        System.out.println ("enter first number");
        a = input.nextInt();
        System.out.println ("enter second number");
        b = input.nextInt();
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
        a = b;
        b = a;
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
    }
}
פלט:
a=1
b=2
a=2
b=2
גיא לא הצליח לפתור את המשימה בגלל שהוא לקח את ערך a ושינה אותו לערך של b אך לאחר מכן
לקח את הערך של b ושינה אותו לערך החדש של a מה שגרם לשני המשנים להכיל את אותו מספר.
 */

/*
תרגיל 20, תיקון הקוד של גיא.
import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        System.out.println("enter first number");
        a = input.nextInt();
        System.out.println("enter second number");
        b = input.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        c=b;
        d=a;
        b=d;
        a=c;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}
 */

/*
תרגיל 21
import java.util.*;
public class variables21{
    public static void main(String[]args){
        double num;
        num = 1.35;
        System.out.println ("num=" + num);
    }
}
פלט:
num=1.35
היא הוראת הצהרה ומשמעותה: בתכנית יעשה שימוש במשתנה בשם num שיכול להכיל מספרים ממשיים.
 */

/*
תרגיל 22
import java.util.Scanner;
public class variables22{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, num4, avg;
        System.out.println("enter number");
        num1=input.nextDouble();
        System.out.println("enter number");
        num2=input.nextDouble();
        System.out.println("enter number");
        num3=input.nextDouble();
        System.out.println("enter number");
        num4=input.nextDouble();
        avg=(num1+num2+num3+num4)/4;
        System.out.println("the avg of the numbers is: "+avg);
    }
}
*/

/*
תרגיל 23 א.
הפלט יהיה:
numI=15
numD=15.0
import java.util.*;
public class variables23{
    public static void main(String[]args){
        int numI = 15;
        double numD;
        numD = numI;
        System.out.println ("numI= " + numI);
        System.out.println ("numD= " + numD);
    }
}
numI=15
numD=15.0
 */

/*
תרגיל 23 ב.
הפלט יהיה שגיאה
import java.util.*;
public class variables23{
    public static void main(String[]args){
        int numInt;
        double numD;
        numD = 9.6;
        numI = numD;
        System.out.println ("numI= " + numI);
        System.out.println ("numD= " + numD);
    }
}
פלט: שגיאה
 */

/*
תרגיל 23 ב.
import java.util.*;
public class variables23{
    public static void main(String[]args){
        int numI;
        double numD;
        numD = 9.6;
        numI =(int)numD;
        System.out.println ("numI= " + numI);
        System.out.println ("numD= " + numD);
    }
}
numI=9
numD=9.6
אפשר להציב במשתנה מטיפוס מספר ממשי ערך של משתנה מטיפוס מספר שלם
 במקרה כזה, יתווסף למספר הממשי מספר אחרי הנקודה העשרונית.

כדי להציב במשתנה מטיפוס מספר שלם ערך של משתנה מטיפוס מספר ממשי
צריך לרשום (int) לפני הערך להצבה. למשל:
numI = (int)numD;

כאשר מתבצעת המרה, המספר השלם יקבל את החלק השלם של המספר הממשי.
 */

/*
תרגיל 24
import java.util.*;
public class variables24{
    public static void main(String[]args){
        char tav1 , tav2;
        tav1 = 't';
        tav2 = '+';
        System.out.println ("tav1=" + tav1);
        System.out.println ("tav2=" + tav2);
    }
}
למשל, משמעות ההוראה "tav = "t היא הצבת הערך "t" בתוך משתנה בשם tav.
 */

/*
תרגיל 25א.
הפלט יהיה:
num=99
ch=c
import java.util.*;
public class variables25{
    public static void main(String[]args){
        int num;
        char ch;
        ch = 'c';
        num = ch;
        System.out.println ("num=" + num);
        System.out.println ("ch=" + ch);
    }
}
num=99
ch=c
 */

/*
תרגיל 25ב.
הפלט יהיה שגיאה.
import java.util.*;
public class variables25 {
    public static void main(String[] args) {
        int num;
        char ch;
        num = 99;
        ch = num;
        System.out.println ("num=" + num);
        System.out.println ("ch=" + ch);
    }
}
שגיאה
 */

/*
תרגיל 25ג.
import java.util.*;
public class variables25{
    public static void main(String[]args){
        int num;
        char ch;
        num = 99;
        ch = (char) num;
        System.out.println ("num=" + num);
        System.out.println ("ch=" + ch);
    }
}
num=99
ch=c
כאשר מציבים במשתנה מטיפוס מספר שלם הערך של המשתנה מטיפוס תו,
 הערך שנכנס למשתנה השלם הוא הערך הASCII של התו שנמצא במשתנה התווי.

 אי אפשר להציב במשתנה מטיפוס תו, ערך של משתנה מטיפוס שלם.
 אבל, באמצעות המרה, למשל: ch=(char)num אפשר להציב במשתנה מטיפוס תו את התו
שהקוד האסקי שלו נמצא במשתנה מטיפוס שלם.
 */

/*
תרגיל 26.
import java.util.Scanner;
public class CheckMath{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println ("enter two number");
        a = input.nextInt();
        b = input.nextInt();
        int result = a+b;
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
        System.out.println ("result="+result);
    }
}
א.
התוצאה היא מטיפוס ממשי.
ב.
אם מציבים את התוצאה במשתנה מטיפוס מספר שלם, יכנס אליו רק
החלק השלם.

אם שני הערכים הם מטיפוס מספר שלם, התוצאה היא מטיפוס שלם.
א.
אם שני הערכים הם מטיפוס מספר שלם, ומציבים את התוצאה במשתנה מטיפוס מספר
שלם, יוכנס למשתנה החלק השלם.
ב.
אם שני הערכים הם מטיפוס מספר שלם, ומציבים את התוצאה במשתנה מטיפוס מספר
ממשי, יוכנס למשתנה הממשי גם את החלק השלם וגם את החלק הממשי של התוצאה.

לכן, כאשר הפעולה / מקבלת שני מספרים שלמים, היא מחזירה את החלק השלם של תוצאת החילוק.
 */

/*
תרגיל 27.
import java.util.Scanner;
public class variables27{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println ("enter two number");
        a = input.nextInt();
        b = input.nextInt();
        int result = a%b;
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
        System.out.println ("result="+result);
    }
}
כאשר הפעולה % קולטת שני מספרים שלמים, היא מחזירה את שארית החילוק.
*/

/*
תרגיל 28.
n3=num/10;
במשתנה 1n שמורה ספרת היחידות של המספר הנקלט.
במשתנה 2n שמורה ספרת העשרות של המספר הנקלט.
במשתנה 3n שמורה ספרת המאות של המספר הנקלט.
import java.util.*;
public class variables28{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num, n1, n2, n3;
        System.out.println("enter number");
        num=input.nextInt();
        n1=num%10;
        num=num/10;
        n2=num%10;
        n3=num/10;
        System.out.println(n1*100+n2*10+n3);
    }
}
 */

/*
תרגיל 29.
import java.util.Scanner;
public class variables29{
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       int num, dozens, fives,units;
       System.out.println("enter number");
       num=input.nextInt();
       dozens=num/10;
       num=num%10;
       fives=num/5;
       units=num%5;
       System.out.println("the amount of dozens is: "+dozens);
       System.out.println("the amount of fives is: "+fives);
       System.out.println("the amount of units is: "+units);
    }
}
 */

/*
תרגיל 30.
import java.util.Scanner;
public class variables30{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int today, days_left;
        System.out.println("enter the number of the day today");
        today=input.nextInt();
        System.out.println("enter the number of days left");
        days_left=input.nextInt();
        System.out.println("your birthday is on day: "+(days_left+today)%7);
    }
}
 */

/*
תרגיל 31.
import java.util.*;
public class variables31{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a,b;
        System.out.println ("enter two number");
        a = input.nextDouble();
        b = input.nextDouble();
        double result = a%b;
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
        System.out.println ("result="+result);
    }
}
כאשר הפעולה % קולטת שני מספרים ממשיים, היא מחזירה את שארית החילוק בין שני המספרים הממשיים.
 */

/*
תרגיל 32א.
import java.util.Scanner;
public class variables32{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        final double PI=3.14;
        double radius , area;
        System.out.println ("enter radius");
        radius = input.nextDouble();
        area = PI*radius*radius;
        System.out.println ("area ="+ area);
    }
}
רדיוס: 3
פלט: 28.259998
 */

/*
תרגיל 32ב.
import java.util.Scanner;
public class variables32{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        final double PI=3.14;
        double radius , area;
        System.out.println ("enter radius");
        radius = input.nextDouble();
        PI=12.7;
        area = PI*radius*radius;
        System.out.println ("area ="+ area);
    }
}
הסימן X מופיע בגלל שPI הוא משתנה קבוע שאי אפשר לשנות את הערך שלו ולכן הPI החדש יצור בעיה בקוד.
קבוע הוא נתון שאי אפשר לשנות את ערכו.

תרגיל 32ג.
אנו צריכים קבועים בשפות תכנות מכיוון שהקבועים יכולים לשמור נתונים ללא שינוי, מונעים שגיאות ויעילים לקודים עם הרבה משתנים.
 */









































































