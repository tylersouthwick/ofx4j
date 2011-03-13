package net.northfuse.ofx

import net.northfuse.ofx.domain._
import java.io.OutputStream

object OfxWriter {
	val context = javax.xml.bind.JAXBContext.newInstance(classOf[ObjectFactory])
	val marshaller = context.createMarshaller

	def write(ofx : OFX, out: OutputStream) = marshaller.marshal(ofx, out)
}
