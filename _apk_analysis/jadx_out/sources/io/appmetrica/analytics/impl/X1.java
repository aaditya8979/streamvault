package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class X1 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile X1[] f66142c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f66143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f66144b;

    public X1() {
        a();
    }

    public static X1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (X1) MessageNano.mergeFrom(new X1(), bArr);
    }

    public static X1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new X1().mergeFrom(codedInputByteBufferNano);
    }

    public static X1[] b() {
        if (f66142c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66142c == null) {
                    f66142c = new X1[0];
                }
            }
        }
        return f66142c;
    }

    public final X1 a() {
        this.f66143a = "";
        this.f66144b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66143a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f66144b = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f66144b) + CodedOutputByteBufferNano.computeStringSize(1, this.f66143a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f66143a);
        codedOutputByteBufferNano.writeBool(2, this.f66144b);
        super.writeTo(codedOutputByteBufferNano);
    }
}
