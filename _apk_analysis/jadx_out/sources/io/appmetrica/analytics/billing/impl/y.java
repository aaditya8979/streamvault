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
public final class y extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f64503f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f64504g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f64505h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile y[] f64506i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f64507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f64508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f64510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f64511e;

    public y() {
        a();
    }

    public static y a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    public static y[] b() {
        if (f64506i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f64506i == null) {
                    f64506i = new y[0];
                }
            }
        }
        return f64506i;
    }

    public final y a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f64507a = bArr;
        this.f64508b = 0L;
        this.f64509c = 0;
        this.f64510d = bArr;
        this.f64511e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f64507a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f64508b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f64509c = int32;
                }
            } else if (tag == 34) {
                this.f64510d = codedInputByteBufferNano.readBytes();
            } else if (tag == 40) {
                this.f64511e = codedInputByteBufferNano.readUInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f64507a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f64507a);
        }
        long j10 = this.f64508b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        int i10 = this.f64509c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f64510d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f64510d);
        }
        long j11 = this.f64511e;
        return j11 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j11) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f64507a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f64507a);
        }
        long j10 = this.f64508b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        int i10 = this.f64509c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f64510d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f64510d);
        }
        long j11 = this.f64511e;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
