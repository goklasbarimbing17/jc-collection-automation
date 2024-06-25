Feature: Payment - Paid Page

 # VERIFIKASI

  #View Verifikasi
  Scenario: Show form view paid
    When klik menu Paid
    Then Menampilkan view form Paid

  #Fitur Search
  Scenario Outline: Fitur Search Payment - Paid
    When input keyword search Paid "<keyword>"
    And klik button search Paid
    Then Menampilkan data Paid berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword        | result         | searchBy        |
      | JC01322007     | JC01322007     | nipp            |
      | CHANDRA YANUAR | CHANDRA YANUAR | name            |
      | SQA RPA 8      | SQA RPA 8      | class name      |
      | ISA            | ISA            | channel payment |
      | Y6564%$%       | no entries     | negatif test    |

  #Feature Filter
  Scenario: Filter by class name
    When pilih dropdown class name Paid
    Then Menampilkan data paid berdasarkan class name

  Scenario: Filter by channel name paid
    When pilih dropdown status paid
    Then Menampilkan data paid berdasarkan channel name

  #Detail Informasi Payment
  Scenario: Show detail data Payment
    When klik row yang ini di show detail informasi data payment
    Then menampilkan form detail informasi data payment
    Then mencocokkan data pada grid dengan data detail
