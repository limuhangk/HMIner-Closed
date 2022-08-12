# HMIner-Closed
Note: This is the implementation of HMiner-Closed algorithm by reference to the pseudo code of the paper, not the implementation by the author of the paper.

This repository contains the source code for the paper "An efficient method for mining high utility closed itemsets", published in Information Sciences journal. For more information, please contact the main author.

Citation: Nguyen L T T, Vu V V, Lam M T H, et al. An efficient method for mining high utility closed itemsets[J]. Information Sciences, 2019, 495: 78-99., https://doi.org/10.1016/j.ins.2019.05.006.

Abstract: Mining closed high utility itemsets (CHUIs) involves finding a representative set of HUIs that is usually smaller than that of HUIs but can generate the full HUIs without loss of in- formation. Researchers have therefore shown interest in this problem, and many methods have been proposed for mining CHUIs effectively, of which CHUI-Miner and EFIM-Closed are the two most efficient algorithms. However, these face performance issues when min- ing CHUIs from sparse datasets. In this paper, we propose a method for the effective min- ing of CHUIs in both dense and sparse datasets. We first modify the compact utility list structure in the HMiner algorithm to reduce the mining time, and then develop back- ward and forward checking methods using the most recently explored CHUIs and combine this with candidate building for the next levels. Finally, we apply pruning strategies to re- duce the search space for the generation of CHUIs. Our experimental results show that the proposed algorithm, called HMiner-Closed, is more efficient than the state-of-the-art algorithms for both dense and sparse datasets.
