package org.java.expenseManager.service;

import org.java.expenseManager.model.Expense;

import java.util.List;

public interface IExpenseService {
    List<Expense> readDirectory(String property);
    List<Expense> readFile(String path);

}
