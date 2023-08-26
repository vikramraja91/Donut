import scala.io.StdIn.readLine

object one {
  def main(args:Array[String])={
    var a=readLine("enter a number:")
    var x=a.toInt
    var b=readLine("enter a number:")
    var y=b.toInt
    if (x>y){
      println("x is greater")
    }else{
      println("y is greater")
    }

  }

}
