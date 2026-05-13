package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5251y3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f68004c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f68005d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f68006e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f68007f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5251y3[] f68008g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5176v3 f68009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5176v3[] f68010b;

    public C5251y3() {
        a();
    }

    public static C5251y3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5251y3) MessageNano.mergeFrom(new C5251y3(), bArr);
    }

    public static C5251y3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5251y3().mergeFrom(codedInputByteBufferNano);
    }

    public static C5251y3[] b() {
        if (f68008g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f68008g == null) {
                    f68008g = new C5251y3[0];
                }
            }
        }
        return f68008g;
    }

    public final C5251y3 a() {
        this.f68009a = null;
        this.f68010b = C5176v3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5251y3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f68009a == null) {
                    this.f68009a = new C5176v3();
                }
                codedInputByteBufferNano.readMessage(this.f68009a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5176v3[] c5176v3Arr = this.f68010b;
                int length = c5176v3Arr == null ? 0 : c5176v3Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5176v3[] c5176v3Arr2 = new C5176v3[i10];
                if (length != 0) {
                    System.arraycopy(c5176v3Arr, 0, c5176v3Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5176v3 c5176v3 = new C5176v3();
                    c5176v3Arr2[length] = c5176v3;
                    codedInputByteBufferNano.readMessage(c5176v3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5176v3 c5176v32 = new C5176v3();
                c5176v3Arr2[length] = c5176v32;
                codedInputByteBufferNano.readMessage(c5176v32);
                this.f68010b = c5176v3Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5176v3 c5176v3 = this.f68009a;
        if (c5176v3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5176v3);
        }
        C5176v3[] c5176v3Arr = this.f68010b;
        if (c5176v3Arr != null && c5176v3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5176v3[] c5176v3Arr2 = this.f68010b;
                if (i10 >= c5176v3Arr2.length) {
                    break;
                }
                C5176v3 c5176v32 = c5176v3Arr2[i10];
                if (c5176v32 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5176v32);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5176v3 c5176v3 = this.f68009a;
        if (c5176v3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5176v3);
        }
        C5176v3[] c5176v3Arr = this.f68010b;
        if (c5176v3Arr != null && c5176v3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5176v3[] c5176v3Arr2 = this.f68010b;
                if (i10 >= c5176v3Arr2.length) {
                    break;
                }
                C5176v3 c5176v32 = c5176v3Arr2[i10];
                if (c5176v32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5176v32);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
