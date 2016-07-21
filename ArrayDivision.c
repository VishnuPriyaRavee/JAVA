#define N  5
main()
{
int arr[N] = {15,12,9,1,23};
int i;
int sum = 0;
float avg;


for (i = 0; i < N; i++)
    sum += arr[i];

avg = (float)sum / N;
sum = 0;

/
for (i = 0; i < N - 1; i++) {
    sum += arr[i];
    if (avg == (float)sum / (i+1)) {
         printf("Divided array  %d\n", i);
         return;
    }
}

printf("Invalid array\n");
return;
}
