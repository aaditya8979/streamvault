package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4957m8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4957m8[] f67280c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4932l8[] f67281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67282b;

    public C4957m8() {
        a();
    }

    public static C4957m8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4957m8) MessageNano.mergeFrom(new C4957m8(), bArr);
    }

    public static C4957m8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4957m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4957m8[] b() {
        if (f67280c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67280c == null) {
                    f67280c = new C4957m8[0];
                }
            }
        }
        return f67280c;
    }

    public final C4957m8 a() {
        this.f67281a = C4932l8.b();
        this.f67282b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4957m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4932l8[] c4932l8Arr = this.f67281a;
                int length = c4932l8Arr == null ? 0 : c4932l8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4932l8[] c4932l8Arr2 = new C4932l8[i10];
                if (length != 0) {
                    System.arraycopy(c4932l8Arr, 0, c4932l8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4932l8 c4932l8 = new C4932l8();
                    c4932l8Arr2[length] = c4932l8;
                    codedInputByteBufferNano.readMessage(c4932l8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4932l8 c4932l82 = new C4932l8();
                c4932l8Arr2[length] = c4932l82;
                codedInputByteBufferNano.readMessage(c4932l82);
                this.f67281a = c4932l8Arr2;
            } else if (tag == 16) {
                this.f67282b = codedInputByteBufferNano.readUInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4932l8[] c4932l8Arr = this.f67281a;
        if (c4932l8Arr != null && c4932l8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4932l8[] c4932l8Arr2 = this.f67281a;
                if (i10 >= c4932l8Arr2.length) {
                    break;
                }
                C4932l8 c4932l8 = c4932l8Arr2[i10];
                if (c4932l8 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4932l8);
                }
                i10++;
            }
        }
        int i11 = this.f67282b;
        return i11 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i11) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4932l8[] c4932l8Arr = this.f67281a;
        if (c4932l8Arr != null && c4932l8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4932l8[] c4932l8Arr2 = this.f67281a;
                if (i10 >= c4932l8Arr2.length) {
                    break;
                }
                C4932l8 c4932l8 = c4932l8Arr2[i10];
                if (c4932l8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4932l8);
                }
                i10++;
            }
        }
        int i11 = this.f67282b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
