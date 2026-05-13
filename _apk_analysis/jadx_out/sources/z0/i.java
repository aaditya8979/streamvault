package z0;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: IgnoreHostProxySelector.java */
/* JADX INFO: loaded from: classes10.dex */
public class i extends ProxySelector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<Proxy> f98167d = Arrays.asList(Proxy.NO_PROXY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProxySelector f98168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98170c;

    public i(ProxySelector proxySelector, String str, int i10) {
        this.f98168a = (ProxySelector) k.c(proxySelector);
        this.f98169b = (String) k.c(str);
        this.f98170c = i10;
    }

    public static void a(String str, int i10) {
        ProxySelector.setDefault(new i(ProxySelector.getDefault(), str, i10));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f98168a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        return this.f98169b.equals(uri.getHost()) && this.f98170c == uri.getPort() ? f98167d : this.f98168a.select(uri);
    }
}
