package algorithms.utils

/**
 * User: Maurício Linhares
 * Date: 1/22/12
 * Time: 6:57 PM
 */

object ArrayUtils {

	def swap[T]( items : Array[T], source : Int, destination : Int ) {
		var left = items(source)
		var right = items(destination)

		items.update( source, right )
		items.update( destination, left )
	}
	
}