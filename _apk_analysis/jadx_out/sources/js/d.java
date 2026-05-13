package js;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: DatagramIOImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class d implements ls.c<c> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Logger f72590g = Logger.getLogger(ls.c.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f72591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public is.a f72592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ls.d f72593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InetSocketAddress f72594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MulticastSocket f72595f;

    public d(c cVar) {
        this.f72591b = cVar;
    }

    public c a() {
        return this.f72591b;
    }

    public synchronized void b(DatagramPacket datagramPacket) {
        if (f72590g.isLoggable(Level.FINE)) {
            f72590g.fine("Sending message from address: " + this.f72594e);
        }
        try {
            this.f72595f.send(datagramPacket);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (SocketException unused) {
            f72590g.fine("Socket closed, aborting datagram send to: " + datagramPacket.getAddress());
        } catch (Exception e11) {
            f72590g.log(Level.SEVERE, "Exception sending datagram to: " + datagramPacket.getAddress() + ": " + e11, (Throwable) e11);
        }
    }

    @Override // ls.c
    public synchronized void e(org.fourthline.cling.model.message.a aVar) {
        Logger logger = f72590g;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            f72590g.fine("Sending message from address: " + this.f72594e);
        }
        DatagramPacket datagramPacketA = this.f72593d.a(aVar);
        if (f72590g.isLoggable(level)) {
            f72590g.fine("Sending UDP datagram packet to: " + aVar.u() + StringUtils.PROCESS_POSTFIX_DELIMITER + aVar.v());
        }
        b(datagramPacketA);
    }

    @Override // ls.c
    public synchronized void o(InetAddress inetAddress, is.a aVar, ls.d dVar) throws InitializationException {
        this.f72592c = aVar;
        this.f72593d = dVar;
        try {
            f72590g.info("Creating bound socket (for datagram input/output) on: " + inetAddress);
            this.f72594e = new InetSocketAddress(inetAddress, 0);
            MulticastSocket multicastSocket = new MulticastSocket(this.f72594e);
            this.f72595f = multicastSocket;
            multicastSocket.setTimeToLive(this.f72591b.b());
            this.f72595f.setReceiveBufferSize(262144);
        } catch (Exception e10) {
            throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        f72590g.fine("Entering blocking receiving loop, listening for UDP datagrams on: " + this.f72595f.getLocalAddress());
        while (true) {
            try {
                int iA = a().a();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[iA], iA);
                this.f72595f.receive(datagramPacket);
                f72590g.fine("UDP datagram received from: " + datagramPacket.getAddress().getHostAddress() + StringUtils.PROCESS_POSTFIX_DELIMITER + datagramPacket.getPort() + " on: " + this.f72594e);
                this.f72592c.g(this.f72593d.b(this.f72594e.getAddress(), datagramPacket));
            } catch (SocketException unused) {
                f72590g.fine("Socket closed");
                try {
                    if (this.f72595f.isClosed()) {
                        return;
                    }
                    f72590g.fine("Closing unicast socket");
                    this.f72595f.close();
                    return;
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (UnsupportedDataException e11) {
                f72590g.info("Could not read datagram: " + e11.getMessage());
            } catch (Exception e12) {
                throw new RuntimeException(e12);
            }
        }
    }

    @Override // ls.c
    public synchronized void stop() {
        MulticastSocket multicastSocket = this.f72595f;
        if (multicastSocket != null && !multicastSocket.isClosed()) {
            this.f72595f.close();
        }
    }
}
