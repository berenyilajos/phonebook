package hu.hugo.phonebook.service;

import java.util.HashMap;
import java.util.Map;

public class PhonebookService implements IPhonebookService {

    @Override
    public Map<String, String> data(String user) {
        HashMap<String, String> data = new HashMap<>();
        data.put("user", user);
        return data;
    }

}
