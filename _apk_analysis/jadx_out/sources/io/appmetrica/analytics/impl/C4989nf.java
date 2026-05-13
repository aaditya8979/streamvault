package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4989nf extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C4989nf[] f67360d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f67362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67363c;

    public C4989nf() {
        a();
    }

    public static C4989nf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4989nf) MessageNano.mergeFrom(new C4989nf(), bArr);
    }

    public static C4989nf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4989nf().mergeFrom(codedInputByteBufferNano);
    }

    public static C4989nf[] b() {
        if (f67360d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67360d == null) {
                    f67360d = new C4989nf[0];
                }
            }
        }
        return f67360d;
    }

    public final C4989nf a() {
        this.f67361a = "";
        this.f67362b = "";
        this.f67363c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4989nf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67361a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f67362b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f67363c = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f67361a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f67361a);
        }
        if (!this.f67362b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f67362b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f67363c) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f67361a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f67361a);
        }
        if (!this.f67362b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f67362b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f67363c);
        super.writeTo(codedOutputByteBufferNano);
    }
}
