package algorithms.chapter2

/**
 * User: Maurício Linhares
 * Date: 1/5/12
 * Time: 6:14 PM
 */

trait Sorter {

	def sort [T <% Ordered[T]] ( items : Array[T] ) : Unit

}