package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class Ji extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Ji[] f65448e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f65449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ki f65450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f65452d;

    public Ji() {
        a();
    }

    public static Ji a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ji) MessageNano.mergeFrom(new Ji(), bArr);
    }

    public static Ji b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ji().mergeFrom(codedInputByteBufferNano);
    }

    public static Ji[] b() {
        if (f65448e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f65448e == null) {
                    f65448e = new Ji[0];
                }
            }
        }
        return f65448e;
    }

    public final Ji a() {
        this.f65449a = 0L;
        this.f65450b = null;
        this.f65451c = 0;
        this.f65452d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ji mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f65449a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f65450b == null) {
                    this.f65450b = new Ki();
                }
                codedInputByteBufferNano.readMessage(this.f65450b);
            } else if (tag == 24) {
                this.f65451c = codedInputByteBufferNano.readUInt32();
            } else if (tag == 34) {
                this.f65452d = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f65449a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        Ki ki2 = this.f65450b;
        if (ki2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ki2);
        }
        int i10 = this.f65451c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i10);
        }
        return !Arrays.equals(this.f65452d, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f65452d) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f65449a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        Ki ki2 = this.f65450b;
        if (ki2 != null) {
            codedOutputByteBufferNano.writeMessage(2, ki2);
        }
        int i10 = this.f65451c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i10);
        }
        if (!Arrays.equals(this.f65452d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f65452d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
