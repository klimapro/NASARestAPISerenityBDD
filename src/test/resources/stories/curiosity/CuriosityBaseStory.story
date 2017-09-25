Meta:

Narrative:
As a user
I can use NASA API
So that I can check images which are made by Curiosity

Scenario: Compare first 10 images and metadata made by "Curiosity" on 1000 Mars sol and same 10 Mars photos
made by "Curiosity" on earth date that is equals 1000 Mars sol
Given Set token xBEmFwpvUHMdsL2iw9UNCTaPBHtfJyllBI3elnD4
Then Downloaded first 10 images and metadata from API are identical

Scenario: Verify that each separate camera made 10 times more images than any other camera
Given Set token xBEmFwpvUHMdsL2iw9UNCTaPBHtfJyllBI3elnD4
Then Each separate camera made 10 times less images than any other camera