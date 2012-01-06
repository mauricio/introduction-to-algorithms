package algorithms.chapter1

import org.specs2.mutable.Specification

/**
 * User: Maurício Linhares
 * Date: 1/6/12
 * Time: 8:53 AM
 */

class SelectionSortSpec extends Specification {

	val sorter = new SelectionSort()

	"correctlly sort the array" in {

		val items = Array(5, 2, 4, 6, 1, 3)

		sorter.sort(items)

		items.toList === List( 1, 2, 3, 4, 5, 6 )

	}

	"correctly sort the small array" in {

		val items = Array(2, 1)

		sorter.sort( items )

		items.toList === List(1, 2)

	}
	
}