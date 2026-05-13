package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4907k9 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f67099g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f67100h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f67101i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile C4907k9[] f67102j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4830h9[] f67103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4701c9 f67104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z8[] f67105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4856i9[] f67106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f67107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[][] f67108f;

    public C4907k9() {
        a();
    }

    public static C4907k9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4907k9) MessageNano.mergeFrom(new C4907k9(), bArr);
    }

    public static C4907k9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4907k9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4907k9[] b() {
        if (f67102j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67102j == null) {
                    f67102j = new C4907k9[0];
                }
            }
        }
        return f67102j;
    }

    public final C4907k9 a() {
        this.f67103a = C4830h9.b();
        this.f67104b = null;
        this.f67105c = Z8.b();
        this.f67106d = C4856i9.b();
        this.f67107e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f67108f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4907k9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4830h9[] c4830h9Arr = this.f67103a;
                int length = c4830h9Arr == null ? 0 : c4830h9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4830h9[] c4830h9Arr2 = new C4830h9[i10];
                if (length != 0) {
                    System.arraycopy(c4830h9Arr, 0, c4830h9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4830h9 c4830h9 = new C4830h9();
                    c4830h9Arr2[length] = c4830h9;
                    codedInputByteBufferNano.readMessage(c4830h9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4830h9 c4830h92 = new C4830h9();
                c4830h9Arr2[length] = c4830h92;
                codedInputByteBufferNano.readMessage(c4830h92);
                this.f67103a = c4830h9Arr2;
            } else if (tag == 34) {
                if (this.f67104b == null) {
                    this.f67104b = new C4701c9();
                }
                codedInputByteBufferNano.readMessage(this.f67104b);
            } else if (tag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                Z8[] z8Arr = this.f67105c;
                int length2 = z8Arr == null ? 0 : z8Arr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                Z8[] z8Arr2 = new Z8[i11];
                if (length2 != 0) {
                    System.arraycopy(z8Arr, 0, z8Arr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    Z8 z82 = new Z8();
                    z8Arr2[length2] = z82;
                    codedInputByteBufferNano.readMessage(z82);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                Z8 z83 = new Z8();
                z8Arr2[length2] = z83;
                codedInputByteBufferNano.readMessage(z83);
                this.f67105c = z8Arr2;
            } else if (tag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C4856i9[] c4856i9Arr = this.f67106d;
                int length3 = c4856i9Arr == null ? 0 : c4856i9Arr.length;
                int i12 = repeatedFieldArrayLength3 + length3;
                C4856i9[] c4856i9Arr2 = new C4856i9[i12];
                if (length3 != 0) {
                    System.arraycopy(c4856i9Arr, 0, c4856i9Arr2, 0, length3);
                }
                while (length3 < i12 - 1) {
                    C4856i9 c4856i9 = new C4856i9();
                    c4856i9Arr2[length3] = c4856i9;
                    codedInputByteBufferNano.readMessage(c4856i9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C4856i9 c4856i92 = new C4856i9();
                c4856i9Arr2[length3] = c4856i92;
                codedInputByteBufferNano.readMessage(c4856i92);
                this.f67106d = c4856i9Arr2;
            } else if (tag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f67107e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i13 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i13];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i13 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f67107e = strArr2;
            } else if (tag == 98) {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f67108f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i14 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i14][];
                if (length5 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i14 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f67108f = bArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4830h9[] c4830h9Arr = this.f67103a;
        int i10 = 0;
        if (c4830h9Arr != null && c4830h9Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4830h9[] c4830h9Arr2 = this.f67103a;
                if (i11 >= c4830h9Arr2.length) {
                    break;
                }
                C4830h9 c4830h9 = c4830h9Arr2[i11];
                if (c4830h9 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4830h9);
                }
                i11++;
            }
        }
        C4701c9 c4701c9 = this.f67104b;
        if (c4701c9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4701c9);
        }
        Z8[] z8Arr = this.f67105c;
        if (z8Arr != null && z8Arr.length > 0) {
            int i12 = 0;
            while (true) {
                Z8[] z8Arr2 = this.f67105c;
                if (i12 >= z8Arr2.length) {
                    break;
                }
                Z8 z82 = z8Arr2[i12];
                if (z82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, z82) + iComputeSerializedSize;
                }
                i12++;
            }
        }
        C4856i9[] c4856i9Arr = this.f67106d;
        if (c4856i9Arr != null && c4856i9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4856i9[] c4856i9Arr2 = this.f67106d;
                if (i13 >= c4856i9Arr2.length) {
                    break;
                }
                C4856i9 c4856i9 = c4856i9Arr2[i13];
                if (c4856i9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c4856i9) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        String[] strArr = this.f67107e;
        if (strArr != null && strArr.length > 0) {
            int i14 = 0;
            int iComputeStringSizeNoTag = 0;
            int i15 = 0;
            while (true) {
                String[] strArr2 = this.f67107e;
                if (i14 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i14];
                if (str != null) {
                    i15++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i14++;
            }
            iComputeSerializedSize = iComputeSerializedSize + iComputeStringSizeNoTag + i15;
        }
        byte[][] bArr = this.f67108f;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeBytesSizeNoTag = 0;
        int i16 = 0;
        while (true) {
            byte[][] bArr2 = this.f67108f;
            if (i10 >= bArr2.length) {
                return iComputeSerializedSize + iComputeBytesSizeNoTag + i16;
            }
            byte[] bArr3 = bArr2[i10];
            if (bArr3 != null) {
                i16++;
                iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
            }
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4830h9[] c4830h9Arr = this.f67103a;
        int i10 = 0;
        if (c4830h9Arr != null && c4830h9Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4830h9[] c4830h9Arr2 = this.f67103a;
                if (i11 >= c4830h9Arr2.length) {
                    break;
                }
                C4830h9 c4830h9 = c4830h9Arr2[i11];
                if (c4830h9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4830h9);
                }
                i11++;
            }
        }
        C4701c9 c4701c9 = this.f67104b;
        if (c4701c9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4701c9);
        }
        Z8[] z8Arr = this.f67105c;
        if (z8Arr != null && z8Arr.length > 0) {
            int i12 = 0;
            while (true) {
                Z8[] z8Arr2 = this.f67105c;
                if (i12 >= z8Arr2.length) {
                    break;
                }
                Z8 z82 = z8Arr2[i12];
                if (z82 != null) {
                    codedOutputByteBufferNano.writeMessage(7, z82);
                }
                i12++;
            }
        }
        C4856i9[] c4856i9Arr = this.f67106d;
        if (c4856i9Arr != null && c4856i9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4856i9[] c4856i9Arr2 = this.f67106d;
                if (i13 >= c4856i9Arr2.length) {
                    break;
                }
                C4856i9 c4856i9 = c4856i9Arr2[i13];
                if (c4856i9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c4856i9);
                }
                i13++;
            }
        }
        String[] strArr = this.f67107e;
        if (strArr != null && strArr.length > 0) {
            int i14 = 0;
            while (true) {
                String[] strArr2 = this.f67107e;
                if (i14 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i14];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i14++;
            }
        }
        byte[][] bArr = this.f67108f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f67108f;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
