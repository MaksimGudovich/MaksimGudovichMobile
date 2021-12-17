package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.User;
import java.io.File;
import java.io.IOException;

public class UserDataReader {

    public static User getUserFromJson(String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = null;
        try {
            user = objectMapper.readValue(new File(path), User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
