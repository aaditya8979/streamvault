package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5007o8 extends MessageNano {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile C5007o8[] f67408h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f67409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f67410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4803g8 f67411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4957m8 f67412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4982n8 f67413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4982n8 f67414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C5032p8[] f67415g;

    public C5007o8() {
        a();
    }

    public static C5007o8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5007o8) MessageNano.mergeFrom(new C5007o8(), bArr);
    }

    public static C5007o8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5007o8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5007o8[] b() {
        if (f67408h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67408h == null) {
                    f67408h = new C5007o8[0];
                }
            }
        }
        return f67408h;
    }

    public final C5007o8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f67409a = bArr;
        this.f67410b = bArr;
        this.f67411c = null;
        this.f67412d = null;
        this.f67413e = null;
        this.f67414f = null;
        this.f67415g = C5032p8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5007o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f67409a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f67410b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f67411c == null) {
                    this.f67411c = new C4803g8();
                }
                codedInputByteBufferNano.readMessage(this.f67411c);
            } else if (tag == 34) {
                if (this.f67412d == null) {
                    this.f67412d = new C4957m8();
                }
                codedInputByteBufferNano.readMessage(this.f67412d);
            } else if (tag == 42) {
                if (this.f67413e == null) {
                    this.f67413e = new C4982n8();
                }
                codedInputByteBufferNano.readMessage(this.f67413e);
            } else if (tag == 50) {
                if (this.f67414f == null) {
                    this.f67414f = new C4982n8();
                }
                codedInputByteBufferNano.readMessage(this.f67414f);
            } else if (tag == 58) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C5032p8[] c5032p8Arr = this.f67415g;
                int length = c5032p8Arr == null ? 0 : c5032p8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5032p8[] c5032p8Arr2 = new C5032p8[i10];
                if (length != 0) {
                    System.arraycopy(c5032p8Arr, 0, c5032p8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5032p8 c5032p8 = new C5032p8();
                    c5032p8Arr2[length] = c5032p8;
                    codedInputByteBufferNano.readMessage(c5032p8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5032p8 c5032p82 = new C5032p8();
                c5032p8Arr2[length] = c5032p82;
                codedInputByteBufferNano.readMessage(c5032p82);
                this.f67415g = c5032p8Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f67409a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f67409a);
        }
        if (!Arrays.equals(this.f67410b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f67410b);
        }
        C4803g8 c4803g8 = this.f67411c;
        if (c4803g8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4803g8);
        }
        C4957m8 c4957m8 = this.f67412d;
        if (c4957m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4957m8);
        }
        C4982n8 c4982n8 = this.f67413e;
        if (c4982n8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c4982n8);
        }
        C4982n8 c4982n82 = this.f67414f;
        if (c4982n82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c4982n82);
        }
        C5032p8[] c5032p8Arr = this.f67415g;
        if (c5032p8Arr != null && c5032p8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5032p8[] c5032p8Arr2 = this.f67415g;
                if (i10 >= c5032p8Arr2.length) {
                    break;
                }
                C5032p8 c5032p8 = c5032p8Arr2[i10];
                if (c5032p8 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c5032p8);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f67409a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f67409a);
        }
        if (!Arrays.equals(this.f67410b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f67410b);
        }
        C4803g8 c4803g8 = this.f67411c;
        if (c4803g8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4803g8);
        }
        C4957m8 c4957m8 = this.f67412d;
        if (c4957m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4957m8);
        }
        C4982n8 c4982n8 = this.f67413e;
        if (c4982n8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c4982n8);
        }
        C4982n8 c4982n82 = this.f67414f;
        if (c4982n82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4982n82);
        }
        C5032p8[] c5032p8Arr = this.f67415g;
        if (c5032p8Arr != null && c5032p8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5032p8[] c5032p8Arr2 = this.f67415g;
                if (i10 >= c5032p8Arr2.length) {
                    break;
                }
                C5032p8 c5032p8 = c5032p8Arr2[i10];
                if (c5032p8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c5032p8);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
