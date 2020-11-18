#include<stdio.h>
int main()
{
    double a,count=0,s=0;
    while(count!=2)
    {
        scanf("%lf",&a);
     if(a>=0 &&a<=10)
    {
        s=s+a;
        count=count+1;
    }
    else
    {
        printf("nota invalida\n");
    }
    }
    printf("media = %.2lf\n",s/2);

    return 0;
}
