import spock.lang.Specification

class YoTest extends Specification {

    def "should mock object"() {
      given:
        def someObj = new Yo("someString")
        def loggerMock = Mock(MyLogger)
        someObj.log = loggerMock

      when:
        someObj.doStuff()

      then:
        1 * loggerMock.warn("stuff: someString")
    }
}
