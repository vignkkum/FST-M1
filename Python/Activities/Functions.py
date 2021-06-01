def my_function():
  print("Hello from a function")
  
my_function() # Output: Hello from a function

def my_function(name):
  print("Hello " + name)
  
my_function("Abhiram") # Output: Hello Abhiram

def my_function(*pets):
  print("The youngest pet is " + pets[0])

my_function("Timmy", "Chippy") 