package nio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class NioTest1 {

    public static void main(String[] args) throws IOException {
        Selector selector=Selector.open();
        new Thread().start();
        //new Thread(new ReactorTask()).start();
        ServerSocketChannel serverSocketChannel=ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        ServerSocket serverSocket=serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress(8888));
        serverSocketChannel.register(selector,SelectionKey.OP_ACCEPT);

    }
}
