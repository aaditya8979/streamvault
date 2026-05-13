package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import ue.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Message<M extends Message<M, B>, B extends a<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient ProtoAdapter<M> f53347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient ByteString f53348f;
    public transient int cachedSerializedSize = 0;
    public transient int hashCode = 0;

    public static abstract class a<M extends Message<M, B>, B extends a<M, B>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient ByteString f53349a = ByteString.EMPTY;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Buffer f53350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient c f53351c;

        public final a<M, B> a(int i10, FieldEncoding fieldEncoding, Object obj) {
            f();
            try {
                fieldEncoding.rawProtoAdapter().k(this.f53351c, i10, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        public final a<M, B> b(ByteString byteString) {
            if (byteString.size() > 0) {
                f();
                try {
                    this.f53351c.k(byteString);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public abstract M c();

        public final ByteString d() {
            Buffer buffer = this.f53350b;
            if (buffer != null) {
                this.f53349a = buffer.readByteString();
                this.f53350b = null;
                this.f53351c = null;
            }
            return this.f53349a;
        }

        public final a<M, B> e() throws EOFException {
            this.f53349a = ByteString.EMPTY;
            Buffer buffer = this.f53350b;
            if (buffer != null) {
                buffer.clear();
                this.f53350b = null;
            }
            this.f53351c = null;
            return this;
        }

        public final void f() {
            if (this.f53350b == null) {
                Buffer buffer = new Buffer();
                this.f53350b = buffer;
                c cVar = new c(buffer);
                this.f53351c = cVar;
                try {
                    cVar.k(this.f53349a);
                    this.f53349a = ByteString.EMPTY;
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
        }
    }

    public Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        if (protoAdapter == null) {
            throw new NullPointerException("adapter == null");
        }
        if (byteString == null) {
            throw new NullPointerException("unknownFields == null");
        }
        this.f53347e = protoAdapter;
        this.f53348f = byteString;
    }

    public final ProtoAdapter<M> adapter() {
        return this.f53347e;
    }

    public final void encode(OutputStream outputStream) throws IOException {
        this.f53347e.g(outputStream, this);
    }

    public final void encode(BufferedSink bufferedSink) throws IOException {
        this.f53347e.h(bufferedSink, this);
    }

    public final byte[] encode() {
        return this.f53347e.j(this);
    }

    public abstract a<M, B> newBuilder();

    public String toString() {
        return this.f53347e.q(this);
    }

    public final ByteString unknownFields() {
        ByteString byteString = this.f53348f;
        return byteString != null ? byteString : ByteString.EMPTY;
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().e().c();
    }

    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }
}
