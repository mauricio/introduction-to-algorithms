package algorithms.chapter1

/**
 * User: Maurício Linhares
 * Date: 1/6/12
 * Time: 8:37 AM
 */

class SelectionSort extends Sort {

	def sort [T <% Ordered[T]] ( items : Array[T] ) : Unit = {

		0.until( items.length - 1 ).foreach( ( currentIndex ) => {

			var currentItem = items(currentIndex)
			var smallerIndex = currentIndex

			(currentIndex + 1).until( items.length ).foreach( ( loopIndex ) => {

				if ( currentItem > items( loopIndex ) ) {
					currentItem = items(loopIndex)
					smallerIndex = loopIndex
				}

			} )

			if ( smallerIndex != currentIndex ) {
				items.update( smallerIndex, items( currentIndex ) )
				items.update( currentIndex, currentItem )
			}

		} )

	}

}