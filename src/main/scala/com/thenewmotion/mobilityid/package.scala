package com.thenewmotion

package object mobilityid {
  implicit private[mobilityid] class CharacterChecks(val c: Char) extends AnyVal {
    def isAsciiUpper: Boolean = c >= 'A' && c <= 'Z'
    def isAsciiDigit: Boolean = c >= '0' && c <= '9'
    def isAsciiUpperOrDigit: Boolean = isAsciiUpper || isAsciiDigit
  }
}
