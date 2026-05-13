package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5095rm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5095rm[] f67629b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f67630a;

    public C5095rm() {
        a();
    }

    public static C5095rm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5095rm) MessageNano.mergeFrom(new C5095rm(), bArr);
    }

    public static C5095rm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5095rm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5095rm[] b() {
        if (f67629b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67629b == null) {
                    f67629b = new C5095rm[0];
                }
            }
        }
        return f67629b;
    }

    public final C5095rm a() {
        this.f67630a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5095rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f67630a = codedInputByteBufferNano.readInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f67630a;
        return j10 != 864000000 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f67630a;
        if (j10 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
