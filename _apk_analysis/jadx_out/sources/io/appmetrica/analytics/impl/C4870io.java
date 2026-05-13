package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4870io extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C4870io[] f66995e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f66996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f66997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f66998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66999d;

    public C4870io() {
        a();
    }

    public static C4870io a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4870io) MessageNano.mergeFrom(new C4870io(), bArr);
    }

    public static C4870io b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4870io().mergeFrom(codedInputByteBufferNano);
    }

    public static C4870io[] b() {
        if (f66995e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66995e == null) {
                    f66995e = new C4870io[0];
                }
            }
        }
        return f66995e;
    }

    public final C4870io a() {
        this.f66996a = WireFormatNano.EMPTY_BYTES;
        this.f66997b = 0.0d;
        this.f66998c = 0.0d;
        this.f66999d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4870io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66996a = codedInputByteBufferNano.readBytes();
            } else if (tag == 17) {
                this.f66997b = codedInputByteBufferNano.readDouble();
            } else if (tag == 25) {
                this.f66998c = codedInputByteBufferNano.readDouble();
            } else if (tag == 32) {
                this.f66999d = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f66996a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f66996a);
        }
        if (Double.doubleToLongBits(this.f66997b) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f66997b);
        }
        if (Double.doubleToLongBits(this.f66998c) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f66998c);
        }
        boolean z10 = this.f66999d;
        return z10 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f66996a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f66996a);
        }
        if (Double.doubleToLongBits(this.f66997b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f66997b);
        }
        if (Double.doubleToLongBits(this.f66998c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f66998c);
        }
        boolean z10 = this.f66999d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
