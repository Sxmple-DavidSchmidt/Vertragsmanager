package com.simple.datastructures;

import java.util.Date;

public class DataManager {
    private static Company[] companies;
    private static Contract[] contracts;
    private static CompanyContact[] contacts;

    private static void init() {
        if (companies == null) {
            companies = new Company[] {
                    new Company(0,"AlphaTech Solutions", "123 Innovation Way"),
                    new Company(1,"BetaWare Systems", "456 Beta Blvd"),
                    new Company(2,"Gamma Innovations", "789 Gamma Drive"),
                    new Company(3,"Delta Dynamics", "101 Delta Road"),
                    new Company(4,"Epsilon Enterprises", "202 Epsilon Ave"),
                    new Company(5,"ZetaSoft", "303 Zeta Street"),
                    new Company(6,"EtaEnergy", "404 Eta Highway"),
                    new Company(7,"Theta Technologies", "505 Theta Terrace"),
                    new Company(8,"Iota Industries", "606 Iota Lane"),
                    new Company(9,"Kappa Komputers", "707 Kappa Court"),
                    new Company(10,"Lambda Logistics", "808 Lambda Park"),
                    new Company(11,"Mu Manufacturing", "909 Mu Place"),
                    new Company(12,"Nu Networks", "1010 Nu Boulevard"),
                    new Company(13,"Xi Xpress", "1111 Xi Expressway"),
                    new Company(14,"Omicron Operations", "1212 Omicron Circle"),
                    new Company(15,"Pi Productions", "1313 Pi Plaza"),
                    new Company(16,"Rho Resources", "1414 Rho Road"),
                    new Company(17,"Sigma Services", "1515 Sigma Street"),
                    new Company(18,"Tau Tech", "1616 Tau Trail"),
                    new Company(19,"Upsilon Utilities", "1717 Upsilon Avenue")
            };
        }

        if (contracts == null) {
            contacts = new CompanyContact[]{
                    new CompanyContact(0, companies[0], "John Dough", "+49 187 123 456", "john.dough@gmail.com", ""),
                    new CompanyContact(1, companies[1], "Ben Dover", "+52 112", "ben.dover@gmx.com", "Likes to be called Benny"),
                    new CompanyContact(2, companies[2], "Alice Wonderland", "+1 987 654 321", "alice.wonderland@example.com", "Loves tea parties"),
                    new CompanyContact(3, companies[3], "Bob Builder", "+1 234 567 890", "bob.builder@example.com", "Can fix anything"),
                    new CompanyContact(4, companies[4], "Eva Green", "+1 345 678 901", "eva.green@example.com", "Passionate about the environment"),
                    new CompanyContact(5, companies[0], "Michael Smith", "+49 876 543 210", "michael.smith@example.com", "Enjoys coding"),
                    new CompanyContact(6, companies[1], "Emily Rose", "+52 345", "emily.rose@example.com", "Loves gardening"),
                    new CompanyContact(7, companies[2], "David Jones", "+1 543 210 987", "david.jones@example.com", "Avid traveler"),
                    new CompanyContact(8, companies[3], "Sarah Johnson", "+1 432 109 876", "sarah.johnson@example.com", "Passionate cook"),
                    new CompanyContact(9, companies[4], "Alex White", "+1 321 098 765", "alex.white@example.com", "Sports enthusiast")
            };
        }

        if (contracts == null) {
            contracts = new Contract[] {
                    new Contract(0, "Sanitary Services", contacts[0], new Date(1945, 10, 10), new Date(1955, 5, 23), 100_000_000, null, ContractState.ARCHIVED, "CONTENT!"),
                    new Contract(1, "Supply management", contacts[1], new Date(2015, 3, 1), new Date(2024, 10, 24), 250_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(2, "Software Development", contacts[2], new Date(2020, 6, 15), new Date(2023, 6, 15), 500_000, null, ContractState.PENDING, "CONTENT!"),
                    new Contract(3, "Consulting Services", contacts[3], new Date(2018, 8, 20), new Date(2025, 8, 20), 150_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(4, "Security Systems", contacts[4], new Date(2019, 2, 10), new Date(2022, 2, 10), 300_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(5, "Marketing Campaign", contacts[0], new Date(2023, 1, 1), new Date(2024, 12, 31), 200_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(6, "Event Management", contacts[1], new Date(2022, 4, 15), new Date(2023, 4, 15), 350_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(7, "Product Design", contacts[2], new Date(2023, 8, 1), new Date(2025, 8, 1), 450_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(8, "Legal Services", contacts[3], new Date(2024, 3, 10), new Date(2026, 3, 10), 300_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(9, "Transportation Logistics", contacts[4], new Date(2023, 6, 20), new Date(2024, 6, 20), 280_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(10, "Human Resources Training", contacts[0], new Date(2021, 9, 5), new Date(2023, 9, 5), 150_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(11, "Healthcare Services", contacts[1], new Date(2017, 7, 10), new Date(2025, 7, 10), 400_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(12, "IT Support", contacts[2], new Date(2022, 5, 12), new Date(2023, 5, 12), 180_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(13, "Financial Consulting", contacts[3], new Date(2023, 4, 1), new Date(2026, 4, 1), 320_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(14, "Construction Management", contacts[4], new Date(2022, 2, 20), new Date(2024, 2, 20), 600_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(15, "Public Relations", contacts[0], new Date(2024, 1, 5), new Date(2026, 1, 5), 280_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(16, "Environmental Services", contacts[1], new Date(2019, 10, 15), new Date(2025, 10, 15), 420_000, null, ContractState.RUNNING, "CONTENT!"),
                    new Contract(17, "Educational Programs", contacts[2], new Date(2023, 3, 8), new Date(2025, 3, 8), 200_000, null, ContractState.PENDING, "CONTENT!"),
                    new Contract(18, "Retail Merchandising", contacts[3], new Date(2020, 12, 1), new Date(2022, 12, 1), 150_000, null, ContractState.ARCHIVED, "CONTENT!"),
                    new Contract(19, "Telecommunications Services", contacts[4], new Date(2021, 6, 30), new Date(2024, 6, 30), 350_000, null, ContractState.RUNNING, "CONTENT!")
            };
        }
    }

    public static Company[] getCompanies() {
        if (companies == null) init();
        return companies;
    }

    public static Contract[] getContracts() {
        if (contracts == null) init();
        return contracts;
    }

    public CompanyContact[] getCompanyContacts() {
        if (contacts == null) init();
        return contacts;
    }
}
