package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class S extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile S[] f68409c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f68410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f68411b;

    public S() {
        a();
    }

    public static S a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S) MessageNano.mergeFrom(new S(), bArr);
    }

    public static S b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S().mergeFrom(codedInputByteBufferNano);
    }

    public static S[] b() {
        if (f68409c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f68409c == null) {
                    f68409c = new S[0];
                }
            }
        }
        return f68409c;
    }

    public final S a() {
        this.f68410a = true;
        this.f68411b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f68410a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f68411b == null) {
                    this.f68411b = new Q();
                }
                codedInputByteBufferNano.readMessage(this.f68411b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f68410a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        Q q10 = this.f68411b;
        return q10 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, q10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f68410a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        Q q10 = this.f68411b;
        if (q10 != null) {
            codedOutputByteBufferNano.writeMessage(2, q10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
