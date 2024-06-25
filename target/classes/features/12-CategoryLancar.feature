Feature: Category - Lancar

 # Category - Lancar

  #View Lancar
  Scenario: Show form view lancar
    When klik navigation Category
    When klik menu lancar
    Then Menampilkan view form lancar

  #Fitur Search
  Scenario Outline: Fitur Search Category - Lancar
    When input keyword search lancar "<keyword>"
    And klik button search lancar
    Then Menampilkan data lancar berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword           | result            | searchBy        |
      | JC01122002        | JC01122002        | nipp            |
      | Dwi Samsari       | Dwi Samsari       | name            |
      | Java Fullstack 11 | Java Fullstack 11 | class name      |
      | Beasiswa          | Beasiswa          | channel payment |
      | Payment           | Payment           | status          |
      | Y6564%$%          | no entries        | negatif test    |



