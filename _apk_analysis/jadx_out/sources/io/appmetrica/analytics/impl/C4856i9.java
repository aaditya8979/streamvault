package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4856i9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4856i9[] f66974e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f66977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66978d;

    public C4856i9() {
        a();
    }

    public static C4856i9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4856i9) MessageNano.mergeFrom(new C4856i9(), bArr);
    }

    public static C4856i9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4856i9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4856i9[] b() {
        if (f66974e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66974e == null) {
                    f66974e = new C4856i9[0];
                }
            }
        }
        return f66974e;
    }

    public final C4856i9 a() {
        this.f66975a = 0;
        this.f66976b = 0;
        this.f66977c = "";
        this.f66978d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4856i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f66975a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 16) {
                this.f66976b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 26) {
                this.f66977c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f66978d = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f66975a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int i11 = this.f66976b;
        if (i11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i11);
        }
        if (!this.f66977c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f66977c);
        }
        boolean z10 = this.f66978d;
        return z10 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f66975a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        int i11 = this.f66976b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i11);
        }
        if (!this.f66977c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f66977c);
        }
        boolean z10 = this.f66978d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
