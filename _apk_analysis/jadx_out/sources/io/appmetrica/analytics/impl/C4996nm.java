package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4996nm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4996nm[] f67381c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4971mm f67383b;

    public C4996nm() {
        a();
    }

    public static C4996nm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4996nm) MessageNano.mergeFrom(new C4996nm(), bArr);
    }

    public static C4996nm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4996nm().mergeFrom(codedInputByteBufferNano);
    }

    public static C4996nm[] b() {
        if (f67381c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67381c == null) {
                    f67381c = new C4996nm[0];
                }
            }
        }
        return f67381c;
    }

    public final C4996nm a() {
        this.f67382a = "";
        this.f67383b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4996nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67382a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                if (this.f67383b == null) {
                    this.f67383b = new C4971mm();
                }
                codedInputByteBufferNano.readMessage(this.f67383b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f67382a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f67382a);
        }
        C4971mm c4971mm = this.f67383b;
        return c4971mm != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4971mm) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f67382a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f67382a);
        }
        C4971mm c4971mm = this.f67383b;
        if (c4971mm != null) {
            codedOutputByteBufferNano.writeMessage(2, c4971mm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
