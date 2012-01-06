package algorithms.chapter1

/**
 * User: Maurício Linhares
 * Date: 1/5/12
 * Time: 6:14 PM
 */

trait Sort {

	def sort [T <% Ordered[T]] ( items : Array[T] ) : Unit

}