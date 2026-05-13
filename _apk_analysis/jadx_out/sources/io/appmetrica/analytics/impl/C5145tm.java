package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5145tm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5145tm[] f67750c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f67752b;

    public C5145tm() {
        a();
    }

    public static C5145tm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5145tm) MessageNano.mergeFrom(new C5145tm(), bArr);
    }

    public static C5145tm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5145tm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5145tm[] b() {
        if (f67750c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67750c == null) {
                    f67750c = new C5145tm[0];
                }
            }
        }
        return f67750c;
    }

    public final C5145tm a() {
        this.f67751a = "";
        this.f67752b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5145tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67751a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f67752b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f67751a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f67751a);
        }
        return !Arrays.equals(this.f67752b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f67752b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f67751a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f67751a);
        }
        if (!Arrays.equals(this.f67752b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f67752b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
