Feature: Special Case - Page

 # SPECIAL CASE

  #View Special case
  Scenario: Show form view Special Case
    When klik navigation special case
    And klik menu special case
    Then Menampilkan view form special case

  #Fitur Search
  Scenario Outline: Fitur Search Special case
    When input keyword search special case "<keyword>"
    And klik button search special case
    Then Menampilkan data special case berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword                  | result                   | searchBy           |
      | SQA00522004              | SQA00522004              | nipp               |
      | Davin Reyhan Setiawan    | Davin Reyhan Setiawan    | name               |
      | novanmasriandi@gmail.com | novanmasriandi@gmail.com | email              |
      | S1 Teknik Informatika    | S1 Teknik Informatika    | jenjang pendidikan |
      | MERN - PINTAR 17         | MERN - PINTAR 17         | class name         |
      | CASH                     | CASH                     | channel payment    |
      | Y6564%$%                 | no entries               | negatif test       |

  #Feature Filter
  Scenario: Filter by class name
    When pilih dropdown class name special case
    Then Menampilkan data special case berdasarkan class name

  Scenario: Filter by status special case
    When pilih dropdown status special case
    Then Menampilkan data special case berdasarkan status

  #Detail Activity
  Scenario: Show detail special case
    When klik button detail special case
    Then menampilkan form detail special case

  #Update Status Special Case
  Scenario Outline: Update Status Special Case
    When klik button edit special case
    And pilih status special case <status_special_case>
    And klik button save - special case
    And klik button ya pada popup
    Then validasi status special case "<resultStatus>"

    Examples: Data table PTP
      | status_special_case | resultStatus |
      | 1                   | Beasiswa     |