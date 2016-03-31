package stovall;

import java.util.*;

public class ListComprehension {
    public static void main(String[] args) {
        ArrayList<List<Object>> emp = new ArrayList<List<Object>>();
        List<Object> e1 = Arrays.asList("ID", "LAST_NAME", "FIRST_NAME","USERID","START_DATE","COMMENTS","TITLE","SALARY","COMMISSION","DEPT_ID","MANAGER_ID");
        List<Object> e2 = Arrays.asList(1, "Martin", "Carmen", "martincu", "1990-05-03 00:00:00", "", "President", 4500, "", 50, "");
        List<Object> e3 = Arrays.asList(10, "JACKSON", "MARTA", "JACKSOMT", "27-FEB-91", "", "WAREHOUSE MANAGER", 1507, 0, 45, 2);
        List<Object> e4 = Arrays.asList(11, "HENDERSON", "COLIN", "HENDERCS", "14-MAY-90", "", "SALES REPRESENTATIVE", 1400, 10, 31, 3);
        List<Object> e5 = Arrays.asList(12, "Gilson", "Sam", "gilsonsj", "1992-01-18 00:00:00", "", "Sales Representative", 1490, 12.5, 32, 3);
        List<Object> e6 = Arrays.asList(13, "Sanders", "Jason", "sanderjk", "1991-02-18 00:00:00", "", "Sales Representative", 1515, 10, 33, 3);
        List<Object> e7 = Arrays.asList(14, "Dameron", "Andre", "dameroap", "10-09-1991 00:00:00", "", "Sales Representative", 1450, 17.5, 35, 3);
        List<Object> e8 = Arrays.asList(15, "Hardwick", "Elaine", "hardwiem", "02-07-1992 00:00:00", "", "Stock Clerk", 1400, "", 41, 6);
        List<Object> e9 = Arrays.asList(16, "Brown", "George", "browngw", "03-08-1990 00:00:00", "", "Stock Clerk", 940, "", 41, 6);
        List<Object> e10 = Arrays.asList(17, "Washington", "Thomas", "washintl", "02-09-1991 00:00:00", "", "Stock Clerk", 1200, "", 42, 7);
        List<Object> e11 = Arrays.asList(18, "Patterson", "Donald", "patterdv", "08-06-1991 00:00:00", "", "Stock Clerk", 795, "", 42, 7);
        List<Object> e12 = Arrays.asList(19, "Bell", "Alexander", "bellag", "05-26-1991 00:00:00", "", "Stock Clerk", 850, "", 43, 8);
        List<Object> e13 = Arrays.asList(2, "Smith", "Doris", "smithdj", "03-08-1990 00:00:00", "", "VP, Operations", 2450, "", 41, 1);
        List<Object> e14 = Arrays.asList(20, "Gantos", "Eddie", "gantosej", "11-30-1990 00:00:00", "", "Stock Clerk", 800, "", 44, 9);
        List<Object> e15 = Arrays.asList(21, "Stephenson", "Blaine", "stephebs", "03-17-1991 00:00:00", "", "Stock Clerk", 860, "", 45, 10);
        List<Object> e16 = Arrays.asList(22, "Chester", "Eddie", "chesteek", "11-30-1990 00:00:00", "", "Stock Clerk", 800, "", 44, 9);
        List<Object> e17 = Arrays.asList(23, "Pearl", "Roger", "pearlrg", "10-17-1990 00:00:00", "", "Stock Clerk", 795, "", 34, 9);
        List<Object> e18 = Arrays.asList(24, "Dancer", "Bonnie", "dancerbw", "03-17-1991 00:00:00", "", "Stock Clerk", 860, "", 45, 7);
        List<Object> e19 = Arrays.asList(25, "Schmitt", "Sandra", "schmitss", "05-09-1991 00:00:00", "", "Stock Clerk", 1100, "", 45, 8);
        List<Object> e20 = Arrays.asList(3, "Norton", "Michael", "nortonma", "06-17-1991 00:00:00", "", "VP, Sales", 2400, "", 31, 1);
        List<Object> e21 = Arrays.asList(4, "Quentin", "Mark", "quentiml", "04-07-1990 00:00:00", "", "VP, Finance", 2450, "", 10, 1);
        List<Object> e22 = Arrays.asList(5, "Roper", "Joseph", "roperjm", "03-04-1990 00:00:00", "", "VP, Administration", 2550, "", 50, 1);
        List<Object> e23 = Arrays.asList(6, "Brown", "Molly", "brownmr", "01-18-1991 00:00:00", "", "Warehouse Manager", 1600, "", 41, 2);
        List<Object> e24 = Arrays.asList(7, "Hawkins", "Roberta", "hawkinrt", "05-14-1990 00:00:00", "", "Warehouse Manager", 1650, "", 42, 2);
        List<Object> e25 = Arrays.asList(8, "Burns", "Ben", "burnsba", "04-07-1990 00:00:00", "", "Warehouse Manager", 1500, "", 43, 2);
        List<Object> e26 = Arrays.asList(9, "Catskill", "Antoinette", "catskiaw", "02-09-1992 00:00:00", "", "Warehouse Manager", 1700, "", 44, 2);

        emp.add(e1); emp.add(e2); emp.add(e3); emp.add(e4); emp.add(e5); emp.add(e6); emp.add(e7); emp.add(e8);
        emp.add(e9); emp.add(e10); emp.add(e11); emp.add(e12); emp.add(e13); emp.add(e14); emp.add(e15); emp.add(e16);
        emp.add(e17); emp.add(e18); emp.add(e19); emp.add(e20); emp.add(e21); emp.add(e22); emp.add(e23); emp.add(e24);
        emp.add(e25); emp.add(e26);
        emp.stream()
                .filter(e -> {return e.get(7) >= 1000;})
                .forEach(e -> { System.out.println(e); });
    }
}
