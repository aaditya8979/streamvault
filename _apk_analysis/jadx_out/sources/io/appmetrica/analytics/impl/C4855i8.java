package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4855i8 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C4855i8[] f66968f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f66969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f66970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4957m8 f66971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4880j8[] f66972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66973e;

    public C4855i8() {
        a();
    }

    public static C4855i8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4855i8) MessageNano.mergeFrom(new C4855i8(), bArr);
    }

    public static C4855i8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4855i8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4855i8[] b() {
        if (f66968f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66968f == null) {
                    f66968f = new C4855i8[0];
                }
            }
        }
        return f66968f;
    }

    public final C4855i8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f66969a = bArr;
        this.f66970b = bArr;
        this.f66971c = null;
        this.f66972d = C4880j8.b();
        this.f66973e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4855i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66969a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f66970b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f66971c == null) {
                    this.f66971c = new C4957m8();
                }
                codedInputByteBufferNano.readMessage(this.f66971c);
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C4880j8[] c4880j8Arr = this.f66972d;
                int length = c4880j8Arr == null ? 0 : c4880j8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4880j8[] c4880j8Arr2 = new C4880j8[i10];
                if (length != 0) {
                    System.arraycopy(c4880j8Arr, 0, c4880j8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4880j8 c4880j8 = new C4880j8();
                    c4880j8Arr2[length] = c4880j8;
                    codedInputByteBufferNano.readMessage(c4880j8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4880j8 c4880j82 = new C4880j8();
                c4880j8Arr2[length] = c4880j82;
                codedInputByteBufferNano.readMessage(c4880j82);
                this.f66972d = c4880j8Arr2;
            } else if (tag == 40) {
                this.f66973e = codedInputByteBufferNano.readUInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f66969a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f66969a);
        }
        if (!Arrays.equals(this.f66970b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f66970b);
        }
        C4957m8 c4957m8 = this.f66971c;
        if (c4957m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4957m8);
        }
        C4880j8[] c4880j8Arr = this.f66972d;
        if (c4880j8Arr != null && c4880j8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4880j8[] c4880j8Arr2 = this.f66972d;
                if (i10 >= c4880j8Arr2.length) {
                    break;
                }
                C4880j8 c4880j8 = c4880j8Arr2[i10];
                if (c4880j8 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4880j8);
                }
                i10++;
            }
        }
        int i11 = this.f66973e;
        return i11 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i11) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f66969a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f66969a);
        }
        if (!Arrays.equals(this.f66970b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f66970b);
        }
        C4957m8 c4957m8 = this.f66971c;
        if (c4957m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4957m8);
        }
        C4880j8[] c4880j8Arr = this.f66972d;
        if (c4880j8Arr != null && c4880j8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4880j8[] c4880j8Arr2 = this.f66972d;
                if (i10 >= c4880j8Arr2.length) {
                    break;
                }
                C4880j8 c4880j8 = c4880j8Arr2[i10];
                if (c4880j8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c4880j8);
                }
                i10++;
            }
        }
        int i11 = this.f66973e;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
