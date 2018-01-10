import random
count = int(input())
for index in range(count):
    expression1 = input()
    expression2 = input()
    value1 = list(set(expression1))
    value1 = [i for i in value1 if i!= '-' and i!='+' and i!='(' and i!=')']
    value2 = list(set(expression2))
    value2 = [i for i in value2 if i!= '-' and i!='+' and i!='(' and i!=')']
    variables = list(set(value1).union(set(value2)))
    values = random.sample(range(1,1000), len(variables))
    for i in range(len(variables)):
        expression1 = str.replace(expression1, variables[i], str(values[i]))
        expression2 = str.replace(expression2, variables[i], str(values[i]))

    if(eval(expression1) == eval(expression2)):
        print("True")
    else:
        print("No")
