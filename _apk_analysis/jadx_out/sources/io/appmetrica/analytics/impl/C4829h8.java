package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4829h8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4829h8[] f66895c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f66896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66897b;

    public C4829h8() {
        a();
    }

    public static C4829h8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4829h8) MessageNano.mergeFrom(new C4829h8(), bArr);
    }

    public static C4829h8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4829h8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4829h8[] b() {
        if (f66895c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66895c == null) {
                    f66895c = new C4829h8[0];
                }
            }
        }
        return f66895c;
    }

    public final C4829h8 a() {
        this.f66896a = 0L;
        this.f66897b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4829h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f66896a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f66897b = codedInputByteBufferNano.readInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f66896a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        int i10 = this.f66897b;
        return i10 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f66896a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        int i10 = this.f66897b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
