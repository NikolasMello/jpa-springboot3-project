package com.nikolasmello.projetosb.repositories;

import com.nikolasmello.projetosb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//Quando a interface já está herdando um componente registrado do spring como o caso abaixo
//não é necessário usar a annotation @Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
