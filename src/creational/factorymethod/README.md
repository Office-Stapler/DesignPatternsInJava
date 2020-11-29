Factory Method is a creational design pattern that lets subclasses of a creator
superclasss to dictate what type of object it creates. \

In this example, the BirdHome is an abstract class which has a create method 
which both the PenguinHome and PigeonNest extends in order to decide what
type of bird it produces.