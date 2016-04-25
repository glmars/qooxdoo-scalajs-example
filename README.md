Introduction
============

This is a small test application that demonstrates how you can easily use Qooxdoo from 
a Scala.js project. This application can also serve as a template to build your own application.


How to get started
==================

All you really need to do is implement a function with the following signature: 

    someFunctionName(app: qx.application.Standolone): Unit

and then register it:

    qx.registry.registerMainMethod(someFunctionName)

Within this function you can use all the Qooxdoo widgets you like and it is behaves 
just like a normal Qooxdoo application.

You can use the provided test application as an example to see how to 
create some simple widgets.
