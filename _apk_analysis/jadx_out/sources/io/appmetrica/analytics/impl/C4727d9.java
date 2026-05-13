package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4727d9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4727d9[] f66592c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f66593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f66594b;

    public C4727d9() {
        a();
    }

    public static C4727d9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4727d9) MessageNano.mergeFrom(new C4727d9(), bArr);
    }

    public static C4727d9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4727d9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4727d9[] b() {
        if (f66592c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66592c == null) {
                    f66592c = new C4727d9[0];
                }
            }
        }
        return f66592c;
    }

    public final C4727d9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f66593a = bArr;
        this.f66594b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4727d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66593a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f66594b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f66593a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f66593a);
        }
        return !Arrays.equals(this.f66594b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f66594b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f66593a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f66593a);
        }
        if (!Arrays.equals(this.f66594b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f66594b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
