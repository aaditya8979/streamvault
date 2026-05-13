package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5031p7 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C5031p7[] f67508d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f67509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f67510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67511c;

    public C5031p7() {
        a();
    }

    public static C5031p7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5031p7) MessageNano.mergeFrom(new C5031p7(), bArr);
    }

    public static C5031p7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5031p7().mergeFrom(codedInputByteBufferNano);
    }

    public static C5031p7[] b() {
        if (f67508d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67508d == null) {
                    f67508d = new C5031p7[0];
                }
            }
        }
        return f67508d;
    }

    public final C5031p7 a() {
        this.f67509a = -1L;
        this.f67510b = -1L;
        this.f67511c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5031p7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f67509a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f67510b = codedInputByteBufferNano.readInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f67511c = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f67509a;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        long j11 = this.f67510b;
        if (j11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j11);
        }
        int i10 = this.f67511c;
        return i10 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f67509a;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        long j11 = this.f67510b;
        if (j11 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j11);
        }
        int i10 = this.f67511c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
