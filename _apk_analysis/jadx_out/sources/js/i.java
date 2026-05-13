package js;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.DatagramPacket;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: MulticastReceiverImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class i implements ls.f<h> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Logger f72603i = Logger.getLogger(ls.f.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f72604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public is.a f72605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ls.g f72606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ls.d f72607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NetworkInterface f72608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InetSocketAddress f72609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MulticastSocket f72610h;

    public i(h hVar) {
        this.f72604b = hVar;
    }

    public h a() {
        return this.f72604b;
    }

    @Override // ls.f
    public synchronized void f0(NetworkInterface networkInterface, is.a aVar, ls.g gVar, ls.d dVar) throws InitializationException {
        this.f72605c = aVar;
        this.f72606d = gVar;
        this.f72607e = dVar;
        this.f72608f = networkInterface;
        try {
            f72603i.info("Creating wildcard socket (for receiving multicast datagrams) on port: " + this.f72604b.c());
            this.f72609g = new InetSocketAddress(this.f72604b.a(), this.f72604b.c());
            MulticastSocket multicastSocket = new MulticastSocket(this.f72604b.c());
            this.f72610h = multicastSocket;
            multicastSocket.setReuseAddress(true);
            this.f72610h.setReceiveBufferSize(32768);
            f72603i.info("Joining multicast group: " + this.f72609g + " on network interface: " + this.f72608f.getDisplayName());
            this.f72610h.joinGroup(this.f72609g, this.f72608f);
        } catch (Exception e10) {
            throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        f72603i.fine("Entering blocking receiving loop, listening for UDP datagrams on: " + this.f72610h.getLocalAddress());
        while (true) {
            try {
                int iB = a().b();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[iB], iB);
                this.f72610h.receive(datagramPacket);
                InetAddress inetAddressB = this.f72606d.b(this.f72608f, this.f72609g.getAddress() instanceof Inet6Address, datagramPacket.getAddress());
                f72603i.fine("UDP datagram received from: " + datagramPacket.getAddress().getHostAddress() + StringUtils.PROCESS_POSTFIX_DELIMITER + datagramPacket.getPort() + " on local interface: " + this.f72608f.getDisplayName() + " and address: " + inetAddressB.getHostAddress());
                this.f72605c.g(this.f72607e.b(inetAddressB, datagramPacket));
            } catch (SocketException unused) {
                f72603i.fine("Socket closed");
                try {
                    if (this.f72610h.isClosed()) {
                        return;
                    }
                    f72603i.fine("Closing multicast socket");
                    this.f72610h.close();
                    return;
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (UnsupportedDataException e11) {
                f72603i.info("Could not read datagram: " + e11.getMessage());
            } catch (Exception e12) {
                throw new RuntimeException(e12);
            }
        }
    }

    @Override // ls.f
    public synchronized void stop() {
        MulticastSocket multicastSocket = this.f72610h;
        if (multicastSocket != null && !multicastSocket.isClosed()) {
            try {
                f72603i.fine("Leaving multicast group");
                this.f72610h.leaveGroup(this.f72609g, this.f72608f);
            } catch (Exception e10) {
                f72603i.fine("Could not leave multicast group: " + e10);
            }
            this.f72610h.close();
        }
    }
}
