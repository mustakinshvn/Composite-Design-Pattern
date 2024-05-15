public class File implements FileSystemComponent{
    private int s;

    public File(int s) {
        this.s = s;
    }
    @Override
    public int fs() {
        return s;
    }

}
