package algorithms.chapter2

/**
 * User: Maurício Linhares
 * Date: 1/6/12
 * Time: 6:48 PM
 */

class SquareRootCalculator {

	def calculate(value: Int) : Int = {
		value match {
			case 1 => 1
			case _ => {
				sqrt(value, (2.until(value)))
			}
		}
	}

	def sqrt(value: Int, range: Range) : Int = {

		if ( range.head * range.head == value ) {
			return range.head
		}

		if ( range.end * range.end == value ) {
			return range.end
		}

		val tuple = range.splitAt( range.length / 2 )

		if ( inRange( value, tuple._1 ) ) {
			sqrt( value, tuple._1 )
		} else {
			sqrt( value, tuple._2 )
		}

	}
	
	def inRange( value : Int,  range : Range ) : Boolean = {
		value >= ( range.head * range.head ) && value <= ( range.end * range.end )
	}


}