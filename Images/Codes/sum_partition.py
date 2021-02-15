def solver(arr,l,t,s=[]):
	if sum(s)==t:
		return True
	if l == len(arr):
		return False
	s.append(arr[l])
	if solver(arr,l+1,t):
		return True
	s.pop(-1)
	if solver(arr,l+1,t):
		return True
	return False

print(solver([1,3],0,))
