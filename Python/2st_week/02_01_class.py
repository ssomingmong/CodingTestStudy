
class Person:
    def __init__(self, name_param):
        self.name = name_param
        print("hi", self, self.name)
    

    def talk(self):
        print("안녕하세요 저는 ", self.name, "입니다.")

person1 = Person("김민철")
person1.talk()

person2 = Person("김소현")
person2.talk()
