package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5131t8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5131t8[] f67722c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5007o8 f67723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5057q8 f67724b;

    public C5131t8() {
        a();
    }

    public static C5131t8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5131t8) MessageNano.mergeFrom(new C5131t8(), bArr);
    }

    public static C5131t8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5131t8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5131t8[] b() {
        if (f67722c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67722c == null) {
                    f67722c = new C5131t8[0];
                }
            }
        }
        return f67722c;
    }

    public final C5131t8 a() {
        this.f67723a = null;
        this.f67724b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5131t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f67723a == null) {
                    this.f67723a = new C5007o8();
                }
                codedInputByteBufferNano.readMessage(this.f67723a);
            } else if (tag == 18) {
                if (this.f67724b == null) {
                    this.f67724b = new C5057q8();
                }
                codedInputByteBufferNano.readMessage(this.f67724b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5007o8 c5007o8 = this.f67723a;
        if (c5007o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5007o8);
        }
        C5057q8 c5057q8 = this.f67724b;
        return c5057q8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c5057q8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5007o8 c5007o8 = this.f67723a;
        if (c5007o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5007o8);
        }
        C5057q8 c5057q8 = this.f67724b;
        if (c5057q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5057q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
