Feature: Validating the Google place APIs

@tag1
Scenario Outline: Validate that the user is able to add new place
Given The user Add Place Payload with "<name>" "<number>" "<address>"
When The user calls "AddPlaceApi" with "post" https request
Then The API got successful with status code 200
And The "status" in response body is "OK"
And The "scope" in response body is "APP"
And Verify that "<name>" is added using "getPlace"                                                                                                   

Examples:
|name 	| number		| address 				|
|Nidhi	| 0909090900	|Marol, Andheri |
#|Nidhi	|8989898989		|Airoli			|

@DeletePlace
Scenario: Validate that the user is able to delete palce
Given The user calls "deletePlace" with "DELETE" request
Then The API got successful with status code 200
And The "status" in response body is "OK"

@UpdatePlaceAPI
Scenario: Validate that the user is able to update the address
Given The user calls "updatePlace" with "put" request
Then The API got successful with status code 200
And The "msg" in response body is "Address successfully updated"