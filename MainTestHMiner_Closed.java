package ca.pfv.spmf.test;

import ca.pfv.spmf.algorithms.frequentpatterns.AlgoFCHM_Stream.AlgoFCHM_Stream;
import ca.pfv.spmf.algorithms.frequentpatterns.HMiner_CLosed.AlgoHMiner_Closed;

import java.io.UnsupportedEncodingException;
import java.net.URL;

/* This file is copyright (c) 2018+  by Siddharth Dawar et al.
 *
 * This file is part of the SPMF DATA MINING SOFTWARE
 * (http://www.philippe-fournier-viger.com/spmf).
 *
 * SPMF is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * SPMF is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with
 * SPMF. If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Example of how to run the HMiner algorithm from the source code of SPMF
 */
public class MainTestHMiner_Closed {

    public static void main(String[] args) {
        try {

            String input = fileToPath("dataset/BMS.txt");
            String output = ".//output.txt";
//      int [] minutil_Array= {500000,1000000,2000000,3000000,4000000,5000000};//Chainstore
//		int [] minutil_Array= {10000000,12000000,14000000,16000000,18000000,20000000};//Connect
//		int [] minutil_Array= {5000,10000,20000,30000,40000,50000};//Retail
// 		int [] minutil_Array= {10000,20000,30000,40000,50000,60000};//Mushroom
//      int[] minutil_Array = {1000, 1500, 2000, 2500, 3000, 3500};//Foodmart
//		int [] minutil_Array= {22500000,25000000,27500000,28000000,28500000,29000000};//accidents
//		int [] minutil_Array= {2240000,2250000,2260000,2270000,2280000,2290000};//BMS
//		int [] minutil_Array= {350000,400000,450000,500000,550000,600000};//chess
//      int[] minutil_Array = {1200000, 1500000, 1800000, 2100000, 2400000, 2700000};//kosarak
//		int [] minutil_Array= {12000000,12100000,12200000,12300000,12400000,12500000};//pumsb
            long min_utility = 2240000; //
//            for (int minutil_t : minutil_Array) {
//                AlgoHMiner_Closed algorithm = new AlgoHMiner_Closed();
//                boolean applyTransactionMergingOptimization = true;
//                boolean applyEUCSOptimization = true;
//                algorithm.runAlgorithm(input, output, minutil_t,
//                        applyTransactionMergingOptimization, applyEUCSOptimization);
//                System.out.println("Minutil :" + minutil_t);
//                System.out.println("Dataset :" + input);
//                algorithm.printStats();
//                algorithm.writeCHUIsToFile(output);
//            }
            AlgoHMiner_Closed algorithm = new AlgoHMiner_Closed();

            boolean applyTransactionMergingOptimization = true;
            boolean applyEUCSOptimization = true;

            algorithm.runAlgorithm(input, output, min_utility,
                    applyTransactionMergingOptimization, applyEUCSOptimization);
            algorithm.printStats();
            //WRITE ALL THE CHUIs found until now to a file
            algorithm.writeCHUIsToFile(output);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String fileToPath(String filename)
            throws UnsupportedEncodingException {
        URL url = MainTestHMiner_Closed.class.getResource(filename);
        return java.net.URLDecoder.decode(url.getPath(), "UTF-8");
    }
}
