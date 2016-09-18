package ashwin.CRUDS;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;

import ashwin.todo.Todo;

public class TodoOperations {

	
	
	public void addTodoItem(String item){
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		
		Todolist todolist = new Todolist();
		
		
		Query q = session.createSQLQuery("INSERT INTO todolist(todoitem) VALUES('"+item+"');");
		q.executeUpdate();
		
		Transaction tr = session.beginTransaction();
		tr.commit();
		session.close();
		SF.close();
	}
	
	public void deleteTodoItem(String item){
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		
		Query q = session.createSQLQuery("DELETE FROM todolist WHERE todoitem='"+item+"';");
		q.executeUpdate();
		
		Transaction tr = session.beginTransaction();
		tr.commit();
		session.close();
		SF.close();
	}
	
	public List getTodoItem(){
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		
		List itemlist = session.createSQLQuery("select todoitem from todolist").list();
		
		return itemlist;
	}

}
