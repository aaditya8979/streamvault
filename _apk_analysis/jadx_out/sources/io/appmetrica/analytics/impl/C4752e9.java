package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4752e9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4752e9[] f66674c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66676b;

    public C4752e9() {
        a();
    }

    public static C4752e9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4752e9) MessageNano.mergeFrom(new C4752e9(), bArr);
    }

    public static C4752e9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4752e9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4752e9[] b() {
        if (f66674c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66674c == null) {
                    f66674c = new C4752e9[0];
                }
            }
        }
        return f66674c;
    }

    public final C4752e9 a() {
        this.f66675a = 2;
        this.f66676b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4752e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f66675a = int32;
                        break;
                }
            } else if (tag == 34) {
                this.f66676b = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f66675a;
        if (i10 != 2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        return !this.f66676b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f66676b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f66675a;
        if (i10 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!this.f66676b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f66676b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
