package yads;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public final class wl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f96434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f96435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s51 f96436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f96437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f96438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f96439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p51 f96440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f96441h;

    public wl1(vl1 vl1Var) {
        ni.b((vl1Var.f96131f && vl1Var.f96127b == null) ? false : true);
        this.f96434a = (UUID) ni.a(vl1Var.f96126a);
        this.f96435b = vl1Var.f96127b;
        this.f96436c = vl1Var.f96128c;
        this.f96437d = vl1Var.f96129d;
        this.f96439f = vl1Var.f96131f;
        this.f96438e = vl1Var.f96130e;
        this.f96440g = vl1Var.f96132g;
        byte[] bArr = vl1Var.f96133h;
        this.f96441h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final byte[] a() {
        byte[] bArr = this.f96441h;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl1)) {
            return false;
        }
        wl1 wl1Var = (wl1) obj;
        return this.f96434a.equals(wl1Var.f96434a) && ib3.a(this.f96435b, wl1Var.f96435b) && ib3.a(this.f96436c, wl1Var.f96436c) && this.f96437d == wl1Var.f96437d && this.f96439f == wl1Var.f96439f && this.f96438e == wl1Var.f96438e && this.f96440g.equals(wl1Var.f96440g) && Arrays.equals(this.f96441h, wl1Var.f96441h);
    }

    public final int hashCode() {
        int iHashCode = this.f96434a.hashCode() * 31;
        Uri uri = this.f96435b;
        return Arrays.hashCode(this.f96441h) + ((this.f96440g.hashCode() + ((((((((ly2.a(this.f96436c.entrySet()) + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f96437d ? 1 : 0)) * 31) + (this.f96439f ? 1 : 0)) * 31) + (this.f96438e ? 1 : 0)) * 31)) * 31);
    }
}
