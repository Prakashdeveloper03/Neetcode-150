import scala.collection.mutable.Stack
import scala.io.StdIn

object Solution {
  def isValid(s: String): Boolean = {
    val stack = Stack[Char]()
    s.forall {
      case '('                     => stack.push(')'); true
      case '['                     => stack.push(']'); true
      case '{'                     => stack.push('}'); true
      case other if stack.nonEmpty => stack.pop() == other
      case _                       => false
    } && stack.isEmpty
  }
}

object isValid extends App {
  val tc = StdIn.readInt()
  for (_ <- 1 to tc) {
    val s = StdIn.readLine()
    println(Solution.isValid(s))
  }
}
