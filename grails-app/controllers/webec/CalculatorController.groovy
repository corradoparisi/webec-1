package webec

class CalculatorController {

    def calc(CalculatorModel calculatorModel) {
        double result = (calculatorModel.getEn() + calculatorModel.getMsp()) / 2
        calculatorModel.result = result
        render view: 'CalculatorOutput', model: [calcModel: calculatorModel]
    }

    class CalculatorModel {
        double en
        double msp
        String result = ''
    }
}
