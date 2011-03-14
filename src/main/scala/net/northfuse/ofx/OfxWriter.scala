package net.northfuse.ofx

import net.northfuse.ofx.domain._
import java.io._

object OfxWriter {
	val context = javax.xml.bind.JAXBContext.newInstance(classOf[ObjectFactory])
	val marshaller = context.createMarshaller
	val unmarshaller = context.createUnmarshaller

	def write(ofx : OFX, out: OutputStream) = marshaller.marshal(ofx, out)

	def read(in : InputStream) = unmarshaller.unmarshal(in).asInstanceOf[OFX]
}
