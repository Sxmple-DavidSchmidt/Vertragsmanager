package com.simple.datastructures;

public class DataManager {
    private static Company[] companies;
    private static Contract[] contracts;

    public static Company[] getCompanies() {
        if (companies == null) {
            companies = new Company[] {
                    new Company("AlphaTech Solutions", "123 Innovation Way"),
                    new Company("BetaWare Systems", "456 Beta Blvd"),
                    new Company("Gamma Innovations", "789 Gamma Drive"),
                    new Company("Delta Dynamics", "101 Delta Road"),
                    new Company("Epsilon Enterprises", "202 Epsilon Ave"),
                    new Company("ZetaSoft", "303 Zeta Street"),
                    new Company("EtaEnergy", "404 Eta Highway"),
                    new Company("Theta Technologies", "505 Theta Terrace"),
                    new Company("Iota Industries", "606 Iota Lane"),
                    new Company("Kappa Komputers", "707 Kappa Court"),
                    new Company("Lambda Logistics", "808 Lambda Park"),
                    new Company("Mu Manufacturing", "909 Mu Place"),
                    new Company("Nu Networks", "1010 Nu Boulevard"),
                    new Company("Xi Xpress", "1111 Xi Expressway"),
                    new Company("Omicron Operations", "1212 Omicron Circle"),
                    new Company("Pi Productions", "1313 Pi Plaza"),
                    new Company("Rho Resources", "1414 Rho Road"),
                    new Company("Sigma Services", "1515 Sigma Street"),
                    new Company("Tau Tech", "1616 Tau Trail"),
                    new Company("Upsilon Utilities", "1717 Upsilon Avenue")
            };
        }

        return companies;
    }

    public static Contract[] getContracts(Company company) {
        if (contracts == null) {
            contracts = new Contract[] {
                    new Contract(companies[1], "Sanitary services", 50000),
                    new Contract(companies[2], "IT Infrastructure", 1000000),
                    new Contract(companies[3], "Logistics Management", 200000),
                    new Contract(companies[4], "Energy Supply", 150000),
                    new Contract(companies[5], "Software Development", 300000),
                    new Contract(companies[6], "Network Security", 400000),
                    new Contract(companies[7], "Renewable Energy Solutions", 250000),
                    new Contract(companies[8], "Tech Consulting", 350000),
                    new Contract(companies[9], "Industrial Equipment Supply", 450000),
                    new Contract(companies[10], "Transportation Services", 500000),
                    new Contract(companies[11], "Manufacturing Machinery", 600000),
                    new Contract(companies[12], "Telecommunications Infrastructure", 700000),
                    new Contract(companies[13], "Express Delivery Services", 800000),
            };
        }

        return contracts;
    }
}
