Additional Features Implemented:
In-memory Data Storage: Uses a List<Candidate> in the VoteService to store candidate data, simplifying the design and avoiding the need for external databases.

Error Handling: If an invalid candidate name is provided, a custom exception (IllegalArgumentException) is thrown, allowing the system to handle errors gracefully.

Winner Determination: The getWinner method identifies the candidate with the highest votes. If no candidates exist, an appropriate message is returned.

Testing: Includes comprehensive unit tests in VoteServiceTest for all major functionalities:

Adding a candidate.
Casting votes and counting votes.
Retrieving all candidates.
Determining the winner based on vote count.
