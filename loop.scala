/*Scala program to print numbers from 1 to 100 
using for loop.*/

object ExampleForLoop1 {
   def main(args: Array[String]) {
      var counter: Int=0;
      
      for(counter <- 1 to 100)
        print(counter + " ");
    
      // to print new line
      println();
   }
}