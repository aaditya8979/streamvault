package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4726d8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4726d8[] f66589c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f66590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4829h8 f66591b;

    public C4726d8() {
        a();
    }

    public static C4726d8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4726d8) MessageNano.mergeFrom(new C4726d8(), bArr);
    }

    public static C4726d8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4726d8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4726d8[] b() {
        if (f66589c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66589c == null) {
                    f66589c = new C4726d8[0];
                }
            }
        }
        return f66589c;
    }

    public final C4726d8 a() {
        this.f66590a = WireFormatNano.EMPTY_BYTES;
        this.f66591b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4726d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66590a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f66591b == null) {
                    this.f66591b = new C4829h8();
                }
                codedInputByteBufferNano.readMessage(this.f66591b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f66590a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f66590a);
        }
        C4829h8 c4829h8 = this.f66591b;
        return c4829h8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4829h8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f66590a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f66590a);
        }
        C4829h8 c4829h8 = this.f66591b;
        if (c4829h8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4829h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
