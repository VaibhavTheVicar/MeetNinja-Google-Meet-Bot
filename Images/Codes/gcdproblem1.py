
def gcdprob():
    t = int(input())
    for _ in range(t):
        l = int(input())
        ar= list(map(int,input().split()))
        x = ar.copy()
        x.sort()
        Ans = True
        for i in range(l):
            if x[i] != ar[i] and ar[i]%x[0]!=0:
                Ans = False
                break
        print(Ans)

gcdprob()
