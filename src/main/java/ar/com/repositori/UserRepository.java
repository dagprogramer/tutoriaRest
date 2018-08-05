package ar.com.repositori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.modelo.User;
/**
 * Creamos una interfaz que extiende de JpaRepositori; dicha clase recibe como parametros
 * una clase y el id (con su tipo de dato)
 * @author micha
 *
 */

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
	


