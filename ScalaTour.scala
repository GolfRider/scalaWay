//Single line comment
package com.example

/*
Multi line comment 
*/

import java.util._
import scala.collection.immutable.List 

object ScalaBasics {

  def main(args:Array[String]):Unit = {
     sayHello("Elixir")
	 sumOfTwo(2,7)
	 isEqual(5,5)
	 forLoop()
	 listExamples()
  }
  
  //1.Simple Method 
  def sayHello(name:String) {
      println("Scala welcomes:"+name)  
  }
  
  //2.Add two numbers
  def sumOfTwo(a:Int,b:Int):Int ={
     val z=a+b
	 println("Sum is:"+z)
	 z
  }

  //3. Equality
  def isEqual(a:Int,b:Int):Boolean = {
        if(a==b) { 
	        println("are equal ..!") 
	    }else{
		    println("are un-equal..!")
		}
		(a==b)
  }
  //4. For Loops
  def forLoop()={
    val n=10
	for (i<- 1 to n){
	   println("Val:"+i)
	}
	(1 to 5).foreach(println(_))
  } 

  //5. List
  def listExamples() {
    val list=List("val_0")
	val x=list:+"val_2"
	val y=list+:x
	y.foreach(println(_))
	println("At index 2:"+y(2))
	
  } 

  //6. Exceptions
  def handleException()5 xxbgg  

}