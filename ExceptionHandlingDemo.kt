/* when i take 0 as input it will give exception and code terminate with
exception error for solution i will do try catch */
fun main(args: Array<String>) {
    println("Enter Value For Division" )
  try {
      var n1: Int=readLine()!!.toInt()
      var Div: Int=100 / n1
      println("Division is : $Div")
  }catch (ex:Exception){
      println(ex.message)
  }
    println("Operation Done !!" )
}
// when i use try catch code will execute without crashing