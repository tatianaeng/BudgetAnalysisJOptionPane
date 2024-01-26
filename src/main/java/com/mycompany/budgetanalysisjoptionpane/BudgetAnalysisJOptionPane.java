/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.budgetanalysisjoptionpane;
import javax.swing.JOptionPane;

/**
 *
 * @author tatianaeng
 */
public class BudgetAnalysisJOptionPane
{

    public static void main(String[] args)
    {
        // variables
        String stringMonthlyBudget;
        double monthlyBudget;
        String expenseToRecord;
        String stringExpenseAmount;
        double expenseAmount;
        double totalExpenses = 0;
        double amountOverBudget;
        double amountUnderBudget;
        
        // ask user what their monthly budget is
        stringMonthlyBudget = JOptionPane.showInputDialog("Hi, Tatiana Eng! Enter your budget for the month. (Just the numeric value; no $ or commas.)");
        
        // convert monthly budget to a double
        monthlyBudget = Double.parseDouble(stringMonthlyBudget);
        
        // ask user if they have an expense to record for the month
        expenseToRecord = JOptionPane.showInputDialog("Do you have an expense to record? Type 'yes' or 'no.'");
        
        // while loop to record additional expenses
        while (expenseToRecord.equals("yes"))
        {
            // ask user for the expense amount
            stringExpenseAmount = JOptionPane.showInputDialog("Enter the expense amount. (Just the numeric value; no $ or commas.)");
            
            // read user input aka convert to a double
            expenseAmount = Double.parseDouble(stringExpenseAmount);
            
            // ask if user has another expense
            expenseToRecord = JOptionPane.showInputDialog("Do you have another expense to record? Type 'yes' or 'no.'");
            
            // keep running total
            totalExpenses = totalExpenses + expenseAmount;
            
        }
            
        // calculate and display the amount that the user is over or under budget
        if (totalExpenses > monthlyBudget)
        {
            amountOverBudget = totalExpenses - monthlyBudget;
            JOptionPane.showMessageDialog(null, String.format("You are over budget by $%,.2f. Better luck next month.", amountOverBudget));
        }
        else if (monthlyBudget > totalExpenses)
        {
            amountUnderBudget = monthlyBudget - totalExpenses;
            JOptionPane.showMessageDialog(null, String.format("You are under budget by $%,.2f. Nice job!", amountUnderBudget));
        }
        
        // exit the program
        System.exit(0);
    }
}
