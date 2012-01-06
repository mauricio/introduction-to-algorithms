package algorithms.chapter2

import org.specs2.mutable.Specification

/**
 * User: Maurício Linhares
 * Date: 1/6/12
 * Time: 4:29 PM
 */

class BinarySeacherSpec extends Specification {

	val searcher = new BinarySearcher()

	"searcher" should {

		"find the value expected in a sorted array" in {
			val items = Array( 1, 2, 3, 4, 5, 6, 7, 8 )
			searcher.search( items, 7 ) === 6
		}

		"find the value expected in a sorted array at the end" in {
			val items = Array( 1, 2, 3, 4, 5, 6, 7, 8 )
			searcher.search( items, 8 ) === 7
		}

		"not find the value" in {
			val items = Array( 1, 2, 3, 4, 5, 6, 7, 8 )
			searcher.search( items, 10 ) === -1
		}

		"find the value in a single item element" in {

			val items = Array( 6 )
			searcher.search( items, 6 ) === 0

		}

		"find the value expected in a two items array" in {
			val items = Array( 1, 2 )
			searcher.search( items, 2 ) === 1
		}

		"not find the value expected in a two items array" in {
			val items = Array( 1, 2 )
			searcher.search( items, 3 ) === -1
		}

		"not find the value if it is not there" in {

			val items = Array( 6 )
			searcher.search( items, 5 ) === -1

		}


	}

}