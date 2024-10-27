Architecture and Design Documentation 
The project consists of a simple voting system implemented with a Spring Boot backend, exposing RESTful APIs to manage and cast votes for candidates. 
The architecture is organized into a three-layer structure:

Model Layer: Contains the Candidate class, representing a candidate with a name and vote count.
Service Layer: Contains the VoteService class, implementing business logic to add candidates, cast votes, retrieve vote counts, list candidates, and determine the winner.
Controller Layer: Contains the VoteController class, which maps HTTP requests to corresponding service methods.

Flow of Requests:
The controller receives HTTP requests via defined endpoints.
The controller calls the service layer (VoteService) to process the request.
The service layer interacts with the model (in this case, a list of Candidate objects stored in memory) to perform operations and return results to the controller.
The controller sends responses back to the client.
This setup provides a simple, RESTful design, with endpoints to add candidates, cast votes, retrieve vote counts, and determine the winner.
