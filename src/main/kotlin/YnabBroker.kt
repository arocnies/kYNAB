import budget.YnabBudget
import budget.YnabTransaction
import budget.category.YnabBudgetCategory
import budget.category.YnabCategoryHistory

interface YnabBroker {
    fun getBudgetsPartiallyLoaded() : MutableList<YnabBudget>
    fun getBudgetById( ynabId: String ): YnabBudget
    fun budgetRequestRefresh(budget: YnabBudget ): Boolean
    fun getRefreshedBudget(staleBudget: YnabBudget ): YnabBudget
    fun getBudgetByName( name: String ): YnabBudget
    fun getOverBudgetCategories(budgetYnabId: String, month: String): List<YnabBudgetCategory>
    fun getCategoryHistory( budgetYnabId: String, categoryYnabId: String): YnabCategoryHistory
    fun getTransaction(  budgetYnabId: String, transactionYnabId : String ) : YnabTransaction
    fun getTransactions( budgetYnabId : String ) : List<YnabTransaction>
    fun getTransactionsByMemo( budgetYnabId: String, memoText: String): List<YnabTransaction>
}