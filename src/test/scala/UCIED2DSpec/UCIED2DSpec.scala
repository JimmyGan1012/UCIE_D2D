// See README.md for license details.

package ucied2d

import chisel3._
import chiseltest._
import org.scalatest.freespec.AnyFreeSpec
import chisel3.experimental.BundleLiterals._

/**
  * This is a trivial example of how to run this Specification
  * From within sbt use:
  * {{{
  * testOnly ucied2d.UCIED2DSpec
  * }}}
  * From a terminal shell use:
  * {{{
  * sbt 'testOnly ucied2d.UCIED2DSpec'
  * }}}
  */
class UCIED2DSpec extends AnyFreeSpec with ChiselScalatestTester {

  "Dummy Test" in {
    test(new UCIED2D()) { dut =>
      dut.io.a.poke(1.U)
      
      dut.io.b.expect(1.U)
    }
  }
}
