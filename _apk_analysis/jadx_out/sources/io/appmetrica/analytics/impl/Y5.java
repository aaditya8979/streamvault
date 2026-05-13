package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class Y5 extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f66236l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f66237m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile Y5[] f66238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static byte[] f66239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile boolean f66240p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4698c6 f66241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S5 f66242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f66243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4646a6[] f66245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f66246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public X5 f66248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f66249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f66250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public U5[] f66251k;

    public Y5() {
        if (!f66240p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f66240p) {
                    f66239o = InternalNano.bytesDefaultValue("JVM");
                    f66240p = true;
                }
            }
        }
        a();
    }

    public static Y5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y5) MessageNano.mergeFrom(new Y5(), bArr);
    }

    public static Y5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y5().mergeFrom(codedInputByteBufferNano);
    }

    public static Y5[] b() {
        if (f66238n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66238n == null) {
                    f66238n = new Y5[0];
                }
            }
        }
        return f66238n;
    }

    public final Y5 a() {
        this.f66241a = null;
        this.f66242b = null;
        this.f66243c = "";
        this.f66244d = -1;
        this.f66245e = C4646a6.b();
        this.f66246f = "";
        this.f66247g = 0;
        this.f66248h = null;
        this.f66249i = (byte[]) f66239o.clone();
        this.f66250j = WireFormatNano.EMPTY_BYTES;
        this.f66251k = U5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.f66241a == null) {
                        this.f66241a = new C4698c6();
                    }
                    codedInputByteBufferNano.readMessage(this.f66241a);
                    break;
                case 18:
                    if (this.f66242b == null) {
                        this.f66242b = new S5();
                    }
                    codedInputByteBufferNano.readMessage(this.f66242b);
                    break;
                case 26:
                    this.f66243c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f66244d = int32;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C4646a6[] c4646a6Arr = this.f66245e;
                    int length = c4646a6Arr == null ? 0 : c4646a6Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C4646a6[] c4646a6Arr2 = new C4646a6[i10];
                    if (length != 0) {
                        System.arraycopy(c4646a6Arr, 0, c4646a6Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C4646a6 c4646a6 = new C4646a6();
                        c4646a6Arr2[length] = c4646a6;
                        codedInputByteBufferNano.readMessage(c4646a6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4646a6 c4646a62 = new C4646a6();
                    c4646a6Arr2[length] = c4646a62;
                    codedInputByteBufferNano.readMessage(c4646a62);
                    this.f66245e = c4646a6Arr2;
                    break;
                case 50:
                    this.f66246f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 0 || int322 == 1) {
                        this.f66247g = int322;
                    }
                    break;
                case 66:
                    if (this.f66248h == null) {
                        this.f66248h = new X5();
                    }
                    codedInputByteBufferNano.readMessage(this.f66248h);
                    break;
                case 74:
                    this.f66249i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f66250j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    U5[] u5Arr = this.f66251k;
                    int length2 = u5Arr == null ? 0 : u5Arr.length;
                    int i11 = repeatedFieldArrayLength2 + length2;
                    U5[] u5Arr2 = new U5[i11];
                    if (length2 != 0) {
                        System.arraycopy(u5Arr, 0, u5Arr2, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        U5 u52 = new U5();
                        u5Arr2[length2] = u52;
                        codedInputByteBufferNano.readMessage(u52);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    U5 u53 = new U5();
                    u5Arr2[length2] = u53;
                    codedInputByteBufferNano.readMessage(u53);
                    this.f66251k = u5Arr2;
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
        C4698c6 c4698c6 = this.f66241a;
        if (c4698c6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4698c6);
        }
        S5 s52 = this.f66242b;
        if (s52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, s52);
        }
        if (!this.f66243c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f66243c);
        }
        int i10 = this.f66244d;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        C4646a6[] c4646a6Arr = this.f66245e;
        int i11 = 0;
        if (c4646a6Arr != null && c4646a6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4646a6[] c4646a6Arr2 = this.f66245e;
                if (i12 >= c4646a6Arr2.length) {
                    break;
                }
                C4646a6 c4646a6 = c4646a6Arr2[i12];
                if (c4646a6 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c4646a6);
                }
                i12++;
            }
        }
        if (!this.f66246f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f66246f);
        }
        int i13 = this.f66247g;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i13);
        }
        X5 x52 = this.f66248h;
        if (x52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, x52);
        }
        if (!Arrays.equals(this.f66249i, f66239o)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f66249i);
        }
        if (!Arrays.equals(this.f66250j, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f66250j);
        }
        U5[] u5Arr = this.f66251k;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f66251k;
                if (i11 >= u5Arr2.length) {
                    break;
                }
                U5 u52 = u5Arr2[i11];
                if (u52 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(11, u52);
                }
                i11++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4698c6 c4698c6 = this.f66241a;
        if (c4698c6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4698c6);
        }
        S5 s52 = this.f66242b;
        if (s52 != null) {
            codedOutputByteBufferNano.writeMessage(2, s52);
        }
        if (!this.f66243c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f66243c);
        }
        int i10 = this.f66244d;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        C4646a6[] c4646a6Arr = this.f66245e;
        int i11 = 0;
        if (c4646a6Arr != null && c4646a6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4646a6[] c4646a6Arr2 = this.f66245e;
                if (i12 >= c4646a6Arr2.length) {
                    break;
                }
                C4646a6 c4646a6 = c4646a6Arr2[i12];
                if (c4646a6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c4646a6);
                }
                i12++;
            }
        }
        if (!this.f66246f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f66246f);
        }
        int i13 = this.f66247g;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i13);
        }
        X5 x52 = this.f66248h;
        if (x52 != null) {
            codedOutputByteBufferNano.writeMessage(8, x52);
        }
        if (!Arrays.equals(this.f66249i, f66239o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f66249i);
        }
        if (!Arrays.equals(this.f66250j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f66250j);
        }
        U5[] u5Arr = this.f66251k;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f66251k;
                if (i11 >= u5Arr2.length) {
                    break;
                }
                U5 u52 = u5Arr2[i11];
                if (u52 != null) {
                    codedOutputByteBufferNano.writeMessage(11, u52);
                }
                i11++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
