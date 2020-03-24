package webec

class CalculatorController {

    def calc(CalculatorModel calculatorModel) {

        // DECLARATIVE
        if (calculatorModel.validate()) {
            double result = (calculatorModel.en + calculatorModel.msp) / 2
            calculatorModel.result = result
        } else {
            if (calculatorModel.errors.fieldErrors.any { it.field == 'en' }) {
                calculatorModel.result = "Can NOT calculate. En was invalid."
            } else if (calculatorModel.errors.fieldErrors.any { it.field == 'msp' }) {
                calculatorModel.result = "Can NOT calculate. Msp was invalid."
            }
        }
        render view: 'CalculatorOutput', model: [calcModel: calculatorModel]
    }

    // IMPERATIVE
//        if(calculatorModel.en < 1) {
//            calculatorModel.result = "Cannot calculate. En was invalid."
//        }
//        else if(calculatorModel.msp < 1) {
//            calculatorModel.result = "Cannot calculate. MSP was invalid."
//        } else {
//            double result = (calculatorModel.getEn() + calculatorModel.getMsp()) / 2
//            calculatorModel.result = result
//        }
//        render view: 'CalculatorOutput', model: [calcModel: calculatorModel]


}
    class CalculatorModel {
        double en
        double msp
        String result = ''

        static constraints = {
            en min: 1d, max: 6d, scale: 1
            msp min: 1d, max: 6d, scale: 1
            result nullable: null
        }
    }
