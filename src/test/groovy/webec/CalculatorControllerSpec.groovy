package webec

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CalculatorControllerSpec extends Specification implements ControllerUnitTest<CalculatorController> {

    def setup() {
    }

    def cleanup() {
    }

//    void "test_calc"()  {
//        when: "calc is invoked with 5 and 6 "
//        controller.calc(5, 6);
//        then: "5.5 is returned"
//        model.result == 5.5
//    }

    void "test calc with calculator model"() {
        when: "calc is invoked with 5 and 6"
        def calculatorModel = new CalculatorModel(en: 5, msp: 6)
        controller.calc(calculatorModel)
        then: "5.5 is returned"
        calculatorModel.result == "5.5"
    }

    void "test calc with provided model"() {
        when: "calc is invoked with 5 and 6"
        def calculatorModel = new CalculatorModel(en: 5, msp: 6)
        controller.calc(calculatorModel)
        then: "5.5 is returned"
        model.calcModel.result == "5.5" // we're accessing the model that is sent to the view
    }

    void "test cals with invalid input"() {
        when: "calc is invoked with -20 and 3"
        def calculatorModel = new CalculatorModel(en: -20, msp: 3)
        controller.calc(calculatorModel)
        then: "An error message should be returned"
        model.calcModel.result == "Can NOT calculate. En was invalid."
    }
}
