package io.appmetrica.analytics.impl;

import androidx.work.WorkRequest;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5220wm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5220wm[] f67912b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f67913a;

    public C5220wm() {
        a();
    }

    public static C5220wm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5220wm) MessageNano.mergeFrom(new C5220wm(), bArr);
    }

    public static C5220wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5220wm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5220wm[] b() {
        if (f67912b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f67912b == null) {
                    f67912b = new C5220wm[0];
                }
            }
        }
        return f67912b;
    }

    public final C5220wm a() {
        this.f67913a = WorkRequest.MAX_BACKOFF_MILLIS;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5220wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f67913a = codedInputByteBufferNano.readInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f67913a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f67913a);
        super.writeTo(codedOutputByteBufferNano);
    }
}
