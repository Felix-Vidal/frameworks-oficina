package br.ufac.webacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufac.webacademy.models.Course;

public interface CouseRepository extends JpaRepository<Course, Long> {
    
}
