package webec

class DecorationTagLib {
    static defaultEncodeAs = 'raw'
    static namespace = "webec"

    def decorate = { attributes, body ->
        String decor = ''
        try {
            float grade = Float.parseFloat(attributes.grade)
            if (grade >= 4) {
                decor = ' :-)'
            } else {
                decor = ' :-('
            }
        }
        catch (NumberFormatException e) {
            // ignore
        }

        out << body()
        out << decor //  <<  =  append
    }
}
