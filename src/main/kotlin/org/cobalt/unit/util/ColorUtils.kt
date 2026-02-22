package org.cobalt.unit.util

/**
 * Implementation from OdinFabric
 * Original work: <a href="https://github.com/odtheking/OdinFabric">OdinFabric</a>
 *
 * @author OdinFabric
 */

internal inline val Int.red get() = this shr 16 and 0xFF
internal inline val Int.green get() = this shr 8 and 0xFF
internal inline val Int.blue get() = this and 0xFF
internal inline val Int.alpha get() = this shr 24 and 0xFF
