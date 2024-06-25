Feature: Payment - Verifikasi Page

 # VERIFIKASI

  #View Verifikasi
  Scenario: Show form view verifikasi
    When klik navigation payment
    And klik menu verfikasi
    Then Menampilkan view form verifikasi

  #Fitur Search
  Scenario Outline: Fitur Search Payment - Verifikasi
    When input keyword search Verifikasi "<keyword>"
    And klik button search Verifikasi
    Then Menampilkan data Verifikasi berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword            | result             | searchBy        |
      | SQA00823021        | SQA00823021        | nipp            |
      | TAUFIK FERDIANSYAH | TAUFIK FERDIANSYAH | name            |
      | SQA RPA 8          | SQA RPA 8          | class name      |
      | ISA                | ISA                | channel payment |
      | Y6564%$%           | no entries         | negatif test    |

  #Feature Filter
  Scenario: Filter by class name
    When pilih dropdown class name verifikasi
    Then Menampilkan data verifikasi berdasarkan class name

  Scenario: Filter by channel name verifikasi
    When pilih dropdown status verifikasi
    Then Menampilkan data verifikasi berdasarkan channel name

  #Detail Informasi Payment
  Scenario: Show detail Informasi Payment
    When klik row yang ini di show detail informasi payment
    Then menampilkan form detail informasi payment

  #Update payment to Unpaid
  Scenario: Update Payment to Unpaid
    When klik button unpaid
    And Klik Yes pada popup unpaid
    Then data berhasil di update ke menu unpaid

  #Update payment to Unpaid
  Scenario: Verifikasi activity payment
    When klik button verifikasi
    When Klik Yes pada popup verifikasi
    Then data berhasil di update ke menu paid
