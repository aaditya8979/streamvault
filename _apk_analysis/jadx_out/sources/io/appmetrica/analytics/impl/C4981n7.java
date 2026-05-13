package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4981n7 extends MessageNano {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile C4981n7[] f67329s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f67331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f67332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f67333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5006o7 f67334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f67335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f67336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f67337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f67338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f67339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f67340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f67341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f67342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f67343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f67344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f67345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f67346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f67347r;

    public C4981n7() {
        a();
    }

    public static C4981n7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4981n7) MessageNano.mergeFrom(new C4981n7(), bArr);
    }

    public static C4981n7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4981n7().mergeFrom(codedInputByteBufferNano);
    }

    public static C4981n7[] b() {
        if (f67329s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67329s == null) {
                    f67329s = new C4981n7[0];
                }
            }
        }
        return f67329s;
    }

    public final C4981n7 a() {
        this.f67330a = -1;
        this.f67331b = "";
        this.f67332c = "";
        this.f67333d = -1L;
        this.f67334e = null;
        this.f67335f = "";
        this.f67336g = "";
        this.f67337h = -1L;
        this.f67338i = -1;
        this.f67339j = -1;
        this.f67340k = "";
        this.f67341l = -1;
        this.f67342m = "";
        this.f67343n = -1;
        this.f67344o = -1;
        this.f67345p = -1;
        this.f67346q = -1;
        this.f67347r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4981n7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f67330a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f67331b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f67332c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f67333d = codedInputByteBufferNano.readInt64();
                    break;
                case 42:
                    if (this.f67334e == null) {
                        this.f67334e = new C5006o7();
                    }
                    codedInputByteBufferNano.readMessage(this.f67334e);
                    break;
                case 50:
                    this.f67335f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f67336g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f67337h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f67338i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f67339j = codedInputByteBufferNano.readInt32();
                    break;
                case 90:
                    this.f67340k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f67341l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f67342m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f67343n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f67344o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f67345p = int32;
                    }
                    break;
                case 136:
                    this.f67346q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f67347r = codedInputByteBufferNano.readBytes();
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
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f67330a;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        if (!this.f67331b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f67331b);
        }
        if (!this.f67332c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f67332c);
        }
        long j10 = this.f67333d;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j10);
        }
        C5006o7 c5006o7 = this.f67334e;
        if (c5006o7 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c5006o7);
        }
        if (!this.f67335f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f67335f);
        }
        if (!this.f67336g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f67336g);
        }
        long j11 = this.f67337h;
        if (j11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j11);
        }
        int i11 = this.f67338i;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i11);
        }
        int i12 = this.f67339j;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i12);
        }
        if (!this.f67340k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f67340k);
        }
        int i13 = this.f67341l;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i13);
        }
        if (!this.f67342m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f67342m);
        }
        int i14 = this.f67343n;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i14);
        }
        int i15 = this.f67344o;
        if (i15 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i15);
        }
        int i16 = this.f67345p;
        if (i16 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i16);
        }
        int i17 = this.f67346q;
        if (i17 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i17);
        }
        return !Arrays.equals(this.f67347r, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(18, this.f67347r) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f67330a;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (!this.f67331b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f67331b);
        }
        if (!this.f67332c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f67332c);
        }
        long j10 = this.f67333d;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j10);
        }
        C5006o7 c5006o7 = this.f67334e;
        if (c5006o7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c5006o7);
        }
        if (!this.f67335f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f67335f);
        }
        if (!this.f67336g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f67336g);
        }
        long j11 = this.f67337h;
        if (j11 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j11);
        }
        int i11 = this.f67338i;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i11);
        }
        int i12 = this.f67339j;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i12);
        }
        if (!this.f67340k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f67340k);
        }
        int i13 = this.f67341l;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i13);
        }
        if (!this.f67342m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f67342m);
        }
        int i14 = this.f67343n;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i14);
        }
        int i15 = this.f67344o;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i15);
        }
        int i16 = this.f67345p;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i16);
        }
        int i17 = this.f67346q;
        if (i17 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i17);
        }
        if (!Arrays.equals(this.f67347r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f67347r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
