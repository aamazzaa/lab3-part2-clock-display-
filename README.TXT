Project: clock-display
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 3.

To use this project, create an instance of class ClockDisplay. Then inspect this 
instance and leave the object inspector window open. With the inspector window open, 
call the object's methods, such as timeTick and setTime. Watch the 
"displayString" in the inspector.

The displayString field simulates the actual clock display device. Were this 
program running in a real clock, it would change the real, physical display 
hardware instead of this string. The timeTick method would be triggered once 
every minute by some timer hardware.

Everything else could be pretty much the same.


Note: This project does not implement adequate handling of errors.

21. Since this object starts at "00:00" we can understand that its a 24 hour clock that has a rollback of 60 in the minutes and 24 in the hours that uses the ClockTick method as its increment method.
23. 60 times or you can use the setTime method
24. NumberDisplay digit;
digit = new NumberDisplay(10);
25.
Rectangle window;
window = new Rectangle(10, 20);
26. public ClockDisplay(int hour, int minute) Constructor for ClockDisplay objects. This constructor creates a new clock set at the time specified by the parameters
27.because for one constructor your setting the time predeterminely and the other is set automaticly at zero.
28. p1.print("report.docx", true);
int status2 = p1.getStatus(5000);
29. Circle, Square, Triangle
30. roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
31. Maybe the boolean method for draw is internal the rest was externally called private boolean drawn;