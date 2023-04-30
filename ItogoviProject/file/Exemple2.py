
class Exemple2():
    def __init__(self, x, y, z = 0):
        self.x = x
        self.y = y
        self.z = z
        self.param = 42
        #self.coord = (x,y,z)

    #def __init__(self, x, y):
    #    self.coord2 = (x,y)



obj2 = Exemple2(2,3,2)
obj3 = Exemple2(2,3)
print(obj2.x, obj2.y, obj2.z)
print(obj3.x)
print(obj3.param)