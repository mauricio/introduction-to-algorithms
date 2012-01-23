package algorithms.chapter6

import org.specs2.mutable.Specification

/**
 * User: Maurício Linhares
 * Date: 1/22/12
 * Time: 6:30 PM
 */

class HeapSpec extends Specification {
	
	"heap" should {

		"should correctly max heapify an array" in {

			val items = Array[Int]( 1, 2, 3, 4, 5 )

			Heap.buildMaxHeap(items, items.size)

			items.toList === List( 5, 4, 3, 1, 2 )
		}

		"should correctly max heapify a piece array" in {

			val items = Array[Int]( 1, 2, 3, 4, 5, 6 )

			Heap.buildMaxHeap(items, 5)

			items.toList === List( 5, 4, 3, 1, 2, 6 )
		}

		"sort a list of items" in {

			val items = Array[Int]( 5,13,2,25,7,17,20,8,4 )

			Heap.sort(items)

			items.toList === List( 2, 4, 5, 7, 8, 13, 17, 20, 25 )

		}

	}


}