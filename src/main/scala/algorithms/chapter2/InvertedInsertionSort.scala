package algorithms.chapter1

/**
 * User: Maurício Linhares
 * Date: 1/5/12
 * Time: 11:24 PM
 */

class InvertedInsertionSort extends Sort {

	override def sort[T <% Ordered[T]]( items : Array[T] ) : Unit = {

		if ( items.length < 2 ) {
			throw new IllegalArgumentException( "Array must be bigger than 1" )
		}

		1.until( items.length ).foreach( ( currentIndex ) => {

			val key = items(currentIndex)

			var loopIndex = currentIndex - 1

			while ( loopIndex > -1 && items(loopIndex) < key ) {

				items.update( loopIndex + 1, items(loopIndex) )

				loopIndex -= 1
			}

			items.update( loopIndex + 1, key )

		} )

	}

}