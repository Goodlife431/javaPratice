package Diary;
import java.util.ArrayList;
public class Diary {

        private boolean isLocked = true;
        private String password;
        private ArrayList<Workings> numberOfWorkings = new ArrayList<>();


        public Diary(String ownersName, String password){
            this.password = password;
        }
        public boolean isLocked() {

            return isLocked;
        }

        public void unlockWith(String password) {
            boolean checkPassword = password.equals(this.password);
            if (checkPassword) {
                isLocked = false;
            }
        }

        public void lock() {
            isLocked = true;
        }

        public void write(String title,String words) {
            if (!isLocked) {
                writeIntoDiary(title,words);
            }

        }
        private void writeIntoDiary(String title,String words){
            int id = getNumberOfHappenings() + 1;
            Workings happenings = new Workings(id, title, words);
            numberOfWorkings.add(happenings);
        }

        public int getNumberOfHappenings() {
            return numberOfWorkings.size();
        }


        public Workings findEntryWithId(int id) {
            for (Workings happenings : numberOfWorkings){
                if (happenings.getId() == id){
                    return happenings;
                }
            }
            return null;
        }

        public Workings updateEntry(int id, String title, String body) {
            for (Workings happenings : numberOfWorkings) {
                if (happenings.getId() == id) {
                    happenings.setTitle(title);
                    happenings.setWords(body);
                    happenings = new Workings(id, title, body);
                    numberOfWorkings.add(happenings);
                    return happenings;
                }
            }
            return null;
    }
//    public void deleteEntry(int id){
//            for (Workings workings : numberOfWorkings){
//                id = getNumberOfHappenings();
//                if(workings  id)
//            }
//    }
}
