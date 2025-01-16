#include <iostream>
using namespace std;

template <class T>
T Addition(T Arr[], int iSize)
{
    T iSum = 0; // Initialize sum to the type of T
    for (int i = 0; i < iSize; i++)
    {
        iSum = iSum + Arr[i];
    }
    return iSum;
}

int main()
{
    double Brr[] = {10.82, 20.23, 30.333, 40.4333};
    double dRet = 0.0;

    dRet = Addition(Brr,4);
    cout<<"Addition is:"<<dRet<<"\n";

    return 0;
}

