package label;

import java.util.Date;

public class User {
    private int id;
    private String tureName;
    private String userName;
    private String password;
    private String sex;
    private String dentityCode;
    private Date birthday;
    private String email;
    private String mobile;
    private String address;
    private int status = 1;//状态 1：用户 2：管理员
    public User(){

    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String userName, String password, String sex, String dentityCode, Date birthday, String email, String mobile, String address) {
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.dentityCode = dentityCode;
        this.birthday = birthday;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public User(int id, String trueName, String userName, String password, String sex, String dentityCode, Date birthday, String email, String mobile, String address, int status) {
        this.id = id;
        this.tureName = trueName;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.dentityCode = dentityCode;
        this.birthday = birthday;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTureName() {
        return tureName;
    }

    public void setTureName(String tureName) {
        this.tureName = tureName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDentityCode() {
        return dentityCode;
    }

    public void setDentityCode(String dentityCode) {
        this.dentityCode = dentityCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
