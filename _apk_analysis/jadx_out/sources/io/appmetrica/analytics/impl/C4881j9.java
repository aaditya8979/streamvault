package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4881j9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4881j9[] f67023e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f67024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f67026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67027d;

    public C4881j9() {
        a();
    }

    public static C4881j9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4881j9) MessageNano.mergeFrom(new C4881j9(), bArr);
    }

    public static C4881j9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4881j9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4881j9[] b() {
        if (f67023e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67023e == null) {
                    f67023e = new C4881j9[0];
                }
            }
        }
        return f67023e;
    }

    public final C4881j9 a() {
        this.f67024a = 0L;
        this.f67025b = 0;
        this.f67026c = 0L;
        this.f67027d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4881j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f67024a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 16) {
                this.f67025b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f67026c = codedInputByteBufferNano.readInt64();
            } else if (tag == 32) {
                this.f67027d = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f67025b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f67024a) + super.computeSerializedSize();
        long j10 = this.f67026c;
        if (j10 != 0) {
            iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j10);
        }
        boolean z10 = this.f67027d;
        return z10 ? iComputeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z10) : iComputeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f67024a);
        codedOutputByteBufferNano.writeSInt32(2, this.f67025b);
        long j10 = this.f67026c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j10);
        }
        boolean z10 = this.f67027d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
