Feature: Home And Basket Pages
  Scenario: User sees products
    Given User on home page
    When  User clicks searchbox
    When   User writes "mont"
    When   User clicks home page Search Button


    Scenario Outline: User adds product
      Given User on home page
      When  User clicks searchbox
      When   User writes "mont"
      When  User clicks home page Search Button
      When  User clicks Erkek checkbox button
      Then  User should see "Kiğılı Erkek Lacivert Kapitone Spor Mont 216297" product
      When  User clicks "Kiğılı Erkek Lacivert Kapitone Spor Mont 216297"
      When  User clicks Sepete Ekle button
      When User on cart page
      When  User clicks trash can icon
      And   User clicks Sil button
      Then  Should see "<emptyCart>" empty cart message.

      Examples:
        |emptyCart|
        | Sepetinde urun bulunmamaktadir.        |







