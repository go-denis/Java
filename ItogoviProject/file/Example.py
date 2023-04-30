
class Exemple(object):
    a = 10;
    b = "Hello!";

    def method1(self, x):
        return 2 * x

obj = Exemple()

print(obj.method1(500))

print(obj.a)
print(Exemple.b)
