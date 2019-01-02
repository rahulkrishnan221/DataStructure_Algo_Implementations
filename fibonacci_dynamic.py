# Uses python3
n=int(input())
l=[None]*(n+1)
if n>=1:
    l[0]=0
    l[1]=1
elif n==0:
    l[0]=0
for i in range(2,n+1):
	l[i]=l[i-1]+l[i-2]
print(l)