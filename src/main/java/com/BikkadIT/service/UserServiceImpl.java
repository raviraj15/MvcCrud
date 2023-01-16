

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIT.dao.UserDaoI;
import com.BikkadIT.entity.User;

@Repository
public class UserDaoImpl implements UserDaoI {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public int saveUserToDb(User user) {
		System.out.println("Dao layer Method");
		System.out.println(user);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		  int save = (int) session.save(user);
		  session.getTransaction().commit();
		
		return save;
	}


	public List<User> getAllData() {
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from User");
		List<User> list = query.getResultList();
		
		return list;
	}


	@Override
	public List<User> getAllDataFromDB() {
		// TODO Auto-generated method stub
		return null;
	}



}
