l=[int(x) for x in input().split()]
max_so_far=l[0]
current_max=l[0]
for i in range(1,len(l)):
    current_max=max(l[i],current_max+l[i])
    max_so_far=max(max_so_far,current_max)
print(max_so_far)
