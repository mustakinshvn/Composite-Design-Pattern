public class Client {
    public static void main(String[] args) {

        Directory dir1 = new Directory();
        Directory Root = new Directory();


        File file1 = new File(10);
        File file2 = new File(20);
        File file3 = new File(30);


        Root.add(dir1);
        Root.add(file1);
        Root.add(file2);
        dir1.add(file3);

        System.out.println(Root.fs());

    }
}
