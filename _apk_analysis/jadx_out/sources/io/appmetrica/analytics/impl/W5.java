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
public final class W5 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f66079k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f66080l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile W5[] f66081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static byte[] f66082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile boolean f66083o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4698c6 f66084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S5 f66085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f66086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4646a6[] f66088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public V5 f66090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f66091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f66092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public U5[] f66093j;

    public W5() {
        if (!f66083o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f66083o) {
                    f66082n = InternalNano.bytesDefaultValue("JVM");
                    f66083o = true;
                }
            }
        }
        a();
    }

    public static W5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (W5) MessageNano.mergeFrom(new W5(), bArr);
    }

    public static W5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new W5().mergeFrom(codedInputByteBufferNano);
    }

    public static W5[] b() {
        if (f66081m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66081m == null) {
                    f66081m = new W5[0];
                }
            }
        }
        return f66081m;
    }

    public final W5 a() {
        this.f66084a = null;
        this.f66085b = null;
        this.f66086c = "";
        this.f66087d = -1;
        this.f66088e = C4646a6.b();
        this.f66089f = 0;
        this.f66090g = null;
        this.f66091h = (byte[]) f66082n.clone();
        this.f66092i = WireFormatNano.EMPTY_BYTES;
        this.f66093j = U5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.f66084a == null) {
                        this.f66084a = new C4698c6();
                    }
                    codedInputByteBufferNano.readMessage(this.f66084a);
                    break;
                case 18:
                    if (this.f66085b == null) {
                        this.f66085b = new S5();
                    }
                    codedInputByteBufferNano.readMessage(this.f66085b);
                    break;
                case 26:
                    this.f66086c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f66087d = int32;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C4646a6[] c4646a6Arr = this.f66088e;
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
                    this.f66088e = c4646a6Arr2;
                    break;
                case 48:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 0 || int322 == 1) {
                        this.f66089f = int322;
                    }
                    break;
                case 58:
                    if (this.f66090g == null) {
                        this.f66090g = new V5();
                    }
                    codedInputByteBufferNano.readMessage(this.f66090g);
                    break;
                case 66:
                    this.f66091h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f66092i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    U5[] u5Arr = this.f66093j;
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
                    this.f66093j = u5Arr2;
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
        C4698c6 c4698c6 = this.f66084a;
        if (c4698c6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4698c6);
        }
        S5 s52 = this.f66085b;
        if (s52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, s52);
        }
        if (!this.f66086c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f66086c);
        }
        int i10 = this.f66087d;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        C4646a6[] c4646a6Arr = this.f66088e;
        int i11 = 0;
        if (c4646a6Arr != null && c4646a6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4646a6[] c4646a6Arr2 = this.f66088e;
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
        int i13 = this.f66089f;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i13);
        }
        V5 v52 = this.f66090g;
        if (v52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, v52);
        }
        if (!Arrays.equals(this.f66091h, f66082n)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f66091h);
        }
        if (!Arrays.equals(this.f66092i, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f66092i);
        }
        U5[] u5Arr = this.f66093j;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f66093j;
                if (i11 >= u5Arr2.length) {
                    break;
                }
                U5 u52 = u5Arr2[i11];
                if (u52 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, u52);
                }
                i11++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4698c6 c4698c6 = this.f66084a;
        if (c4698c6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4698c6);
        }
        S5 s52 = this.f66085b;
        if (s52 != null) {
            codedOutputByteBufferNano.writeMessage(2, s52);
        }
        if (!this.f66086c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f66086c);
        }
        int i10 = this.f66087d;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        C4646a6[] c4646a6Arr = this.f66088e;
        int i11 = 0;
        if (c4646a6Arr != null && c4646a6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4646a6[] c4646a6Arr2 = this.f66088e;
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
        int i13 = this.f66089f;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i13);
        }
        V5 v52 = this.f66090g;
        if (v52 != null) {
            codedOutputByteBufferNano.writeMessage(7, v52);
        }
        if (!Arrays.equals(this.f66091h, f66082n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f66091h);
        }
        if (!Arrays.equals(this.f66092i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f66092i);
        }
        U5[] u5Arr = this.f66093j;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f66093j;
                if (i11 >= u5Arr2.length) {
                    break;
                }
                U5 u52 = u5Arr2[i11];
                if (u52 != null) {
                    codedOutputByteBufferNano.writeMessage(10, u52);
                }
                i11++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
