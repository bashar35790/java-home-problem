public class ConstractorOverlodingTest {
    public static void main(String[] args){
        ConstractorOverloding teacher1 = new ConstractorOverloding();
        teacher1.getInfo();
        ConstractorOverloding teacher2 = new ConstractorOverloding("John", "Male");
        teacher2.getInfo();
        ConstractorOverloding teacher3 = new ConstractorOverloding("Jane", "Female", 987654321);
        teacher3.getInfo();
    }
}