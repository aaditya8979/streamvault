package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5120sm extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5120sm[] f67702g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f67703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f67704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f67705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67708f;

    public C5120sm() {
        a();
    }

    public static C5120sm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5120sm) MessageNano.mergeFrom(new C5120sm(), bArr);
    }

    public static C5120sm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5120sm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5120sm[] b() {
        if (f67702g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67702g == null) {
                    f67702g = new C5120sm[0];
                }
            }
        }
        return f67702g;
    }

    public final C5120sm a() {
        this.f67703a = false;
        this.f67704b = false;
        this.f67705c = false;
        this.f67706d = false;
        this.f67707e = false;
        this.f67708f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5120sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f67703a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f67704b = codedInputByteBufferNano.readBool();
            } else if (tag == 24) {
                this.f67705c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f67706d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f67707e = codedInputByteBufferNano.readBool();
            } else if (tag == 48) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f67708f = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f67706d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f67705c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f67704b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f67703a) + super.computeSerializedSize();
        boolean z10 = this.f67707e;
        if (z10) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
        }
        int i10 = this.f67708f;
        return i10 != -1 ? iComputeBoolSize + CodedOutputByteBufferNano.computeInt32Size(6, i10) : iComputeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f67703a);
        codedOutputByteBufferNano.writeBool(2, this.f67704b);
        codedOutputByteBufferNano.writeBool(3, this.f67705c);
        codedOutputByteBufferNano.writeBool(4, this.f67706d);
        boolean z10 = this.f67707e;
        if (z10) {
            codedOutputByteBufferNano.writeBool(5, z10);
        }
        int i10 = this.f67708f;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
