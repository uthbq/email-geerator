import java.util.Scanner;

public class Email {
    private String firstName;
    // имя
    private String lastName;
    //фамилия
    private String password;
    // пароль
    private String alteremail;
    // альтернативная почта
    private int emailcapacity = 500;
    // ёмкость ящика
    private String department;
    //отдел компании
    private int defaultPasswordLength = 12;
    // длина пароля по умолчанию = 12
    private String email;
    //готовый email
    private String company = ".MorozInc.com";

    public Email(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.department=setDepartment();
        this.password=ranPassword(defaultPasswordLength);
        //System.out.println("Email created: "+this.firstName+" "+this.lastName);
        //System.out.println(this.department);
        //System.out.println(this.password);
        email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+company;
        System.out.println(email);
    }

    //получени информации об отделе сотрудника
    private String setDepartment(){
        System.out.println("Введите Ваш отдел: \n1) Продажи \n2) Бухгалтерия \n" +
                "3) Разработка\n4) Без отдела");
        Scanner scanner = new Scanner(System.in);
        int dep = scanner.nextInt();
        if (dep==1){
            return "sales";
        } else if (dep==2) {
            return "acc-ing";
        }else if (dep==3){
            return "dev";
        }else {
            return "";
        }
    }

    // получение рандомного пароля
    private String ranPassword(int length){
        String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&*!";

        char [] password= new char[length];
        for (int i = 0; i<length;i++){
            int rand = (int)(Math.random() * setPassword.length());
            password[i]=setPassword.charAt(rand);
        }
        return new String(password);
    }
    public void setCapacity(int capacity){
        this.emailcapacity=capacity;
    }
    public void setAlteremail(String altemail){
        this.alteremail = altemail;
    }
    public void changePassword(String password){
        this.password=password;
    }
    public int getEmailcapacity(){
        return emailcapacity;
    }

    public String getAlteremail() {
        return alteremail;
    }

    public String getPassword() {
        return password;
    }
}
