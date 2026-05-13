package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4982n8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4982n8[] f67348c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4726d8 f67349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4726d8[] f67350b;

    public C4982n8() {
        a();
    }

    public static C4982n8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4982n8) MessageNano.mergeFrom(new C4982n8(), bArr);
    }

    public static C4982n8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4982n8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4982n8[] b() {
        if (f67348c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67348c == null) {
                    f67348c = new C4982n8[0];
                }
            }
        }
        return f67348c;
    }

    public final C4982n8 a() {
        this.f67349a = null;
        this.f67350b = C4726d8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4982n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f67349a == null) {
                    this.f67349a = new C4726d8();
                }
                codedInputByteBufferNano.readMessage(this.f67349a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4726d8[] c4726d8Arr = this.f67350b;
                int length = c4726d8Arr == null ? 0 : c4726d8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4726d8[] c4726d8Arr2 = new C4726d8[i10];
                if (length != 0) {
                    System.arraycopy(c4726d8Arr, 0, c4726d8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4726d8 c4726d8 = new C4726d8();
                    c4726d8Arr2[length] = c4726d8;
                    codedInputByteBufferNano.readMessage(c4726d8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4726d8 c4726d82 = new C4726d8();
                c4726d8Arr2[length] = c4726d82;
                codedInputByteBufferNano.readMessage(c4726d82);
                this.f67350b = c4726d8Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4726d8 c4726d8 = this.f67349a;
        if (c4726d8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4726d8);
        }
        C4726d8[] c4726d8Arr = this.f67350b;
        if (c4726d8Arr != null && c4726d8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4726d8[] c4726d8Arr2 = this.f67350b;
                if (i10 >= c4726d8Arr2.length) {
                    break;
                }
                C4726d8 c4726d82 = c4726d8Arr2[i10];
                if (c4726d82 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4726d82);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4726d8 c4726d8 = this.f67349a;
        if (c4726d8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4726d8);
        }
        C4726d8[] c4726d8Arr = this.f67350b;
        if (c4726d8Arr != null && c4726d8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4726d8[] c4726d8Arr2 = this.f67350b;
                if (i10 >= c4726d8Arr2.length) {
                    break;
                }
                C4726d8 c4726d82 = c4726d8Arr2[i10];
                if (c4726d82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4726d82);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
