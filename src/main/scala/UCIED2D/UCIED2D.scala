// See README.md for license details.

package ucied2d

import chisel3._

/**
  * UCIE D2D adaptor
  */
class UCIED2D extends Module {
  val io = IO(new Bundle {
    // This is a dummy module
    val a        = Input(UInt(16.W))
    val b        = Output(UInt(16.W))
  })

  io.b := io.a
}
