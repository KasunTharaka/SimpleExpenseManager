
//

package lk.ac.mrt.cse.dbs.simpleexpensemanager.data;

import java.util.List;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.exception.InvalidAccountException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.ExpenseType;

/**
 * AccountDAO interface can be used to access the account details, including listing, adding, updating, removing
 * accounts and updating account balance.
 */
public interface AccountDAO {

    /***
     * Get a list of account numbers.
     *
     * @return - list of account numbers as String
     */
    public List<String> getAccountNumbersList();

    /***
     * Get a list of accounts.
     *
     * @return - list of Account objects.
     */
    public List<Account> getAccountsList();

    /***
     * Get the account given the account number.
     *
     * @param accountNo as String
     * @return - the corresponding Account
     * @throws InvalidAccountException - if the account number is invalid
     */
    public Account getAccount(String accountNo) throws InvalidAccountException;

    /***
     * Add an account to the accounts collection.
     *
     * @param account - the account to be added.
     */
    public void addAccount(Account account);

    /***
     * Remove an account from the accounts collection.
     *
     * @param accountNo - of the account to be removed.
     * @throws InvalidAccountException - if the account number is invalid
     */
    public void removeAccount(String accountNo) throws InvalidAccountException;

    /***
     * Update the balance of the given account. The type of the expense is specified in order to determine which
     * action to be performed.
     * <p/>
     * The implementation has the flexibility to figure out how the updating operation is committed based on the type
     * of the transaction.
     *
     * @param accountNo   - account number of the respective account
     * @param expenseType - the type of the transaction
     * @param amount      - amount involved
     * @throws InvalidAccountException - if the account number is invalid
     */
    public void updateBalance(String accountNo, ExpenseType expenseType, double amount) throws InvalidAccountException;

}
