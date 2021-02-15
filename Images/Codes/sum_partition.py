n = int(input())
def div(n):
    rs = (n*(n+1))//4
    group1 = []
    group2 = []
    for i in range(n,0,-1):
        if  rs - i >= 0:
            group1.append(i)
            rs-=i
        else:
            group2.append(i)
    return (group1,group2)
for i in range(n):
    A =div(i)
    print(i,"\n",sum(A[0]),A[0],sum(A[1]),A[1])
#if rem is 0,3 ans 0 else 1
