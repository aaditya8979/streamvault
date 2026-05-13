package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class Wf extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66125e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f66126f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f66127g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Wf[] f66128h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f66129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f66130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f66131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66132d;

    public Wf() {
        a();
    }

    public static Wf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Wf) MessageNano.mergeFrom(new Wf(), bArr);
    }

    public static Wf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Wf().mergeFrom(codedInputByteBufferNano);
    }

    public static Wf[] b() {
        if (f66128h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66128h == null) {
                    f66128h = new Wf[0];
                }
            }
        }
        return f66128h;
    }

    public final Wf a() {
        this.f66129a = WireFormatNano.EMPTY_BYTES;
        this.f66130b = 0L;
        this.f66131c = 0L;
        this.f66132d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Wf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66129a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f66130b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f66131c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f66132d = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f66129a) + super.computeSerializedSize();
        long j10 = this.f66130b;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        long j11 = this.f66131c;
        if (j11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j11);
        }
        int i10 = this.f66132d;
        return i10 != 0 ? iComputeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i10) : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f66129a);
        long j10 = this.f66130b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        long j11 = this.f66131c;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j11);
        }
        int i10 = this.f66132d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
