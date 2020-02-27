public class Person {
    private String firstName;
    private String[] middleNames;
    private String userName; 
    
    public void SetfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void SetmiddleNames(String middleNames) {
        this.middleNames = middleNames.split(" ");
    }

    public void SetuserName(String userName) {
        this.userName = userName;
        if (userName.length()>10) {
            this.userName = userName.substring(0, 10);
        } else {
            this.userName = userName;
        }


    }

    public String GetfirstName() {
        return firstName;
    }

    public String GetmiddleNames() {
        StringBuffer sb = new StringBuffer();
       for (int i = 0; i < middleNames.length; i++) {
            sb.append(middleNames[i] + " ");
       }
       String middleNames = sb.toString();
        return middleNames;
    }

    public String GetuserName() {
        return userName;
    }


}
