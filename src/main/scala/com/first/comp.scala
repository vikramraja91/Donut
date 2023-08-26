package com.first

class comp(name:String,age:Int){
  var a=name
  var b=age
  def this(name:String){
    this(name,99)

  }
  def this(){
    this("vikram",30)

  }
  def ram()={
    a+ "nameIsNani" + "age" + b
  }

  override def toString: String = s"name is $a and $ram()"
}

object comp{
  def apply(name:String,age:Int):comp=new comp(name,age)

}


