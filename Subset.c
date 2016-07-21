#include <stdio.h>
#include <string.h>
 
char a[20];
int n, len, j;
 
void main()
{
    int i, index = 0, start = 0;
 
    printf("Enter the string\n");
    scanf("%s", a);
    n = strlen(a);
    printf("enter input length\n");
    scanf("%d", &len);
    printf("The subsets are\n");
    for (i  =  1;i < = n;i++)
    {
        if (index - start + 1  ==   i)
        {
            if (i  ==   len)
            {
                for (j  =  index;j < n;j++)
                {
                    for (i  =  start;i < index;i++)
                        printf("%c", a[i]);
                    printf("%c\n", a[j]);
                }
                if (start != i)
                {
                    start++;
                    index = start;
                }
            }
            else
            {
                index++;
            }
        }
    }
}
