package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class Mk extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Mk[] f65607c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f65608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f65609b;

    public Mk() {
        a();
    }

    public static Mk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Mk) MessageNano.mergeFrom(new Mk(), bArr);
    }

    public static Mk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Mk().mergeFrom(codedInputByteBufferNano);
    }

    public static Mk[] b() {
        if (f65607c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f65607c == null) {
                    f65607c = new Mk[0];
                }
            }
        }
        return f65607c;
    }

    public final Mk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f65608a = bArr;
        this.f65609b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f65608a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f65609b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f65608a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f65608a);
        }
        return !Arrays.equals(this.f65609b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f65609b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f65608a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f65608a);
        }
        if (!Arrays.equals(this.f65609b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f65609b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
