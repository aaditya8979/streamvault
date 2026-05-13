package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4845ho extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4845ho[] f66945c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f66946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f66947b;

    public C4845ho() {
        a();
    }

    public static C4845ho a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4845ho) MessageNano.mergeFrom(new C4845ho(), bArr);
    }

    public static C4845ho b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4845ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C4845ho[] b() {
        if (f66945c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66945c == null) {
                    f66945c = new C4845ho[0];
                }
            }
        }
        return f66945c;
    }

    public final C4845ho a() {
        this.f66946a = false;
        this.f66947b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4845ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f66946a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f66947b = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f66946a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        boolean z11 = this.f66947b;
        return z11 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z11) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f66946a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        boolean z11 = this.f66947b;
        if (z11) {
            codedOutputByteBufferNano.writeBool(2, z11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
