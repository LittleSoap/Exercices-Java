public class List {

    private class Item{
        private int value;
        private Item next;

        public Item(int value, Item next) {
            this.value = value;
            this.next = next;
        }
    }

    private Item start;

    public void addItem(int value){
        Item item = new Item(value, null);
        start.next = item;
    }

    public void printList(){
        Item inter = start;
        while(inter != null){
            System.out.println(start.value);
            inter = inter.next;
        }
    }

}
