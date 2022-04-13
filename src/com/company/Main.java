package com.company;

public class Main {

    public static void main(String[] args) {

        double investment = 100; // 투자금
        double yearInvestment = 0;  // 1200
        double nextYearInvestment = 0;
        double InvestmentAll = 0;
        double yearDividend = 0;
        double nextYearDividend = 0;
        double dividendAll = 0;
        // 3의 배수 일때는 1씩 + 하고 3의 배스가 아닌때는 100씩만+
        // 3월 300 == 3  603 == 6+3.3  909.3 == 9.093  1218.4 == 12.18
        for (int i = 1; i < 13; i++) {
            if (i % 3 == 0) {
                yearInvestment += investment;
                yearDividend = (0.01 * yearInvestment);
                yearInvestment += yearDividend;
            }
            if (i % 3 != 0) {
                yearInvestment += investment;
            }
            System.out.println(i + "투자금 :" + yearInvestment);
            System.out.println(i + "배당금 :" + yearDividend);
            System.out.println("------------");
        }
        for (int k = 1; k < 13; k++) {
            if (k % 3 == 0) {
                nextYearInvestment += investment;
                yearDividend = (0.011 * yearInvestment);
                nextYearDividend = (0.01 * nextYearInvestment);
                dividendAll = yearDividend + nextYearDividend;
                nextYearInvestment += dividendAll;
                InvestmentAll = yearInvestment + nextYearInvestment;
            }
            if (k % 3 != 0) {
                yearDividend = (0.011 * yearInvestment);
                nextYearInvestment += investment;
                InvestmentAll = yearInvestment + nextYearInvestment;
            }
            System.out.println(k + ": 총투자금 :" + InvestmentAll);
            System.out.println(k + ": 배당금 :" + yearDividend );
            System.out.println(k + ": 다음해투자금 :" + nextYearInvestment);
            System.out.println(k + ": 다음해배당금 :" + nextYearDividend);
            System.out.println(k + ": 다음해배당금총합 :" + dividendAll);
            System.out.println("------------");
        }
    }

}
