package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4777f8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4777f8[] f66737e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5007o8 f66738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5057q8 f66739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4829h8 f66740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4982n8 f66741d;

    public C4777f8() {
        a();
    }

    public static C4777f8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4777f8) MessageNano.mergeFrom(new C4777f8(), bArr);
    }

    public static C4777f8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4777f8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4777f8[] b() {
        if (f66737e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66737e == null) {
                    f66737e = new C4777f8[0];
                }
            }
        }
        return f66737e;
    }

    public final C4777f8 a() {
        this.f66738a = null;
        this.f66739b = null;
        this.f66740c = null;
        this.f66741d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4777f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f66738a == null) {
                    this.f66738a = new C5007o8();
                }
                codedInputByteBufferNano.readMessage(this.f66738a);
            } else if (tag == 18) {
                if (this.f66739b == null) {
                    this.f66739b = new C5057q8();
                }
                codedInputByteBufferNano.readMessage(this.f66739b);
            } else if (tag == 26) {
                if (this.f66740c == null) {
                    this.f66740c = new C4829h8();
                }
                codedInputByteBufferNano.readMessage(this.f66740c);
            } else if (tag == 34) {
                if (this.f66741d == null) {
                    this.f66741d = new C4982n8();
                }
                codedInputByteBufferNano.readMessage(this.f66741d);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5007o8 c5007o8 = this.f66738a;
        if (c5007o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5007o8);
        }
        C5057q8 c5057q8 = this.f66739b;
        if (c5057q8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5057q8);
        }
        C4829h8 c4829h8 = this.f66740c;
        if (c4829h8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4829h8);
        }
        C4982n8 c4982n8 = this.f66741d;
        return c4982n8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c4982n8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5007o8 c5007o8 = this.f66738a;
        if (c5007o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5007o8);
        }
        C5057q8 c5057q8 = this.f66739b;
        if (c5057q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5057q8);
        }
        C4829h8 c4829h8 = this.f66740c;
        if (c4829h8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4829h8);
        }
        C4982n8 c4982n8 = this.f66741d;
        if (c4982n8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4982n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
