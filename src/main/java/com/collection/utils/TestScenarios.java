package com.collection.utils;

public enum TestScenarios {
    //Scenario Modul Login Page
    T1(""),
    T2("Check access login page with invalid url"),
    T3("Check Login is Failed with invalid password"),
    T4("Check Login is Falied with invalid username"),
    T5("Check Login is Falied with null password"),
    T6("Check Login is Failed with null username"),
    T7("Check Login is falied with null username and password"),
    T8("Check Login is success with valid credentials"),

    //    Test Scenario Modul Dashboar - 7 hari
    T9("Test access halaman Detail data overing 7 hari"),
    T10("Test Search data by Name"),
    T11("Test Search data by Name with invalid keyword"),
    T12("Test Search data by Name with keyword kombinasi karakter"),
    T13("Test show entries"),
    T14("Test tombol back"),

    //Test Scenario Modul Dashboar - 10 hari
    T15("Test access halaman Detail data overing 10 hari"),
    T16("Test Search data by Name"),
    T17("Test Search data by Name with invalid keyword"),
    T18("Test Search data by Name with keyword kombinasi karakter"),
    T19("Test show entries"),
    T20("Test tombol back"),

    //Test Scenario Modul Dashboar - 14 hari
    T21("Test access halaman Detail data overing 14 hari"),
    T22("Test Search data by Name"),
    T23("Test Search data by Name with invalid keyword"),
    T24("Test Search data by Name with keyword kombinasi karakter"),
    T25("Test show entries"),
    T26("Test tombol back"),

    //Test Scenario Modul Dashboard - Jumlah Client
    T27("Test access halaman Detail data clients"),
    T28("Test Search data by Client Name"),
    T29("Test Search data by Client Name with invalid keyword"),
    T30("Test Search data by Client Name with keyword kombinasi karakter"),
    T31("Test show entries"),
    T32("Test tombol back"),

    //Test Scenario Modul Recruitment Request - Data Aktif
    T33("Test Access halaman Data Aktif"),
    T34("Test Filter by Status as open"),
    T35("Test Filter by Status as close"),
    T36("Test Filter by Status as cancel"),
    T37("Test Filter by Status as hold"),
    T38("Test Reset value filter"),
    T39("Test show entries"),
    T40("Test Search by Invalid keyword"),
    T41("Test Search by kombinasi karakter [aA3265$%?]"),
    T42("Test Search by nama project"),
    T43("Test Search by nama klien"),
    T44("Test Search by jenis kerjasama"),
    T45("Test Search by nama posisi"),
    T46("Test Search by status kontrak"),
    T47("Test Search by penempatan"),
    T48("Test Search by jam kerja"),
    T49("Test Search by pendidikan"),
    T50("Test View detail data recruitment request aktif"),
    T51("Test back to data aktif page"),
    T52("Test Success Update Status "),
    T53("Test Invalid Update Status - Status null "),
    T54("Test Invalid Update Status - Status dan note null"),
    T55("Test Cancel Update Status"),
    T56("Download data aktif"),

    //Scenario Approve RRF Data Pengajuan
    T57("View Halaman Approve RRF"),
    T58("View from data pengajuan"),
    T59("Search by Client Name"),  //Valid Keyword
    T60("Search by Project Name"),
    T61("Search by Position Name"),
    T62("Search by Placement Name"),
    T63("Search by Kontrak Name"),
    T64("Search by Kontrak Name"),
    T65("Search by Kontrak Name"),
    T66("Search by Kontrak Name"),
    T67("Input Invalid Keyword TOPAN33"), //Invalid Keyword
    T68("Input Invalid Keyword a@#$R23"),
    T69("Refresh from data pengajuan"),
    T70("Approve from data pengajuan IT"),
    T71("Cancel Approve from data pengajuan IT"),
    T72("Approve from data pengajuan NON IT"),
    T73("Cancel Approve from data pengajuan NON IT"),
    T74("Return from data pengajuan"),
    T75("Cancel Return from data pengajuan"),
    T76("Pilih value show entries"),

    //Scenario Approve RRF Data Aktif
    T77("View Halaman Data Aktif"),
    T78("Pilih value show entries Data Aktif"),
    T79("Search by Client Name"),  //Valid Keyword
    T80("Search by Project Name"),
    T81("Search by Position Name"),
    T82("Search by Placement Name"),
    T83("Search by Kontrak Name"),
    T84("Search by Kontrak Name"),
    T85("Search by Kontrak Name"),
    T86("Search by Kontrak Name"),
    T87("Input Invalid Keyword TOPAN33"), //Invalid Keyword
    T88("Input Invalid Keyword a@#$R23"),
    T89("Refresh from Data Aktif"),
    T90("View Data Aktif"),
    T91("Download Data"),
    T92("Logout"),

    //Test Scenario Modul Recruitment Request - Data Pengajuan
    T93(""),
    T94(""),
    T95(""),
    T96(""),
    T97(""),
    T98(""),
    T99(""),
    T100("");

    private String testCaseName;

    TestScenarios(String value) {
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
