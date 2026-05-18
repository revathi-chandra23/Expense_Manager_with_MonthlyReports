package org.java.expenseManager;

import org.java.expenseManager.model.Expense;
import org.java.expenseManager.service.ExpenseService;
import org.java.expenseManager.service.IExpenseService;
import org.java.expenseManager.service.IReportService;
import org.java.expenseManager.service.ReportService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.YearMonth;
import java.util.List;
import java.util.Properties;

public class ExpenseManagerApp {

    private final IExpenseService expenseService;
    private final IReportService reportService;
    private static Properties prop=new Properties();

    public ExpenseManagerApp(IExpenseService expenseService, IReportService reportService) {
        this.expenseService = expenseService;
        this.reportService = reportService;
    }

    public void run() {
        try {

            String path = prop.getProperty("input.path");

        //    System.out.println("Path = " + path);

            List<Expense> allExpenses = expenseService.readDirectory(path);

          //  System.out.println(allExpenses);

            YearMonth selectedMonth = YearMonth.of(2025, 7);

            reportService.generateMonthlyReport(allExpenses, selectedMonth);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        prop = readProperties(args[0]);

        IExpenseService expenseService = new ExpenseService();
        IReportService reportService = new ReportService();

        ExpenseManagerApp app = new ExpenseManagerApp(expenseService, reportService);
        app.run();
    }

    private static Properties readProperties(String arg)  {
        Properties props = new Properties();
        try (FileInputStream fils = new FileInputStream(arg)
        ) {
            props.load(fils);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return props;
    }
}