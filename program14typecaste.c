#include<stdio.h>

float calculatepercentage(int iobtained,int itotal) 
{
    float fpercentage=0.0f;
    fpercentage = ((float)iobtained/(float)itotal)*100;

    
    return fpercentage;
}

int main()
{
    int isubject1=0;
    int isubject2=0;
    float fresult=0.0f;
    
    printf("enter the  obtained marks:\n");
    scanf("%d",&isubject1);
    printf("enter the  total marks:\n");
    scanf("%d",&isubject2);
 
    fresult=calculatepercentage(isubject1,isubject2);
  
    printf("your percentage is :%f\n",fresult);

    return 0;
}