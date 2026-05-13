package qr;

import java.net.InetAddress;
import java.net.URL;
import ur.z;

/* JADX INFO: compiled from: RemoteDeviceIdentity.java */
/* JADX INFO: loaded from: classes3.dex */
public class j extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f78460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f78461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InetAddress f78462e;

    public j(nr.a aVar) {
        this(aVar.A(), aVar.z(), aVar.y(), aVar.x(), aVar.u());
    }

    public j(nr.c cVar) {
        this(cVar.A(), cVar.z(), cVar.y(), cVar.x(), cVar.u());
    }

    public j(z zVar, Integer num, URL url, byte[] bArr, InetAddress inetAddress) {
        super(zVar, num);
        this.f78460c = url;
        this.f78461d = bArr;
        this.f78462e = inetAddress;
    }

    public j(z zVar, j jVar) {
        this(zVar, jVar.a(), jVar.d(), jVar.f(), jVar.e());
    }

    public URL d() {
        return this.f78460c;
    }

    public InetAddress e() {
        return this.f78462e;
    }

    public byte[] f() {
        return this.f78461d;
    }

    @Override // qr.c
    public String toString() {
        if (ir.f.f71773a) {
            return "(RemoteDeviceIdentity) UDN: " + b() + ", Descriptor: " + d();
        }
        return "(" + getClass().getSimpleName() + ") UDN: " + b() + ", Descriptor: " + d();
    }
}
