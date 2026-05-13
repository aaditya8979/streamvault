package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4932l8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4932l8[] f67192c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f67193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f67194b;

    public C4932l8() {
        a();
    }

    public static C4932l8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4932l8) MessageNano.mergeFrom(new C4932l8(), bArr);
    }

    public static C4932l8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4932l8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4932l8[] b() {
        if (f67192c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67192c == null) {
                    f67192c = new C4932l8[0];
                }
            }
        }
        return f67192c;
    }

    public final C4932l8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f67193a = bArr;
        this.f67194b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4932l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67193a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f67194b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f67193a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f67193a);
        }
        return !Arrays.equals(this.f67194b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f67194b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f67193a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f67193a);
        }
        if (!Arrays.equals(this.f67194b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f67194b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
