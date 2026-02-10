class Car:
    def __init__(self,manufacture,model,make,transmission,color):
        self.manufacture=manufacture
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    def accelerate(self):
        print(f"{self.manufacture} {self.model} is moving")
    def stop(self):
        print(f"{self.manufacture} {self.model} has stopped")
c=Car('tata','sierra','x','manual','red')
d=Car('hyundai','creata','y','automatic','black')
e=Car('kia','seltos','z','manual','blue')
c.accelerate()
c.stop()
d.accelerate()
d.stop()
e.accelerate()
e.stop()