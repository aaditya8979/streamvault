package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4964mf extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C4964mf[] f67290f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f67292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f67293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67295e;

    public C4964mf() {
        a();
    }

    public static C4964mf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4964mf) MessageNano.mergeFrom(new C4964mf(), bArr);
    }

    public static C4964mf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4964mf().mergeFrom(codedInputByteBufferNano);
    }

    public static C4964mf[] b() {
        if (f67290f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67290f == null) {
                    f67290f = new C4964mf[0];
                }
            }
        }
        return f67290f;
    }

    public final C4964mf a() {
        this.f67291a = "";
        this.f67292b = "";
        this.f67293c = false;
        this.f67294d = false;
        this.f67295e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4964mf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67291a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f67292b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f67293c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f67294d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f67295e = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f67291a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f67291a);
        }
        if (!this.f67292b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f67292b);
        }
        boolean z10 = this.f67293c;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z10);
        }
        boolean z11 = this.f67294d;
        if (z11) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z11);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f67295e) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f67291a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f67291a);
        }
        if (!this.f67292b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f67292b);
        }
        boolean z10 = this.f67293c;
        if (z10) {
            codedOutputByteBufferNano.writeBool(3, z10);
        }
        boolean z11 = this.f67294d;
        if (z11) {
            codedOutputByteBufferNano.writeBool(4, z11);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f67295e);
        super.writeTo(codedOutputByteBufferNano);
    }
}
