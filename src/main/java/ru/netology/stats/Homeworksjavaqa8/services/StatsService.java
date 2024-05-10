package ru.netology.stats.Homeworksjavaqa8.services;

public class StatsService {

    public int calculate(long[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += (int) sales[i];
        }
        return sumSales;
    }


    public double averageSumSales(long[] sales) {
        double averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSum += (double) sales[i] / sales.length;
        }
        return averageSum;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
}

  //  public double minAverageSumSales(long[] sales) {
    //    double averageSum = averageSumSales(sales);
      //  int SumminSalesMonth = 0;

        //for (int i = 0; i < sales.length; i++) {
          //  if (sales[i] < sales[(int) averageSum]) {
            //    SumminSalesMonth = i;
       //     }

     //   }

       // return SumminSalesMonth;
  //  }


 //   public int maxAverageSumSales(long[] sales) {
  //      double averageSum = averageSumSales(sales);
 //       int maxSalesMonth = 0;
 //       for (int i = 0; i < sales.length; i++) {
  //          if (sales[i] > sales[(int) averageSum]) {
 //               maxSalesMonth += i;

  //          }
 //       }
   //             return maxSalesMonth;
  //          }

  //  }