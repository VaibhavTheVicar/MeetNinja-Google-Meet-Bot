
def emp(arr,st,el,idx,ans):
        if len(st) == 0 or arr[st[-1]] > el:
            st.append(idx)
            return
        if arr[st[-1]] < el:
            ans[st.pop()] = arr[idx]
            emp(arr,st,el,idx,ans)


 
def nextLargerElement(arr,n):
    ans = [-1]*n
    st = []
    for idx,el in enumerate(arr):
        if len(st) == 0:
            st.append(idx)
        else:
            if arr[st[-1]] >= el:
                st.append(idx)
            else:
                emp(arr,st,el,idx,ans)
    
    return ans


print(nextLargerElement([1,3,2,4],4))
