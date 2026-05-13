package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5081r8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5081r8[] f67608e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f67609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4803g8 f67610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f67611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4957m8 f67612d;

    public C5081r8() {
        a();
    }

    public static C5081r8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5081r8) MessageNano.mergeFrom(new C5081r8(), bArr);
    }

    public static C5081r8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5081r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5081r8[] b() {
        if (f67608e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67608e == null) {
                    f67608e = new C5081r8[0];
                }
            }
        }
        return f67608e;
    }

    public final C5081r8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f67609a = bArr;
        this.f67610b = null;
        this.f67611c = bArr;
        this.f67612d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5081r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67609a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f67610b == null) {
                    this.f67610b = new C4803g8();
                }
                codedInputByteBufferNano.readMessage(this.f67610b);
            } else if (tag == 26) {
                this.f67611c = codedInputByteBufferNano.readBytes();
            } else if (tag == 34) {
                if (this.f67612d == null) {
                    this.f67612d = new C4957m8();
                }
                codedInputByteBufferNano.readMessage(this.f67612d);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f67609a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f67609a);
        }
        C4803g8 c4803g8 = this.f67610b;
        if (c4803g8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4803g8);
        }
        if (!Arrays.equals(this.f67611c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f67611c);
        }
        C4957m8 c4957m8 = this.f67612d;
        return c4957m8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c4957m8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f67609a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f67609a);
        }
        C4803g8 c4803g8 = this.f67610b;
        if (c4803g8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4803g8);
        }
        if (!Arrays.equals(this.f67611c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f67611c);
        }
        C4957m8 c4957m8 = this.f67612d;
        if (c4957m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4957m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
