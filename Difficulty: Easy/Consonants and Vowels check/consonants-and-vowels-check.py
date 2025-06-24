def checkString(s):
    # write your code here
    
    arr1=['a','e','i','o','u']
    count=0
    count1=0
    
    for i in s:
        if i.isalpha():
            if i in arr1:
                count+=1
            else:
                count1+=1

    if count>count1:
        print('Yes')
    elif count<count1:
        print('No')
    else:
        print('Same')
    
    