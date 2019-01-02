def pisiano_period(m):
    a=0
    b=1
    for i in range(0,m*m):
        c=(a+b)%m
        a=b
        b=c
        if a==0 and b==1:
            return i+1

def Huge_Fib(n,m):
    remain=n%pisiano_period(m)
    a=0
    b=1
    c=remain
    for i in range(1,remain):
        c=(a+b)%m # or use just a+b
        a=b
        b=c
    print(c%m)

n,m = map(int, input().split())
Huge_Fib(n,m)
