package algorithms.chapter2

/**
 * User: Maurício Linhares
 * Date: 1/6/12
 * Time: 4:06 PM
 */

trait Searcher {

	def search[T <% Ordered[T]]( items : Array[T], item : T ) : Int

}