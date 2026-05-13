package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class Y1 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Y1[] f66210d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X1[] f66211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W1 f66212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f66213c;

    public Y1() {
        a();
    }

    public static Y1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y1) MessageNano.mergeFrom(new Y1(), bArr);
    }

    public static Y1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y1().mergeFrom(codedInputByteBufferNano);
    }

    public static Y1[] b() {
        if (f66210d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66210d == null) {
                    f66210d = new Y1[0];
                }
            }
        }
        return f66210d;
    }

    public final Y1 a() {
        this.f66211a = X1.b();
        this.f66212b = null;
        this.f66213c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                X1[] x1Arr = this.f66211a;
                int length = x1Arr == null ? 0 : x1Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                X1[] x1Arr2 = new X1[i10];
                if (length != 0) {
                    System.arraycopy(x1Arr, 0, x1Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    X1 x12 = new X1();
                    x1Arr2[length] = x12;
                    codedInputByteBufferNano.readMessage(x12);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                X1 x13 = new X1();
                x1Arr2[length] = x13;
                codedInputByteBufferNano.readMessage(x13);
                this.f66211a = x1Arr2;
            } else if (tag == 18) {
                if (this.f66212b == null) {
                    this.f66212b = new W1();
                }
                codedInputByteBufferNano.readMessage(this.f66212b);
            } else if (tag == 26) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f66213c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i11];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f66213c = strArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        X1[] x1Arr = this.f66211a;
        int i10 = 0;
        if (x1Arr != null && x1Arr.length > 0) {
            int i11 = 0;
            while (true) {
                X1[] x1Arr2 = this.f66211a;
                if (i11 >= x1Arr2.length) {
                    break;
                }
                X1 x12 = x1Arr2[i11];
                if (x12 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, x12);
                }
                i11++;
            }
        }
        W1 w12 = this.f66212b;
        if (w12 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, w12);
        }
        String[] strArr = this.f66213c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.f66213c;
            if (i10 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i12;
            }
            String str = strArr2[i10];
            if (str != null) {
                i12++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        X1[] x1Arr = this.f66211a;
        int i10 = 0;
        if (x1Arr != null && x1Arr.length > 0) {
            int i11 = 0;
            while (true) {
                X1[] x1Arr2 = this.f66211a;
                if (i11 >= x1Arr2.length) {
                    break;
                }
                X1 x12 = x1Arr2[i11];
                if (x12 != null) {
                    codedOutputByteBufferNano.writeMessage(1, x12);
                }
                i11++;
            }
        }
        W1 w12 = this.f66212b;
        if (w12 != null) {
            codedOutputByteBufferNano.writeMessage(2, w12);
        }
        String[] strArr = this.f66213c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f66213c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
