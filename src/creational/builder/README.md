Builder is a creational design pattern that allows you to create complex objects
part by part by deconstructing each part into it's own method for a builder
class. The director then does the main part of building the specified object,
this allows additional builders without modifying how the object is built. \

In this example, the Phone has two types of builders, GalaxyS10Builder and
IPhoneXBuilder. These builders specify the specific aspects of the phone
such as RAM, CPU and battery life. The PhoneDirector then brings everything
together.