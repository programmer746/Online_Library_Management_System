package com.example.library.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.library.model.Book;
import com.example.library.HibernateUtil;

public class ItemDAO {

    public void saveItem(Book book) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
