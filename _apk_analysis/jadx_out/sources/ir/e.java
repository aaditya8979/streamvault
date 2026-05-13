package ir;

import java.net.InetAddress;
import java.net.URL;

/* JADX INFO: compiled from: Location.java */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f71770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f71772c;

    public e(h hVar, String str) {
        this.f71770a = hVar;
        this.f71771b = str;
        this.f71772c = a(hVar.a(), hVar.c(), str);
    }

    public static URL a(InetAddress inetAddress, int i10, String str) {
        try {
            return new URL("http", inetAddress.getHostAddress(), i10, str);
        } catch (Exception e10) {
            throw new IllegalArgumentException("Address, port, and URI can not be converted to URL", e10);
        }
    }

    public h b() {
        return this.f71770a;
    }

    public URL c() {
        return this.f71772c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f71770a.equals(eVar.f71770a) && this.f71771b.equals(eVar.f71771b);
    }

    public int hashCode() {
        return (this.f71770a.hashCode() * 31) + this.f71771b.hashCode();
    }
}
