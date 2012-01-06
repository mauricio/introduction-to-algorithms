package algorithms.chapter1

/**
 * User: mauricio
 * Date: 1/5/12
 * Time: 5:35 PM
 */

class InsertionSort extends Sort {

	override def sort [T <% Ordered[T]]( items : Array[T] ) : Unit = {

		if ( items.length < 2 ) {
			throw new IllegalArgumentException( "Array must be bigger than 1" )
		}

		1.until( items.length ).foreach( ( currentIndex ) => {

			val key = items(currentIndex)

			var loopIndex = currentIndex - 1

			while ( loopIndex > -1 && items(loopIndex) > key ) {

				items.update( loopIndex + 1, items(loopIndex) )

				loopIndex -= 1
			}

			items.update( loopIndex + 1, key )

		} )

	}

}