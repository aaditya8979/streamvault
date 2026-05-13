package ue;

import com.squareup.wire.FieldEncoding;
import java.io.IOException;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: compiled from: ProtoWriter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedSink f85653a;

    public c(BufferedSink bufferedSink) {
        this.f85653a = bufferedSink;
    }

    public static int a(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long b(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static int c(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long d(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int e(int i10) {
        if (i10 >= 0) {
            return i(i10);
        }
        return 10;
    }

    public static int f(int i10, FieldEncoding fieldEncoding) {
        return (i10 << 3) | fieldEncoding.value;
    }

    public static int g(int i10) {
        return i(f(i10, FieldEncoding.VARINT));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L46
            char r3 = r7.charAt(r1)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L13
        L10:
            int r2 = r2 + 1
            goto L43
        L13:
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L1a
            int r2 = r2 + 2
            goto L43
        L1a:
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r4) goto L41
            r4 = 57343(0xdfff, float:8.0355E-41)
            if (r3 <= r4) goto L25
            goto L41
        L25:
            r5 = 56319(0xdbff, float:7.892E-41)
            if (r3 > r5) goto L10
            int r3 = r1 + 1
            if (r3 >= r0) goto L10
            char r5 = r7.charAt(r3)
            r6 = 56320(0xdc00, float:7.8921E-41)
            if (r5 < r6) goto L10
            char r5 = r7.charAt(r3)
            if (r5 > r4) goto L10
            int r2 = r2 + 4
            r1 = r3
            goto L43
        L41:
            int r2 = r2 + 3
        L43:
            int r1 = r1 + 1
            goto L6
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.c.h(java.lang.String):int");
    }

    public static int i(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public void k(ByteString byteString) throws IOException {
        this.f85653a.write(byteString);
    }

    public void l(int i10) throws IOException {
        this.f85653a.writeIntLe(i10);
    }

    public void m(long j10) throws IOException {
        this.f85653a.writeLongLe(j10);
    }

    public void n(int i10) throws IOException {
        if (i10 >= 0) {
            q(i10);
        } else {
            r(i10);
        }
    }

    public void o(String str) throws IOException {
        this.f85653a.writeUtf8(str);
    }

    public void p(int i10, FieldEncoding fieldEncoding) throws IOException {
        q(f(i10, fieldEncoding));
    }

    public void q(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f85653a.writeByte((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f85653a.writeByte(i10);
    }

    public void r(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f85653a.writeByte((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f85653a.writeByte((int) j10);
    }
}
