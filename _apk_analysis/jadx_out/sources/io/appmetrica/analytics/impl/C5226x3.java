package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5226x3 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5226x3[] f67925b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5201w3[] f67926a;

    public C5226x3() {
        a();
    }

    public static C5226x3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5226x3) MessageNano.mergeFrom(new C5226x3(), bArr);
    }

    public static C5226x3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5226x3().mergeFrom(codedInputByteBufferNano);
    }

    public static C5226x3[] b() {
        if (f67925b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67925b == null) {
                    f67925b = new C5226x3[0];
                }
            }
        }
        return f67925b;
    }

    public final C5226x3 a() {
        this.f67926a = C5201w3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5226x3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5201w3[] c5201w3Arr = this.f67926a;
                int length = c5201w3Arr == null ? 0 : c5201w3Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5201w3[] c5201w3Arr2 = new C5201w3[i10];
                if (length != 0) {
                    System.arraycopy(c5201w3Arr, 0, c5201w3Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5201w3 c5201w3 = new C5201w3();
                    c5201w3Arr2[length] = c5201w3;
                    codedInputByteBufferNano.readMessage(c5201w3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5201w3 c5201w32 = new C5201w3();
                c5201w3Arr2[length] = c5201w32;
                codedInputByteBufferNano.readMessage(c5201w32);
                this.f67926a = c5201w3Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5201w3[] c5201w3Arr = this.f67926a;
        if (c5201w3Arr != null && c5201w3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5201w3[] c5201w3Arr2 = this.f67926a;
                if (i10 >= c5201w3Arr2.length) {
                    break;
                }
                C5201w3 c5201w3 = c5201w3Arr2[i10];
                if (c5201w3 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5201w3);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5201w3[] c5201w3Arr = this.f67926a;
        if (c5201w3Arr != null && c5201w3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5201w3[] c5201w3Arr2 = this.f67926a;
                if (i10 >= c5201w3Arr2.length) {
                    break;
                }
                C5201w3 c5201w3 = c5201w3Arr2[i10];
                if (c5201w3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5201w3);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
