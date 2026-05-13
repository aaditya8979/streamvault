package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4751e8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4751e8[] f66672b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4777f8 f66673a;

    public C4751e8() {
        a();
    }

    public static C4751e8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4751e8) MessageNano.mergeFrom(new C4751e8(), bArr);
    }

    public static C4751e8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4751e8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4751e8[] b() {
        if (f66672b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66672b == null) {
                    f66672b = new C4751e8[0];
                }
            }
        }
        return f66672b;
    }

    public final C4751e8 a() {
        this.f66673a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4751e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f66673a == null) {
                    this.f66673a = new C4777f8();
                }
                codedInputByteBufferNano.readMessage(this.f66673a);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4777f8 c4777f8 = this.f66673a;
        return c4777f8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c4777f8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4777f8 c4777f8 = this.f66673a;
        if (c4777f8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4777f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
