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
public final class Mi extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f65598f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f65599g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f65600h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Mi[] f65601i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f65602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f65603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f65605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f65606e;

    public Mi() {
        a();
    }

    public static Mi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Mi) MessageNano.mergeFrom(new Mi(), bArr);
    }

    public static Mi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Mi().mergeFrom(codedInputByteBufferNano);
    }

    public static Mi[] b() {
        if (f65601i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f65601i == null) {
                    f65601i = new Mi[0];
                }
            }
        }
        return f65601i;
    }

    public final Mi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f65602a = bArr;
        this.f65603b = 0L;
        this.f65604c = 0;
        this.f65605d = bArr;
        this.f65606e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f65602a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f65603b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f65604c = int32;
                }
            } else if (tag == 34) {
                this.f65605d = codedInputByteBufferNano.readBytes();
            } else if (tag == 40) {
                this.f65606e = codedInputByteBufferNano.readUInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f65602a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f65602a);
        }
        long j10 = this.f65603b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        int i10 = this.f65604c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f65605d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f65605d);
        }
        long j11 = this.f65606e;
        return j11 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j11) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f65602a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f65602a);
        }
        long j10 = this.f65603b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        int i10 = this.f65604c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f65605d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f65605d);
        }
        long j11 = this.f65606e;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
