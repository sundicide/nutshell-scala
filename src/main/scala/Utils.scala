object Utils {
  /**
   * getType of parameter
   * https://stackoverflow.com/questions/19386964/i-want-to-get-the-type-of-a-variable-at-runtime
   * @param t any
   * @tparam T any
   * @return type name
   */
  def manOf[T: Manifest](t: T): Manifest[T] = manifest[T]
}
