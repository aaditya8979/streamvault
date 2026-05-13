package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5097s extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f67633l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f67634m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f67635n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f67636o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f67637p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f67638q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f67639r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f67640s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile C5097s[] f67641t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static byte[] f67642u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static volatile boolean f67643v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f67644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f67645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f67646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f67648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f67649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f67650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f67651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f67652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f67653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f67654k;

    public C5097s() {
        if (!f67643v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f67643v) {
                    f67642u = InternalNano.bytesDefaultValue("manual");
                    f67643v = true;
                }
            }
        }
        a();
    }

    public static C5097s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5097s) MessageNano.mergeFrom(new C5097s(), bArr);
    }

    public static C5097s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5097s().mergeFrom(codedInputByteBufferNano);
    }

    public static C5097s[] b() {
        if (f67641t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67641t == null) {
                    f67641t = new C5097s[0];
                }
            }
        }
        return f67641t;
    }

    public final C5097s a() {
        this.f67644a = (byte[]) f67642u.clone();
        this.f67645b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f67646c = bArr;
        this.f67647d = 0;
        this.f67648e = bArr;
        this.f67649f = bArr;
        this.f67650g = bArr;
        this.f67651h = bArr;
        this.f67652i = bArr;
        this.f67653j = bArr;
        this.f67654k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5097s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f67644a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f67645b == null) {
                        this.f67645b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f67645b);
                    break;
                case 26:
                    this.f67646c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f67647d = int32;
                            break;
                    }
                    break;
                case 42:
                    this.f67648e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f67649f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f67650g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f67651h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f67652i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f67653j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    this.f67654k = codedInputByteBufferNano.readBytes();
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
        if (!Arrays.equals(this.f67644a, f67642u)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f67644a);
        }
        r rVar = this.f67645b;
        if (rVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f67646c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f67646c);
        }
        int i10 = this.f67647d;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        if (!Arrays.equals(this.f67648e, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f67648e);
        }
        if (!Arrays.equals(this.f67649f, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f67649f);
        }
        if (!Arrays.equals(this.f67650g, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f67650g);
        }
        if (!Arrays.equals(this.f67651h, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f67651h);
        }
        if (!Arrays.equals(this.f67652i, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f67652i);
        }
        if (!Arrays.equals(this.f67653j, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f67653j);
        }
        return !Arrays.equals(this.f67654k, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f67654k) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f67644a, f67642u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f67644a);
        }
        r rVar = this.f67645b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f67646c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f67646c);
        }
        int i10 = this.f67647d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        if (!Arrays.equals(this.f67648e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f67648e);
        }
        if (!Arrays.equals(this.f67649f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f67649f);
        }
        if (!Arrays.equals(this.f67650g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f67650g);
        }
        if (!Arrays.equals(this.f67651h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f67651h);
        }
        if (!Arrays.equals(this.f67652i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f67652i);
        }
        if (!Arrays.equals(this.f67653j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f67653j);
        }
        if (!Arrays.equals(this.f67654k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f67654k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
