# Data-Structures-and-Algorithms-Arrays
Arrays - it stores a list of data of a specific type or class.

We can refine the array to be a better data structure by making it a generic array -  then it is a list of objects from any class.

How can the functionality of the array list class be further improved? Functionality can be improved by adding additional methods for common operations on a array list needed by your application.

Can you think of any? I can, see my list below.

getMax() return the largest value found in the array list. (uses compareTo)

getMin() return the smallest value in the array list. (uses compareTo)

equals(..) receives an array list a parameter and compare every object in the calling list with every object in the parameter list to determine equality. (can use equals or compareTo)

getUnique() return a list without duplicates example (1,2,1,3,5,4,2,1) return (1,2,3,4,5)  (can use equals or compareTo)


getFiltered(..) this method receives a parameter and will return values larger (if needed smaller) than the parameter. example (1,2,5,4,6,3,7,9)  parameter (4) return (5,6,7,9). (uses compareTo)

In this scenario, I am using consoles for data input. I will be comparing PlayStation with Xboxes. The arrays will be populated with console data and this data will be used to test opeartions.
