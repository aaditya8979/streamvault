package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5106s8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5106s8[] f67669c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5007o8 f67670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5081r8 f67671b;

    public C5106s8() {
        a();
    }

    public static C5106s8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5106s8) MessageNano.mergeFrom(new C5106s8(), bArr);
    }

    public static C5106s8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5106s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5106s8[] b() {
        if (f67669c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67669c == null) {
                    f67669c = new C5106s8[0];
                }
            }
        }
        return f67669c;
    }

    public final C5106s8 a() {
        this.f67670a = null;
        this.f67671b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5106s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f67670a == null) {
                    this.f67670a = new C5007o8();
                }
                codedInputByteBufferNano.readMessage(this.f67670a);
            } else if (tag == 18) {
                if (this.f67671b == null) {
                    this.f67671b = new C5081r8();
                }
                codedInputByteBufferNano.readMessage(this.f67671b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5007o8 c5007o8 = this.f67670a;
        if (c5007o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5007o8);
        }
        C5081r8 c5081r8 = this.f67671b;
        return c5081r8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c5081r8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5007o8 c5007o8 = this.f67670a;
        if (c5007o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5007o8);
        }
        C5081r8 c5081r8 = this.f67671b;
        if (c5081r8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5081r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
