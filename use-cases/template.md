Defining Use Cases for Our System
Lecture 10 goes into more detail about use cases. Here, we are going to cover the application of these ideas. We are going to use a version of Cockburn's Use Case Template. You can see a sample of Use Case 4 using this template style.

Cockburn's template contains the following sections of note:

Goal in Context - we will use our user story.
Scope - is discussed more in the lecture. Scoping is an important consideration in any work you do.
Level - what level is the use case targeted at. This is discussed further in the lecture.
Preconditions - what do we expect is true before the use case is executed.
Success Condition - what will happen on completion of the goal.
Failed Condition - what will happen on failure of the goal.
Primary Actor - the main actor of the use case.
Trigger - how is the use case started.
Main Success Scenario - what are the steps leading to success.
Extensions - what might happen at a given step to stop the use case.
Sub-variations - any other branches that a step can take?
Schedule - when does the use case need to be delivered.

### Coursework Specification
You will work on the project as a Scrum team. Details on Scrum are provided in Lecture 2, including an FAQ on how to apply Scrum in the module.

You work for an **organisation** that requires reporting on population information.
You have been tasked with designing and implementing a new system to allow easy access to this population information.
The organisation has provided you with an SQL database to work from available here.

The organisation has asked for the following reports to be generated:

1. All the countries in the world organised by largest population to smallest.
2. All the countries in a continent organised by largest population to smallest.
3. All the countries in a region organised by largest population to smallest.
4. The top N populated countries in the world where N is provided by the user.
5. The top N populated countries in a continent where N is provided by the user.
6. The top N populated countries in a region where N is provided by the user.

---

7. All the cities in the world organised by largest population to smallest.
8. All the cities in a continent organised by largest population to smallest.
9. All the cities in a region organised by largest population to smallest.
10. All the cities in a country organised by largest population to smallest.
11. All the cities in a district organised by largest population to smallest.
12. The top N populated cities in the world where N is provided by the user.
13. The top N populated cities in a continent where N is provided by the user.
14. The top N populated cities in a region where N is provided by the user.
15. The top N populated cities in a country where N is provided by the user.
16. The top N populated cities in a district where N is provided by the user.

---

17. All the capital cities in the world organised by largest population to smallest.
18. All the capital cities in a continent organised by largest population to smallest.
19. All the capital cities in a region organised by largest to smallest.
20. The top N populated capital cities in the world where N is provided by the user.
21. The top N populated capital cities in a continent where N is provided by the user.
22. The top N populated capital cities in a region where N is provided by the user.

---

23. The population of people, people living in cities, and people not living in cities in each continent.
24. The population of people, people living in cities, and people not living in cities in each region.
25. The population of people, people living in cities, and people not living in cities in each country.

---

### Other Reports:

Additionally, the following information should be accessible to the organisation:

26. The population of the world.
27. The population of a continent.
28. The population of a region.
29. The population of a country.
30. The population of a district.
31. The population of a city.

---

Finally, the organisation has asked if it is possible to provide the number of people who speak the following the following languages from greatest number to smallest, including the percentage of the world population:

32. Chinese.
33. English.
34. Hindi.
35. Spanish.
36. Arabic.