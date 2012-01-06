package algorithms.chapter2

/**
 * User: Maurício Linhares
 * Date: 1/6/12
 * Time: 4:07 PM
 */

class BinarySearcher extends Searcher {

	override def search[T <% Ordered[T]]( items : Array[T], item : T ) : Int = {
		return binarySearch( items, item, 0, items.length )
	}

	def binarySearch[T <% Ordered[T]]( items : Array[T], item : T, start : Int, end : Int ) : Int = {
		
		(end - start) match {
			case 0 => -1
			case 1 => if ( item == items(start) ) start else -1
			case 2 => {

				if ( item == items(start) ) {
					return start
				}
				
				if ( item == items(end - 1) ) {
					return end - 1
				}

				return -1
			}
			case _ => {
				val medianIndex = (( end - start ) / 2) + start
				val median = items( medianIndex )
				
				item.compareTo( median ) match {
					case 0 => medianIndex
					case 1 => binarySearch( items, item, medianIndex + 1, end )
					case -1 => binarySearch( items, item, start, medianIndex )
				}
				
			}
		}

	}

}