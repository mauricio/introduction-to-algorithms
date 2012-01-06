package algorithms.chapter2

import org.specs2.mutable.Specification
import runtime.RichInt

/**
 * User: Maurício Linhares
 * Date: 1/5/12
 * Time: 6:23 PM
 */

class InsertionSortSpec extends Specification {

	val insertionSort = new InsertionSorter()

	"while sorting arrays" should {

		"sort correctly with merge sort" in {

			val items = Array(5, 2, 4, 6, 1, 3)
			
			insertionSort.sort( items )

			items.toList === List( 1, 2, 3, 4, 5, 6 )

		}
		
		"sort correctly a small array" in {
			
			val items = Array( 2, 1 )
			
			insertionSort.sort(items)
			
			items.toList === List( 1, 2 )
		}

	}

}