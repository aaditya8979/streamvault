package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4971mm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4971mm[] f67306b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67307a;

    public C4971mm() {
        a();
    }

    public static C4971mm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4971mm) MessageNano.mergeFrom(new C4971mm(), bArr);
    }

    public static C4971mm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4971mm().mergeFrom(codedInputByteBufferNano);
    }

    public static C4971mm[] b() {
        if (f67306b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67306b == null) {
                    f67306b = new C4971mm[0];
                }
            }
        }
        return f67306b;
    }

    public final C4971mm a() {
        this.f67307a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4971mm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67307a = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !this.f67307a.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f67307a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f67307a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f67307a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
