package pkg;

import com.google.gson.Gson;

public class App {

  public static void main(String[] args) {


    UserSimple userObject = new UserSimple(
      "Bubba",
      "Bubba@BubbaRules.com",
      26,
      true
    );

    // Creat the JSON string
    Gson gson = new Gson();
    // Can also pass in a FileWriter that saves to a file
    String userJson = gson.toJson(userObject);


    // Make it into a new object
    // (can also take from a file by passing in a FileReader)
    UserSimple newObject = gson.fromJson(userJson, UserSimple.class);

  }

}
