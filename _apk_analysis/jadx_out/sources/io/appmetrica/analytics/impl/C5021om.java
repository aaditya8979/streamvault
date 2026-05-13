package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5021om extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5021om[] f67471b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4996nm[] f67472a;

    public C5021om() {
        a();
    }

    public static C5021om a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5021om) MessageNano.mergeFrom(new C5021om(), bArr);
    }

    public static C5021om b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5021om().mergeFrom(codedInputByteBufferNano);
    }

    public static C5021om[] b() {
        if (f67471b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67471b == null) {
                    f67471b = new C5021om[0];
                }
            }
        }
        return f67471b;
    }

    public final C5021om a() {
        this.f67472a = C4996nm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5021om mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4996nm[] c4996nmArr = this.f67472a;
                int length = c4996nmArr == null ? 0 : c4996nmArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4996nm[] c4996nmArr2 = new C4996nm[i10];
                if (length != 0) {
                    System.arraycopy(c4996nmArr, 0, c4996nmArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4996nm c4996nm = new C4996nm();
                    c4996nmArr2[length] = c4996nm;
                    codedInputByteBufferNano.readMessage(c4996nm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4996nm c4996nm2 = new C4996nm();
                c4996nmArr2[length] = c4996nm2;
                codedInputByteBufferNano.readMessage(c4996nm2);
                this.f67472a = c4996nmArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4996nm[] c4996nmArr = this.f67472a;
        if (c4996nmArr != null && c4996nmArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4996nm[] c4996nmArr2 = this.f67472a;
                if (i10 >= c4996nmArr2.length) {
                    break;
                }
                C4996nm c4996nm = c4996nmArr2[i10];
                if (c4996nm != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4996nm);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4996nm[] c4996nmArr = this.f67472a;
        if (c4996nmArr != null && c4996nmArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4996nm[] c4996nmArr2 = this.f67472a;
                if (i10 >= c4996nmArr2.length) {
                    break;
                }
                C4996nm c4996nm = c4996nmArr2[i10];
                if (c4996nm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4996nm);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
