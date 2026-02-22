package org.cobalt.unit.util

import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URI

/**
 * Implementation from OdinFabric
 * Original work: <a href="https://github.com/odtheking/OdinFabric">OdinFabric</a>
 *
 * @author OdinFabric
 */
internal fun setupConnection(url: String, timeout: Int = 5000, useCaches: Boolean = true): InputStream {
  val connection = URI(url).toURL().openConnection() as HttpURLConnection
  connection.setRequestMethod("GET")
  connection.setUseCaches(useCaches)
  connection.addRequestProperty("User-Agent", "Cobalt-Unit")
  connection.setReadTimeout(timeout)
  connection.setConnectTimeout(timeout)
  connection.setDoOutput(true)
  return connection.inputStream
}
