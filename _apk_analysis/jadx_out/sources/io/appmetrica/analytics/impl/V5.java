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
public final class V5 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile V5[] f66022c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f66023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z5 f66024b;

    public V5() {
        a();
    }

    public static V5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V5) MessageNano.mergeFrom(new V5(), bArr);
    }

    public static V5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V5().mergeFrom(codedInputByteBufferNano);
    }

    public static V5[] b() {
        if (f66022c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66022c == null) {
                    f66022c = new V5[0];
                }
            }
        }
        return f66022c;
    }

    public final V5 a() {
        this.f66023a = WireFormatNano.EMPTY_BYTES;
        this.f66024b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66023a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f66024b == null) {
                    this.f66024b = new Z5();
                }
                codedInputByteBufferNano.readMessage(this.f66024b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f66023a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f66023a);
        }
        Z5 z52 = this.f66024b;
        return z52 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, z52) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f66023a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f66023a);
        }
        Z5 z52 = this.f66024b;
        if (z52 != null) {
            codedOutputByteBufferNano.writeMessage(2, z52);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
