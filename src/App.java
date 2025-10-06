public class App {
    public static void main(String[] args) throws Exception {

        UserService service = new UserService();

        //  Create (Ekle)
        service.createUser(new User(1, "İrfan Can", "irfan@example.com"));
        service.createUser(new User(2, "Ahmet Kaya", "ahmet@example.com"));

        // Read (Listele)
        service.readUsers();

        //  Update (Güncelle)
        service.updateUser(1, "İrfan Y.", "irfan.y@example.com");

        //  Delete (Sil)
        service.deleteUser(2);

        //  Tekrar Listele
        service.readUsers();
    }
}
