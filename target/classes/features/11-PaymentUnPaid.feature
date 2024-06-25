Feature: Payment - Unpaid Page

 # VERIFIKASI

  #View Verifikasi
  Scenario: Show form view Unpaid
    When klik menu Unpaid
    Then Menampilkan view form Unpaid

  #Fitur Search
  Scenario Outline: Fitur Search Payment - Unpaid
    When input keyword search unpaid "<keyword>"
    And klik button search unpaid
    Then Menampilkan data unpaid berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword            | result             | searchBy        |
      | JC00921018         | JC00921018         | nipp            |
      | AHMAD FAQIH ARIFIN | AHMAD FAQIH ARIFIN | name            |
      | MERN - PINTAR 17  | MERN - PINTAR 17   | class name      |
      | ISA                | ISA                | channel payment |
      | Y6564%$%           | no entries         | negatif test    |

  #Feature Filter
  Scenario: Filter by class name
    When pilih dropdown class name unpaid
    Then Menampilkan data unpaid berdasarkan class name

  Scenario: Filter by channel name unpaid
    When pilih dropdown status unpaid
    Then Menampilkan data unpaid berdasarkan channel name

