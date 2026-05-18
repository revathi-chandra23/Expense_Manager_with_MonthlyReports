package org.java.expenseManager.service;

import org.java.expenseManager.model.Expense;

import java.time.YearMonth;
import java.util.List;

public interface IReportService {
    void generateMonthlyReport(List<Expense> expenses, YearMonth month);
}
