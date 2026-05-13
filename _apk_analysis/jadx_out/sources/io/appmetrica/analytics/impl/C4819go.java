package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4819go extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66875e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f66876f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f66877g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f66878h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile C4819go[] f66879i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f66880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4845ho f66882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4870io f66883d;

    public C4819go() {
        a();
    }

    public static C4819go a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4819go) MessageNano.mergeFrom(new C4819go(), bArr);
    }

    public static C4819go b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4819go().mergeFrom(codedInputByteBufferNano);
    }

    public static C4819go[] b() {
        if (f66879i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f66879i == null) {
                    f66879i = new C4819go[0];
                }
            }
        }
        return f66879i;
    }

    public final C4819go a() {
        this.f66880a = WireFormatNano.EMPTY_BYTES;
        this.f66881b = 0;
        this.f66882c = null;
        this.f66883d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4819go mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f66880a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f66881b = int32;
                }
            } else if (tag == 26) {
                if (this.f66882c == null) {
                    this.f66882c = new C4845ho();
                }
                codedInputByteBufferNano.readMessage(this.f66882c);
            } else if (tag == 34) {
                if (this.f66883d == null) {
                    this.f66883d = new C4870io();
                }
                codedInputByteBufferNano.readMessage(this.f66883d);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f66881b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f66880a) + super.computeSerializedSize();
        C4845ho c4845ho = this.f66882c;
        if (c4845ho != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c4845ho);
        }
        C4870io c4870io = this.f66883d;
        return c4870io != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c4870io) : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f66880a);
        codedOutputByteBufferNano.writeInt32(2, this.f66881b);
        C4845ho c4845ho = this.f66882c;
        if (c4845ho != null) {
            codedOutputByteBufferNano.writeMessage(3, c4845ho);
        }
        C4870io c4870io = this.f66883d;
        if (c4870io != null) {
            codedOutputByteBufferNano.writeMessage(4, c4870io);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
