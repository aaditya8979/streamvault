package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5170um extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5170um[] f67791c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f67792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f67793b;

    public C5170um() {
        a();
    }

    public static C5170um a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5170um) MessageNano.mergeFrom(new C5170um(), bArr);
    }

    public static C5170um b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5170um().mergeFrom(codedInputByteBufferNano);
    }

    public static C5170um[] b() {
        if (f67791c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67791c == null) {
                    f67791c = new C5170um[0];
                }
            }
        }
        return f67791c;
    }

    public final C5170um a() {
        this.f67792a = 86400L;
        this.f67793b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5170um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f67792a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f67793b = codedInputByteBufferNano.readInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f67793b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f67792a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f67792a);
        codedOutputByteBufferNano.writeInt64(2, this.f67793b);
        super.writeTo(codedOutputByteBufferNano);
    }
}
