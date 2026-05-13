package js;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.NoNetworkException;

/* JADX INFO: compiled from: NetworkAddressFactoryImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class j implements ls.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Logger f72611f = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f72612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f72613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<NetworkInterface> f72614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<InetAddress> f72615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72616e;

    /* JADX INFO: compiled from: NetworkAddressFactoryImpl.java */
    public class a extends os.b<NetworkInterface> {
        public a(Collection collection) {
            super(collection);
        }

        @Override // os.b
        public void a(int i10) {
            synchronized (j.this.f72614c) {
                j.this.f72614c.remove(i10);
            }
        }
    }

    /* JADX INFO: compiled from: NetworkAddressFactoryImpl.java */
    public class b extends os.b<InetAddress> {
        public b(Collection collection) {
            super(collection);
        }

        @Override // os.b
        public void a(int i10) {
            synchronized (j.this.f72615d) {
                j.this.f72615d.remove(i10);
            }
        }
    }

    public j() throws InitializationException {
        this(0);
    }

    public j(int i10) throws InitializationException {
        HashSet hashSet = new HashSet();
        this.f72612a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.f72613b = hashSet2;
        ArrayList arrayList = new ArrayList();
        this.f72614c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f72615d = arrayList2;
        System.setProperty("java.net.preferIPv4Stack", "true");
        String property = System.getProperty("org.fourthline.cling.network.useInterfaces");
        if (property != null) {
            hashSet.addAll(Arrays.asList(property.split(StringUtils.COMMA)));
        }
        String property2 = System.getProperty("org.fourthline.cling.network.useAddresses");
        if (property2 != null) {
            hashSet2.addAll(Arrays.asList(property2.split(StringUtils.COMMA)));
        }
        j();
        i();
        if (arrayList.size() == 0 || arrayList2.size() == 0) {
            f72611f.warning("No usable network interface or addresses found");
            if (q()) {
                throw new NoNetworkException("Could not discover any usable network interfaces and/or addresses");
            }
        }
        this.f72616e = i10;
    }

    @Override // ls.g
    public Iterator<InetAddress> a() {
        return new b(this.f72615d);
    }

    @Override // ls.g
    public InetAddress b(NetworkInterface networkInterface, boolean z10, InetAddress inetAddress) {
        InetAddress inetAddressK = k(inetAddress);
        if (inetAddressK != null) {
            return inetAddressK;
        }
        f72611f.finer("Could not find local bind address in same subnet as: " + inetAddress.getHostAddress());
        for (InetAddress inetAddress2 : l(networkInterface)) {
            if (z10 && (inetAddress2 instanceof Inet6Address)) {
                return inetAddress2;
            }
            if (!z10 && (inetAddress2 instanceof Inet4Address)) {
                return inetAddress2;
            }
        }
        throw new IllegalStateException("Can't find any IPv4 or IPv6 address on interface: " + networkInterface.getDisplayName());
    }

    @Override // ls.g
    public boolean c() {
        return this.f72614c.size() > 0 && this.f72615d.size() > 0;
    }

    @Override // ls.g
    public InetAddress d() {
        try {
            return InetAddress.getByName("239.255.255.250");
        } catch (UnknownHostException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // ls.g
    public int e() {
        return this.f72616e;
    }

    @Override // ls.g
    public Iterator<NetworkInterface> f() {
        return new a(this.f72614c);
    }

    @Override // ls.g
    public int g() {
        return 1900;
    }

    @Override // ls.g
    public byte[] h(InetAddress inetAddress) {
        try {
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(inetAddress);
            if (byInetAddress != null) {
                return byInetAddress.getHardwareAddress();
            }
            return null;
        } catch (Throwable th2) {
            f72611f.log(Level.WARNING, "Cannot get hardware address for: " + inetAddress, th2);
            return null;
        }
    }

    public void i() throws InitializationException {
        try {
            synchronized (this.f72614c) {
                Iterator<NetworkInterface> it = this.f72614c.iterator();
                while (it.hasNext()) {
                    NetworkInterface next = it.next();
                    f72611f.finer("Discovering addresses of interface: " + next.getDisplayName());
                    int i10 = 0;
                    for (InetAddress inetAddress : l(next)) {
                        if (inetAddress == null) {
                            f72611f.warning("Network has a null address: " + next.getDisplayName());
                        } else if (o(next, inetAddress)) {
                            f72611f.fine("Discovered usable network interface address: " + inetAddress.getHostAddress());
                            i10++;
                            synchronized (this.f72615d) {
                                this.f72615d.add(inetAddress);
                            }
                        } else {
                            f72611f.finer("Ignoring non-usable network interface address: " + inetAddress.getHostAddress());
                        }
                    }
                    if (i10 == 0) {
                        f72611f.finer("Network interface has no usable addresses, removing: " + next.getDisplayName());
                        it.remove();
                    }
                }
            }
        } catch (Exception e10) {
            throw new InitializationException("Could not not analyze local network interfaces: " + e10, e10);
        }
    }

    public void j() throws InitializationException {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                f72611f.finer("Analyzing network interface: " + networkInterface.getDisplayName());
                if (p(networkInterface)) {
                    f72611f.fine("Discovered usable network interface: " + networkInterface.getDisplayName());
                    synchronized (this.f72614c) {
                        this.f72614c.add(networkInterface);
                    }
                } else {
                    f72611f.finer("Ignoring non-usable network interface: " + networkInterface.getDisplayName());
                }
            }
        } catch (Exception e10) {
            throw new InitializationException("Could not not analyze local network interfaces: " + e10, e10);
        }
    }

    public InetAddress k(InetAddress inetAddress) {
        synchronized (this.f72614c) {
            Iterator<NetworkInterface> it = this.f72614c.iterator();
            while (it.hasNext()) {
                for (InterfaceAddress interfaceAddress : m(it.next())) {
                    synchronized (this.f72615d) {
                        if (interfaceAddress != null) {
                            if (this.f72615d.contains(interfaceAddress.getAddress())) {
                                if (n(inetAddress.getAddress(), interfaceAddress.getAddress().getAddress(), interfaceAddress.getNetworkPrefixLength())) {
                                    return interfaceAddress.getAddress();
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    public List<InetAddress> l(NetworkInterface networkInterface) {
        return Collections.list(networkInterface.getInetAddresses());
    }

    public List<InterfaceAddress> m(NetworkInterface networkInterface) {
        return networkInterface.getInterfaceAddresses();
    }

    public boolean n(byte[] bArr, byte[] bArr2, short s10) {
        if (bArr.length != bArr2.length || s10 / 8 > bArr.length) {
            return false;
        }
        int i10 = 0;
        while (s10 >= 8 && i10 < bArr.length) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
            s10 = (short) (s10 - 8);
        }
        if (i10 == bArr.length) {
            return true;
        }
        byte b10 = (byte) (~((1 << (8 - s10)) - 1));
        return (bArr[i10] & b10) == (bArr2[i10] & b10);
    }

    public boolean o(NetworkInterface networkInterface, InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet4Address)) {
            f72611f.finer("Skipping unsupported non-IPv4 address: " + inetAddress);
            return false;
        }
        if (inetAddress.isLoopbackAddress()) {
            f72611f.finer("Skipping loopback address: " + inetAddress);
            return false;
        }
        if (this.f72613b.size() <= 0 || this.f72613b.contains(inetAddress.getHostAddress())) {
            return true;
        }
        f72611f.finer("Skipping unwanted address: " + inetAddress);
        return false;
    }

    public boolean p(NetworkInterface networkInterface) throws Exception {
        if (!networkInterface.isUp()) {
            f72611f.finer("Skipping network interface (down): " + networkInterface.getDisplayName());
            return false;
        }
        if (l(networkInterface).size() == 0) {
            f72611f.finer("Skipping network interface without bound IP addresses: " + networkInterface.getDisplayName());
            return false;
        }
        String name = networkInterface.getName();
        Locale locale = Locale.ROOT;
        if (name.toLowerCase(locale).startsWith("vmnet") || (networkInterface.getDisplayName() != null && networkInterface.getDisplayName().toLowerCase(locale).contains("vmnet"))) {
            f72611f.finer("Skipping network interface (VMWare): " + networkInterface.getDisplayName());
            return false;
        }
        if (networkInterface.getName().toLowerCase(locale).startsWith("vnic")) {
            f72611f.finer("Skipping network interface (Parallels): " + networkInterface.getDisplayName());
            return false;
        }
        if (networkInterface.getName().toLowerCase(locale).startsWith("vboxnet")) {
            f72611f.finer("Skipping network interface (Virtual Box): " + networkInterface.getDisplayName());
            return false;
        }
        if (networkInterface.getName().toLowerCase(locale).contains("virtual")) {
            f72611f.finer("Skipping network interface (named '*virtual*'): " + networkInterface.getDisplayName());
            return false;
        }
        if (networkInterface.getName().toLowerCase(locale).startsWith("ppp")) {
            f72611f.finer("Skipping network interface (PPP): " + networkInterface.getDisplayName());
            return false;
        }
        if (networkInterface.isLoopback()) {
            f72611f.finer("Skipping network interface (ignoring loopback): " + networkInterface.getDisplayName());
            return false;
        }
        if (this.f72612a.size() > 0 && !this.f72612a.contains(networkInterface.getName())) {
            f72611f.finer("Skipping unwanted network interface (-Dorg.fourthline.cling.network.useInterfaces): " + networkInterface.getName());
            return false;
        }
        if (networkInterface.supportsMulticast()) {
            return true;
        }
        f72611f.warning("Network interface may not be multicast capable: " + networkInterface.getDisplayName());
        return true;
    }

    public boolean q() {
        return true;
    }
}
