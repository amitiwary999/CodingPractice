import queue

def op(A):
    res = []
    q_odd = queue.Queue()
    q_even = queue.Queue()
    
    i = 0
    for elem in A:
        if i%2 == 0 and not q_even.empty():
            res.append(q_even.get())
            q_even.put(elem) if elem%2 == 0 else q_odd.put(elem)
            i += 1
        elif i%2 == 1 and not q_odd.empty():
            res.append(q_odd.get())
            q_even.put(elem) if elem%2 == 0 else q_odd.put(elem)
            i += 1
        elif i%2 == elem%2:
            res.append(elem)
            i += 1
        else:
            q_even.put(elem) if elem%2 == 0 else q_odd.put(elem)
    
    while not q_odd.empty() and not q_even.empty():
        if i%2 == 0:
            res.append(q_even.get())
        else:
            res.append(q_odd.get())
        i += 1
        
    while not q_odd.empty():
        res.append(q_odd.get())
    while not q_even.empty():
        res.append(q_even.get())
        
    print(' '.join(map(lambda x: str(x), res)))

if __name__ == '__main__':
    T = int(input().strip())
    
    for _ in range(T):
        N = int(input().strip())
        A = list(map(lambda x: int(x), input().strip().split(' ')))
        
        op(A)
