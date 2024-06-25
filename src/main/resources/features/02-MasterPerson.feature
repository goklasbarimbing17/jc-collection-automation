Feature: Master Data Page

 # MASTER PERSON

  #View master person
  Scenario: Show form view master person
    When klik navigation Master data
    And klik menu person
    Then view master person di tampilkan

#  #Fitur Search
#  Scenario Outline: Fitur Search
#    When input keyword search "<keyword>"
#    And klik button search
#    Then Menampilkan data berdasarkan keyword yang di cari "<result>" "<searchBy>"
#    Examples:
#      | keyword                 | result                  | searchBy           |
#      | JC01222004              | JC01222004              | nipp               |
#      | GOKLAS                  | GOKLAS                  | nama               |
#      | benefitadrian@gmail.com | benefitadrian@gmail.com | email              |
#      | S1 Teknik Mesin         | S1 Teknik Mesin         | jenjang pendidikan |
#      | PHYTON REGULAR 1        | PHYTON REGULAR 1        | class              |
#      | Tanpa PKS               | Tanpa PKS               | channel payment    |
#
#  #Feature Filter
#  Scenario: Filter by class
#    When pilih dropdown filter class
#    Then Menampilkan data berdasarkan class
#
#  Scenario: Filter by Channel Payment
#    When pilih dropdown filter Channel payment
#    Then Menampilkan data berdasarkan channel payment
#
#  #Get Data
#  Scenario: Get data person
#    When klik tombol Get Data
#    And konfirmasi alert get data
#    Then berhasil get data