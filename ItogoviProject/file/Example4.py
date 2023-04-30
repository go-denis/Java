class Exemple4():

    def __call__(self, x, y):
        return x * y

obj5 = Exemple4()
print(obj5(4,9))
print(obj5.__call__(2,9))