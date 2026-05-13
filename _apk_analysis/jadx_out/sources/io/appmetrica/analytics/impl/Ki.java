package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class Ki extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f65487c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f65488d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f65489e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f65490f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f65491g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Ki[] f65492h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65494b;

    public Ki() {
        a();
    }

    public static Ki a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ki) MessageNano.mergeFrom(new Ki(), bArr);
    }

    public static Ki b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ki().mergeFrom(codedInputByteBufferNano);
    }

    public static Ki[] b() {
        if (f65492h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f65492h == null) {
                    f65492h = new Ki[0];
                }
            }
        }
        return f65492h;
    }

    public final Ki a() {
        this.f65493a = 0;
        this.f65494b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ki mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f65493a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f65494b = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f65493a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int i11 = this.f65494b;
        return i11 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i11) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f65493a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        int i11 = this.f65494b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
