package simple

import xyz.kamyar.jni.nativeLoader

@nativeLoader("demo0")
object Library {

  @native def say(message: String): Int

}
