def euclediangcd(a,b):
    if b==0:
        return a
    else:
        ax=a%b
        return euclediangcd(b,ax)
a=int(input())
b=int(input())
print(euclediangcd(a,b))
