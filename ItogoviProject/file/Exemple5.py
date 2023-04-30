class Exemple5():

    def __init__(self, x):
        self.x = x


    def getX(self):
        return self.x

    def setX(self, x):
        self.x = x

ob = Exemple5(20)
print(ob.getX())
ob.setX(5)
print(ob.getX())