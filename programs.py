a=int(input("enter a number :"))
flag=False

if a==1:
    print("neigther prime nor composite")
else:
    for i in range(2,a):
        if a%i==0:
            print("prime")
            flag=True
            break
if flag:
    print("not a prime")
else:
    print(" prime")
