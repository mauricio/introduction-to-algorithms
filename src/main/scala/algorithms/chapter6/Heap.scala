package algorithms.chapter6

import algorithms.utils.ArrayUtils.swap;

/**
 * User: Maurício Linhares
 * Date: 1/22/12
 * Time: 6:26 PM
 */

object Heap {

	def sort [T <% Ordered[T]] ( items : Array[T] )  {
		
		buildMaxHeap(items, items.size)
		
		var size = items.length

		( items.length - 1 ).to( 1 ).by( -1 ).inclusive.foreach(( index ) => {

			swap( items, 0, index )
			size -= 1
			maxHeapify(items, 0, size)

		} )


	}

	def left [T <% Ordered[T]] ( index : Int ) : Int = {
		(2 * index) + 1
	}

	def right [T <% Ordered[T]] ( index : Int ) : Int = {
		(2 * index) + 2
	}

	def parent( index : Int ) : Int = {
		( index - 1 ) / 2
	}

	def maxHeapify[T <% Ordered[T]] ( items : Array[T], index : Int, size : Int ) {

		val leftIndex = left( index )
		val rightIndex = right( index )
		var largest = index

		if ( leftIndex < size && items(leftIndex) > items(largest) ) {
			largest = leftIndex
		}

		if ( rightIndex < size && items(rightIndex) > items(largest) ) {
			largest = rightIndex
		}

		if ( largest != index ) {
			swap( items, index, largest )
			maxHeapify( items, largest, size )
		}

	}

	def buildMaxHeap[T <% Ordered[T]] ( items : Array[T], size : Int ) {

		( items.length / 2 ).to( 0 ).by(-1).inclusive.foreach( ( index ) => {

			maxHeapify(items, index, size)
			printf( "starting index %s - %s%n", index, items.toList )

		} )

	}


}