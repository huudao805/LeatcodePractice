package array_string;

public class _1672_Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int totalMoneyOfAPerson;
        for(int i = 0; i < accounts.length; i++) {
            totalMoneyOfAPerson = 0;
            for(int j = 0; j < accounts[i].length; j++){
                totalMoneyOfAPerson += accounts[i][j];
            }
            if(totalMoneyOfAPerson > maxWealth) maxWealth = totalMoneyOfAPerson;
        }
        return maxWealth;
    }

}
