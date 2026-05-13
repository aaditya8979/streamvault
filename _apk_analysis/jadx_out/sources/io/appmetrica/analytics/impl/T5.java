package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class T5 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile T5[] f65921d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S5 f65922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f65923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65924c;

    public T5() {
        a();
    }

    public static T5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T5) MessageNano.mergeFrom(new T5(), bArr);
    }

    public static T5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new T5().mergeFrom(codedInputByteBufferNano);
    }

    public static T5[] b() {
        if (f65921d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f65921d == null) {
                    f65921d = new T5[0];
                }
            }
        }
        return f65921d;
    }

    public final T5 a() {
        this.f65922a = null;
        this.f65923b = "";
        this.f65924c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f65922a == null) {
                    this.f65922a = new S5();
                }
                codedInputByteBufferNano.readMessage(this.f65922a);
            } else if (tag == 18) {
                this.f65923b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f65924c = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        S5 s52 = this.f65922a;
        if (s52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, s52);
        }
        if (!this.f65923b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f65923b);
        }
        int i10 = this.f65924c;
        return i10 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i10) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        S5 s52 = this.f65922a;
        if (s52 != null) {
            codedOutputByteBufferNano.writeMessage(1, s52);
        }
        if (!this.f65923b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f65923b);
        }
        int i10 = this.f65924c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
