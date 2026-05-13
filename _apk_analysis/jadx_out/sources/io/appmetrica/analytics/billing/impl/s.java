package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile s[] f64477c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64479b;

    public s() {
        a();
    }

    public static s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (s) MessageNano.mergeFrom(new s(), bArr);
    }

    public static s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new s().mergeFrom(codedInputByteBufferNano);
    }

    public static s[] b() {
        if (f64477c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f64477c == null) {
                    f64477c = new s[0];
                }
            }
        }
        return f64477c;
    }

    public final s a() {
        this.f64478a = 86400;
        this.f64479b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f64478a = codedInputByteBufferNano.readInt32();
            } else if (tag == 16) {
                this.f64479b = codedInputByteBufferNano.readInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f64478a;
        if (i10 != 86400) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        int i11 = this.f64479b;
        return i11 != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i11) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f64478a;
        if (i10 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        int i11 = this.f64479b;
        if (i11 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
