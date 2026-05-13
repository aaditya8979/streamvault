package on;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements ao.i<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BufferedReader f76501a;

    /* JADX INFO: compiled from: ReadWrite.kt */
    public static final class a implements Iterator<String>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f76502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f76503c;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f76502b;
            this.f76502b = null;
            p.h(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f76502b == null && !this.f76503c) {
                String line = j.this.f76501a.readLine();
                this.f76502b = line;
                if (line == null) {
                    this.f76503c = true;
                }
            }
            return this.f76502b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j(@NotNull BufferedReader bufferedReader) {
        p.k(bufferedReader, "reader");
        this.f76501a = bufferedReader;
    }

    @Override // ao.i
    @NotNull
    public Iterator<String> iterator() {
        return new a();
    }
}
