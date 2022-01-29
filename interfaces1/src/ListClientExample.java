import java.util.ArrayList;
import java.util.List;

public class ListClientExample {

    private final List<Integer> list;

    public ListClientExample() {
        list = new ArrayList<>();
    }

    public ListClientExample(ListClientExample listClientExample) {
        this.list = listClientExample.list;
    }

    public List<Integer> getList() {
        return list;
    }

    @Override
    public boolean equals(Object obj) {
        ListClientExample listClientExample = (ListClientExample) obj;
        return list.equals(listClientExample.getList());
    }

    @Override
    public int hashCode() {
        return 31 * list.hashCode();
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List<Integer> list = lce.getList();
        System.out.println(list);

        System.out.println(new ListClientExample().equals(new ListClientExample(new ListClientExample())));
    }
}