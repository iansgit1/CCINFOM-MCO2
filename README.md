## Read Me
Hi guys! We can use this repo to collaboratively work on MCO2 DB App.
I'm currently making the wireframes for the other transactions' wireframes.


## Folder Structure
Follows MVC structure, where:

- `src`: the folder to maintain sources
  - `model`
    - Person.java
      - Resident.java
      - Employee.java
    - Equipment.java
    - Shelter.java
  - `view`
    - MainFrame.java : where all panels are called
    - LoginFrame.jave : where users (employees) can log in
    - TransactionsMenu.java : where users can choose from the transaction options
    - AssignToSheleter.java : where resident can be assigned to an available shelter
    - BorrowEquipment.java : where users can borrow equipment
    - ReturnEquipment.jave : where users can return equipment
  - `controller`
- `lib`: the folder to maintain dependencies
- `bin`: the folder to compiled output files

  
## Notes
- I haven't made the changes based on ms' comments :)
- I think transactions are still subject to change
- Don't forget to error check (input validation)


## To Do
- Model (double check tho)
  - [x] employee (can have parent: person)
  - [x] resident (can have parent: person)
  - [x] shelter
  - [x] equipment
  - [ ] response
  - [ ] disaster
- View
  - [x] login (optional)
  - [x] transactions menu
  - [ ] transaction 1:
  - [x] transaction 2: assignt to shelter
  - [x] transaction 3: release from shelter
  - [x] transaction 4: borrow equipment
  - [x] transaction 5: return equipment
  - [ ] reports
    - [ ] response report
    - [ ] shelter occupancy report
    - [ ] equipment report
  - [ ] success message
  - [ ] fail message
- Controller


## Logs
- Nov 10 (8PM) : finished BorrowEquipment UI
- Nov 10 (8:20PM) : finished ReturnEquipment UI
- Nov 11 (3PM) : finished AssignToShelter UI
- Nov 12 (3:30PM) : finished ReleaseFromShelter UI


## Useful Stuff
- Project Wireframe
  - https://www.figma.com/design/6sUrWmSbpCk0XMCQJZKLRi/-INFOM--MCO2-wireframe---prototype?node-id=0-1&t=4y4khbw5qCWpUoUR-1
- Java Layouts
  - https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
- LSCS Java + SQL tutorial materials
  - https://drive.google.com/file/d/1BuI93fJYXsNNm50uqeoPv6Oef86wi4LL/view?usp=sharing
  - https://github.com/Pierre120/Java_Meets_SQL.git
  
