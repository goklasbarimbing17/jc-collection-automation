Feature: Master Person Page

 # MASTER CLASS

  #View master class
  Scenario: Show form view master class
    Given Open prollo
    When  login

#  #Fitur Search
#  Scenario: Fitur Search Master Class
#

  Scenario Outline: Input prospect
    When redirect to List client
    When klik card create client
    And input perusahaan "<perusahaan>"
    And input nama PIC "<nama>"
    And input no telp "<telp>"
    And input email PIC "<email>"
    And pilih source <source>
    And klik create
    Examples:
      | perusahaan  | nama        | telp        | email           | source |
      | PT Dummy 0111  | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 00 | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 1  | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 2  | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 3  | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 4  | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 5  | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 6  | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 7  | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 8  | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 9  | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 10 | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 11 | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 12 | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 13 | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |
      | PT Dummy 14 | AjI Nugraha | 08123456877 | dummy@gmail.com | 2      |


