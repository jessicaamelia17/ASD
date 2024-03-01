public class Admin {
    String nama;
    String password;

    public Admin(String nama2, String password2) {
        nama= nama2;
        password=password2;
    }
   
    public void login(String username, String password){
        if (this.nama.equals(username) && this.password.equals(password)) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
    }
   
}

