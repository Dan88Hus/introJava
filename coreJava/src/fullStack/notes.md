- inheritance = is a relationship in between with parent and child

	some common properties if exist of classes then we can make it an class and then inheritance from them
	common properties will be VEHICLE and then BIKE,CAR,TRUCK will inherit VEHICLE class
	VEHICLE class contains common properties
	like  Bike extends Vehicle

- class ta propertileri private yapinca constructor a igtiyacimiz olacak

- UML de is a relationship direct line with solid arrow , class A is parent, Class B is the child class
 A__>B , parent class __>child class
 
 - multiple inheritance is not allowed in Java
 
 - interface de method un icini doldurmuyoruz, her implements yapan class methodu override yapmak zorunda
 	relationship "can" relationship, person can sing song, person can speak (bu dikey olarak anlamlandirdigimizda)
 	(yatay olarak = public abstract class Person implements isAlive(interface), liveLife(inteface) interfaceleri implements yaptigimizda ise
 	Person should be alive, should be liveLife diye anlamlandiriyoruz)
 	implement ettigimizde class a attribute ekliyoruz fonksiyonel olarak
 	abstract class lar ise kesinlikle method yazilmali implement edilen class a
 
 	public interface Phone{}---- interface class --- methodlarin icine birsey yazilmiyor
 	public xClass implements Phone{}----- interface methodlarini override yapmak zorunda
 	
 - abstract ta methodun icine birseyler yazabiliniyor. relationship " is a" relationship
 
 - 


