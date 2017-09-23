#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    /* Enter your codev here. Read input from STDIN. Print output to STDOUT */   
    vector<int> v;
    int n,c;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>c;
        v.push_back(c);
    }  
    cin>>c;
    v.erase(v.begin()+(c-1));
    cin>>c>>n;
    v.erase(v.begin()+(c-1),v.begin()+(n-1));
    cout<<v.size()<<endl;
    for(int i=0;i<v.size();i++)
    {
        cout<<v[i]<<" ";
    }
    return 0;
}
