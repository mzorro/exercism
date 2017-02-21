/**
  * Created by mz on 2/20 020.
  */
object HelloWorld {
  def hello(): String = {
    "Hello, World!"
  }

  def hello(name: String): String = {
    s"Hello, $name!"
  }
}
