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
public final class Ii extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Ii[] f65370c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f65371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f65372b;

    public Ii() {
        a();
    }

    public static Ii a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ii) MessageNano.mergeFrom(new Ii(), bArr);
    }

    public static Ii b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ii().mergeFrom(codedInputByteBufferNano);
    }

    public static Ii[] b() {
        if (f65370c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f65370c == null) {
                    f65370c = new Ii[0];
                }
            }
        }
        return f65370c;
    }

    public final Ii a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f65371a = bArr;
        this.f65372b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f65371a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f65372b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f65371a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f65371a);
        }
        return !Arrays.equals(this.f65372b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f65372b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f65371a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f65371a);
        }
        if (!Arrays.equals(this.f65372b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f65372b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
