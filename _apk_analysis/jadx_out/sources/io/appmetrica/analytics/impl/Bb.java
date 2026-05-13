package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class Bb extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Bb[] f65030f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f65031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f65032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f65033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f65034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f65035e;

    public Bb() {
        a();
    }

    public static Bb a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Bb) MessageNano.mergeFrom(new Bb(), bArr);
    }

    public static Bb b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Bb().mergeFrom(codedInputByteBufferNano);
    }

    public static Bb[] b() {
        if (f65030f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f65030f == null) {
                    f65030f = new Bb[0];
                }
            }
        }
        return f65030f;
    }

    public final Bb a() {
        this.f65031a = "";
        this.f65032b = "";
        this.f65033c = false;
        this.f65034d = "";
        this.f65035e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f65031a = codedInputByteBufferNano.readString();
            } else if (tag == 154) {
                this.f65032b = codedInputByteBufferNano.readString();
            } else if (tag == 176) {
                this.f65033c = codedInputByteBufferNano.readBool();
            } else if (tag == 202) {
                this.f65034d = codedInputByteBufferNano.readString();
            } else if (tag == 210) {
                this.f65035e = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f65031a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f65031a);
        }
        if (!this.f65032b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f65032b);
        }
        boolean z10 = this.f65033c;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z10);
        }
        if (!this.f65034d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f65034d);
        }
        return !this.f65035e.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(26, this.f65035e) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f65031a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f65031a);
        }
        if (!this.f65032b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f65032b);
        }
        boolean z10 = this.f65033c;
        if (z10) {
            codedOutputByteBufferNano.writeBool(22, z10);
        }
        if (!this.f65034d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f65034d);
        }
        if (!this.f65035e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f65035e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
