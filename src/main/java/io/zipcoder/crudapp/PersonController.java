package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {

    private PersonService service;
    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }
    @GetMapping("/people")
    public ResponseEntity<Iterable<Person>> index() {

        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }
    @GetMapping("/person/{id}")
    public ResponseEntity<Person> show(@PathVariable Long id) {

        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }
    @PostMapping("/people")
    public ResponseEntity<Person> create(@RequestBody Person baker) {
        return new ResponseEntity<>(service.create(baker), HttpStatus.CREATED);
    }
    @PutMapping("/person/{id}")
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person baker) {
        return new ResponseEntity<>(service.update(id, baker), HttpStatus.OK);
    }
    @DeleteMapping("/person/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {

        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
