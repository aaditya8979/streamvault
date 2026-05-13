package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4906k8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4906k8[] f67097b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4855i8 f67098a;

    public C4906k8() {
        a();
    }

    public static C4906k8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4906k8) MessageNano.mergeFrom(new C4906k8(), bArr);
    }

    public static C4906k8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4906k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4906k8[] b() {
        if (f67097b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67097b == null) {
                    f67097b = new C4906k8[0];
                }
            }
        }
        return f67097b;
    }

    public final C4906k8 a() {
        this.f67098a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4906k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f67098a == null) {
                    this.f67098a = new C4855i8();
                }
                codedInputByteBufferNano.readMessage(this.f67098a);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4855i8 c4855i8 = this.f67098a;
        return c4855i8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c4855i8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4855i8 c4855i8 = this.f67098a;
        if (c4855i8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4855i8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
