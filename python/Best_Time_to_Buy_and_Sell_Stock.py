class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        minProfit=float('inf')
        maxProfit=0

        for price in prices:
            if(price<minProfit):
                minProfit=price
            elif(price-minProfit>maxProfit):
                maxProfit=price-minProfit
        return maxProfit