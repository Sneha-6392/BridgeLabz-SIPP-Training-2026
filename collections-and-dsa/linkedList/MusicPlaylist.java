package linkedList;

class Node {
    String songName;
    Node next;
    Node(String songName) {
        this.songName = songName;
        this.next = null;
    }
}
public class MusicPlaylist {
    public static void insertAfter(Node currentSong, String newSong) {
        if (currentSong == null) {
            System.out.println("Current song not found.");
            return;
        }
        Node newSongNode = new Node(newSong);
        newSongNode.next = currentSong.next;
        currentSong.next = newSongNode;
    }
    public static void display(Node playlistHead) {
        Node current = playlistHead;
        while (current != null) {
            System.out.print(current.songName + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node playlistHead = new Node("Song A");
        playlistHead.next = new Node("Song B");
        playlistHead.next.next = new Node("Song D");
        System.out.println("Before Insertion:");
        display(playlistHead);
        insertAfter(playlistHead.next, "Song C");
        System.out.println("After Insertion:");
        display(playlistHead);
    }
}