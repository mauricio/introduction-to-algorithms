package algorithms.chapter2

import org.specs2.mutable.Specification

/**
 * User: Maurício Linhares
 * Date: 1/5/12
 * Time: 11:26 PM
 */

class InvertedInsertionSortSpec extends Specification {

	val sorter = new InvertedInsertionSorter()

	"sorter" should {

		"correctlly sort the array" in {

			val items = Array(5, 2, 4, 6, 1, 3)

			sorter.sort(items)

			items.toList === List( 6, 5, 4, 3, 2, 1 )

		}

		"correctly sort the small array" in {

			val items = Array(1, 2)

			sorter.sort( items )

			items.toList === List(2, 1)

		}

	}

}