package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5040pg extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67525e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f67526f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f67527g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile C5040pg[] f67528h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f67530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f67531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67532d;

    public C5040pg() {
        a();
    }

    public static C5040pg a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5040pg) MessageNano.mergeFrom(new C5040pg(), bArr);
    }

    public static C5040pg b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5040pg().mergeFrom(codedInputByteBufferNano);
    }

    public static C5040pg[] b() {
        if (f67528h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67528h == null) {
                    f67528h = new C5040pg[0];
                }
            }
        }
        return f67528h;
    }

    public final C5040pg a() {
        this.f67529a = "";
        this.f67530b = 0L;
        this.f67531c = 0L;
        this.f67532d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5040pg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67529a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f67530b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f67531c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f67532d = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f67529a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f67529a);
        }
        long j10 = this.f67530b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        long j11 = this.f67531c;
        if (j11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j11);
        }
        int i10 = this.f67532d;
        return i10 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f67529a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f67529a);
        }
        long j10 = this.f67530b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        long j11 = this.f67531c;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j11);
        }
        int i10 = this.f67532d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
