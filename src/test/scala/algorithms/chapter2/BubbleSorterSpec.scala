package algorithms.chapter2

import org.specs2.mutable.Specification

/**
 * User: Maurício Linhares
 * Date: 1/6/12
 * Time: 11:31 PM
 */

class BubbleSorterSpec extends Specification {

	val sort = new BubbleSorter()

	"while sorting arrays" should {

		"sort correctly with merge sort and an odd number of items" in {

			val items = Array(5, 2, 4, 6, 1, 3, 7)

			sort.sort( items )

			items.toList === List( 1, 2, 3, 4, 5, 6, 7 )

		}

		"sort correctly with merge sort and an even number of items" in {

			val items = Array(5, 2, 4, 6, 1, 3)

			sort.sort( items )

			items.toList === List( 1, 2, 3, 4, 5, 6 )

		}

		"sort correctly a small array" in {

			val items = Array( 2, 1 )

			sort.sort(items)

			items.toList === List( 1, 2 )
		}

	}

}