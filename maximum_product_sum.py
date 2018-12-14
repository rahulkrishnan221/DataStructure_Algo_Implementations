l=[int(x) for x in input().split()]
posa=0
posb=0

nega=0
negb=0

for i in range(len(l)):
    if l[i]>posa :
        posb=posa
        posa=l[i]
    elif l[i]>posb:
        posb=l[i]
    if l[i]<0 and abs(l[i])>abs(nega):
        negb=nega
        nega=l[i]

    elif l[i]<0 and abs(l[i])>abs(negb):
        negb=l[i]
if nega*negb>posa*posb:
    print(nega*negb)
else:
    print(posa*posb)
