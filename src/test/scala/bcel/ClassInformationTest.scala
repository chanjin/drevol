package bcel
//import org.scalatest.funsuite.AnyFunSuite
import org.scalatest._

import org.apache.bcel.classfile._
import java.io.File
import bcel._

class ClassInformationTest extends AnyFlatSpec with BeforeAndAfterAll {

  var ts: List[JavaClass]

  override def beforeAll() {
    // 모든 테스트 전에 실행
    val analyzer = new TypeAnalyzer
    val url = getClass.getClassLoader.getResource("junit")
    print(url)

    ts = analyzer.getJavaClasses(new File(url.toURI())).toList.map(_.asInstanceOf[JavaClass])
  }

  override def afterAll() {
    // 모든 테스트 후에 실행
  }



}
