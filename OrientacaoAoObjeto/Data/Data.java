package OrientacaoAoObjeto.Data;

import javax.swing.JOptionPane;

public class Data {
    
    private int day;
    private int month;
    private int year;
    private boolean valid = false;
    private static int YEAR_MIN = 1900, YEAR_MAX = 2100;

    //constructor
    public Data(int day, int month, int year, boolean valid) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.valid = valid;
    }

    // subrotinas membro

    public void validate(){
        valid = ((day >= 1 && day <= lastDayMonth()) &&
                   (month >= 1 && month <= 12) &&
                   (year >= YEAR_MIN && year <= YEAR_MAX));
    }

    public int lastDayMonth(){
        if (month == 2)
            return isLeapYear() ? 29 : 28;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        return 31;
    }

    public boolean isLeapYear(){
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public void printDate(int day, int month, int year){
        String dataFormat = String.format("%02d/%02d/%d", day, month, year);
        JOptionPane.showMessageDialog(null, dataFormat);
    }

    // setter e getters das variaveis
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int mouth) {
        this.month = mouth;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    // exibição de dados
    @Override
    public String toString(){
        return "Data: " + day + "/"+ month + "/" + year;
    }
}
