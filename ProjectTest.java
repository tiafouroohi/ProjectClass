public class ProjectTest {
    public static void main(String[] args){
        Project one = new Project();

        
        one.setName("Tia");
        one.setDescription("Really Cool");
        String yourName = one.getName();
        String yourDescription = one.getDescription();

        System.out.println("First project- Name:" + yourName + ", Description: " + yourDescription);
        
    }
}