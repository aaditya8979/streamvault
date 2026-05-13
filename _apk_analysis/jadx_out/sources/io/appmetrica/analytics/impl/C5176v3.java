package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5176v3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5176v3[] f67801c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5226x3 f67802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67803b;

    public C5176v3() {
        a();
    }

    public static C5176v3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5176v3) MessageNano.mergeFrom(new C5176v3(), bArr);
    }

    public static C5176v3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5176v3().mergeFrom(codedInputByteBufferNano);
    }

    public static C5176v3[] b() {
        if (f67801c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67801c == null) {
                    f67801c = new C5176v3[0];
                }
            }
        }
        return f67801c;
    }

    public final C5176v3 a() {
        this.f67802a = null;
        this.f67803b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5176v3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f67802a == null) {
                    this.f67802a = new C5226x3();
                }
                codedInputByteBufferNano.readMessage(this.f67802a);
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f67803b = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5226x3 c5226x3 = this.f67802a;
        if (c5226x3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5226x3);
        }
        int i10 = this.f67803b;
        return i10 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5226x3 c5226x3 = this.f67802a;
        if (c5226x3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5226x3);
        }
        int i10 = this.f67803b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
