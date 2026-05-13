package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile t[] f64480c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f64482b;

    public t() {
        a();
    }

    public static t a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (t) MessageNano.mergeFrom(new t(), bArr);
    }

    public static t b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new t().mergeFrom(codedInputByteBufferNano);
    }

    public static t[] b() {
        if (f64480c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f64480c == null) {
                    f64480c = new t[0];
                }
            }
        }
        return f64480c;
    }

    public final t a() {
        this.f64481a = true;
        this.f64482b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f64481a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f64482b == null) {
                    this.f64482b = new s();
                }
                codedInputByteBufferNano.readMessage(this.f64482b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f64481a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        s sVar = this.f64482b;
        return sVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, sVar) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f64481a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        s sVar = this.f64482b;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(2, sVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
