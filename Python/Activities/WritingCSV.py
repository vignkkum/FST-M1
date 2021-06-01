# import pandas
import pandas

# Structure our data as a dictionary
data = {
  "Vehicle Type": ["Car", "Car", "Bike", "Truck"],
  "Manufacturer": ["Maruti", "Toyota", "Royal Enfield", "Bharat Benz"],
  "Model": ["Swift", "Corolla", "Thunderbird", "IndianModel"]
}

# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)

# Write the data to a csv file
dataframe.to_csv("vehicles.csv")