package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4778f9 extends MessageNano {
    public static final int A = 17;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 29;
    public static final int J = 35;
    public static final int K = 38;
    public static final int L = 40;
    public static final int M = 42;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static volatile C4778f9[] T = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f66742t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f66743u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f66744v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f66745w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f66746x = 7;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f66747y = 13;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f66748z = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f66749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f66750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f66752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f66753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4649a9 f66754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C4752e9 f66755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f66756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f66757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f66758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f66759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f66760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f66761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f66762n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f66763o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f66764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f66765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f66766r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C4727d9[] f66767s;

    public C4778f9() {
        a();
    }

    public static C4778f9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4778f9) MessageNano.mergeFrom(new C4778f9(), bArr);
    }

    public static C4778f9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4778f9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4778f9[] b() {
        if (T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (T == null) {
                    T = new C4778f9[0];
                }
            }
        }
        return T;
    }

    public final C4778f9 a() {
        this.f66749a = 0L;
        this.f66750b = 0L;
        this.f66751c = 0;
        this.f66752d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f66753e = bArr;
        this.f66754f = null;
        this.f66755g = null;
        this.f66756h = "";
        this.f66757i = 0;
        this.f66758j = 0;
        this.f66759k = -1;
        this.f66760l = bArr;
        this.f66761m = -1;
        this.f66762n = 0L;
        this.f66763o = 0L;
        this.f66764p = 0;
        this.f66765q = false;
        this.f66766r = 1L;
        this.f66767s = C4727d9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4778f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f66749a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f66750b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f66751c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f66752d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f66753e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f66754f == null) {
                        this.f66754f = new C4649a9();
                    }
                    codedInputByteBufferNano.readMessage(this.f66754f);
                    break;
                case 58:
                    if (this.f66755g == null) {
                        this.f66755g = new C4752e9();
                    }
                    codedInputByteBufferNano.readMessage(this.f66755g);
                    break;
                case 66:
                    this.f66756h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f66757i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f66758j = int32;
                    }
                    break;
                case 104:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == -1 || int322 == 0 || int322 == 1) {
                        this.f66759k = int322;
                    }
                    break;
                case 114:
                    this.f66760l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int int323 = codedInputByteBufferNano.readInt32();
                    if (int323 == -1 || int323 == 0 || int323 == 1) {
                        this.f66761m = int323;
                    }
                    break;
                case 128:
                    this.f66762n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f66763o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int int324 = codedInputByteBufferNano.readInt32();
                    if (int324 == 0 || int324 == 1 || int324 == 2) {
                        this.f66764p = int324;
                    }
                    break;
                case 184:
                    this.f66765q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f66766r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C4727d9[] c4727d9Arr = this.f66767s;
                    int length = c4727d9Arr == null ? 0 : c4727d9Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C4727d9[] c4727d9Arr2 = new C4727d9[i10];
                    if (length != 0) {
                        System.arraycopy(c4727d9Arr, 0, c4727d9Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C4727d9 c4727d9 = new C4727d9();
                        c4727d9Arr2[length] = c4727d9;
                        codedInputByteBufferNano.readMessage(c4727d9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4727d9 c4727d92 = new C4727d9();
                    c4727d9Arr2[length] = c4727d92;
                    codedInputByteBufferNano.readMessage(c4727d92);
                    this.f66767s = c4727d9Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f66751c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f66750b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f66749a) + super.computeSerializedSize();
        if (!this.f66752d.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f66752d);
        }
        byte[] bArr = this.f66753e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f66753e);
        }
        C4649a9 c4649a9 = this.f66754f;
        if (c4649a9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c4649a9);
        }
        C4752e9 c4752e9 = this.f66755g;
        if (c4752e9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c4752e9);
        }
        if (!this.f66756h.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f66756h);
        }
        int i10 = this.f66757i;
        if (i10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i10);
        }
        int i11 = this.f66758j;
        if (i11 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i11);
        }
        int i12 = this.f66759k;
        if (i12 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i12);
        }
        if (!Arrays.equals(this.f66760l, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f66760l);
        }
        int i13 = this.f66761m;
        if (i13 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i13);
        }
        long j10 = this.f66762n;
        if (j10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j10);
        }
        long j11 = this.f66763o;
        if (j11 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j11);
        }
        int i14 = this.f66764p;
        if (i14 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i14);
        }
        boolean z10 = this.f66765q;
        if (z10) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z10);
        }
        long j12 = this.f66766r;
        if (j12 != 1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j12);
        }
        C4727d9[] c4727d9Arr = this.f66767s;
        if (c4727d9Arr != null && c4727d9Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C4727d9[] c4727d9Arr2 = this.f66767s;
                if (i15 >= c4727d9Arr2.length) {
                    break;
                }
                C4727d9 c4727d9 = c4727d9Arr2[i15];
                if (c4727d9 != null) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(25, c4727d9);
                }
                i15++;
            }
        }
        return iComputeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f66749a);
        codedOutputByteBufferNano.writeUInt64(2, this.f66750b);
        codedOutputByteBufferNano.writeUInt32(3, this.f66751c);
        if (!this.f66752d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f66752d);
        }
        byte[] bArr = this.f66753e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f66753e);
        }
        C4649a9 c4649a9 = this.f66754f;
        if (c4649a9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4649a9);
        }
        C4752e9 c4752e9 = this.f66755g;
        if (c4752e9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c4752e9);
        }
        if (!this.f66756h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f66756h);
        }
        int i10 = this.f66757i;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i10);
        }
        int i11 = this.f66758j;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i11);
        }
        int i12 = this.f66759k;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i12);
        }
        if (!Arrays.equals(this.f66760l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f66760l);
        }
        int i13 = this.f66761m;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i13);
        }
        long j10 = this.f66762n;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j10);
        }
        long j11 = this.f66763o;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j11);
        }
        int i14 = this.f66764p;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i14);
        }
        boolean z10 = this.f66765q;
        if (z10) {
            codedOutputByteBufferNano.writeBool(23, z10);
        }
        long j12 = this.f66766r;
        if (j12 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j12);
        }
        C4727d9[] c4727d9Arr = this.f66767s;
        if (c4727d9Arr != null && c4727d9Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C4727d9[] c4727d9Arr2 = this.f66767s;
                if (i15 >= c4727d9Arr2.length) {
                    break;
                }
                C4727d9 c4727d9 = c4727d9Arr2[i15];
                if (c4727d9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c4727d9);
                }
                i15++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
