package latihan2_modul3;

import java.util.LinkedList;
import java.util.Queue;
import javax.sound.sampled.SourceDataLine;

public class MainQueue {
    public void queueExample(){
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("Html");
        System.out.println("remove :" + queue.remove());
        System.out.println("element :" + queue.element());
        System.out.println("poll :" + queue.poll());
        System.out.println("peek :" + queue.peek());
    }

    public static void main(String[] args) {
        new MainQueue().queueExample();
    }
}