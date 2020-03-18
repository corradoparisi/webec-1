package webec

class CalculatorController {

    def calc(CalculatorModel calculatorModel) {
        if(calculatorModel.en < 1) {
            calculatorModel.result = "Cannot calculate. En was invalid."
        }
        else if(calculatorModel.msp < 1) {
            calculatorModel.result = "Cannot calculate. MSP was invalid."
        } else {
            double result = (calculatorModel.getEn() + calculatorModel.getMsp()) / 2
            calculatorModel.result = result
        }
        render view: 'CalculatorOutput', model: [calcModel: calculatorModel]
    }

    class CalculatorModel {
        double en
        double msp
        String result = ''
    }
}
