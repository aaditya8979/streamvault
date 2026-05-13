package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4880j8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4880j8[] f67020c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4777f8 f67022b;

    public C4880j8() {
        a();
    }

    public static C4880j8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4880j8) MessageNano.mergeFrom(new C4880j8(), bArr);
    }

    public static C4880j8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4880j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4880j8[] b() {
        if (f67020c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67020c == null) {
                    f67020c = new C4880j8[0];
                }
            }
        }
        return f67020c;
    }

    public final C4880j8 a() {
        this.f67021a = 0;
        this.f67022b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4880j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f67021a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 18) {
                if (this.f67022b == null) {
                    this.f67022b = new C4777f8();
                }
                codedInputByteBufferNano.readMessage(this.f67022b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f67021a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        C4777f8 c4777f8 = this.f67022b;
        return c4777f8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4777f8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f67021a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        C4777f8 c4777f8 = this.f67022b;
        if (c4777f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4777f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
