
def lps(s,l,h):
        if l<0 or h>len(s)-1 or s[l]!=s[h]:
                return (l+1,h-1)
        return lps(s,l-1,h+1)



s = "forgeeksskeegfor"
lmax = 0
smax = 0


for i in range(0,len(s)):
        t = lps(s,i-1,i+1)
        if t[1]-t[0]+1>lmax:
                lmax = t[1]-t[0]+1
                smax = t[0]

   
for i in range(0,len(s)):
      t = lps(s,i-1,i)
      if t[1]-t[0]+1>lmax:
                lmax = t[1]-t[0]+1
                smax = t[0]

print(lmax,s[smax:lmax+smax])
