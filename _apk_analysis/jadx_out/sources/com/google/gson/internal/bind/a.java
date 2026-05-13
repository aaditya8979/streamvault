package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import e8.e;
import e8.h;
import e8.i;
import e8.j;
import e8.l;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: JsonTreeReader.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends JsonReader {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Reader f23625f = new C0322a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f23626g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f23627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f23629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f23630e;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JsonTreeReader.java */
    public static class C0322a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    }

    public a(h hVar) {
        super(f23625f);
        this.f23627b = new Object[32];
        this.f23628c = 0;
        this.f23629d = new String[32];
        this.f23630e = new int[32];
        l(hVar);
    }

    private String locationString() {
        return " at path " + getPath();
    }

    public final void a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        a(JsonToken.BEGIN_ARRAY);
        l(((e) d()).iterator());
        this.f23630e[this.f23628c - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        a(JsonToken.BEGIN_OBJECT);
        l(((j) d()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23627b = new Object[]{f23626g};
        this.f23628c = 1;
    }

    public final Object d() {
        return this.f23627b[this.f23628c - 1];
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        a(JsonToken.END_ARRAY);
        h();
        h();
        int i10 = this.f23628c;
        if (i10 > 0) {
            int[] iArr = this.f23630e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        a(JsonToken.END_OBJECT);
        h();
        h();
        int i10 = this.f23628c;
        if (i10 > 0) {
            int[] iArr = this.f23630e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (i10 < this.f23628c) {
            Object[] objArr = this.f23627b;
            Object obj = objArr[i10];
            if (obj instanceof e) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('[');
                    sb2.append(this.f23630e[i10]);
                    sb2.append(']');
                }
            } else if (obj instanceof j) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('.');
                    String str = this.f23629d[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public final Object h() {
        Object[] objArr = this.f23627b;
        int i10 = this.f23628c - 1;
        this.f23628c = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY) ? false : true;
    }

    public void k() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) d()).next();
        l(entry.getValue());
        l(new l((String) entry.getKey()));
    }

    public final void l(Object obj) {
        int i10 = this.f23628c;
        Object[] objArr = this.f23627b;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[i10 * 2];
            int[] iArr = new int[i10 * 2];
            String[] strArr = new String[i10 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f23630e, 0, iArr, 0, this.f23628c);
            System.arraycopy(this.f23629d, 0, strArr, 0, this.f23628c);
            this.f23627b = objArr2;
            this.f23630e = iArr;
            this.f23629d = strArr;
        }
        Object[] objArr3 = this.f23627b;
        int i11 = this.f23628c;
        this.f23628c = i11 + 1;
        objArr3[i11] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        a(JsonToken.BOOLEAN);
        boolean zM = ((l) h()).m();
        int i10 = this.f23628c;
        if (i10 > 0) {
            int[] iArr = this.f23630e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zM;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        double dO = ((l) d()).o();
        if (!isLenient() && (Double.isNaN(dO) || Double.isInfinite(dO))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dO);
        }
        h();
        int i10 = this.f23628c;
        if (i10 > 0) {
            int[] iArr = this.f23630e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dO;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        int iP = ((l) d()).p();
        h();
        int i10 = this.f23628c;
        if (i10 > 0) {
            int[] iArr = this.f23630e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iP;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        long jQ = ((l) d()).q();
        h();
        int i10 = this.f23628c;
        if (i10 > 0) {
            int[] iArr = this.f23630e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jQ;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) d()).next();
        String str = (String) entry.getKey();
        this.f23629d[this.f23628c - 1] = str;
        l(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        a(JsonToken.NULL);
        h();
        int i10 = this.f23628c;
        if (i10 > 0) {
            int[] iArr = this.f23630e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek == jsonToken || jsonTokenPeek == JsonToken.NUMBER) {
            String strS = ((l) h()).s();
            int i10 = this.f23628c;
            if (i10 > 0) {
                int[] iArr = this.f23630e;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return strS;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f23628c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objD = d();
        if (objD instanceof Iterator) {
            boolean z10 = this.f23627b[this.f23628c - 2] instanceof j;
            Iterator it = (Iterator) objD;
            if (!it.hasNext()) {
                return z10 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z10) {
                return JsonToken.NAME;
            }
            l(it.next());
            return peek();
        }
        if (objD instanceof j) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objD instanceof e) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(objD instanceof l)) {
            if (objD instanceof i) {
                return JsonToken.NULL;
            }
            if (objD == f23626g) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        l lVar = (l) objD;
        if (lVar.x()) {
            return JsonToken.STRING;
        }
        if (lVar.t()) {
            return JsonToken.BOOLEAN;
        }
        if (lVar.v()) {
            return JsonToken.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f23629d[this.f23628c - 2] = "null";
        } else {
            h();
            int i10 = this.f23628c;
            if (i10 > 0) {
                this.f23629d[i10 - 1] = "null";
            }
        }
        int i11 = this.f23628c;
        if (i11 > 0) {
            int[] iArr = this.f23630e;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return a.class.getSimpleName();
    }
}
