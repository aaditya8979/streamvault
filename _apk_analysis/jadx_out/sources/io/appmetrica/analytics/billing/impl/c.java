package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile c[] f64449f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f64451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f64452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f64453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f64454e;

    public c() {
        a();
    }

    public static c a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (c) MessageNano.mergeFrom(new c(), bArr);
    }

    public static c b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new c().mergeFrom(codedInputByteBufferNano);
    }

    public static c[] b() {
        if (f64449f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f64449f == null) {
                    f64449f = new c[0];
                }
            }
        }
        return f64449f;
    }

    public final c a() {
        this.f64450a = 1;
        this.f64451b = "";
        this.f64452c = "";
        this.f64453d = 0L;
        this.f64454e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f64450a = int32;
                }
            } else if (tag == 18) {
                this.f64451b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                this.f64452c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f64453d = codedInputByteBufferNano.readUInt64();
            } else if (tag == 40) {
                this.f64454e = codedInputByteBufferNano.readUInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f64454e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f64453d) + CodedOutputByteBufferNano.computeStringSize(3, this.f64452c) + CodedOutputByteBufferNano.computeStringSize(2, this.f64451b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f64450a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f64450a);
        codedOutputByteBufferNano.writeString(2, this.f64451b);
        codedOutputByteBufferNano.writeString(3, this.f64452c);
        codedOutputByteBufferNano.writeUInt64(4, this.f64453d);
        codedOutputByteBufferNano.writeUInt64(5, this.f64454e);
        super.writeTo(codedOutputByteBufferNano);
    }
}
