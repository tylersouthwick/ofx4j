package net.northfuse.ofx

import net.northfuse.ofx.domain._
import org.junit.Test
import java.io._

class OfxWriterTest extends OfxWriter {

        @Test
        def check {
		val ofx = new OFX
		val out = new ByteArrayOutputStream
		ofx.write(out)
		println("output: " + ofx)
		println(out.toString)
        }
}
