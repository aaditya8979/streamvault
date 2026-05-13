package com.google.gson.internal.bind;

import com.google.gson.stream.JsonWriter;
import e8.e;
import e8.h;
import e8.i;
import e8.j;
import e8.l;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: JsonTreeWriter.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends JsonWriter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Writer f23631e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f23632f = new l("closed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h> f23633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f23635d;

    /* JADX INFO: compiled from: JsonTreeWriter.java */
    public static class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f23631e);
        this.f23633b = new ArrayList();
        this.f23635d = i.f60935b;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        e eVar = new e();
        k(eVar);
        this.f23633b.add(eVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        j jVar = new j();
        k(jVar);
        this.f23633b.add(jVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f23633b.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f23633b.add(f23632f);
    }

    public h d() {
        if (this.f23633b.isEmpty()) {
            return this.f23635d;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f23633b);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (this.f23633b.isEmpty() || this.f23634c != null) {
            throw new IllegalStateException();
        }
        if (!(h() instanceof e)) {
            throw new IllegalStateException();
        }
        this.f23633b.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (this.f23633b.isEmpty() || this.f23634c != null) {
            throw new IllegalStateException();
        }
        if (!(h() instanceof j)) {
            throw new IllegalStateException();
        }
        this.f23633b.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    public final h h() {
        return this.f23633b.get(r0.size() - 1);
    }

    public final void k(h hVar) {
        if (this.f23634c != null) {
            if (!hVar.i() || getSerializeNulls()) {
                ((j) h()).m(this.f23634c, hVar);
            }
            this.f23634c = null;
            return;
        }
        if (this.f23633b.isEmpty()) {
            this.f23635d = hVar;
            return;
        }
        h hVarH = h();
        if (!(hVarH instanceof e)) {
            throw new IllegalStateException();
        }
        ((e) hVarH).m(hVar);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        if (this.f23633b.isEmpty() || this.f23634c != null) {
            throw new IllegalStateException();
        }
        if (!(h() instanceof j)) {
            throw new IllegalStateException();
        }
        this.f23634c = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        k(i.f60935b);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d10) throws IOException {
        if (isLenient() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            k(new l(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j10) throws IOException {
        k(new l(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        k(new l(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        k(new l(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        k(new l(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z10) throws IOException {
        k(new l(Boolean.valueOf(z10)));
        return this;
    }
}
