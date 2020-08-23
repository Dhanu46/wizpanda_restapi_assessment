package wizpanda_restapi_assessment


import grails.rest.*
import grails.converters.*

class StudentController extends RestfulController {
    def studentService
    static responseFormats = ['json', 'xml']
    StudentController() {
        super(Student)
    }

    @Override
    Object index(Integer max) {
        respond studentService.list(params,request)
    }

    @Override
    Object show() {
        respond studentService.single(params,request)
    }

    @Override
    Object save() {
      def student = studentService.save(params,request)
        respond student
    }

    @Override
    Object update() {
        def student = studentService.update(params,request)
        respond student
    }

    @Override
    Object delete() {
        def student = studentService.update(params,request)
        respond student
    }
}
