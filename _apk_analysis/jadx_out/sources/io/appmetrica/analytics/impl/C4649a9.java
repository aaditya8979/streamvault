package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4649a9 extends MessageNano {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f66346j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f66347k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f66348l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile C4649a9[] f66349m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f66350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f66351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f66352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f66357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f66358i;

    public C4649a9() {
        a();
    }

    public static C4649a9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4649a9) MessageNano.mergeFrom(new C4649a9(), bArr);
    }

    public static C4649a9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4649a9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4649a9[] b() {
        if (f66349m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66349m == null) {
                    f66349m = new C4649a9[0];
                }
            }
        }
        return f66349m;
    }

    public final C4649a9 a() {
        this.f66350a = 0.0d;
        this.f66351b = 0.0d;
        this.f66352c = 0L;
        this.f66353d = 0;
        this.f66354e = 0;
        this.f66355f = 0;
        this.f66356g = 0;
        this.f66357h = 0;
        this.f66358i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4649a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 9) {
                this.f66350a = codedInputByteBufferNano.readDouble();
            } else if (tag == 17) {
                this.f66351b = codedInputByteBufferNano.readDouble();
            } else if (tag == 24) {
                this.f66352c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                this.f66353d = codedInputByteBufferNano.readUInt32();
            } else if (tag == 40) {
                this.f66354e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 48) {
                this.f66355f = codedInputByteBufferNano.readUInt32();
            } else if (tag == 56) {
                this.f66356g = codedInputByteBufferNano.readInt32();
            } else if (tag == 64) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f66357h = int32;
                }
            } else if (tag == 74) {
                this.f66358i = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f66351b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f66350a) + super.computeSerializedSize();
        long j10 = this.f66352c;
        if (j10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j10);
        }
        int i10 = this.f66353d;
        if (i10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i10);
        }
        int i11 = this.f66354e;
        if (i11 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i11);
        }
        int i12 = this.f66355f;
        if (i12 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i12);
        }
        int i13 = this.f66356g;
        if (i13 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i13);
        }
        int i14 = this.f66357h;
        if (i14 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i14);
        }
        return !this.f66358i.equals("") ? iComputeDoubleSize + CodedOutputByteBufferNano.computeStringSize(9, this.f66358i) : iComputeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f66350a);
        codedOutputByteBufferNano.writeDouble(2, this.f66351b);
        long j10 = this.f66352c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j10);
        }
        int i10 = this.f66353d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i10);
        }
        int i11 = this.f66354e;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i11);
        }
        int i12 = this.f66355f;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i12);
        }
        int i13 = this.f66356g;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i13);
        }
        int i14 = this.f66357h;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i14);
        }
        if (!this.f66358i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f66358i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
