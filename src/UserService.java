
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users = new ArrayList<>();

    //create ekle
    public void createUser(User user){
        users.add(user);
        System.out.println("Kullanıcı eklendi: " + user);
    }

    //Read
    public void readUsers(){
        System.out.println("Kullanıcı Listesi: ");
        for(User u : users){
            System.out.println(u);
        }
    }

    //update
    public void updateUser(int id , String newName , String newEmail){
        for(User u : users){
            if(u.getId() == id){
                u.setName(newName);
                u.setEmail(newEmail);
                System.out.println("Kullanıcı guncellendi: " + u);
                return;
            }
        }
        System.out.println("Kullanıcı bulunamadı (id: " + id + ")");
    }

     // ✅ Delete (Sil)
    public void deleteUser(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                users.remove(u);
                System.out.println("Kullanıcı silindi: " + u);
                return;
            }
        }
        System.out.println("Kullanıcı bulunamadı (id: " + id + ")");
    }
}
