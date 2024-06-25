Feature: Task - Reminder Page

 # TASK Reminder

  #View to-do page
  Scenario: Show form view reminder
    When klik navigation task
    And klik menu reminder
    Then Menampilkan view form reminder

  #Fitur Search
  Scenario Outline: Fitur Search Task reminder
    When input keyword search reminder "<keyword>"
    And klik button search reminder
    Then Menampilkan data reminder berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword                       | result                        | searchBy     |
      | JC01723006                    | JC01723006                    | nipp         |
      | ACHMAD GILANG ERLANGGA DZAKIY | ACHMAD GILANG ERLANGGA DZAKIY | name         |
      | MERN - PINTAR 17              | MERN - PINTAR 17              | class name   |
      | CASH BERTAHAP                 | CASH BERTAHAP                 | channel name |
      | Y6564%$%                      | no entries                    | negatif test |

  #Feature Filter
  Scenario: Filter by class name
    When pilih dropdown class name reminder
    Then Menampilkan data reminder berdasarkan class name

  Scenario: Filter by channel name
    When pilih dropdown channel name reminder
    Then Menampilkan data reminder berdasarkan channel name

  #Detail Activity
  Scenario: Show detail activity
    When klik row reminder yang ingin di show detail activitynya
    Then menampilkan form detail activity reminder

  Scenario: Show detail History
    When klik tombol history reminder
    Then Menampilkan form view history reminder

  Scenario: Show detail Biodata
    When klik tombol biodata reminder
    Then Menampilkan form view biodata reminder

  #Update Status Activity  -  PTP
  Scenario Outline: Update Status Activity Todo - Reminder
    When pilih status - reminder <status>
    And pilih status call - reminder <status_call>
    And pilih status result - reminder <status_result>
    And pilih tanggal ptp - reminder
    And input remarks - reminder "<remarks>"
    And klik button save - reminder
    Then berhasil update activity - reminder
    Then validasi status pada menu data all - reminder "<statusAll>"

    Examples: Data table PTP
      | status | status_call | status_result | remarks              | statusAll |
      | 1      | 3           | 1             | Process activity PTP | PTP       |

  #Update Status Activity  -  Belum Bayar
  Scenario Outline: Update Status Activity - Belum Bayar
    When klik navigation task - reminder
    And klik menu reminder
    And klik row reminder yang ingin di show detail activitynya
    And pilih status - reminder <status>
    And pilih status call - reminder <status_call>
    And pilih status result - reminder <status_result>
    And input remarks - reminder "<remarks>"
    And klik button save - reminder
    Then berhasil update activity - reminder
    Then validasi status pada menu data all - reminder "<statusAll>"

    Examples: Data table belum bayar
      | status | status_call | status_result | remarks                      | statusAll   |
      | 1      | 3           | 2             | Process activity Belum Bayar | Belum Bayar |

  #Update Status Activity - Follow up
  Scenario Outline: Update Status Activity - Follow up
    When klik navigation task - reminder
    And klik menu reminder
    And klik row reminder yang ingin di show detail activitynya
    And pilih status - reminder <status>
    And pilih status call - reminder <status_call>
    And pilih status result - reminder <status_result>
    And pilih tanggal follow up - reminder
    And input remarks - reminder "<remarks>"
    And klik button save - reminder
    Then berhasil update activity - reminder
    Then validasi status pada menu data all - reminder "<statusAll>"

    Examples: Data table follow up
      | status | status_call | status_result | remarks                    | statusAll |
      | 1      | 3           | 3             | Process activity Follow Up | Follow Up |

  #Update Status Activity - Payment
  Scenario Outline: Update Status Activity - Payment
    When klik navigation task - reminder
    And klik menu reminder
    And klik row reminder yang ingin di show detail activitynya
    And pilih status - reminder <status>
    And pilih status call - reminder <status_call>
    And pilih status result - reminder <status_result>
    And pilih payment status - reminder <payment_status>
    And input nominal payment - reminder <nominal>
    And input remarks - reminder "<remarks>"
    And klik button attachment - reminder
    And upload file attachment - reminder
    And input name file - reminder
    And klik button upload - reminder
    And klik button save - reminder
    Then berhasil update activity - reminder
    Then validasi status pada menu data all - reminder "<statusAll>"

    Examples: Data table Payment
      | status | status_call | status_result | payment_status | nominal | remarks                    | statusAll |
      | 1      | 3           | 4             | 1              | 500000  | Process activity Follow Up | Payment   |

#  Update Status Activity (Tidak diangkat / Tidak direspon, Salah nomor dan tidak tersambung)
  Scenario Outline: Update Status Activity (Tidak diangkat / Tidak direspon, Salah nomor dan tidak tersambung)
    When klik navigation task - reminder
    And klik menu reminder
    And klik row reminder yang ingin di show detail activitynya
    And pilih status - reminder <status>
    And pilih status call - reminder <status_call>
    And pilih status result - reminder <status_result>
    And input remarks - reminder "<remarks>"
    And klik button save - reminder
    Then berhasil update activity - reminder
    Then validasi status pada menu data all - reminder "<statusAll>"

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
    When klik navigation task - reminder
    And klik menu reminder
    And klik row reminder yang ingin di show detail activitynya
    And pilih status - reminder <status>
    And pilih status call - reminder <status_call>
    And pilih status result - reminder <status_result>
    And input remarks - reminder "<remarks>"
    And klik button save - reminder
    Then tidak berhasil update activity - reminder "<result>"
    Examples: Data table negatif test
      | status | status_call | status_result | remarks | result                       |
      | 0      | 0           | 0             |         | [Status] tidak boleh kosong! |

  Scenario Outline: Negatif test Update status activity
    When pilih status - reminder <status>
    And pilih status call - reminder <status_call>
    And pilih status result - reminder <status_result>
    And klik button save - reminder
    Then tidak berhasil update activity - reminder "<result>"

    Examples: Data table negatif test
      | status | status_call | status_result | result                                 |
      | 1      | 0           | 0             | [Status Call] tidak boleh kosong!      |
      | 1      | 1           | 0             | [Status Result] tidak boleh kosong!    |
      | 1      | 3           | 3             | [Tanggal Follow Up] Tidak Boleh Kosong |
      | 1      | 3           | 4             | [Payment Status] Tidak Boleh Kosong    |

#      | 1      | 3           | 1             | [Tanggal PTP] Tidak Boleh Kosong       |

