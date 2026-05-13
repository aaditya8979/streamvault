package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4646a6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4646a6[] f66336g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f66337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f66340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f66341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66342f;

    public C4646a6() {
        a();
    }

    public static C4646a6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4646a6) MessageNano.mergeFrom(new C4646a6(), bArr);
    }

    public static C4646a6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4646a6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4646a6[] b() {
        if (f66336g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66336g == null) {
                    f66336g = new C4646a6[0];
                }
            }
        }
        return f66336g;
    }

    public final C4646a6 a() {
        this.f66337a = "";
        this.f66338b = "";
        this.f66339c = -1;
        this.f66340d = "";
        this.f66341e = false;
        this.f66342f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4646a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66337a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f66338b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f66339c = codedInputByteBufferNano.readSInt32();
            } else if (tag == 34) {
                this.f66340d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f66341e = codedInputByteBufferNano.readBool();
            } else if (tag == 48) {
                this.f66342f = codedInputByteBufferNano.readSInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f66337a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f66337a);
        }
        if (!this.f66338b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f66338b);
        }
        int i10 = this.f66339c;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i10);
        }
        if (!this.f66340d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f66340d);
        }
        boolean z10 = this.f66341e;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
        }
        int i11 = this.f66342f;
        return i11 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i11) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f66337a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f66337a);
        }
        if (!this.f66338b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f66338b);
        }
        int i10 = this.f66339c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i10);
        }
        if (!this.f66340d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f66340d);
        }
        boolean z10 = this.f66341e;
        if (z10) {
            codedOutputByteBufferNano.writeBool(5, z10);
        }
        int i11 = this.f66342f;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
