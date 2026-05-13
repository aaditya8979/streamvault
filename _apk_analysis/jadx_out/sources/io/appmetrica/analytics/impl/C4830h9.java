package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4830h9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66898d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66899e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f66900f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f66901g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f66902h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f66903i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f66904j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f66905k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f66906l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f66907m = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f66908n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f66909o = 11;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f66910p = 12;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile C4830h9[] f66911q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f66912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4804g9 f66913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4778f9[] f66914c;

    public C4830h9() {
        a();
    }

    public static C4830h9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4830h9) MessageNano.mergeFrom(new C4830h9(), bArr);
    }

    public static C4830h9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4830h9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4830h9[] b() {
        if (f66911q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66911q == null) {
                    f66911q = new C4830h9[0];
                }
            }
        }
        return f66911q;
    }

    public final C4830h9 a() {
        this.f66912a = 0L;
        this.f66913b = null;
        this.f66914c = C4778f9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4830h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f66912a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 18) {
                if (this.f66913b == null) {
                    this.f66913b = new C4804g9();
                }
                codedInputByteBufferNano.readMessage(this.f66913b);
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4778f9[] c4778f9Arr = this.f66914c;
                int length = c4778f9Arr == null ? 0 : c4778f9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4778f9[] c4778f9Arr2 = new C4778f9[i10];
                if (length != 0) {
                    System.arraycopy(c4778f9Arr, 0, c4778f9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4778f9 c4778f9 = new C4778f9();
                    c4778f9Arr2[length] = c4778f9;
                    codedInputByteBufferNano.readMessage(c4778f9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4778f9 c4778f92 = new C4778f9();
                c4778f9Arr2[length] = c4778f92;
                codedInputByteBufferNano.readMessage(c4778f92);
                this.f66914c = c4778f9Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f66912a) + super.computeSerializedSize();
        C4804g9 c4804g9 = this.f66913b;
        if (c4804g9 != null) {
            iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c4804g9);
        }
        C4778f9[] c4778f9Arr = this.f66914c;
        if (c4778f9Arr != null && c4778f9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4778f9[] c4778f9Arr2 = this.f66914c;
                if (i10 >= c4778f9Arr2.length) {
                    break;
                }
                C4778f9 c4778f9 = c4778f9Arr2[i10];
                if (c4778f9 != null) {
                    iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(3, c4778f9);
                }
                i10++;
            }
        }
        return iComputeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f66912a);
        C4804g9 c4804g9 = this.f66913b;
        if (c4804g9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4804g9);
        }
        C4778f9[] c4778f9Arr = this.f66914c;
        if (c4778f9Arr != null && c4778f9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4778f9[] c4778f9Arr2 = this.f66914c;
                if (i10 >= c4778f9Arr2.length) {
                    break;
                }
                C4778f9 c4778f9 = c4778f9Arr2[i10];
                if (c4778f9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4778f9);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
