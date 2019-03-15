package nio;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

public class SelectSocket {

    public static final int PORT = 1234;

    public static void main(String[] args) {
        int q = 3 << 3;
        System.out.println(q);
    }

    private static void start() throws IOException {
        //打开选择器
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ServerSocket serverSocket = serverSocketChannel.socket();

        serverSocket.bind(new InetSocketAddress(PORT));
        serverSocketChannel.configureBlocking(Boolean.FALSE);
        //将channel注册到选择器seletor上
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (Boolean.TRUE) {
            Iterator<SelectionKey> keys = selector.keys().iterator();
            while (keys.hasNext()) {
                SelectionKey key = keys.next();
                if (key.isAcceptable()) {
                    ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                    registerChannel(selector,channel,SelectionKey.OP_ACCEPT);
                    SocketChannel sc=channel.accept();
                    sayHello(sc);
                }
                if(key.isReadable()){

                }
                keys.remove();
            }
        }
    }

    private static void readDataFromSocket(ServerSocketChannel channel){
        channel
    }

    private static void registerChannel(Selector selector, SelectableChannel channel, int ops) throws IOException {
        if(channel==null){
            return;
        }
        channel.configureBlocking(Boolean.FALSE);
        //channel注册到选择器
        channel.register(selector,ops);
    }

    private static ByteBuffer byteBuffer=ByteBuffer.allocate(1024);

    private static void sayHello(SocketChannel channel) throws IOException {
        byteBuffer.clear();
        byteBuffer.put("Hi there!\r\n".getBytes());
        byteBuffer.flip();
        channel.write(byteBuffer);
    }
}
