package ue;

import com.squareup.wire.FieldEncoding;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: compiled from: ProtoReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedSource f85645a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85648d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FieldEncoding f85652h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85646b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85647c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85649e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85650f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f85651g = -1;

    public b(BufferedSource bufferedSource) {
        this.f85645a = bufferedSource;
    }

    public final void a(int i10) throws IOException {
        if (this.f85649e == i10) {
            this.f85649e = 6;
            return;
        }
        long j10 = this.f85646b;
        long j11 = this.f85647c;
        if (j10 > j11) {
            throw new IOException("Expected to end at " + this.f85647c + " but was " + this.f85646b);
        }
        if (j10 != j11) {
            this.f85649e = 7;
            return;
        }
        this.f85647c = this.f85651g;
        this.f85651g = -1L;
        this.f85649e = 6;
    }

    public final long b() throws IOException {
        if (this.f85649e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f85649e);
        }
        long j10 = this.f85647c - this.f85646b;
        this.f85645a.require(j10);
        this.f85649e = 6;
        this.f85646b = this.f85647c;
        this.f85647c = this.f85651g;
        this.f85651g = -1L;
        return j10;
    }

    public long c() throws IOException {
        if (this.f85649e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i10 = this.f85648d + 1;
        this.f85648d = i10;
        if (i10 > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j10 = this.f85651g;
        this.f85651g = -1L;
        this.f85649e = 6;
        return j10;
    }

    public void d(long j10) throws IOException {
        if (this.f85649e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i10 = this.f85648d - 1;
        this.f85648d = i10;
        if (i10 < 0 || this.f85651g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f85646b == this.f85647c || i10 == 0) {
            this.f85647c = j10;
            return;
        }
        throw new IOException("Expected to end at " + this.f85647c + " but was " + this.f85646b);
    }

    public final int e() throws IOException {
        int i10;
        this.f85645a.require(1L);
        this.f85646b++;
        byte b10 = this.f85645a.readByte();
        if (b10 >= 0) {
            return b10;
        }
        int i11 = b10 & 127;
        this.f85645a.require(1L);
        this.f85646b++;
        byte b11 = this.f85645a.readByte();
        if (b11 >= 0) {
            i10 = b11 << 7;
        } else {
            i11 |= (b11 & 127) << 7;
            this.f85645a.require(1L);
            this.f85646b++;
            byte b12 = this.f85645a.readByte();
            if (b12 >= 0) {
                i10 = b12 << 14;
            } else {
                i11 |= (b12 & 127) << 14;
                this.f85645a.require(1L);
                this.f85646b++;
                byte b13 = this.f85645a.readByte();
                if (b13 < 0) {
                    int i12 = i11 | ((b13 & 127) << 21);
                    this.f85645a.require(1L);
                    this.f85646b++;
                    byte b14 = this.f85645a.readByte();
                    int i13 = i12 | (b14 << 28);
                    if (b14 >= 0) {
                        return i13;
                    }
                    for (int i14 = 0; i14 < 5; i14++) {
                        this.f85645a.require(1L);
                        this.f85646b++;
                        if (this.f85645a.readByte() >= 0) {
                            return i13;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
                i10 = b13 << 21;
            }
        }
        return i11 | i10;
    }

    public int f() throws IOException {
        int i10 = this.f85649e;
        if (i10 == 7) {
            this.f85649e = 2;
            return this.f85650f;
        }
        if (i10 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f85646b < this.f85647c && !this.f85645a.exhausted()) {
            int iE = e();
            if (iE == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iE >> 3;
            this.f85650f = i11;
            int i12 = iE & 7;
            if (i12 == 0) {
                this.f85652h = FieldEncoding.VARINT;
                this.f85649e = 0;
                return i11;
            }
            if (i12 == 1) {
                this.f85652h = FieldEncoding.FIXED64;
                this.f85649e = 1;
                return i11;
            }
            if (i12 == 2) {
                this.f85652h = FieldEncoding.LENGTH_DELIMITED;
                this.f85649e = 2;
                int iE2 = e();
                if (iE2 < 0) {
                    throw new ProtocolException("Negative length: " + iE2);
                }
                if (this.f85651g != -1) {
                    throw new IllegalStateException();
                }
                long j10 = this.f85647c;
                this.f85651g = j10;
                long j11 = this.f85646b + ((long) iE2);
                this.f85647c = j11;
                if (j11 <= j10) {
                    return this.f85650f;
                }
                throw new EOFException();
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i12 == 5) {
                    this.f85652h = FieldEncoding.FIXED32;
                    this.f85649e = 5;
                    return i11;
                }
                throw new ProtocolException("Unexpected field encoding: " + i12);
            }
            n(i11);
        }
        return -1;
    }

    public FieldEncoding g() {
        return this.f85652h;
    }

    public ByteString h() throws IOException {
        long jB = b();
        this.f85645a.require(jB);
        return this.f85645a.readByteString(jB);
    }

    public int i() throws IOException {
        int i10 = this.f85649e;
        if (i10 != 5 && i10 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f85649e);
        }
        this.f85645a.require(4L);
        this.f85646b += 4;
        int intLe = this.f85645a.readIntLe();
        a(5);
        return intLe;
    }

    public long j() throws IOException {
        int i10 = this.f85649e;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f85649e);
        }
        this.f85645a.require(8L);
        this.f85646b += 8;
        long longLe = this.f85645a.readLongLe();
        a(1);
        return longLe;
    }

    public String k() throws IOException {
        long jB = b();
        this.f85645a.require(jB);
        return this.f85645a.readUtf8(jB);
    }

    public int l() throws IOException {
        int i10 = this.f85649e;
        if (i10 == 0 || i10 == 2) {
            int iE = e();
            a(0);
            return iE;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f85649e);
    }

    public long m() throws IOException {
        int i10 = this.f85649e;
        if (i10 != 0 && i10 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f85649e);
        }
        long j10 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            this.f85645a.require(1L);
            this.f85646b++;
            byte b10 = this.f85645a.readByte();
            j10 |= ((long) (b10 & 127)) << i11;
            if ((b10 & 128) == 0) {
                a(0);
                return j10;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void n(int i10) throws IOException {
        while (this.f85646b < this.f85647c && !this.f85645a.exhausted()) {
            int iE = e();
            if (iE == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iE >> 3;
            int i12 = iE & 7;
            if (i12 == 0) {
                this.f85649e = 0;
                m();
            } else if (i12 == 1) {
                this.f85649e = 1;
                j();
            } else if (i12 == 2) {
                long jE = e();
                this.f85646b += jE;
                this.f85645a.skip(jE);
            } else if (i12 == 3) {
                n(i11);
            } else if (i12 == 4) {
                if (i11 != i10) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i12 != 5) {
                    throw new ProtocolException("Unexpected field encoding: " + i12);
                }
                this.f85649e = 5;
                i();
            }
        }
        throw new EOFException();
    }
}
