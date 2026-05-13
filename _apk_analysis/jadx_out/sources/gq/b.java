package gq;

import java.io.UnsupportedEncodingException;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;

/* JADX INFO: compiled from: EncodedHttpURI.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f62773q;

    public b(String str) {
        this.f62773q = str;
    }

    @Override // gq.n
    public void b(MultiMap multiMap) {
        int i10 = this.f62889k;
        if (i10 == this.f62890l) {
            return;
        }
        UrlEncoded.decodeTo(sq.o.h(this.f62880b, i10 + 1, (r1 - i10) - 1, this.f62773q), multiMap, this.f62773q);
    }

    @Override // gq.n
    public void c(MultiMap multiMap, String str) throws UnsupportedEncodingException {
        int i10 = this.f62889k;
        if (i10 == this.f62890l) {
            return;
        }
        if (str == null) {
            str = this.f62773q;
        }
        UrlEncoded.decodeTo(sq.o.h(this.f62880b, i10 + 1, (r1 - i10) - 1, str), multiMap, str);
    }

    @Override // gq.n
    public String d() {
        int i10 = this.f62887i;
        int i11 = this.f62891m;
        if (i10 == i11) {
            return null;
        }
        return sq.o.h(this.f62880b, i10, i11 - i10, this.f62773q);
    }

    @Override // gq.n
    public String e() {
        int i10 = this.f62887i;
        int i11 = this.f62888j;
        if (i10 == i11) {
            return null;
        }
        return sq.q.e(this.f62880b, i10, i11 - i10);
    }

    @Override // gq.n
    public String g() {
        int i10 = this.f62884f;
        int i11 = this.f62885g;
        if (i10 == i11) {
            return null;
        }
        return sq.o.h(this.f62880b, i10, i11 - i10, this.f62773q);
    }

    @Override // gq.n
    public String h() {
        int i10 = this.f62887i;
        int i11 = this.f62888j;
        if (i10 == i11) {
            return null;
        }
        return sq.o.h(this.f62880b, i10, i11 - i10, this.f62773q);
    }

    @Override // gq.n
    public String i() {
        int i10 = this.f62887i;
        int i11 = this.f62889k;
        if (i10 == i11) {
            return null;
        }
        return sq.o.h(this.f62880b, i10, i11 - i10, this.f62773q);
    }

    @Override // gq.n
    public int j() {
        int i10 = this.f62885g;
        if (i10 == this.f62887i) {
            return -1;
        }
        return sq.p.f(this.f62880b, i10 + 1, (r1 - i10) - 1, 10);
    }

    @Override // gq.n
    public String k() {
        int i10 = this.f62889k;
        if (i10 == this.f62890l) {
            return null;
        }
        return sq.o.h(this.f62880b, i10 + 1, (r1 - i10) - 1, this.f62773q);
    }

    @Override // gq.n
    public String m() {
        int i10 = this.f62882d;
        int i11 = this.f62883e;
        if (i10 == i11) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 == 5) {
            byte[] bArr = this.f62880b;
            if (bArr[i10] == 104 && bArr[i10 + 1] == 116 && bArr[i10 + 2] == 116 && bArr[i10 + 3] == 112) {
                return "http";
            }
        }
        if (i12 == 6) {
            byte[] bArr2 = this.f62880b;
            if (bArr2[i10] == 104 && bArr2[i10 + 1] == 116 && bArr2[i10 + 2] == 116 && bArr2[i10 + 3] == 112 && bArr2[i10 + 4] == 115) {
                return "https";
            }
        }
        return sq.o.h(this.f62880b, i10, (i11 - i10) - 1, this.f62773q);
    }

    @Override // gq.n
    public boolean n() {
        return this.f62890l > this.f62889k;
    }

    @Override // gq.n
    public String toString() {
        if (this.f62881c == null) {
            byte[] bArr = this.f62880b;
            int i10 = this.f62882d;
            this.f62881c = sq.o.h(bArr, i10, this.f62891m - i10, this.f62773q);
        }
        return this.f62881c;
    }
}
