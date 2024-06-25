#Feature: Master Person Page
#
# # MASTER CLASS
#
#  #View master class
#  Scenario: Show form view master class
#    When  klik menu class
#    Then view master class di tampilkan
#
#  #Fitur Search
#  Scenario Outline: Fitur Search Master Class
#    When input keyword search master class "<keyword>"
#    And klik button search master class
#    Then Menampilkan data class berdasarkan keyword yang di cari "<result>" "<searchBy>"
#    Examples:
#      | keyword  | result | searchBy     |
#      | UI/UX    | UI/UX  | class name   |
#      | JVBE     | JVBE   | class code   |
#      | Y6564%$% |        | negatif test |
#
#  #Feature Filter
#  Scenario: Filter by class name
#    When pilih dropdown filter class name
#    Then Menampilkan data berdasarkan class name
#
#  Scenario: Filter by Is Active
#    When pilih dropdown filter is active
#    Then Menampilkan data berdasarkan is active
#
#  #Get Data
#  Scenario: Get data class
#    When klik tombol Get Data class
#    And konfirmasi alert get data class
#    Then berhasil get data class