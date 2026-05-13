package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class W1 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f66062c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66063d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66064e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f66065f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f66066g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f66067h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f66068i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f66069j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f66070k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f66071l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile W1[] f66072m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66074b;

    public W1() {
        a();
    }

    public static W1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (W1) MessageNano.mergeFrom(new W1(), bArr);
    }

    public static W1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new W1().mergeFrom(codedInputByteBufferNano);
    }

    public static W1[] b() {
        if (f66072m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66072m == null) {
                    f66072m = new W1[0];
                }
            }
        }
        return f66072m;
    }

    public final W1 a() {
        this.f66073a = 0;
        this.f66074b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f66073a = int32;
                        break;
                }
            } else if (tag == 24) {
                int int322 = codedInputByteBufferNano.readInt32();
                if (int322 == -1 || int322 == 0 || int322 == 1) {
                    this.f66074b = int322;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f66074b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f66073a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f66073a);
        codedOutputByteBufferNano.writeInt32(3, this.f66074b);
        super.writeTo(codedOutputByteBufferNano);
    }
}
