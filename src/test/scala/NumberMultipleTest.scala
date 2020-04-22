import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks
import com.rxcorp.scalatest.practice.NumberMultiple.fizzBuzz


class NumberMultipleTest extends AnyWordSpec with Matchers with ScalaCheckDrivenPropertyChecks{

  val multiple_3:Int = 6
  val multiple_5:Int = 10
  val multiple_3_5:Int = 15
  val multiple_others:Int = 49


  "fizzBuzz " should {

    "return fizzbuzz when input number is multiple of 3 and 5" in {
      val expectedOutput: String = "fizzbuzz"
      assert(fizzBuzz(multiple_3_5) == expectedOutput)
    }

    "return fizz when input number is multiple of 3" in {
      val expectedOutput: String = "fizz"
      assert(fizzBuzz(multiple_3) == expectedOutput)
    }


    "return buzz when input number is multiple of 5" in {
      val expectedOutput:String = "buzz"
      assert(fizzBuzz(multiple_5) == expectedOutput)
    }

    "return the input number if all above cases are not met" in {
      val expectedOutput:String = multiple_others.toString
      assert(fizzBuzz(multiple_others) == expectedOutput)
    }


  }


}
