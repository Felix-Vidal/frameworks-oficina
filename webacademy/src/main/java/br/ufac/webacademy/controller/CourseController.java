package br.ufac.webacademy.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufac.webacademy.models.Course;
import br.ufac.webacademy.service.CourseService;


@RestController
@RequestMapping("/course")
public class CourseController implements IController<Course>{
    
    private CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }
    


    @Override
    public ResponseEntity<List<Course>> get() {
        List<Course> registro = service.get();
        return ResponseEntity.ok(registro);

    }

    @Override
    public ResponseEntity<Course> get(Long id) {
        Course registro = service.get(id);
        return ResponseEntity.ok(registro);
    }

    @Override
    public ResponseEntity<Course> insert(Course objeto) {
        Course registro = service.save(objeto);
        return ResponseEntity.ok(registro);
    }

    @Override
    public ResponseEntity<Course> update(Course objeto) {
        Course registro = service.save(objeto);
        return ResponseEntity.ok(registro);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
    
}
