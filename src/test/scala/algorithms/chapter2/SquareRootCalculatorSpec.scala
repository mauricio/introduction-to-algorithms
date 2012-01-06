package algorithms.chapter2

import org.specs2.mutable.Specification

/**
 * User: Maurício Linhares
 * Date: 1/6/12
 * Time: 7:06 PM
 */

class SquareRootCalculatorSpec extends Specification {

	val calculator = new SquareRootCalculator()

	"calculator" should {

		"correctly calculate the square root of 16" in {
			calculator.calculate( 16 ) === 4
		}

		"correctly calculate the square root of 4" in {
			calculator.calculate( 4 ) === 2
		}

		"correctly calculate the square root of 64516" in {
			calculator.calculate( 64516 ) === 254
		}

	}

}