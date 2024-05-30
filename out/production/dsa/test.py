# Feel free to add new properties and methods to the class.
# lifo
class MinMaxStack:
    def __init__(self):
        self.stack = []
        self.minMaxStack = []
    
    def peek(self):
        if self.stack:
            return self.stack[-1]

    def pop(self):
        popped = self.stack[-1]
        if self.stack:
            self.stack.pop()
            self.minMaxStack.pop()
        return popped

    def push(self, number):
        curr_minMax = {"min": number, "max": number}
        if len(self.stack):
            last_hash_map = self.minMaxStack[-1]
            newMin = min(last_hash_map["min"], number)
            newMax = max(last_hash_map["max"], number)
            curr_minMax = {"min": newMin, "max": newMax}
            self.minMaxStack.append(curr_minMax)

        else:
            self.minMaxStack.append(curr_minMax)
        
        self.stack.append(number)
        return number
        

        self.stack.append(number)

    def getMin(self):
        if len(self.stack):
            return self.minMaxStack[-1]["min"]
        return self.stack[0]

    def getMax(self):
        if len(self.stack):
            return self.minMaxStack[-1]["max"]
        return self.stack[0]
    
stack = MinMaxStack()
stack.push(2)
stack.push(3)
stack.push(4)
print(stack.minMaxStack)
print(stack.getMin())
print(stack.getMax())
stack.pop()
print(stack.getMin())
print(stack.getMax())