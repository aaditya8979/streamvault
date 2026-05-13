package g8;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: compiled from: Streams.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: compiled from: Streams.java */
    public static final class a extends Writer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Appendable f62240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0770a f62241c = new C0770a();

        /* JADX INFO: renamed from: g8.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Streams.java */
        public static class C0770a implements CharSequence {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public char[] f62242b;

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f62242b[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f62242b.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f62242b, i10, i11 - i10);
            }
        }

        public a(Appendable appendable) {
            this.f62240b = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f62240b.append((char) i10);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            C0770a c0770a = this.f62241c;
            c0770a.f62242b = cArr;
            this.f62240b.append(c0770a, i10, i11 + i10);
        }
    }

    public static e8.h a(JsonReader jsonReader) throws JsonParseException {
        boolean z10;
        try {
            try {
                jsonReader.peek();
                z10 = false;
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            try {
                return TypeAdapters.X.b(jsonReader);
            } catch (EOFException e11) {
                e = e11;
                if (z10) {
                    return e8.i.f60935b;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e12) {
            throw new JsonSyntaxException(e12);
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        } catch (NumberFormatException e14) {
            throw new JsonSyntaxException(e14);
        }
    }

    public static void b(e8.h hVar, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.X.d(jsonWriter, hVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
