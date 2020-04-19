I created the testing framwework from scratch using Maven, Cucumber BDD framework combined with Serenity.
My main language is JAVA, and I used JUnit for assertions.

In my .feature file, I tried to utilize Data Driven Testing since,so that this piece of tests can be scaled up.
As such I used Scenario Outline functionality of Cucumber.

As you will see in .feature file, all 3 test scenarios are structured with Scenario Outline.

I created three main packages. First one is navigation under which I initiated and navigated to the main test page.

Then I created pages package under which I put my all the pages that I located the webelements.

Under the stepdefinitions package I created the real code that does the job.

I eliminited the code pieces that caused repetition.

And I ran my tests through CukesRunner file which works through CucumberWithSerenity.

