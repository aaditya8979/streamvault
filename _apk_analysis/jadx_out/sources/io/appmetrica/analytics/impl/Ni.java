package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class Ni extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f65655l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f65656m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f65657n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f65658o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f65659p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile Ni[] f65660q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f65662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f65663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f65664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ii f65665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f65666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f65667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f65668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f65669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Mi f65670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Li f65671k;

    public Ni() {
        a();
    }

    public static Ni a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ni) MessageNano.mergeFrom(new Ni(), bArr);
    }

    public static Ni b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ni().mergeFrom(codedInputByteBufferNano);
    }

    public static Ni[] b() {
        if (f65660q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f65660q == null) {
                    f65660q = new Ni[0];
                }
            }
        }
        return f65660q;
    }

    public final Ni a() {
        this.f65661a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f65662b = bArr;
        this.f65663c = bArr;
        this.f65664d = bArr;
        this.f65665e = null;
        this.f65666f = 0L;
        this.f65667g = false;
        this.f65668h = 0;
        this.f65669i = 1;
        this.f65670j = null;
        this.f65671k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f65661a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f65662b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f65663c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f65664d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f65665e == null) {
                        this.f65665e = new Ii();
                    }
                    codedInputByteBufferNano.readMessage(this.f65665e);
                    break;
                case 56:
                    this.f65666f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f65667g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f65668h = int32;
                    }
                    break;
                case 80:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 1 || int322 == 2) {
                        this.f65669i = int322;
                    }
                    break;
                case 90:
                    if (this.f65670j == null) {
                        this.f65670j = new Mi();
                    }
                    codedInputByteBufferNano.readMessage(this.f65670j);
                    break;
                case 98:
                    if (this.f65671k == null) {
                        this.f65671k = new Li();
                    }
                    codedInputByteBufferNano.readMessage(this.f65671k);
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
        int i10 = this.f65661a;
        if (i10 != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f65662b) + iComputeSerializedSize;
        byte[] bArr = this.f65663c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f65663c);
        }
        if (!Arrays.equals(this.f65664d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f65664d);
        }
        Ii ii2 = this.f65665e;
        if (ii2 != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, ii2);
        }
        long j10 = this.f65666f;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j10);
        }
        boolean z10 = this.f65667g;
        if (z10) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z10);
        }
        int i11 = this.f65668h;
        if (i11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i11);
        }
        int i12 = this.f65669i;
        if (i12 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i12);
        }
        Mi mi2 = this.f65670j;
        if (mi2 != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, mi2);
        }
        Li li2 = this.f65671k;
        return li2 != null ? iComputeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, li2) : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f65661a;
        if (i10 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f65662b);
        byte[] bArr = this.f65663c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f65663c);
        }
        if (!Arrays.equals(this.f65664d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f65664d);
        }
        Ii ii2 = this.f65665e;
        if (ii2 != null) {
            codedOutputByteBufferNano.writeMessage(6, ii2);
        }
        long j10 = this.f65666f;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j10);
        }
        boolean z10 = this.f65667g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(8, z10);
        }
        int i11 = this.f65668h;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i11);
        }
        int i12 = this.f65669i;
        if (i12 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i12);
        }
        Mi mi2 = this.f65670j;
        if (mi2 != null) {
            codedOutputByteBufferNano.writeMessage(11, mi2);
        }
        Li li2 = this.f65671k;
        if (li2 != null) {
            codedOutputByteBufferNano.writeMessage(12, li2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
