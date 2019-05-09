num=input("请输入一个数字：")
if int(num)<10:
    print(num)
else:
    print("数字太大")

    #测试三元
print("num是小于十的数"if int (num)<10 else"num是大于10的数")