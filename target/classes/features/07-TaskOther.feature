Feature: Task - Other Page

 # TASK Other

  #View to-do page
  Scenario: Show form view Other
    When klik navigation task
    And klik menu Other
    Then Menampilkan view form Other

  #Fitur Search
  Scenario Outline: Fitur Search Task Other
    When input keyword search Other "<keyword>"
    And klik button search Other
    Then Menampilkan data Other berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword               | result                | searchBy     |
      | SQA00522004           | SQA00522004           | nipp         |
      | Davin Reyhan Setiawan | Davin Reyhan Setiawan | name         |
      | MERN - PINTAR 17      | MERN - PINTAR 17      | class name   |
      | CASH                  | CASH                  | channel name |
      | Y6564%$%              | no entries            | negatif test |

  #Feature Filter
  Scenario: Filter by class name
    When pilih dropdown class name Other
    Then Menampilkan data Other berdasarkan class name

  Scenario: Filter by channel name
    When pilih dropdown channel name Other
    Then Menampilkan data Other berdasarkan channel name

  #Detail Activity
  Scenario: Show detail activity
    When klik row Other yang ingin di show detail activitynya
    Then menampilkan form detail activity Other

  Scenario: Show detail History
    When klik tombol history Other
    Then Menampilkan form view history Other

  Scenario: Show detail Biodata
    When klik tombol biodata Other
    Then Menampilkan form view biodata Other

  #Update Status Activity  -  PTP
  Scenario Outline: Update Status Activity Todo - Other
    When pilih status - Other <status>
    And pilih status call - Other <status_call>
    And pilih status result - Other <status_result>
    And pilih tanggal ptp - Other
    And input remarks - Other "<remarks>"
    And klik button save - Other
    Then berhasil update activity - Other
    Then validasi status pada menu data all - Other "<statusAll>"

    Examples: Data table PTP
      | status | status_call | status_result | remarks              | statusAll |
      | 1      | 3           | 1             | Process activity PTP | PTP       |

  #Update Status Activity  -  Belum Bayar
  Scenario Outline: Update Status Activity - Belum Bayar
    When klik navigation task - Other
    And klik menu Other
    And klik row Other yang ingin di show detail activitynya
    And pilih status - Other <status>
    And pilih status call - Other <status_call>
    And pilih status result - Other <status_result>
    And input remarks - Other "<remarks>"
    And klik button save - Other
    Then berhasil update activity - Other
    Then validasi status pada menu data all - Other "<statusAll>"

    Examples: Data table belum bayar
      | status | status_call | status_result | remarks                      | statusAll   |
      | 1      | 3           | 2             | Process activity Belum Bayar | Belum Bayar |

  #Update Status Activity - Follow up
  Scenario Outline: Update Status Activity - Follow up
    When klik navigation task - Other
    And klik menu Other
    And klik row Other yang ingin di show detail activitynya
    And pilih status - Other <status>
    And pilih status call - Other <status_call>
    And pilih status result - Other <status_result>
    And pilih tanggal follow up - Other
    And input remarks - Other "<remarks>"
    And klik button save - Other
    Then berhasil update activity - Other
    Then validasi status pada menu data all - Other "<statusAll>"

    Examples: Data table follow up
      | status | status_call | status_result | remarks                    | statusAll |
      | 1      | 3           | 3             | Process activity Follow Up | Follow Up |

  #Update Status Activity - Payment
  Scenario Outline: Update Status Activity - Payment
    When klik navigation task - Other
    And klik menu Other
    And klik row Other yang ingin di show detail activitynya
    And pilih status - Other <status>
    And pilih status call - Other <status_call>
    And pilih status result - Other <status_result>
    And pilih payment status - Other <payment_status>
    And input nominal payment - Other <nominal>
    And input remarks - Other "<remarks>"
    And klik button attachment - Other
    And upload file attachment - Other
    And input name file - Other
    And klik button upload - Other
    And klik button save - Other
    Then berhasil update activity - Other
    Then validasi status pada menu data all - Other "<statusAll>"

    Examples: Data table Payment
      | status | status_call | status_result | payment_status | nominal | remarks                    | statusAll |
      | 1      | 3           | 4             | 1              | 500000  | Process activity Follow Up | Payment   |

#  Update Status Activity (Tidak diangkat / Tidak direspon, Salah nomor dan tidak tersambung)
  Scenario Outline: Update Status Activity (Tidak diangkat / Tidak direspon, Salah nomor dan tidak tersambung)
    When klik navigation task - Other
    And klik menu Other
    And klik row Other yang ingin di show detail activitynya
    And pilih status - Other <status>
    And pilih status call - Other <status_call>
    And pilih status result - Other <status_result>
    And input remarks - Other "<remarks>"
    And klik button save - Other
    Then berhasil update activity - Other
    Then validasi status pada menu data all - Other "<statusAll>"

    Examples: Data update status Activity
      | status | status_call | status_result | remarks                                           | statusAll       |
      | 1      | 2           | 1             | Process activity Salah sambung                    | Salah Sambung   |
      | 1      | 1           | 1             | Process activity Tidak di angkat / tidak direspon | Tidak Respon    |
      | 2      | 1           | 1             | Process activity Nomer salah                      | Nomor Salah     |
      | 2      | 2           | 1             | Process activity Mailbox                          | Mailbox         |
      | 2      | 3           | 1             | Process activity Invalid Number                   | Invalid Number  |
      | 2      | 4           | 1             | Process activity Telepon not register             | Tidak Terdaftar |

  #Negatif test Update status activity
  Scenario Outline: Negatif test Update status activity
    When klik navigation task - Other
    And klik menu Other
    And klik row Other yang ingin di show detail activitynya
    And pilih status - Other <status>
    And pilih status call - Other <status_call>
    And pilih status result - Other <status_result>
    And input remarks - Other "<remarks>"
    And klik button save - Other
    Then tidak berhasil update activity - Other "<result>"
    Examples: Data table negatif test
      | status | status_call | status_result | remarks | result                       |
      | 0      | 0           | 0             |         | [Status] tidak boleh kosong! |

  Scenario Outline: Negatif test Update status activity
    When pilih status - Other <status>
    And pilih status call - Other <status_call>
    And pilih status result - Other <status_result>
    And klik button save - Other
    Then tidak berhasil update activity - Other "<result>"

    Examples: Data table negatif test
      | status | status_call | status_result | result                                 |
      | 1      | 0           | 0             | [Status Call] tidak boleh kosong!      |
      | 1      | 1           | 0             | [Status Result] tidak boleh kosong!    |
      | 1      | 3           | 3             | [Tanggal Follow Up] Tidak Boleh Kosong |
      | 1      | 3           | 4             | [Payment Status] Tidak Boleh Kosong    |

#      | 1      | 3           | 1             | [Tanggal PTP] Tidak Boleh Kosong       |

