package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4804g9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66814d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66815e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f66816f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C4804g9[] f66817g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4881j9 f66818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66820c;

    public C4804g9() {
        a();
    }

    public static C4804g9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4804g9) MessageNano.mergeFrom(new C4804g9(), bArr);
    }

    public static C4804g9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4804g9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4804g9[] b() {
        if (f66817g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66817g == null) {
                    f66817g = new C4804g9[0];
                }
            }
        }
        return f66817g;
    }

    public final C4804g9 a() {
        this.f66818a = null;
        this.f66819b = "";
        this.f66820c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4804g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f66818a == null) {
                    this.f66818a = new C4881j9();
                }
                codedInputByteBufferNano.readMessage(this.f66818a);
            } else if (tag == 18) {
                this.f66819b = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f66820c = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4881j9 c4881j9 = this.f66818a;
        if (c4881j9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4881j9);
        }
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f66819b) + iComputeSerializedSize;
        int i10 = this.f66820c;
        return i10 != 0 ? iComputeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i10) : iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4881j9 c4881j9 = this.f66818a;
        if (c4881j9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4881j9);
        }
        codedOutputByteBufferNano.writeString(2, this.f66819b);
        int i10 = this.f66820c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
