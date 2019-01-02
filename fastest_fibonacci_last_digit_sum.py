#60 because as we know from  Pisano Period of 10
n = int(input())
n=n%60
l=[None]*(n+1)
if n==0:
    l[0]==0
else:
    l[0]=0
    l[1]=1
for i in range(2,n+1):
    l[i]=(l[i-1]%10+l[i-2]%10)%10
print(sum(l)%10)

