package utilityapp

class BootStrap {

    def init = { servletContext ->



        new Vehicle(name: 'Pickup',  make: 'Nissan', model: 'Titan', year: 2012).save()


    }
    def destroy = {
    }
}
