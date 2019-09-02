# SpringCore
The repo will host project build using core APIs of Spring Framework 5

Sports Schedule Management

Requirement

The application tracks a sports activities management for a user. A user can have subsribe to many sports (Cricket, Tennis, Basketball etc.) whose coach which will give daily instructions to practise for certain time period.

Besides these coaches there will be a TrackCoach who will track activities and give final instruction before sport session ends.
TrackCoach takes case of dietary requirement for the user. He instructs user to eat what kind of diet in specific amount. User will have discretion to turn on/off dietary function.
TrackCoach will also assign user to a specific team and informs user about the email address he can raise question to regarding team activities.

Application starts by dispalying a welcome message to all the users and when exit remind user not to forget their belongings(wallet, etc)

Application Design
The application has two variants one with configuration defined as xml and other one with configurations as annotations and java classes. In both variants we have dependency injection as constructor, setter or field depending upon the requirement.Even there is injection of values from properties file. We experimented with bean scopes for different implementation of interface Coach. There is certain business logic exceuted at start and end of the application.
