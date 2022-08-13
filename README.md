# Flames_Calculator
flames calculator by using java 

#note :
  this flames calculator program is is full of my own logic is there is any issues to run my code or any upgrades to run my code more efficient please Bing me through my e-mail : sdivakaran683@gmail.com

on this flame claculator i use two classes in different files 

In class Flame_calculator_main:
  
  in this class I declare a scanner object as in static
  
  i get a two names as a input from the user and i also craeted the object obj g
  
  and i calls the method(getString()) by the obj(object)
   the method getstring() with two parameters(str1,str2) returns the string we stores the  returned value in newstr String variable
  
  we declare a integer variable len and we declare the value the length of the newstr varaible
  
  And i calls the method(output()) by the obj(object)
  the method output() with two parameter(len) dispalys the value "relation between the two names"
  
In class Find_flames:
  in this class I created the methods output() and getstring() and took()
  and we declare that static string variables N1 and N2
  under we declare a scanner object as a static
  
  the method getsstring() with the two parameters str1and str2:
    in this method we disclose that two string output and the outputf
    and we assign the two variables and n1 and n1 the N1 value of StR1 and N2 value of StR2 and we convert the value of STR1 to lowercase and STR2 to upper case
    we create a for loop with the start value 0 and the condition I are you less than str1.length() and I increments after completion of loop but in the for loop
    we get outta sing a chasa character with the value at the str1.charAt(i)
    when we declara POS as an integer and the value is STR2.indexof(Ch)
    the index of is usually to find the index at the string he did return stop position of the character at industry if the character found at the string it did returns the position index
    otherwise it returns minus one you the value of POS is equal to minus one the loop will skip under value of I will increment otherwise it replaces the position we get from the string
    the loop runs while the condition is false if the condition is false we declare that variable output as a instance variable we are storinh the value of str1 and str2 value as 
    the value of output and finally we declare the for loop two segregates the alphabet and digits the segregated value stored in the outputf and it returns the outputf
    
 the method gets output() with the two parameters integer len :
  when we call the method output with the parameter length at in the method output we declare the string variable F with the value of FLAMES 
  under the string variable RES="" and we declare the integer variable N and did so value is len
  and also we declare integer variable K with the value equals to 0
  I declared a for loop with the initial value 0 and the condition is true and it increments i at every looping
  this for loop gets us the store value between the relations between the names he did replace the other characters buy spaces 
  and finally he calls us the method result what did that value that we get from the for loop
  
the method gets result() with the two parameters character res:
  in this method result within the parameters character res
  it defaultly prints "the relation between the first name and the second name is" for every 
  it enters into the switch case with the value or res I need to check the cases and executes the case that match with the value res
  for example the value of result is F he prints friendship and break the switch statement
