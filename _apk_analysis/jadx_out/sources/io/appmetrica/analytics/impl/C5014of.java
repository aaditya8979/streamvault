package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5014of extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f67453c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67454d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67455e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f67456f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5014of[] f67457g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4964mf f67458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4989nf[] f67459b;

    public C5014of() {
        a();
    }

    public static C5014of a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5014of) MessageNano.mergeFrom(new C5014of(), bArr);
    }

    public static C5014of b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5014of().mergeFrom(codedInputByteBufferNano);
    }

    public static C5014of[] b() {
        if (f67457g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67457g == null) {
                    f67457g = new C5014of[0];
                }
            }
        }
        return f67457g;
    }

    public final C5014of a() {
        this.f67458a = null;
        this.f67459b = C4989nf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5014of mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f67458a == null) {
                    this.f67458a = new C4964mf();
                }
                codedInputByteBufferNano.readMessage(this.f67458a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4989nf[] c4989nfArr = this.f67459b;
                int length = c4989nfArr == null ? 0 : c4989nfArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4989nf[] c4989nfArr2 = new C4989nf[i10];
                if (length != 0) {
                    System.arraycopy(c4989nfArr, 0, c4989nfArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4989nf c4989nf = new C4989nf();
                    c4989nfArr2[length] = c4989nf;
                    codedInputByteBufferNano.readMessage(c4989nf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4989nf c4989nf2 = new C4989nf();
                c4989nfArr2[length] = c4989nf2;
                codedInputByteBufferNano.readMessage(c4989nf2);
                this.f67459b = c4989nfArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4964mf c4964mf = this.f67458a;
        if (c4964mf != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4964mf);
        }
        C4989nf[] c4989nfArr = this.f67459b;
        if (c4989nfArr != null && c4989nfArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4989nf[] c4989nfArr2 = this.f67459b;
                if (i10 >= c4989nfArr2.length) {
                    break;
                }
                C4989nf c4989nf = c4989nfArr2[i10];
                if (c4989nf != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4989nf);
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4964mf c4964mf = this.f67458a;
        if (c4964mf != null) {
            codedOutputByteBufferNano.writeMessage(1, c4964mf);
        }
        C4989nf[] c4989nfArr = this.f67459b;
        if (c4989nfArr != null && c4989nfArr.length > 0) {
            int i10 = 0;
            while (true) {
                C4989nf[] c4989nfArr2 = this.f67459b;
                if (i10 >= c4989nfArr2.length) {
                    break;
                }
                C4989nf c4989nf = c4989nfArr2[i10];
                if (c4989nf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4989nf);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
