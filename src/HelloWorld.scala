/**
 * Created by marc on 18/07/2014.
 */

import java.util
import java.util._

object HelloWorld {
  def main (args: Array[String]) {
    println("hello world " + args(0))
  }

  def loop() = {
    for (i <- 1 to 5) {
      printf("%s,", i)
    }
    println()
    (6 to 10).foreach(i => printf("%d,", i))
    println()

    val isMoreThan5 = 11.to(15).forall(i => i>5)
    println(isMoreThan5)
  }

  def getPersonInfo(personId : Int) = ("Peter", "Pan", "peter@pan.com")

}

class Complex (val real:Int, val imaginary:Int) {
  def +(operand: Complex) : Complex = new Complex(real+operand.real, imaginary+operand.imaginary)
  override def toString() : String = real + (if (imaginary<0) "" else "+" ) + imaginary +"i"
}


class Car(val year:Int)
{
  private var kmDriven:Int = 0
  private var model:String = _

  def this (year:Int, kilometresDriven:Int, carModel:String)
  {
    this(year)
    kmDriven=kilometresDriven
    model = carModel
  }

  def km():Int = kmDriven

  def drive(distance:Int) = kmDriven = kmDriven+distance

  def fillGas(gas:Int) {
    kmDriven -= gas
  }

  override def toString():String = {
    println(f"$model%s $year%d $kmDriven%d")
    return f"$model%s $year%d $kmDriven%d"
  }
}

object Lists {
  def sumList {
    var myList: List[Int] = new ArrayList[Int];
    myList add 1
    myList add 2
    var total = 0
    0.to(myList.size()).foreach(i => total+=i)
    println(f"the total is $total")
  }

}

HelloWorld.loop()

var car = new Car(1981)
println(car km)
car drive 10
println(car km)

car = new Car(1981, 50000, "Ford")
println(car)

Lists.sumList

//var listA = new ArrayList[Int]
//var listB = new ArrayList[Any]
//listB = listA

var refA : Int = 1
var refB : Any = 2

refB = refA


//var args = Array[String]("hello")
//var helloWorld = new HelloWorld
//helloWorld.main(args)

//var (first, last, email) = HelloWorld.getPersonInfo(1); printf("%s %s", first, last)

//println(
//  """Hello
//    |this is a formatted string
//  """.stripMargin)

//val c1 = new Complex(1,4)
//val c2 = new Complex(4,-6)
//val sum = c1 + c2
//println(c1 +" + "+ c2 +" = "+ sum )