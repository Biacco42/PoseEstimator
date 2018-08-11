import org.opencv.core._
import org.opencv.imgproc.Imgproc
import org.opencv.imgcodecs.Imgcodecs

object OpenCVTest extends App {
  System.loadLibrary(Core.NATIVE_LIBRARY_NAME)

  val src = Imgcodecs.imread("src/main/resources/lena.png")
  println(src)
  val gray = new Mat()
  Imgproc.cvtColor(src, gray, Imgproc.COLOR_RGB2GRAY)
  Imgcodecs.imwrite("src/main/resources/after.png", gray)
}
