# BDD TEST AUTOMATION FRAMEWORK FOR NASA API TESTING

### About this project
This project based on Serenity BDD framework.
This project verify few NASA Image API endpoints.
Welcome to the NASA API portal - https://api.nasa.gov/api.html#images-endpoints 

### Run tests
To run tests from Command line, use following command: mvn clean verify -Dstories=CuriosityBaseStory.story

To run tests with JUnit - Create JUnit Run Configuration with VM -Options : -ea  -Dstories=CuriosityBaseStory.story
And Class : com.klymenko.vadym.AcceptanceTestSuite

### Reporting
For report generating, do following:
perform mvn serenity:aggregate
go to target/site/serenity/index.html

### Authentication
api_key=DEMO_KEY was override for api_key=xBEmFwpvUHMdsL2iw9UNCTaPBHtfJyllBI3elnD4 
it helps to send more than 30 requests per IP address per hour.
With new api_key - Hourly Limit: 1,000 requests per hour