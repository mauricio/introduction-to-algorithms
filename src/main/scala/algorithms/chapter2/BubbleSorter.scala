package algorithms.chapter2

/**
 * User: Maurício Linhares
 * Date: 1/6/12
 * Time: 9:21 PM
 */

class BubbleSorter extends Sorter {

	def sort [T <% Ordered[T]] ( items : Array[T] ) : Unit = {

		var runs  = 0

		do {

			0.until( (items.length - 1) - runs ).foreach( ( index ) => {

				if ( items( index ) > items(index + 1) ) {
					val left = items(index)
					items.update( index, items(index + 1) )
					items.update( index + 1, left )
				}

			} )

			runs += 1

		} while ( runs != (items.length - 1) )
		

	}

}