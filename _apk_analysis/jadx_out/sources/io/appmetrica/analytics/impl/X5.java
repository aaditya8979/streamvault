package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class X5 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile X5[] f66148b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f66149a;

    public X5() {
        a();
    }

    public static X5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (X5) MessageNano.mergeFrom(new X5(), bArr);
    }

    public static X5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new X5().mergeFrom(codedInputByteBufferNano);
    }

    public static X5[] b() {
        if (f66148b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66148b == null) {
                    f66148b = new X5[0];
                }
            }
        }
        return f66148b;
    }

    public final X5 a() {
        this.f66149a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66149a = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f66149a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f66149a);
        super.writeTo(codedOutputByteBufferNano);
    }
}
