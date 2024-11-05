package Easy_level;
 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Ex8 {
    public boolean hasCycle(ListNode head) {
        if (head.next == null) return false;
        int flag = head.val;

        while (head.next != null){
            flag++;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
