package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5006o7 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile C5006o7[] f67397k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f67399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f67400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f67404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f67405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f67406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f67407j;

    public C5006o7() {
        a();
    }

    public static C5006o7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5006o7) MessageNano.mergeFrom(new C5006o7(), bArr);
    }

    public static C5006o7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5006o7().mergeFrom(codedInputByteBufferNano);
    }

    public static C5006o7[] b() {
        if (f67397k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67397k == null) {
                    f67397k = new C5006o7[0];
                }
            }
        }
        return f67397k;
    }

    public final C5006o7 a() {
        this.f67398a = -1;
        this.f67399b = -1.0d;
        this.f67400c = -1.0d;
        this.f67401d = -1;
        this.f67402e = -1;
        this.f67403f = -1;
        this.f67404g = -1;
        this.f67405h = -1L;
        this.f67406i = "";
        this.f67407j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5006o7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f67398a = int32;
                    }
                    break;
                case 17:
                    this.f67399b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f67400c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f67401d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f67402e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f67403f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f67404g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f67405h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f67406i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f67407j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f67398a;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        if (Double.doubleToLongBits(this.f67399b) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f67399b);
        }
        if (Double.doubleToLongBits(this.f67400c) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f67400c);
        }
        int i11 = this.f67401d;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i11);
        }
        int i12 = this.f67402e;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i12);
        }
        int i13 = this.f67403f;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i13);
        }
        int i14 = this.f67404g;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i14);
        }
        long j10 = this.f67405h;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j10);
        }
        if (!this.f67406i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f67406i);
        }
        return !this.f67407j.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.f67407j) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f67398a;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (Double.doubleToLongBits(this.f67399b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f67399b);
        }
        if (Double.doubleToLongBits(this.f67400c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f67400c);
        }
        int i11 = this.f67401d;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i11);
        }
        int i12 = this.f67402e;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i12);
        }
        int i13 = this.f67403f;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i13);
        }
        int i14 = this.f67404g;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i14);
        }
        long j10 = this.f67405h;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j10);
        }
        if (!this.f67406i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f67406i);
        }
        if (!this.f67407j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f67407j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
