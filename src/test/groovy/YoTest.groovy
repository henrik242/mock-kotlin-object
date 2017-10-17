import spock.lang.Specification

class YoTest extends Specification {

    def "should mock object"() {
      given:
        def someObj = new Yo("someString")
        def loggerMock = Mock(MyLogger)
        someObj.log = loggerMock

      when:
        def res = someObj.doStuff()

      then:
        res == "foobar"
        1 * loggerMock.warn("stuff: someString") >> "foobar"
    }
}
