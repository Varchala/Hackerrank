#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <map>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int q,i,x,y;
    string n;
    map<string,int> m;
    cin>>q;
    while(q)
    {
        cin>>y>>n;
        switch(y)
        {
            case 1:
                cin>>x;
                if(m.find(n)!=m.end())
                    m[n]=m[n]+x;
                else
                m.insert(make_pair(n,x));
                break;
            case 2:
                m.erase(n);
                break;
            case 3:
                map<string,int>::iterator i=m.find(n);
                if(m.end()!=i)
                    cout<<m[n]<<endl;
                else
                    cout<<"0"<<endl;
                break;
                
        }
        q--;
    }
    return 0;
}

