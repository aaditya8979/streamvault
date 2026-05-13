package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5057q8 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C5057q8[] f67568d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f67569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f67570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5081r8 f67571c;

    public C5057q8() {
        a();
    }

    public static C5057q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5057q8) MessageNano.mergeFrom(new C5057q8(), bArr);
    }

    public static C5057q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5057q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5057q8[] b() {
        if (f67568d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67568d == null) {
                    f67568d = new C5057q8[0];
                }
            }
        }
        return f67568d;
    }

    public final C5057q8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f67569a = bArr;
        this.f67570b = bArr;
        this.f67571c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5057q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67569a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f67570b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f67571c == null) {
                    this.f67571c = new C5081r8();
                }
                codedInputByteBufferNano.readMessage(this.f67571c);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f67569a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f67569a);
        }
        if (!Arrays.equals(this.f67570b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f67570b);
        }
        C5081r8 c5081r8 = this.f67571c;
        return c5081r8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c5081r8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f67569a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f67569a);
        }
        if (!Arrays.equals(this.f67570b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f67570b);
        }
        C5081r8 c5081r8 = this.f67571c;
        if (c5081r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5081r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
