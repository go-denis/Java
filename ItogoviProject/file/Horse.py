class Horse():
    is_horse = True

class Donkey():
    is_dopnkey = True

class Mule(Horse, Donkey):
    pass

mule = Mule()
print(mule.is_dopnkey, mule.is_horse)