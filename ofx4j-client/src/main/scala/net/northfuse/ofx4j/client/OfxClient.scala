package net.northfuse.ofx4j.client

import net.northufse.ofx4j.domain.OFX

trait OfxClient {
	def invoke(request : OFX) : OFX
}
