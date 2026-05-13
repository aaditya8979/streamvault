package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class Q extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Q[] f68405d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N f68406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public P f68407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O f68408c;

    public Q() {
        a();
    }

    public static Q a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q) MessageNano.mergeFrom(new Q(), bArr);
    }

    public static Q b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q().mergeFrom(codedInputByteBufferNano);
    }

    public static Q[] b() {
        if (f68405d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f68405d == null) {
                    f68405d = new Q[0];
                }
            }
        }
        return f68405d;
    }

    public final Q a() {
        this.f68406a = null;
        this.f68407b = null;
        this.f68408c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f68406a == null) {
                    this.f68406a = new N();
                }
                codedInputByteBufferNano.readMessage(this.f68406a);
            } else if (tag == 18) {
                if (this.f68407b == null) {
                    this.f68407b = new P();
                }
                codedInputByteBufferNano.readMessage(this.f68407b);
            } else if (tag == 26) {
                if (this.f68408c == null) {
                    this.f68408c = new O();
                }
                codedInputByteBufferNano.readMessage(this.f68408c);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        N n10 = this.f68406a;
        if (n10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, n10);
        }
        P p10 = this.f68407b;
        if (p10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, p10);
        }
        O o10 = this.f68408c;
        return o10 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, o10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        N n10 = this.f68406a;
        if (n10 != null) {
            codedOutputByteBufferNano.writeMessage(1, n10);
        }
        P p10 = this.f68407b;
        if (p10 != null) {
            codedOutputByteBufferNano.writeMessage(2, p10);
        }
        O o10 = this.f68408c;
        if (o10 != null) {
            codedOutputByteBufferNano.writeMessage(3, o10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
