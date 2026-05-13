package ir;

import java.net.InetAddress;
import java.util.Arrays;

/* JADX INFO: compiled from: NetworkAddress.java */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InetAddress f71778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f71779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f71780c;

    public h(InetAddress inetAddress, int i10, byte[] bArr) {
        this.f71778a = inetAddress;
        this.f71779b = i10;
        this.f71780c = bArr;
    }

    public InetAddress a() {
        return this.f71778a;
    }

    public byte[] b() {
        return this.f71780c;
    }

    public int c() {
        return this.f71779b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f71779b == hVar.f71779b && this.f71778a.equals(hVar.f71778a) && Arrays.equals(this.f71780c, hVar.f71780c);
    }

    public int hashCode() {
        int iHashCode = ((this.f71778a.hashCode() * 31) + this.f71779b) * 31;
        byte[] bArr = this.f71780c;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
