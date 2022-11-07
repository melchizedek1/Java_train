package br.com.springboot.curso_jdev.repository;

import org.springframework.stereotype.Repository;

import br.com.springboot.curso_jdev.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
