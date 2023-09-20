package vn.iuh.edu.fit.th_www_week1.services;

import jakarta.inject.Inject;
import vn.iuh.edu.fit.th_www_week1.models.Account;
import vn.iuh.edu.fit.th_www_week1.repositories.AccountReponsitories;

import java.util.List;

public class AccontServices {
    @Inject
    private AccountReponsitories accountRepository;

    public AccontServices() {
        this.accountRepository = new AccountReponsitories();
    }

    public void insertAccount(Account account) {
        accountRepository.createAccount(account);
    }

    public Account findById(long id) {
        return accountRepository.getAccountById(id);
    }

    public List<Account> getAll() {
        return accountRepository.getAllAccounts();
    }

}
