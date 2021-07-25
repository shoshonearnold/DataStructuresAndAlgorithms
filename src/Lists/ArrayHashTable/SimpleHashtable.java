package Lists.ArrayHashTable;

public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    private int hashValue(String key) {
        return key.length() % hashtable.length;
    }

    public void put(Employee employee, String key) {
        int hashedKey = hashValue(key);
        if (hashtable[hashedKey] != null) {
            System.out.println("Sorry, there is already a value at index" + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }

    }

    public Employee get(String key) {
        int hashedKey = hashValue(key);
        return hashtable[hashedKey];
    }


}
