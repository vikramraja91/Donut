object ll {
  def main(args:Array[String]): Unit ={
    def expen(a:Map[String,Int],b:Int)={
      var total=0
      var count=0
      a.values.toList.sorted.foreach(p=>{
        if(total+p<=b){
          count+=1
          total+=p
        }else{
          (total,count)
        }
      })
      (total,count)
    }

    val c=Map("a"->1,"b"->3,"c"->4,"d"->8,"e"->5)
    val d=9
    expen(c,d)

  }

}
