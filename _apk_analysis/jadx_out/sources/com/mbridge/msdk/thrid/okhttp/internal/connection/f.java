package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: RouteSelector.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.a f40363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f40364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f40365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f40366d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40368f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<Proxy> f40367e = Collections.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f40369g = Collections.emptyList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<c0> f40370h = new ArrayList();

    /* JADX INFO: compiled from: RouteSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c0> f40371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40372b = 0;

        public a(List<c0> list) {
            this.f40371a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.f40371a);
        }

        public boolean b() {
            return this.f40372b < this.f40371a.size();
        }

        public c0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<c0> list = this.f40371a;
            int i10 = this.f40372b;
            this.f40372b = i10 + 1;
            return list.get(i10);
        }
    }

    public f(com.mbridge.msdk.thrid.okhttp.a aVar, d dVar, com.mbridge.msdk.thrid.okhttp.d dVar2, o oVar) {
        this.f40363a = aVar;
        this.f40364b = dVar;
        this.f40365c = dVar2;
        this.f40366d = oVar;
        a(aVar.k(), aVar.f());
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private void a(s sVar, Proxy proxy) {
        if (proxy != null) {
            this.f40367e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f40363a.h().select(sVar.n());
            this.f40367e = (listSelect == null || listSelect.isEmpty()) ? com.mbridge.msdk.thrid.okhttp.internal.c.a(Proxy.NO_PROXY) : com.mbridge.msdk.thrid.okhttp.internal.c.a(listSelect);
        }
        this.f40368f = 0;
    }

    private void a(Proxy proxy) throws IOException {
        String strG;
        int iJ;
        this.f40369g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strG = this.f40363a.k().g();
            iJ = this.f40363a.k().j();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strG = a(inetSocketAddress);
            iJ = inetSocketAddress.getPort();
        }
        if (iJ < 1 || iJ > 65535) {
            throw new SocketException("No route to " + strG + StringUtils.PROCESS_POSTFIX_DELIMITER + iJ + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f40369g.add(InetSocketAddress.createUnresolved(strG, iJ));
            return;
        }
        this.f40366d.dnsStart(this.f40365c, strG);
        List<InetAddress> listA = this.f40363a.c().a(strG);
        if (listA.isEmpty()) {
            throw new UnknownHostException(this.f40363a.c() + " returned no addresses for " + strG);
        }
        this.f40366d.dnsEnd(this.f40365c, strG, listA);
        int size = listA.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f40369g.add(new InetSocketAddress(listA.get(i10), iJ));
        }
    }

    private boolean b() {
        return this.f40368f < this.f40367e.size();
    }

    private Proxy d() throws IOException {
        if (b()) {
            List<Proxy> list = this.f40367e;
            int i10 = this.f40368f;
            this.f40368f = i10 + 1;
            Proxy proxy = list.get(i10);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f40363a.k().g() + "; exhausted proxy configurations: " + this.f40367e);
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.f40363a.h() != null) {
            this.f40363a.h().connectFailed(this.f40363a.k().n(), c0Var.b().address(), iOException);
        }
        this.f40364b.b(c0Var);
    }

    public boolean a() {
        return b() || !this.f40370h.isEmpty();
    }

    public a c() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            int size = this.f40369g.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = new c0(this.f40363a, proxyD, this.f40369g.get(i10));
                if (this.f40364b.c(c0Var)) {
                    this.f40370h.add(c0Var);
                } else {
                    arrayList.add(c0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f40370h);
            this.f40370h.clear();
        }
        return new a(arrayList);
    }
}
