Java Programming Language
- High Level
- Strongly Typed
- Case Sensitive
- successor of c++
- Pure Object Oriented Language

1- Wrapper

class Test{
public static void main (String a[]) {


}
}


2- Hello World Problem in java
class Test{
public static void main(String a[]) {
System.out.println("Hello World");
 }

}

3- Compile Program
set path=c:\temp\jdk1.5\bin
javac Test.java



4- Run Program
 java Test
 
5- More than one Classes
class Test1{
void print () {
System.out.println("Test class");
}
}
class Test{
public static void main(String a[]) {

Test1 t=new Test1(); 
t.print();
 }

}

Rule of Thumb: Don't write extra functions in driver classs
.....................................
6- Extra function and data in driver    class  

class Test{
int sq(int p){
   return p*p;
}
public static void main(String a[]) {
    Test t = new Test();
System.out.println(t.sq(4));
 }

}
..................................
call without object instaniciation
..................................

class Test{
static int sq(int p){
   return p*p;
}
public static void main(String a[]) {
System.out.println(sq(4));
 }

}
.....................................
7- Math Class Example
class MyMath{
int sq(int p){
 return p*p;
}
int power(int x , int y){
 if (y==0)
    return 1;
 else
    return x * power(x,y-1);
}
}
class Test{
public static void main(String a[]) {
MyMath m= new MyMath();
System.out.println(m.sq(4));
System.out.println(m.power(2,3));
 }
}
.....................................
calling methods without object instanciation
..................................
class MyMath{
static int sq(int p){
 return p*p;
}
static int power(int x, int y){
 if (y==0)
    return 1;
 else
    return x * power(x,y-1);
}
}
class Test{
 public static void main(String a[]) {
 System.out.println(MyMath.sq(4));
 System.out.println(MyMath.power(2,3));
 }
}
...................................

8-Naming Conventions and Indentation 

Compiler Naming Conventions

- First is $/_/letter, followed by letters/digits/_

$a   price_list, a2  2a(illegel)
....................................
Quality coding Standards
....................................
Naming Rules
a) Class name
     Shoaib
     ShoaibFarooq
     EnonomyOfPakistan
     Car
     Student
     StudentTranscript
b) Variables/function Name
     shoaib
     shoaibFarooq
     enonomyOfPakistan
     car
     student
     studentTranscript
c) Constants (AllUpper)
    final int A=5;
    final int SHOAIB=5;
    final int ECONOMYOFPAKISTAN=34;
.....................................
Indentation
  class Test{

  }

  void f (){

  }
  while (a>b){
  
  }
 .....................................
9- Data Types

  1- int (4 bytes)  short (2 byte)  long (8)
  2- float (4bytes) 2.5f
      float a=2.5f;
  3- double (8 bytes) 2.5
  4- byte ( 1 byte) 
  5- char (2 bytes) unicode ( Range 0 to 65536)
     'a' '\n'
     '\uxxxx'   '\u2345'   
    '\u' Followed by exactly four hexadecimal digits
      
  6- boolean  (true, false)
.....................................
10- Type Conversion
    Two Methods
     a) Coercion
     b) Casting

    1- Coercion
       - implicit type conversion by compiler
      int a=5;
      float b=a;//promotion
      double g=2.5;
      int y=g;//demotion (data loss)
               // not allowed
     float a=2.5; //demotion
                  //not allowed
  
    2- Casting
       - Explicit type conversion by programmer

       double b=2.5;
       int x=(int)b;
....................................
Practice 1 
class Test{
public static void main(String o[]) {
float a=2.5;

}
}
...................................
Practice 2 
class Test{
public static void main(String o[]) {
float a=2.5f;

}
}
.....................................
Practice 3 
class Test{
public static void main(String o[]) {
float a=2.5f;
int b=a;

}
}
.........................
Practice 4 
class Test{
public static void main(String o[]) {
float a=2.5f;
int b=(int)a;
}
}
....................................
Some Hint from C++ 
c++

void main() {
int i=1;
int sum=0;
while(i<=3){
 float j;
 cin>>j;
 sum=sum+j;
 i++;
}
cout<<sum;
} 

...........................











