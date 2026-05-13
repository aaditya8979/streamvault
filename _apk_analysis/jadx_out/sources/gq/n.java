package gq;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;
import sq.s;

/* JADX INFO: compiled from: HttpURI.java */
/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f62878p = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f62881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f62887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f62888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f62889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f62890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f62891m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f62879a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f62880b = f62878p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f62892n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f62893o = new s(64);

    public n() {
    }

    public n(String str) {
        this.f62881c = str;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            p(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    public n(URI uri) {
        o(uri.toASCIIString());
    }

    public void a() {
        this.f62891m = 0;
        this.f62890l = 0;
        this.f62889k = 0;
        this.f62888j = 0;
        this.f62887i = 0;
        this.f62885g = 0;
        this.f62884f = 0;
        this.f62883e = 0;
        this.f62882d = 0;
        this.f62880b = f62878p;
        this.f62881c = "";
        this.f62892n = false;
    }

    public void b(MultiMap multiMap) {
        if (this.f62889k == this.f62890l) {
            return;
        }
        this.f62893o.f();
        UrlEncoded.decodeUtf8To(this.f62880b, this.f62889k + 1, (this.f62890l - r1) - 1, multiMap, this.f62893o);
    }

    public void c(MultiMap multiMap, String str) throws UnsupportedEncodingException {
        if (this.f62889k == this.f62890l) {
            return;
        }
        if (str == null || sq.o.d(str)) {
            UrlEncoded.decodeUtf8To(this.f62880b, this.f62889k + 1, (this.f62890l - r0) - 1, multiMap);
        } else {
            UrlEncoded.decodeTo(sq.o.h(this.f62880b, this.f62889k + 1, (this.f62890l - r1) - 1, str), multiMap, str);
        }
    }

    public String d() {
        int i10 = this.f62887i;
        int i11 = this.f62891m;
        if (i10 == i11) {
            return null;
        }
        return s(i10, i11 - i10);
    }

    public String e() {
        int i10 = this.f62887i;
        int i11 = this.f62888j;
        if (i10 == i11) {
            return null;
        }
        int i12 = i11 - i10;
        boolean z10 = false;
        while (i10 < this.f62888j) {
            byte b10 = this.f62880b[i10];
            if (b10 == 37) {
                if (!z10) {
                    this.f62893o.f();
                    s sVar = this.f62893o;
                    byte[] bArr = this.f62880b;
                    int i13 = this.f62887i;
                    sVar.b(bArr, i13, i10 - i13);
                    z10 = true;
                }
                int i14 = i10 + 2;
                int i15 = this.f62888j;
                if (i14 >= i15) {
                    throw new IllegalArgumentException("Bad % encoding: " + this);
                }
                byte[] bArr2 = this.f62880b;
                int i16 = i10 + 1;
                if (bArr2[i16] == 117) {
                    i10 += 5;
                    if (i10 >= i15) {
                        throw new IllegalArgumentException("Bad %u encoding: " + this);
                    }
                    try {
                        this.f62893o.h().append(new String(Character.toChars(sq.p.f(bArr2, i14, 4, 16))));
                    } catch (Exception e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    this.f62893o.a((byte) (sq.p.f(bArr2, i16, 2, 16) & 255));
                    i10 = i14;
                }
            } else if (z10) {
                this.f62893o.a(b10);
            }
            i10++;
        }
        return !z10 ? s(this.f62887i, i12) : this.f62893o.toString();
    }

    public String f(String str) {
        int i10 = this.f62887i;
        int i11 = this.f62888j;
        byte[] bArr = null;
        if (i10 == i11) {
            return null;
        }
        int i12 = i11 - i10;
        int length = 0;
        while (true) {
            int i13 = this.f62888j;
            if (i10 >= i13) {
                if (bArr != null) {
                    return sq.o.h(bArr, 0, length, str);
                }
                byte[] bArr2 = this.f62880b;
                int i14 = this.f62887i;
                return sq.o.h(bArr2, i14, i13 - i14, str);
            }
            byte[] bArr3 = this.f62880b;
            byte b10 = bArr3[i10];
            if (b10 == 37) {
                if (bArr == null) {
                    bArr = new byte[i12];
                    System.arraycopy(bArr3, this.f62887i, bArr, 0, length);
                }
                int i15 = i10 + 2;
                int i16 = this.f62888j;
                if (i15 >= i16) {
                    throw new IllegalArgumentException("Bad % encoding: " + this);
                }
                byte[] bArr4 = this.f62880b;
                int i17 = i10 + 1;
                if (bArr4[i17] == 117) {
                    i10 += 5;
                    if (i10 >= i16) {
                        throw new IllegalArgumentException("Bad %u encoding: " + this);
                    }
                    try {
                        byte[] bytes = new String(Character.toChars(sq.p.f(bArr4, i15, 4, 16))).getBytes(str);
                        System.arraycopy(bytes, 0, bArr, length, bytes.length);
                        length += bytes.length;
                    } catch (Exception e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    bArr[length] = (byte) (sq.p.f(bArr4, i17, 2, 16) & 255);
                    i10 = i15;
                    length++;
                }
            } else if (bArr == null) {
                length++;
            } else {
                bArr[length] = b10;
                length++;
            }
            i10++;
        }
    }

    public String g() {
        int i10 = this.f62884f;
        int i11 = this.f62885g;
        if (i10 == i11) {
            return null;
        }
        return s(i10, i11 - i10);
    }

    public String h() {
        int i10 = this.f62887i;
        int i11 = this.f62888j;
        if (i10 == i11) {
            return null;
        }
        return s(i10, i11 - i10);
    }

    public String i() {
        int i10 = this.f62887i;
        int i11 = this.f62889k;
        if (i10 == i11) {
            return null;
        }
        return s(i10, i11 - i10);
    }

    public int j() {
        return this.f62886h;
    }

    public String k() {
        int i10 = this.f62889k;
        if (i10 == this.f62890l) {
            return null;
        }
        return s(i10 + 1, (r1 - i10) - 1);
    }

    public String l(String str) {
        int i10 = this.f62889k;
        if (i10 == this.f62890l) {
            return null;
        }
        return sq.o.h(this.f62880b, i10 + 1, (r1 - i10) - 1, str);
    }

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
        return s(i10, (i11 - i10) - 1);
    }

    public boolean n() {
        return this.f62890l > this.f62889k;
    }

    public void o(String str) {
        byte[] bytes = str.getBytes();
        q(bytes, 0, bytes.length);
        this.f62881c = str;
    }

    public void p(byte[] bArr, int i10, int i11) {
        this.f62881c = null;
        q(bArr, i10, i11);
    }

    public final void q(byte[] bArr, int i10, int i11) {
        char c10 = 0;
        this.f62892n = false;
        this.f62880b = bArr;
        int i12 = i10 + i11;
        this.f62891m = i12;
        this.f62882d = i10;
        this.f62883e = i10;
        this.f62884f = i10;
        this.f62885g = i10;
        this.f62886h = -1;
        this.f62887i = i10;
        this.f62888j = i12;
        this.f62889k = i12;
        this.f62890l = i12;
        boolean z10 = true;
        int i13 = i10;
        int i14 = i13;
        while (i13 < i12) {
            byte[] bArr2 = this.f62880b;
            char c11 = (char) (bArr2[i13] & 255);
            int i15 = i13 + 1;
            switch (c10) {
                case 0:
                    if (c11 == '#') {
                        this.f62888j = i13;
                        this.f62889k = i13;
                        this.f62890l = i13;
                    } else if (c11 == '*') {
                        this.f62887i = i13;
                        i14 = i13;
                        i13 = i15;
                        c10 = '\n';
                        z10 = true;
                    } else if (c11 == '/') {
                        i14 = i13;
                        i13 = i15;
                        c10 = 1;
                        z10 = true;
                    } else if (c11 == ';') {
                        this.f62888j = i13;
                        i14 = i13;
                        i13 = i15;
                        c10 = '\b';
                        z10 = true;
                    } else if (c11 == '?') {
                        this.f62888j = i13;
                        this.f62889k = i13;
                        i14 = i13;
                        i13 = i15;
                        c10 = '\t';
                        z10 = true;
                    } else {
                        c10 = 2;
                    }
                    i14 = i13;
                    i13 = i15;
                    z10 = true;
                    break;
                case 1:
                    if ((!this.f62879a && this.f62882d == this.f62883e) || c11 != '/') {
                        if (c11 == ';' || c11 == '?' || c11 == '#') {
                            i13 = i15 - 1;
                        } else {
                            this.f62884f = i14;
                            this.f62885g = i14;
                            i13 = i15;
                        }
                        c10 = 7;
                        z10 = true;
                    } else {
                        this.f62884f = i15;
                        int i16 = this.f62891m;
                        this.f62885g = i16;
                        this.f62887i = i16;
                        i13 = i15;
                        c10 = 4;
                        z10 = true;
                    }
                    break;
                case 2:
                    if (i11 > 6 && c11 == 't') {
                        int i17 = i10 + 3;
                        if (bArr2[i17] == 58) {
                            i15 = i10 + 4;
                            c11 = ':';
                            i13 = i17;
                        } else {
                            int i18 = i10 + 4;
                            if (bArr2[i18] == 58) {
                                i15 = i10 + 5;
                            } else {
                                i18 = i10 + 5;
                                if (bArr2[i18] == 58) {
                                    i15 = i10 + 6;
                                }
                            }
                            c11 = ':';
                            i13 = i18;
                        }
                    }
                    if (c11 != '#') {
                        if (c11 == '/') {
                            i13 = i15;
                        } else if (c11 == '?') {
                            this.f62888j = i13;
                            this.f62889k = i13;
                            i13 = i15;
                            c10 = '\t';
                            z10 = true;
                        } else if (c11 == ':') {
                            int i19 = i15 + 1;
                            this.f62883e = i15;
                            this.f62887i = i15;
                            if (((char) (bArr2[i19] & 255)) == '/') {
                                i13 = i19;
                                i14 = i15;
                                c10 = 1;
                                z10 = true;
                            } else {
                                this.f62884f = i15;
                                this.f62885g = i15;
                                i13 = i19;
                                i14 = i15;
                            }
                        } else if (c11 == ';') {
                            this.f62888j = i13;
                            i13 = i15;
                            c10 = '\b';
                            z10 = true;
                        }
                        c10 = 7;
                        z10 = true;
                    } else {
                        this.f62888j = i13;
                        this.f62889k = i13;
                        this.f62890l = i13;
                    }
                    i13 = i15;
                    z10 = true;
                    break;
                case 3:
                default:
                    i13 = i15;
                    z10 = true;
                    break;
                case 4:
                    if (c11 == '/') {
                        this.f62887i = i13;
                        this.f62885g = i13;
                        i14 = i13;
                        c10 = 7;
                    } else if (c11 == ':') {
                        this.f62885g = i13;
                        c10 = 6;
                    } else if (c11 == '@') {
                        this.f62884f = i15;
                    } else if (c11 == '[') {
                        c10 = 5;
                    }
                    i13 = i15;
                    break;
                case 5:
                    if (c11 == '/') {
                        throw new IllegalArgumentException("No closing ']' for " + sq.o.h(this.f62880b, i10, i11, sq.q.f84560b));
                    }
                    if (c11 == ']') {
                        c10 = 4;
                    }
                    i13 = i15;
                    break;
                    break;
                case 6:
                    if (c11 != '/') {
                        i13 = i15;
                        z10 = true;
                    } else {
                        this.f62887i = i13;
                        if (this.f62885g <= this.f62883e) {
                            this.f62885g = i13;
                        }
                        i14 = i13;
                        i13 = i15;
                        c10 = 7;
                    }
                    break;
                case 7:
                    if (c11 == '#') {
                        this.f62888j = i13;
                        this.f62889k = i13;
                        this.f62890l = i13;
                        i13 = i15;
                        z10 = true;
                    } else {
                        if (c11 == '%') {
                            this.f62892n = z10;
                        } else if (c11 == ';') {
                            this.f62888j = i13;
                            c10 = '\b';
                        } else if (c11 == '?') {
                            this.f62888j = i13;
                            this.f62889k = i13;
                            c10 = '\t';
                        }
                        i13 = i15;
                    }
                    break;
                case '\b':
                    if (c11 == '#') {
                        this.f62889k = i13;
                        this.f62890l = i13;
                        i13 = i15;
                        z10 = true;
                    } else {
                        if (c11 == '?') {
                            this.f62889k = i13;
                            c10 = '\t';
                        }
                        i13 = i15;
                    }
                    break;
                case '\t':
                    if (c11 == '#') {
                        this.f62890l = i13;
                    }
                    i13 = i15;
                    z10 = true;
                    break;
                case '\n':
                    throw new IllegalArgumentException("only '*'");
            }
        }
        int i20 = this.f62885g;
        int i21 = this.f62887i;
        if (i20 < i21) {
            this.f62886h = sq.p.f(this.f62880b, i20 + 1, (i21 - i20) - 1, 10);
        }
    }

    public void r(byte[] bArr, int i10, int i11) {
        this.f62881c = null;
        this.f62892n = false;
        this.f62880b = bArr;
        int i12 = i10 + i11;
        this.f62891m = i12;
        this.f62882d = i10;
        this.f62883e = i10;
        this.f62884f = i10;
        this.f62885g = i12;
        this.f62886h = -1;
        this.f62887i = i12;
        this.f62888j = i12;
        this.f62889k = i12;
        this.f62890l = i12;
        int i13 = i10;
        char c10 = 4;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            char c11 = (char) (this.f62880b[i13] & 255);
            int i14 = i13 + 1;
            if (c10 == 4) {
                if (c11 == ':') {
                    this.f62885g = i13;
                    break;
                } else if (c11 == '[') {
                    c10 = 5;
                }
            } else if (c10 != 5) {
                continue;
            } else {
                if (c11 == '/') {
                    throw new IllegalArgumentException("No closing ']' for " + sq.o.h(this.f62880b, i10, i11, sq.q.f84560b));
                }
                if (c11 == ']') {
                    c10 = 4;
                }
            }
            i13 = i14;
        }
        int i15 = this.f62885g;
        if (i15 >= this.f62887i) {
            throw new IllegalArgumentException("No port");
        }
        this.f62886h = sq.p.f(this.f62880b, i15 + 1, (r10 - i15) - 1, 10);
        this.f62887i = i10;
    }

    public final String s(int i10, int i11) {
        this.f62893o.f();
        this.f62893o.b(this.f62880b, i10, i11);
        return this.f62893o.toString();
    }

    public String toString() {
        if (this.f62881c == null) {
            int i10 = this.f62882d;
            this.f62881c = s(i10, this.f62891m - i10);
        }
        return this.f62881c;
    }
}
