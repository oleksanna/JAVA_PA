import java.util.*;

public class PhoneBook {
    private HashMap<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String fullName, String phoneNumber) {
        if (phoneBook.containsKey(fullName)) {
            phoneBook.get(fullName).add(phoneNumber);
        } else {
            Set<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(fullName, phoneNumbers);
        }
    }

    public void printPhoneBook() {
        List<Map.Entry<String, Set<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        for (Map.Entry<String, Set<String>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}