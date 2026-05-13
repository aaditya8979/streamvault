package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5181v8 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f67813g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f67814h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f67815i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f67816j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f67817k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f67818l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f67819m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f67820n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile C5181v8[] f67821o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5156u8 f67823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5106s8 f67824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5131t8 f67825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4751e8 f67826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4906k8 f67827f;

    public C5181v8() {
        a();
    }

    public static C5181v8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5181v8) MessageNano.mergeFrom(new C5181v8(), bArr);
    }

    public static C5181v8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5181v8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5181v8[] b() {
        if (f67821o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67821o == null) {
                    f67821o = new C5181v8[0];
                }
            }
        }
        return f67821o;
    }

    public final C5181v8 a() {
        this.f67822a = 0;
        this.f67823b = null;
        this.f67824c = null;
        this.f67825d = null;
        this.f67826e = null;
        this.f67827f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5181v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        this.f67822a = int32;
                        break;
                }
            } else if (tag == 18) {
                if (this.f67823b == null) {
                    this.f67823b = new C5156u8();
                }
                codedInputByteBufferNano.readMessage(this.f67823b);
            } else if (tag == 26) {
                if (this.f67824c == null) {
                    this.f67824c = new C5106s8();
                }
                codedInputByteBufferNano.readMessage(this.f67824c);
            } else if (tag == 34) {
                if (this.f67825d == null) {
                    this.f67825d = new C5131t8();
                }
                codedInputByteBufferNano.readMessage(this.f67825d);
            } else if (tag == 42) {
                if (this.f67826e == null) {
                    this.f67826e = new C4751e8();
                }
                codedInputByteBufferNano.readMessage(this.f67826e);
            } else if (tag == 50) {
                if (this.f67827f == null) {
                    this.f67827f = new C4906k8();
                }
                codedInputByteBufferNano.readMessage(this.f67827f);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f67822a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        C5156u8 c5156u8 = this.f67823b;
        if (c5156u8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5156u8);
        }
        C5106s8 c5106s8 = this.f67824c;
        if (c5106s8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5106s8);
        }
        C5131t8 c5131t8 = this.f67825d;
        if (c5131t8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c5131t8);
        }
        C4751e8 c4751e8 = this.f67826e;
        if (c4751e8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c4751e8);
        }
        C4906k8 c4906k8 = this.f67827f;
        return c4906k8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, c4906k8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f67822a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        C5156u8 c5156u8 = this.f67823b;
        if (c5156u8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5156u8);
        }
        C5106s8 c5106s8 = this.f67824c;
        if (c5106s8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5106s8);
        }
        C5131t8 c5131t8 = this.f67825d;
        if (c5131t8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5131t8);
        }
        C4751e8 c4751e8 = this.f67826e;
        if (c4751e8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c4751e8);
        }
        C4906k8 c4906k8 = this.f67827f;
        if (c4906k8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4906k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
