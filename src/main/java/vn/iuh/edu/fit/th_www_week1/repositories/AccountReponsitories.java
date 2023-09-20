package vn.iuh.edu.fit.th_www_week1.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import vn.iuh.edu.fit.th_www_week1.enums.AccountStatus;
import vn.iuh.edu.fit.th_www_week1.models.Account;

import java.util.List;

public class AccountReponsitories {
    private EntityManager em;

    private EntityTransaction et;

    public AccountReponsitories() {
        em = Persistence.createEntityManagerFactory("ThWeek1").createEntityManager();
        et = em.getTransaction();

    }

    public void createAccount(Account account) {
        try {
            et.begin();
            em.persist(account);
            et.commit();
        } catch (Exception e) {
            et.rollback();
            e.printStackTrace();
        }
    }

    public void updateAccount(Account account) {
        try {
            et.begin();
            em.merge(account);
            et.commit();
        } catch (Exception e) {
            et.rollback();
            e.printStackTrace();
        }
    }

    public void setStatusAccount(Account account, AccountStatus accountStatus) {
        account.setStatus(accountStatus);
    }

    public Account getAccountById(long id) {
        return em.find(Account.class, id);
    }
    public List<Account> getAllAccounts() {
        return em.createNativeQuery("SELECT * FROM account", Account.class).getResultList();
    }

}
