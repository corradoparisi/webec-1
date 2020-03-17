package webec

class ListProjectsController {


    def index() {
        redirect(actionUri: current())
    }


    def current() {
        def projectName = "Project Tracker"
        def dueDate = "17.03.2020"
        [project:projectName, date:dueDate] //this is going to be sent to the view
    }

    def overdue() {
        render "Order Valentines Day Package"
    }
}
