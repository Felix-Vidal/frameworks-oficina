package br.ufac.login.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface IController<T,R> {
    public ResponseEntity<List<R>> get();
    public ResponseEntity<R> get(Long id);
    public ResponseEntity<R> insert(T objeto);
    public ResponseEntity<R> update(T objeto);
    public ResponseEntity<R> delete(Long id);
}
