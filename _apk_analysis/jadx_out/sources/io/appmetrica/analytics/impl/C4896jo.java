package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4896jo extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C4896jo[] f67075b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4819go[] f67076a;

    public C4896jo() {
        a();
    }

    public static C4896jo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4896jo) MessageNano.mergeFrom(new C4896jo(), bArr);
    }

    public static C4896jo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4896jo().mergeFrom(codedInputByteBufferNano);
    }

    public static C4896jo[] b() {
        if (f67075b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67075b == null) {
                    f67075b = new C4896jo[0];
                }
            }
        }
        return f67075b;
    }

    public final C4896jo a() {
        this.f67076a = C4819go.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4896jo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4819go[] c4819goArr = this.f67076a;
                int length = c4819goArr == null ? 0 : c4819goArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4819go[] c4819goArr2 = new C4819go[i10];
                if (length != 0) {
                    System.arraycopy(c4819goArr, 0, c4819goArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4819go c4819go = new C4819go();
                    c4819goArr2[length] = c4819go;
                    codedInputByteBufferNano.readMessage(c4819go);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4819go c4819go2 = new C4819go();
                c4819goArr2[length] = c4819go2;
                codedInputByteBufferNano.readMessage(c4819go2);
                this.f67076a = c4819goArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4819go[] c4819goArr = this.f67076a;
        if (c4819goArr != null && c4819goArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4819go[] c4819goArr2 = this.f67076a;
                if (i10 >= c4819goArr2.length) {
                    break;
                }
                C4819go c4819go = c4819goArr2[i10];
                if (c4819go != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4819go);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4819go[] c4819goArr = this.f67076a;
        if (c4819goArr != null && c4819goArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4819go[] c4819goArr2 = this.f67076a;
                if (i10 >= c4819goArr2.length) {
                    break;
                }
                C4819go c4819go = c4819goArr2[i10];
                if (c4819go != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4819go);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
