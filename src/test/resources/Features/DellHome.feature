#Samia Jouini
Feature: Home Dell

  Scenario: selectionner un produit
    Given admin is on HomePage
    When admin mousHover on menu "Ordinateurs et accessoires" and submenu "Ordinateurs portables"
    And admin click on product "Ordinateurs portables XPS"
    Then admin directed to the page "Ordinateurs portables XPS"
