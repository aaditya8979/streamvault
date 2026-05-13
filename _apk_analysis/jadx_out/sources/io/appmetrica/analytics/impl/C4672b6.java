package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4672b6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4672b6[] f66423g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f66424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f66426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f66427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4646a6[] f66429f;

    public C4672b6() {
        a();
    }

    public static C4672b6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4672b6) MessageNano.mergeFrom(new C4672b6(), bArr);
    }

    public static C4672b6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4672b6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4672b6[] b() {
        if (f66423g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66423g == null) {
                    f66423g = new C4672b6[0];
                }
            }
        }
        return f66423g;
    }

    public final C4672b6 a() {
        this.f66424a = "";
        this.f66425b = 0;
        this.f66426c = 0L;
        this.f66427d = "";
        this.f66428e = 0;
        this.f66429f = C4646a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4672b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66424a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f66425b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f66426c = codedInputByteBufferNano.readSInt64();
            } else if (tag == 34) {
                this.f66427d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f66428e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 50) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C4646a6[] c4646a6Arr = this.f66429f;
                int length = c4646a6Arr == null ? 0 : c4646a6Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4646a6[] c4646a6Arr2 = new C4646a6[i10];
                if (length != 0) {
                    System.arraycopy(c4646a6Arr, 0, c4646a6Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4646a6 c4646a6 = new C4646a6();
                    c4646a6Arr2[length] = c4646a6;
                    codedInputByteBufferNano.readMessage(c4646a6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4646a6 c4646a62 = new C4646a6();
                c4646a6Arr2[length] = c4646a62;
                codedInputByteBufferNano.readMessage(c4646a62);
                this.f66429f = c4646a6Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f66426c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f66425b) + CodedOutputByteBufferNano.computeStringSize(1, this.f66424a) + super.computeSerializedSize();
        if (!this.f66427d.equals("")) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f66427d);
        }
        int i10 = this.f66428e;
        if (i10 != 0) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        C4646a6[] c4646a6Arr = this.f66429f;
        if (c4646a6Arr != null && c4646a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4646a6[] c4646a6Arr2 = this.f66429f;
                if (i11 >= c4646a6Arr2.length) {
                    break;
                }
                C4646a6 c4646a6 = c4646a6Arr2[i11];
                if (c4646a6 != null) {
                    iComputeSInt64Size += CodedOutputByteBufferNano.computeMessageSize(6, c4646a6);
                }
                i11++;
            }
        }
        return iComputeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f66424a);
        codedOutputByteBufferNano.writeSInt32(2, this.f66425b);
        codedOutputByteBufferNano.writeSInt64(3, this.f66426c);
        if (!this.f66427d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f66427d);
        }
        int i10 = this.f66428e;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        C4646a6[] c4646a6Arr = this.f66429f;
        if (c4646a6Arr != null && c4646a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4646a6[] c4646a6Arr2 = this.f66429f;
                if (i11 >= c4646a6Arr2.length) {
                    break;
                }
                C4646a6 c4646a6 = c4646a6Arr2[i11];
                if (c4646a6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c4646a6);
                }
                i11++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
