package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile x[] f64499d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f64501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f64502c;

    public x() {
        a();
    }

    public static x a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (x) MessageNano.mergeFrom(new x(), bArr);
    }

    public static x b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new x().mergeFrom(codedInputByteBufferNano);
    }

    public static x[] b() {
        if (f64499d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f64499d == null) {
                    f64499d = new x[0];
                }
            }
        }
        return f64499d;
    }

    public final x a() {
        this.f64500a = false;
        this.f64501b = null;
        this.f64502c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f64500a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f64501b == null) {
                    this.f64501b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f64501b);
            } else if (tag == 26) {
                if (this.f64502c == null) {
                    this.f64502c = new v();
                }
                codedInputByteBufferNano.readMessage(this.f64502c);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f64500a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        w wVar = this.f64501b;
        if (wVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        v vVar = this.f64502c;
        return vVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, vVar) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f64500a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        w wVar = this.f64501b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        v vVar = this.f64502c;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(3, vVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
