package TeacherExample;

/*import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import jakarta.transaction.Transactional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

	//List<Teacher> getbyemail(String email);

    @Query("select t from Teacher t")
	List<Teacher> getdetails();
    @Transactional
    @Modifying
    @Query("update Teacher t set t.email=:email where t.name=:name")
	int updatedetails(String name, String email);
    @Transactional
    @Modifying
    @Query("delete from Teacher t where t.name=:name")
	int deletedetails(String name);

}*/

