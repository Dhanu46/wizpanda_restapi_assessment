package wizpanda_restapi_assessment

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        "/college/students"(controller: "student", action: "index", method:"GET")
        "/college/students/$id"(controller: "student", action: "show", method:"GET")

        "/college/students"(controller: "student", action: "save", method:"POST")
        "/college/students/$id"(controller: "student", action: "update", method:"PUT")

        "/college/students/$id"(controller: "student", action: "delete", method:"DELETE")


        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
