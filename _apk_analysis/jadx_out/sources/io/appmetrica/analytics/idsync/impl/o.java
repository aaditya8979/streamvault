package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f64916c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f64917d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile o[] f64918e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f64920b;

    public o() {
        a();
    }

    public static o a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (o) MessageNano.mergeFrom(new o(), bArr);
    }

    public static o b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new o().mergeFrom(codedInputByteBufferNano);
    }

    public static o[] b() {
        if (f64918e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f64918e == null) {
                    f64918e = new o[0];
                }
            }
        }
        return f64918e;
    }

    public final o a() {
        this.f64919a = false;
        this.f64920b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f64919a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f64920b == null) {
                    this.f64920b = new n();
                }
                codedInputByteBufferNano.readMessage(this.f64920b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f64919a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        n nVar = this.f64920b;
        return nVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, nVar) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f64919a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        n nVar = this.f64920b;
        if (nVar != null) {
            codedOutputByteBufferNano.writeMessage(2, nVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
