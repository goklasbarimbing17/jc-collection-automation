Feature: Master Payment Page

 # MASTER PAYMENT

  #View master payment
  Scenario: Show form view master payment
    When  klik menu payment
    Then view master payment di tampilkan

  #Fitur Search
  Scenario Outline: Fitur Search Master payment
    When input keyword search master payment "<keyword>"
    And klik button search master payment
    Then Menampilkan data payment berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword       | result        | searchBy     |
      | SQA           | SQA           | class name   |
      | ISA           | ISA           | channel name |
      | Administrator | Administrator | created by   |
      | Y6564%$%      |               | negatif test |

  #Feature Filter
  Scenario: Filter by class name
    When pilih dropdown class name
    Then Menampilkan data payment berdasarkan class name

  #Get Data
  Scenario: Get data payment
    When klik tombol Get Data payment
    And konfirmasi alert get data payment
    Then berhasil get data payment