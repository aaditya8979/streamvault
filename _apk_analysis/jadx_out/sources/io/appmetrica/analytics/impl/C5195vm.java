package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5195vm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5195vm[] f67863b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67864a;

    public C5195vm() {
        a();
    }

    public static C5195vm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5195vm) MessageNano.mergeFrom(new C5195vm(), bArr);
    }

    public static C5195vm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5195vm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5195vm[] b() {
        if (f67863b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67863b == null) {
                    f67863b = new C5195vm[0];
                }
            }
        }
        return f67863b;
    }

    public final C5195vm a() {
        this.f67864a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5195vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f67864a = codedInputByteBufferNano.readUInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f67864a;
        return i10 != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f67864a;
        if (i10 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
