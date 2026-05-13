package io.appmetrica.analytics.idsync.impl;

import com.vungle.ads.internal.signals.SignalManager;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends MessageNano {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile m[] f64905h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f64906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f64907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f64908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k[] f64909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f64910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f64911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f64912g;

    public m() {
        a();
    }

    public static m a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (m) MessageNano.mergeFrom(new m(), bArr);
    }

    public static m b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new m().mergeFrom(codedInputByteBufferNano);
    }

    public static m[] b() {
        if (f64905h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f64905h == null) {
                    f64905h = new m[0];
                }
            }
        }
        return f64905h;
    }

    public final m a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f64906a = bArr;
        this.f64907b = null;
        this.f64908c = bArr;
        this.f64909d = k.b();
        this.f64910e = SignalManager.TWENTY_FOUR_HOURS_MILLIS;
        this.f64911f = 3600000L;
        this.f64912g = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f64906a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f64907b == null) {
                    this.f64907b = new l();
                }
                codedInputByteBufferNano.readMessage(this.f64907b);
            } else if (tag == 26) {
                this.f64908c = codedInputByteBufferNano.readBytes();
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                k[] kVarArr = this.f64909d;
                int length = kVarArr == null ? 0 : kVarArr.length;
                int i10 = repeatedFieldArrayLength + length;
                k[] kVarArr2 = new k[i10];
                if (length != 0) {
                    System.arraycopy(kVarArr, 0, kVarArr2, 0, length);
                }
                while (length < i10 - 1) {
                    k kVar = new k();
                    kVarArr2[length] = kVar;
                    codedInputByteBufferNano.readMessage(kVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                k kVar2 = new k();
                kVarArr2[length] = kVar2;
                codedInputByteBufferNano.readMessage(kVar2);
                this.f64909d = kVarArr2;
            } else if (tag == 40) {
                this.f64910e = codedInputByteBufferNano.readUInt64();
            } else if (tag == 48) {
                this.f64911f = codedInputByteBufferNano.readUInt64();
            } else if (tag == 56) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 56);
                int[] iArr = this.f64912g;
                int length2 = iArr == null ? 0 : iArr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                int[] iArr2 = new int[i11];
                if (length2 != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    iArr2[length2] = codedInputByteBufferNano.readUInt32();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                iArr2[length2] = codedInputByteBufferNano.readUInt32();
                this.f64912g = iArr2;
            } else if (tag == 58) {
                int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i12 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readUInt32();
                    i12++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f64912g;
                int length3 = iArr3 == null ? 0 : iArr3.length;
                int i13 = i12 + length3;
                int[] iArr4 = new int[i13];
                if (length3 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length3);
                }
                while (length3 < i13) {
                    iArr4[length3] = codedInputByteBufferNano.readUInt32();
                    length3++;
                }
                this.f64912g = iArr4;
                codedInputByteBufferNano.popLimit(iPushLimit);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f64906a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f64906a);
        }
        l lVar = this.f64907b;
        if (lVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, lVar);
        }
        if (!Arrays.equals(this.f64908c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f64908c);
        }
        k[] kVarArr = this.f64909d;
        int i10 = 0;
        if (kVarArr != null && kVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                k[] kVarArr2 = this.f64909d;
                if (i11 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i11];
                if (kVar != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, kVar);
                }
                i11++;
            }
        }
        long j10 = this.f64910e;
        if (j10 != SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j10);
        }
        long j11 = this.f64911f;
        if (j11 != 3600000) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(6, j11);
        }
        int[] iArr = this.f64912g;
        if (iArr == null || iArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeUInt32SizeNoTag = 0;
        while (true) {
            int[] iArr2 = this.f64912g;
            if (i10 >= iArr2.length) {
                return iComputeSerializedSize + iComputeUInt32SizeNoTag + iArr2.length;
            }
            iComputeUInt32SizeNoTag += CodedOutputByteBufferNano.computeUInt32SizeNoTag(iArr2[i10]);
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f64906a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f64906a);
        }
        l lVar = this.f64907b;
        if (lVar != null) {
            codedOutputByteBufferNano.writeMessage(2, lVar);
        }
        if (!Arrays.equals(this.f64908c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f64908c);
        }
        k[] kVarArr = this.f64909d;
        int i10 = 0;
        if (kVarArr != null && kVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                k[] kVarArr2 = this.f64909d;
                if (i11 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i11];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(4, kVar);
                }
                i11++;
            }
        }
        long j10 = this.f64910e;
        if (j10 != SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
            codedOutputByteBufferNano.writeUInt64(5, j10);
        }
        long j11 = this.f64911f;
        if (j11 != 3600000) {
            codedOutputByteBufferNano.writeUInt64(6, j11);
        }
        int[] iArr = this.f64912g;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f64912g;
                if (i10 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeUInt32(7, iArr2[i10]);
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
