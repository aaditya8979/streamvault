package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4698c6 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C4698c6[] f66476f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f66477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4646a6[] f66479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4698c6 f66480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4698c6[] f66481e;

    public C4698c6() {
        a();
    }

    public static C4698c6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4698c6) MessageNano.mergeFrom(new C4698c6(), bArr);
    }

    public static C4698c6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4698c6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4698c6[] b() {
        if (f66476f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66476f == null) {
                    f66476f = new C4698c6[0];
                }
            }
        }
        return f66476f;
    }

    public final C4698c6 a() {
        this.f66477a = "";
        this.f66478b = "";
        this.f66479c = C4646a6.b();
        this.f66480d = null;
        this.f66481e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4698c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66477a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f66478b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4646a6[] c4646a6Arr = this.f66479c;
                int length = c4646a6Arr == null ? 0 : c4646a6Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4646a6[] c4646a6Arr2 = new C4646a6[i10];
                if (length != 0) {
                    System.arraycopy(c4646a6Arr, 0, c4646a6Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4646a6 c4646a6 = new C4646a6();
                    c4646a6Arr2[length] = c4646a6;
                    codedInputByteBufferNano.readMessage(c4646a6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4646a6 c4646a62 = new C4646a6();
                c4646a6Arr2[length] = c4646a62;
                codedInputByteBufferNano.readMessage(c4646a62);
                this.f66479c = c4646a6Arr2;
            } else if (tag == 34) {
                if (this.f66480d == null) {
                    this.f66480d = new C4698c6();
                }
                codedInputByteBufferNano.readMessage(this.f66480d);
            } else if (tag == 42) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C4698c6[] c4698c6Arr = this.f66481e;
                int length2 = c4698c6Arr == null ? 0 : c4698c6Arr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                C4698c6[] c4698c6Arr2 = new C4698c6[i11];
                if (length2 != 0) {
                    System.arraycopy(c4698c6Arr, 0, c4698c6Arr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    C4698c6 c4698c6 = new C4698c6();
                    c4698c6Arr2[length2] = c4698c6;
                    codedInputByteBufferNano.readMessage(c4698c6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C4698c6 c4698c62 = new C4698c6();
                c4698c6Arr2[length2] = c4698c62;
                codedInputByteBufferNano.readMessage(c4698c62);
                this.f66481e = c4698c6Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f66477a) + super.computeSerializedSize();
        if (!this.f66478b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f66478b);
        }
        C4646a6[] c4646a6Arr = this.f66479c;
        int i10 = 0;
        if (c4646a6Arr != null && c4646a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4646a6[] c4646a6Arr2 = this.f66479c;
                if (i11 >= c4646a6Arr2.length) {
                    break;
                }
                C4646a6 c4646a6 = c4646a6Arr2[i11];
                if (c4646a6 != null) {
                    iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(3, c4646a6);
                }
                i11++;
            }
        }
        C4698c6 c4698c6 = this.f66480d;
        if (c4698c6 != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c4698c6);
        }
        C4698c6[] c4698c6Arr = this.f66481e;
        if (c4698c6Arr != null && c4698c6Arr.length > 0) {
            while (true) {
                C4698c6[] c4698c6Arr2 = this.f66481e;
                if (i10 >= c4698c6Arr2.length) {
                    break;
                }
                C4698c6 c4698c62 = c4698c6Arr2[i10];
                if (c4698c62 != null) {
                    iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(5, c4698c62);
                }
                i10++;
            }
        }
        return iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f66477a);
        if (!this.f66478b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f66478b);
        }
        C4646a6[] c4646a6Arr = this.f66479c;
        int i10 = 0;
        if (c4646a6Arr != null && c4646a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4646a6[] c4646a6Arr2 = this.f66479c;
                if (i11 >= c4646a6Arr2.length) {
                    break;
                }
                C4646a6 c4646a6 = c4646a6Arr2[i11];
                if (c4646a6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4646a6);
                }
                i11++;
            }
        }
        C4698c6 c4698c6 = this.f66480d;
        if (c4698c6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4698c6);
        }
        C4698c6[] c4698c6Arr = this.f66481e;
        if (c4698c6Arr != null && c4698c6Arr.length > 0) {
            while (true) {
                C4698c6[] c4698c6Arr2 = this.f66481e;
                if (i10 >= c4698c6Arr2.length) {
                    break;
                }
                C4698c6 c4698c62 = c4698c6Arr2[i10];
                if (c4698c62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c4698c62);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
