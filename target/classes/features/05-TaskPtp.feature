Feature: Task - Ptp Page

 # TASK PTP

  #View to-do page
  Scenario: Show form view ptp
    When klik menu ptp
    Then Menampilkan view form ptp

#  #Fitur Search
#  Scenario Outline: Fitur Search Task Ptp
#    When input keyword search ptp "<keyword>"
#    And klik button search ptp
#    Then Menampilkan data ptp berdasarkan keyword yang di cari "<result>" "<searchBy>"
#    Examples:
#      | keyword                       | result                        | searchBy     |
#      | JC01723006                    | JC01723006                    | nipp         |
#      | ACHMAD GILANG ERLANGGA DZAKIY | ACHMAD GILANG ERLANGGA DZAKIY | name         |
#      | MERN - PINTAR 17              | MERN - PINTAR 17              | class name   |
#      | CASH BERTAHAP                 | CASH BERTAHAP                 | channel name |
#      | Y6564%$%                      | no entries                    | negatif test |
#
#  #Feature Filter
#  Scenario: Filter by class name
#    When pilih dropdown class name ptp
#    Then Menampilkan data ptp berdasarkan class name
#
#  Scenario: Filter by channel name
#    When pilih dropdown channel name ptp
#    Then Menampilkan data ptp berdasarkan channel name

  #Detail Activity
  Scenario: Show detail activity
    When klik row ptp yang ingin di show detail activitynya
    Then menampilkan form detail activity ptp

  Scenario: Show detail History
    When klik tombol history ptp
    Then Menampilkan form view history ptp

  Scenario: Show detail Biodata
    When klik tombol biodata ptp
    Then Menampilkan form view biodata ptp

  #Update Status Activity  -  PTP
  Scenario Outline: Update Status Activity Todo - PTP
    When pilih status - ptp <status>
    And pilih status call - ptp <status_call>
    And pilih status result - ptp <status_result>
    And pilih tanggal ptp - ptp
    And input remarks - ptp "<remarks>"
    And klik button save - ptp
    Then berhasil update activity - ptp
    Then validasi status pada menu data all - ptp "<statusAll>"

    Examples: Data table PTP
      | status | status_call | status_result | remarks              | statusAll |
      | 1      | 3           | 1             | Process activity PTP | PTP       |

#  #Update Status Activity  -  Belum Bayar
#  Scenario Outline: Update Status Activity - Belum Bayar
#    When klik navigation task - ptp
#    And klik menu ptp
#    And klik row ptp yang ingin di show detail activitynya
#    And pilih status - ptp <status>
#    And pilih status call - ptp <status_call>
#    And pilih status result - ptp <status_result>
#    And input remarks - ptp "<remarks>"
#    And klik button save - ptp
#    Then berhasil update activity - ptp
#    Then validasi status pada menu data all - ptp "<statusAll>"
#
#    Examples: Data table belum bayar
#      | status | status_call | status_result | remarks                      | statusAll   |
#      | 1      | 3           | 2             | Process activity Belum Bayar | Belum Bayar |
#
#  #Update Status Activity - Follow up
#  Scenario Outline: Update Status Activity - Follow up
#    When klik navigation task - ptp
#    And klik menu ptp
#    And klik row ptp yang ingin di show detail activitynya
#    And pilih status - ptp <status>
#    And pilih status call - ptp <status_call>
#    And pilih status result - ptp <status_result>
#    And pilih tanggal follow up - ptp
#    And input remarks - ptp "<remarks>"
#    And klik button save - ptp
#    Then berhasil update activity - ptp
#    Then validasi status pada menu data all - ptp "<statusAll>"
#
#    Examples: Data table follow up
#      | status | status_call | status_result | remarks                    | statusAll |
#      | 1      | 3           | 3             | Process activity Follow Up | Follow Up |
#
#  #Update Status Activity - Payment
#  Scenario Outline: Update Status Activity - Payment
#    When klik navigation task - ptp
#    And klik menu ptp
#    And klik row ptp yang ingin di show detail activitynya
#    And pilih status - ptp <status>
#    And pilih status call - ptp <status_call>
#    And pilih status result - ptp <status_result>
#    And pilih payment status - ptp <payment_status>
#    And input nominal payment - ptp <nominal>
#    And input remarks - ptp "<remarks>"
#    And klik button attachment - ptp
#    And upload file attachment - ptp
#    And input name file - ptp
#    And klik button upload - ptp
#    And klik button save - ptp
#    Then berhasil update activity - ptp
#    Then validasi status pada menu data all - ptp "<statusAll>"
#
#    Examples: Data table Payment
#      | status | status_call | status_result | payment_status | nominal | remarks                    | statusAll |
#      | 1      | 3           | 4             | 1              | 500000  | Process activity Follow Up | Payment   |
#
##  Update Status Activity (Tidak diangkat / Tidak direspon, Salah nomor dan tidak tersambung)
#  Scenario Outline: Update Status Activity (Tidak diangkat / Tidak direspon, Salah nomor dan tidak tersambung)
#    When klik navigation task - ptp
#    And klik menu ptp
#    And klik row ptp yang ingin di show detail activitynya
#    And pilih status - ptp <status>
#    And pilih status call - ptp <status_call>
#    And pilih status result - ptp <status_result>
#    And input remarks - ptp "<remarks>"
#    And klik button save - ptp
#    Then berhasil update activity - ptp
#    Then validasi status pada menu data all - ptp "<statusAll>"
#
#    Examples: Data update status Activity
#      | status | status_call | status_result | remarks                                           | statusAll       |
#      | 1      | 2           | 1             | Process activity Salah sambung                    | Salah Sambung   |
#      | 1      | 1           | 1             | Process activity Tidak di angkat / tidak direspon | Tidak Respon    |
#      | 2      | 1           | 1             | Process activity Nomer salah                      | Nomor Salah     |
#      | 2      | 2           | 1             | Process activity Mailbox                          | Mailbox         |
#      | 2      | 3           | 1             | Process activity Invalid Number                   | Invalid Number  |
#      | 2      | 4           | 1             | Process activity Telepon not register             | Tidak Terdaftar |
#
#  #Negatif test Update status activity
#  Scenario Outline: Negatif test Update status activity
#    When klik navigation task - ptp
#    And klik menu ptp
#    And klik row ptp yang ingin di show detail activitynya
#    And pilih status - ptp <status>
#    And pilih status call - ptp <status_call>
#    And pilih status result - ptp <status_result>
#    And input remarks - ptp "<remarks>"
#    And klik button save - ptp
#    Then tidak berhasil update activity - ptp "<result>"
#    Examples: Data table negatif test
#      | status | status_call | status_result | remarks | result                       |
#      | 0      | 0           | 0             |         | [Status] tidak boleh kosong! |
#
#  Scenario Outline: Negatif test Update status activity
#    When pilih status - ptp <status>
#    And pilih status call - ptp <status_call>
#    And pilih status result - ptp <status_result>
#    And klik button save - ptp
#    Then tidak berhasil update activity - ptp "<result>"
#
#    Examples: Data table negatif test
#      | status | status_call | status_result | result                                 |
#      | 1      | 0           | 0             | [Status Call] tidak boleh kosong!      |
#      | 1      | 1           | 0             | [Status Result] tidak boleh kosong!    |
#      | 1      | 3           | 3             | [Tanggal Follow Up] Tidak Boleh Kosong |
#      | 1      | 3           | 4             | [Payment Status] Tidak Boleh Kosong    |
#
##      | 1      | 3           | 1             | [Tanggal PTP] Tidak Boleh Kosong       |
#
