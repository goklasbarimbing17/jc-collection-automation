Feature: Category - Tidak Lancar

 # Category - Lancar

  #View Lancar
  Scenario: Show form view tidak lancar
    When klik menu tidak lancar
    Then Menampilkan view form tidak lancar

  #Fitur Search
  Scenario Outline: Fitur Search Category - Tidak Lancar
    When input keyword search tidak lancar "<keyword>"
    And klik button search tidak lancar
    Then Menampilkan data tidak lancar berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword           | result            | searchBy        |
      | D6201030          | D6201030          | nipp            |
      | GOKLAS            | GOKLAS            | name            |
      | Java Fullstack 11 | Java Fullstack 11 | class name      |
      | Cash Bertahap     | CASH BERTAHAP     | channel payment |
      | Y6564%$%          | no entries        | negatif test    |



