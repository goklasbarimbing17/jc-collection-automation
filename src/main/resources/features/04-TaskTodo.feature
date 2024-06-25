Feature: Task - Todo Page

 # TASK TO-DO

  #View to-do page
  Scenario: Show form view todo
    When  klik navigation task
    And klik menu todo
    Then Menampilkan view form todo

  #Fitur Search
  Scenario Outline: Fitur Search Task Todo
    When input keyword search todo "<keyword>"
    And klik button search todo
    Then Menampilkan data todo berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword            | result             | searchBy     |
      | JC01222004         | JC01222004         | nipp         |
      | AHMAD FAQIH ARIFIN | AHMAD FAQIH ARIFIN | name         |
      | PHYTON REGULAR 1   | PHYTON REGULAR 1   | class name   |
      | CASH BERTAHAP      | CASH BERTAHAP      | channel name |
      | Y6564%$%           | no entries         | negatif test |

  #Feature Filter
  Scenario: Filter by class name
    When pilih dropdown class name todo
    Then Menampilkan data todo berdasarkan class name

  Scenario: Filter by channel name
    When pilih dropdown channel name todo
    Then Menampilkan data todo berdasarkan channel name

  #Detail Activity
  Scenario: Show detail activity
    When klik row yang ingin di show detail activitynya
    Then menampilkan form detail activity

  Scenario: Show detail History
    When klik tombol history
    Then Menampilkan form view history

  Scenario: Show detail Biodata
    When klik tombol biodata
    Then Menampilkan form view biodata

  #Update Status Activity  -  PTP
  Scenario Outline: Update Status Activity Todo - PTP
    When pilih status <status>
    And pilih status call <status_call>
    And pilih status result <status_result>
    And pilih tanggal ptp
    And input remarks "<remarks>"
    And klik button save
    Then berhasil update activity

    Examples: Data table PTP
      | status | status_call | status_result | remarks              |
      | 1      | 3           | 1             | Process activity PTP |

  #Update Status Activity  -  Belum Bayar
  Scenario Outline: Update Status Activity - Belum Bayar
    When klik row yang ingin di show detail activitynya
    And pilih status <status>
    And pilih status call <status_call>
    And pilih status result <status_result>
    And input remarks "<remarks>"
    And klik button save
    Then berhasil update activity

    Examples: Data table belum bayar
      | status | status_call | status_result | remarks                      |
      | 1      | 3           | 2             | Process activity Belum Bayar |

  #Update Status Activity - Follow up
  Scenario Outline: Update Status Activity - Follow up
    When klik row yang ingin di show detail activitynya
    And pilih status <status>
    And pilih status call <status_call>
    And pilih status result <status_result>
    And pilih tanggal follow up
    And input remarks "<remarks>"
    And klik button save
    Then berhasil update activity

    Examples: Data table follow up
      | status | status_call | status_result | remarks                    |
      | 1      | 3           | 3             | Process activity Follow Up |

#  Update Status Activity - Payment
  Scenario Outline: Update Status Activity - Payment
    When klik row yang ingin di show detail activitynya
    And pilih status <status>
    And pilih status call <status_call>
    And pilih status result <status_result>
    And pilih payment status <payment_status>
    And input nominal payment <nominal>
    And input remarks "<remarks>"
    And klik button attachment
    And upload file attachment
    And input name file
    And klik button upload
    And klik button save
    Then berhasil update activity

    Examples: Data table Payment
      | status | status_call | status_result | payment_status | nominal | remarks                    |
      | 1      | 3           | 4             | 1              | 500000  | Process activity Follow Up |

#  Update Status Activity (Tidak diangkat / Tidak direspon, Salah nomor dan tidak tersambung)
  Scenario Outline: Update Status Activity Tidak diangkat Tidak direspon Salah nomor dan tidak tersambung
    When klik row yang ingin di show detail activitynya
    And pilih status <status>
    And pilih status call <status_call>
    And pilih status result <status_result>
    And input remarks "<remarks>"
    And klik button save
    Then berhasil update activity

    Examples: Data update status Activity
      | status | status_call | status_result | remarks                                           |
      | 1      | 2           | 1             | Process activity Salah sambung                    |
      | 1      | 1           | 1             | Process activity Tidak di angkat / tidak direspon |
      | 2      | 1           | 1             | Process activity Nomer salah                      |
      | 2      | 2           | 1             | Process activity Mailbox                          |
      | 2      | 3           | 1             | Process activity Invalid Number                   |
      | 2      | 4           | 1             | Process activity Telepon not register             |

  #Negatif test Update status activity
  Scenario Outline: Negatif test Update status activity
    When klik row yang ingin di show detail activitynya
    And pilih status <status>
    And pilih status call <status_call>
    And pilih status result <status_result>
    And input remarks "<remarks>"
    And klik button save
    Then tidak berhasil update activity "<result>"
    Examples: Data table negatif test
      | status | status_call | status_result | remarks | result                       |
      | 0      | 0           | 0             |         | [Status] tidak boleh kosong! |

  Scenario Outline: Negatif test Update status activity
    When pilih status <status>
    And pilih status call <status_call>
    And pilih status result <status_result>
    And klik button save
    Then tidak berhasil update activity "<result>"

    Examples: Data table negatif test
      | status | status_call | status_result | result                                 |
      | 1      | 0           | 0             | [Status Call] tidak boleh kosong!      |
      | 1      | 1           | 0             | [Status Result] tidak boleh kosong!    |
      | 1      | 3           | 3             | [Tanggal Follow Up] Tidak Boleh Kosong |
      | 1      | 3           | 4             | [Payment Status] Tidak Boleh Kosong    |

      | 1      | 3           | 1             | [Tanggal PTP] Tidak Boleh Kosong       |

