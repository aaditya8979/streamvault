package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class Li extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Li[] f65537d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f65538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ki f65539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ji f65540c;

    public Li() {
        a();
    }

    public static Li a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Li) MessageNano.mergeFrom(new Li(), bArr);
    }

    public static Li b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Li().mergeFrom(codedInputByteBufferNano);
    }

    public static Li[] b() {
        if (f65537d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f65537d == null) {
                    f65537d = new Li[0];
                }
            }
        }
        return f65537d;
    }

    public final Li a() {
        this.f65538a = false;
        this.f65539b = null;
        this.f65540c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Li mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f65538a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f65539b == null) {
                    this.f65539b = new Ki();
                }
                codedInputByteBufferNano.readMessage(this.f65539b);
            } else if (tag == 26) {
                if (this.f65540c == null) {
                    this.f65540c = new Ji();
                }
                codedInputByteBufferNano.readMessage(this.f65540c);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f65538a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        Ki ki2 = this.f65539b;
        if (ki2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ki2);
        }
        Ji ji2 = this.f65540c;
        return ji2 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, ji2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f65538a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        Ki ki2 = this.f65539b;
        if (ki2 != null) {
            codedOutputByteBufferNano.writeMessage(2, ki2);
        }
        Ji ji2 = this.f65540c;
        if (ji2 != null) {
            codedOutputByteBufferNano.writeMessage(3, ji2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
