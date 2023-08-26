import com.first.DonutShoppingCart

object aa {
  def main(args: Array[String]): Unit = {

    val donutShoppingCart1: DonutShoppingCart[String] = new DonutShoppingCart[String]()
    donutShoppingCart1.add("Vanilla Donut")
    donutShoppingCart1.update("Vanilla Donut")
    donutShoppingCart1.search("Vanilla Donut")
    donutShoppingCart1.delete("Vanilla Donut")




  }
}
