Feature: Shout

  Shouty allows users to "hear" other users "shouts" as long as they are close enough to each other.

  To do:
    - only shout to people within a certain distance

  Rule: Shouts can be heard by other users
    Scenario: Listener within range
      Given Lucy is located 15 meters from Sean
      When Sean shouts "free bagels at Sean's"
      Then Lucy should hear Sean's message about bagels
