package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f64512l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f64513m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f64514n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f64515o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f64516p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile z[] f64517q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f64519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f64520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f64521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f64522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f64523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f64524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f64525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f64526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f64527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x f64528k;

    public z() {
        a();
    }

    public static z a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (z) MessageNano.mergeFrom(new z(), bArr);
    }

    public static z b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new z().mergeFrom(codedInputByteBufferNano);
    }

    public static z[] b() {
        if (f64517q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f64517q == null) {
                    f64517q = new z[0];
                }
            }
        }
        return f64517q;
    }

    public final z a() {
        this.f64518a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f64519b = bArr;
        this.f64520c = bArr;
        this.f64521d = bArr;
        this.f64522e = null;
        this.f64523f = 0L;
        this.f64524g = false;
        this.f64525h = 0;
        this.f64526i = 1;
        this.f64527j = null;
        this.f64528k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f64518a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f64519b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f64520c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f64521d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f64522e == null) {
                        this.f64522e = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f64522e);
                    break;
                case 56:
                    this.f64523f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f64524g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f64525h = int32;
                    }
                    break;
                case 80:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 1 || int322 == 2) {
                        this.f64526i = int322;
                    }
                    break;
                case 90:
                    if (this.f64527j == null) {
                        this.f64527j = new y();
                    }
                    codedInputByteBufferNano.readMessage(this.f64527j);
                    break;
                case 98:
                    if (this.f64528k == null) {
                        this.f64528k = new x();
                    }
                    codedInputByteBufferNano.readMessage(this.f64528k);
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
        int i10 = this.f64518a;
        if (i10 != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f64519b) + iComputeSerializedSize;
        byte[] bArr = this.f64520c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f64520c);
        }
        if (!Arrays.equals(this.f64521d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f64521d);
        }
        u uVar = this.f64522e;
        if (uVar != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j10 = this.f64523f;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j10);
        }
        boolean z10 = this.f64524g;
        if (z10) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z10);
        }
        int i11 = this.f64525h;
        if (i11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i11);
        }
        int i12 = this.f64526i;
        if (i12 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i12);
        }
        y yVar = this.f64527j;
        if (yVar != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        x xVar = this.f64528k;
        return xVar != null ? iComputeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, xVar) : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f64518a;
        if (i10 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f64519b);
        byte[] bArr = this.f64520c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f64520c);
        }
        if (!Arrays.equals(this.f64521d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f64521d);
        }
        u uVar = this.f64522e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j10 = this.f64523f;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j10);
        }
        boolean z10 = this.f64524g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(8, z10);
        }
        int i11 = this.f64525h;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i11);
        }
        int i12 = this.f64526i;
        if (i12 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i12);
        }
        y yVar = this.f64527j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        x xVar = this.f64528k;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(12, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
