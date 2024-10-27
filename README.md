Project Title: VotingSystemAPI

Description: VotingSystemAPI is a REST API built using Spring Boot for managing a simple voting system. 
It allows users to register candidates, cast votes, view vote counts, list all candidates and their votes, 
and determine the winner based on the highest vote count.

Features Implemented:
Candidate Registration (/entercandidate): Registers a new candidate with an initial vote count of zero.
Cast Vote (/castvote): Increments the vote count for a specified candidate if they exist.
Vote Count (/countvote): Retrieves the current vote count for a specific candidate.
List Votes (/listvote): Returns a list of all candidates and their vote counts in JSON format.
Get Winner (/getwinner): Identifies and returns the candidate with the highest vote count.
API Usage:

Register a Candidate:
POST /api/vote/entercandidate?name={candidateName}

Cast a Vote:
POST /api/vote/castvote?name={candidateName}

Get Vote Count:
GET /api/vote/countvote?name={candidateName}

List All Votes:
GET /api/vote/listvote

Get Winner:
GET /api/vote/getwinner
