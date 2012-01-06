package algorithms.chapter2

import scala.collection.mutable.ListBuffer

/**
 * User: Maurício Linhares
 * Date: 1/6/12
 * Time: 11:37 AM
 */

class MergeSorter extends Sorter {

	def sort[T <% Ordered[T]](items: Array[T]): Unit = {

		val buffer = ListBuffer[T]()
		buffer ++= items

		var count = 0

		performSort(buffer).foreach( ( item ) => {

			items.update( count, item )
			count += 1

		} )

	}
	
	def performSort[ T <% Ordered[T]]( items : ListBuffer[T] ) : ListBuffer[T] = {
		
		if ( items.length <= 1 ) {
			return items
		}

		if ( items.length == 2 ) {

			if ( items(0) > items(1) ) {
				val bigger = items(0)
				items.update( 0, items(1) )
				items.update( 1, bigger)
			}

			return items
		}
		
		val middle = (items.length / 2) + ( items.length % 2 )
		
		var left = items.slice( 0, middle )
		var right = items.slice( middle, items.length )

		return merge( performSort(left), performSort(right) )
	}
	
	def merge[T <% Ordered[T]]( left : ListBuffer[T], right : ListBuffer[T] ) : ListBuffer[T] = {

		val result = ListBuffer[T]()

		while ( left.size > 0 && right.size > 0 ) {

			if ( left.head <= right.head ) {
				result += left.remove(0)
			} else {
				result += right.remove(0)
			}

		}

		if ( left.size == 0 && right.size != 0 ) {
			result ++= right
		}

		if ( right.size == 0 && left.size != 0 ) {
			result ++= left
		}

		return result
	}
}