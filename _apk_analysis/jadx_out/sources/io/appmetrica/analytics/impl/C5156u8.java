package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5156u8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5156u8[] f67774b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5081r8 f67775a;

    public C5156u8() {
        a();
    }

    public static C5156u8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5156u8) MessageNano.mergeFrom(new C5156u8(), bArr);
    }

    public static C5156u8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5156u8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5156u8[] b() {
        if (f67774b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67774b == null) {
                    f67774b = new C5156u8[0];
                }
            }
        }
        return f67774b;
    }

    public final C5156u8 a() {
        this.f67775a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5156u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f67775a == null) {
                    this.f67775a = new C5081r8();
                }
                codedInputByteBufferNano.readMessage(this.f67775a);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5081r8 c5081r8 = this.f67775a;
        return c5081r8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c5081r8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5081r8 c5081r8 = this.f67775a;
        if (c5081r8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5081r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
