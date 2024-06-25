Feature: Login Page

  Scenario Outline: Check access url login page
    Given Input url web lamar "<Url>"
    Then Menampilkan halaman login "<TxtLoginPage>"
    Examples:
      | Url                                   | TxtLoginPage |
#      | https://dev.ptdika.com/lamar2/loginuser   | Not Found    |
      | https://staging.ptkta.com/collectjc/# | MAIN         |

  Scenario Outline: Check login page
    When User input username "<Username>"
    And User input password "<Password>"
    And Klik tombol Sign In
    Then Berhasil login dan menampilkan halaman dashboard "<msgResult>"
#    When klik logout

    Examples:
      | Username | Password | msgResult              |
      | spv01    | 1        | JuaraCoding Collection |