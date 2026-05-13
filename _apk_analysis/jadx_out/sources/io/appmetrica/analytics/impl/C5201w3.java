package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5201w3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5201w3[] f67873c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f67875b;

    public C5201w3() {
        a();
    }

    public static C5201w3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5201w3) MessageNano.mergeFrom(new C5201w3(), bArr);
    }

    public static C5201w3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5201w3().mergeFrom(codedInputByteBufferNano);
    }

    public static C5201w3[] b() {
        if (f67873c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67873c == null) {
                    f67873c = new C5201w3[0];
                }
            }
        }
        return f67873c;
    }

    public final C5201w3 a() {
        this.f67874a = "";
        this.f67875b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5201w3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67874a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f67875b = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f67874a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f67874a);
        }
        return !this.f67875b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f67875b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f67874a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f67874a);
        }
        if (!this.f67875b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f67875b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
