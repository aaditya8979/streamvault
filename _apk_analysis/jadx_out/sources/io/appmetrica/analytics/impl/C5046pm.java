package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5046pm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5046pm[] f67540b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f67541a;

    public C5046pm() {
        a();
    }

    public static C5046pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5046pm) MessageNano.mergeFrom(new C5046pm(), bArr);
    }

    public static C5046pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5046pm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5046pm[] b() {
        if (f67540b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67540b == null) {
                    f67540b = new C5046pm[0];
                }
            }
        }
        return f67540b;
    }

    public final C5046pm a() {
        this.f67541a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5046pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f67541a = codedInputByteBufferNano.readInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f67541a;
        return j10 != 10000 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f67541a;
        if (j10 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
