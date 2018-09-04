package utilityapp

class HomeController {

    def index() {
        respond([name: session.name ?: 'User', vehicleList: Vehicle.list(), vehicleTotal: Vehicle.count()])
    }

    def updateName(String name) {
        session.name = name

        flash.message = 'Name has been updated'

        redirect action: 'index'
    }

    def upload() {
        println request.dump()
        def f = request.getFile('filename')
        println f
        if (f?.empty) {
            flash.message = 'file cannot be empty'
            render(view: 'uploadForm')
            return
        }
        f.transferTo(new File('c:\\shared\\file_name.txt'))
        response.sendError(200, 'Done')
    }
}
