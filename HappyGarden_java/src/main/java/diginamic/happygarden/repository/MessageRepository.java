package diginamic.happygarden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import diginamic.happygarden.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{

}
