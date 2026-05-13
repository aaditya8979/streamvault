package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class S5 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile S5[] f65865d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4672b6 f65866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4672b6[] f65867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65868c;

    public S5() {
        a();
    }

    public static S5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S5) MessageNano.mergeFrom(new S5(), bArr);
    }

    public static S5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S5().mergeFrom(codedInputByteBufferNano);
    }

    public static S5[] b() {
        if (f65865d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f65865d == null) {
                    f65865d = new S5[0];
                }
            }
        }
        return f65865d;
    }

    public final S5 a() {
        this.f65866a = null;
        this.f65867b = C4672b6.b();
        this.f65868c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f65866a == null) {
                    this.f65866a = new C4672b6();
                }
                codedInputByteBufferNano.readMessage(this.f65866a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4672b6[] c4672b6Arr = this.f65867b;
                int length = c4672b6Arr == null ? 0 : c4672b6Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4672b6[] c4672b6Arr2 = new C4672b6[i10];
                if (length != 0) {
                    System.arraycopy(c4672b6Arr, 0, c4672b6Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4672b6 c4672b6 = new C4672b6();
                    c4672b6Arr2[length] = c4672b6;
                    codedInputByteBufferNano.readMessage(c4672b6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4672b6 c4672b62 = new C4672b6();
                c4672b6Arr2[length] = c4672b62;
                codedInputByteBufferNano.readMessage(c4672b62);
                this.f65867b = c4672b6Arr2;
            } else if (tag == 26) {
                this.f65868c = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4672b6 c4672b6 = this.f65866a;
        if (c4672b6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4672b6);
        }
        C4672b6[] c4672b6Arr = this.f65867b;
        if (c4672b6Arr != null && c4672b6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4672b6[] c4672b6Arr2 = this.f65867b;
                if (i10 >= c4672b6Arr2.length) {
                    break;
                }
                C4672b6 c4672b62 = c4672b6Arr2[i10];
                if (c4672b62 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4672b62);
                }
                i10++;
            }
        }
        return !this.f65868c.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f65868c) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4672b6 c4672b6 = this.f65866a;
        if (c4672b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4672b6);
        }
        C4672b6[] c4672b6Arr = this.f65867b;
        if (c4672b6Arr != null && c4672b6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4672b6[] c4672b6Arr2 = this.f65867b;
                if (i10 >= c4672b6Arr2.length) {
                    break;
                }
                C4672b6 c4672b62 = c4672b6Arr2[i10];
                if (c4672b62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4672b62);
                }
                i10++;
            }
        }
        if (!this.f65868c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f65868c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
