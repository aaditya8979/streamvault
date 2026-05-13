package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile v[] f64486e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f64487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f64488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f64490d;

    public v() {
        a();
    }

    public static v a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (v) MessageNano.mergeFrom(new v(), bArr);
    }

    public static v b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new v().mergeFrom(codedInputByteBufferNano);
    }

    public static v[] b() {
        if (f64486e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f64486e == null) {
                    f64486e = new v[0];
                }
            }
        }
        return f64486e;
    }

    public final v a() {
        this.f64487a = 0L;
        this.f64488b = null;
        this.f64489c = 0;
        this.f64490d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f64487a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f64488b == null) {
                    this.f64488b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f64488b);
            } else if (tag == 24) {
                this.f64489c = codedInputByteBufferNano.readUInt32();
            } else if (tag == 34) {
                this.f64490d = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f64487a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        w wVar = this.f64488b;
        if (wVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i10 = this.f64489c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i10);
        }
        return !Arrays.equals(this.f64490d, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f64490d) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f64487a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        w wVar = this.f64488b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i10 = this.f64489c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i10);
        }
        if (!Arrays.equals(this.f64490d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f64490d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
