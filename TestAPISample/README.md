Tech Stack Used:
  Maven , H2 data base,Spring Boot , Spring  DATA and JPA ,Java8

Import the project as a simple maven project and run the application as spring boot application

End point details :
  Swagger link : http://localhost:8080/swagger-ui.html#/ 
  You can find all the end points details here and use the request as below for each end point
  
  Add Employee 
      Request: { "id": 1, "firstName": "Test1", "lastName": "lastName1" }

  Edit Employee 
        Request: { "id": 1, "firstName": "Test1", "lastName": "lastName1"}

  Delete Employee (id) 
    Request : { "id": 1, "firstName": "Test1", "lastName": "lastName1"}
    Response: { "deleted": true }

  List of All Employees 
    response: [{"id":1,"firstName":"Test1","lastName":"lastName1","emailId":"emailId1"},{"id":2,"firstName":"Test1","lastName":"lastName1","emailId":"emailId1"}]
  
  Get count of Employee present
    Response : The count is : 1
