def euclediangcd(a,b):
    if b==0:
        return a
    else:
        ax=a%b
        return euclediangcd(b,ax)
a,b=[int(i) for i in input().split()]
if a>b:
    a=a
else:
    a,b=b,a
n=euclediangcd(a,b)
mul=1*n
while n!=1:
    a=a//n
    b=b//n
    n=euclediangcd(a,b)
    mul=mul*n
print(mul*a*b)
    
