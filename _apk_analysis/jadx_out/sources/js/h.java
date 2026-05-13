package js;

import java.net.InetAddress;

/* JADX INFO: compiled from: MulticastReceiverConfigurationImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InetAddress f72600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72602c;

    public h(InetAddress inetAddress, int i10) {
        this(inetAddress, i10, 640);
    }

    public h(InetAddress inetAddress, int i10, int i11) {
        this.f72600a = inetAddress;
        this.f72601b = i10;
        this.f72602c = i11;
    }

    public InetAddress a() {
        return this.f72600a;
    }

    public int b() {
        return this.f72602c;
    }

    public int c() {
        return this.f72601b;
    }
}
