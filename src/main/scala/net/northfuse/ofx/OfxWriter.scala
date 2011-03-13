package net.northfuse.ofx

object OfxWriter {
	val context = javax.xml.bind.JAXBContext.newInstance(classOf[net.northfuse.ofx.domain.ObjectFactory])
	val marshaller = context.createMarshaller
}
