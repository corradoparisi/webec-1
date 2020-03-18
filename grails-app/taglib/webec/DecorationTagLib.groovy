package webec

class DecorationTagLib {
    static defaultEncodeAs = 'raw'
    static namespace = "webec"

    def decorate = { attributes, body ->
        int grade = Float.parseFloat(attributes.grade)
        String decor = ''
        if(grade >= 4) {
            decor = ' :-)'
        }
        else {
            decor = ' :-('
        }

        out << body()
        out << decor //  <<  =  append
    }
}
