package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4701c9 extends MessageNano {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile C4701c9[] f66484n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f66485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f66487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f66489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f66490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f66491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f66492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f66493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f66494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f66495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C4675b9[] f66496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f66497m;

    public C4701c9() {
        a();
    }

    public static C4701c9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4701c9) MessageNano.mergeFrom(new C4701c9(), bArr);
    }

    public static C4701c9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4701c9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4701c9[] b() {
        if (f66484n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66484n == null) {
                    f66484n = new C4701c9[0];
                }
            }
        }
        return f66484n;
    }

    public final C4701c9 a() {
        this.f66485a = "";
        this.f66486b = "";
        this.f66487c = "";
        this.f66488d = 0;
        this.f66489e = "";
        this.f66490f = "";
        this.f66491g = false;
        this.f66492h = 0;
        this.f66493i = "";
        this.f66494j = "";
        this.f66495k = 0;
        this.f66496l = C4675b9.b();
        this.f66497m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4701c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f66485a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f66486b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f66487c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f66488d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f66489e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f66490f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f66491g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f66492h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f66493i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f66494j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f66495k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C4675b9[] c4675b9Arr = this.f66496l;
                    int length = c4675b9Arr == null ? 0 : c4675b9Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C4675b9[] c4675b9Arr2 = new C4675b9[i10];
                    if (length != 0) {
                        System.arraycopy(c4675b9Arr, 0, c4675b9Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C4675b9 c4675b9 = new C4675b9();
                        c4675b9Arr2[length] = c4675b9;
                        codedInputByteBufferNano.readMessage(c4675b9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4675b9 c4675b92 = new C4675b9();
                    c4675b9Arr2[length] = c4675b92;
                    codedInputByteBufferNano.readMessage(c4675b92);
                    this.f66496l = c4675b9Arr2;
                    break;
                case 194:
                    this.f66497m = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f66485a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f66485a);
        }
        if (!this.f66486b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f66486b);
        }
        if (!this.f66487c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f66487c);
        }
        int i10 = this.f66488d;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        if (!this.f66489e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f66489e);
        }
        if (!this.f66490f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f66490f);
        }
        boolean z10 = this.f66491g;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z10);
        }
        int i11 = this.f66492h;
        if (i11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i11);
        }
        if (!this.f66493i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f66493i);
        }
        if (!this.f66494j.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f66494j);
        }
        int i12 = this.f66495k;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i12);
        }
        C4675b9[] c4675b9Arr = this.f66496l;
        if (c4675b9Arr != null && c4675b9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4675b9[] c4675b9Arr2 = this.f66496l;
                if (i13 >= c4675b9Arr2.length) {
                    break;
                }
                C4675b9 c4675b9 = c4675b9Arr2[i13];
                if (c4675b9 != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(23, c4675b9);
                }
                i13++;
            }
        }
        return !this.f66497m.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f66497m) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f66485a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f66485a);
        }
        if (!this.f66486b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f66486b);
        }
        if (!this.f66487c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f66487c);
        }
        int i10 = this.f66488d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        if (!this.f66489e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f66489e);
        }
        if (!this.f66490f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f66490f);
        }
        boolean z10 = this.f66491g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(17, z10);
        }
        int i11 = this.f66492h;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i11);
        }
        if (!this.f66493i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f66493i);
        }
        if (!this.f66494j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f66494j);
        }
        int i12 = this.f66495k;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i12);
        }
        C4675b9[] c4675b9Arr = this.f66496l;
        if (c4675b9Arr != null && c4675b9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C4675b9[] c4675b9Arr2 = this.f66496l;
                if (i13 >= c4675b9Arr2.length) {
                    break;
                }
                C4675b9 c4675b9 = c4675b9Arr2[i13];
                if (c4675b9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c4675b9);
                }
                i13++;
            }
        }
        if (!this.f66497m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f66497m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
