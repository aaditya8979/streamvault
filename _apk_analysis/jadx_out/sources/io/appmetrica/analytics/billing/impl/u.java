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
public final class u extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile u[] f64483c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f64484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f64485b;

    public u() {
        a();
    }

    public static u a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (u) MessageNano.mergeFrom(new u(), bArr);
    }

    public static u b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new u().mergeFrom(codedInputByteBufferNano);
    }

    public static u[] b() {
        if (f64483c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f64483c == null) {
                    f64483c = new u[0];
                }
            }
        }
        return f64483c;
    }

    public final u a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f64484a = bArr;
        this.f64485b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f64484a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f64485b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f64484a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f64484a);
        }
        return !Arrays.equals(this.f64485b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f64485b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f64484a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f64484a);
        }
        if (!Arrays.equals(this.f64485b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f64485b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
