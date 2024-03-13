class Solution {
public:
    int maxProfit(vector<int>& prices) 
    {
        if(prices.size()==0)
        return 0;
        int curr=0;
        int mini=prices[0];
        int profit=0,maxi=0;
        for(auto i : prices)
        {
            mini=min(mini,i);
            profit=i-mini;
            maxi=max(maxi,profit);
        }
        return maxi;
    }
};