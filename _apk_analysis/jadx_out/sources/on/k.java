package on;

import bn.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final long a(@NotNull Reader reader, @NotNull Writer writer, int i10) throws IOException {
        p.k(reader, "<this>");
        p.k(writer, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            writer.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final void c(@NotNull Reader reader, @NotNull l<? super String, r> lVar) {
        p.k(reader, "<this>");
        p.k(lVar, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = d(bufferedReader).iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            r rVar = r.f5635a;
            b.a(bufferedReader, null);
        } finally {
        }
    }

    @NotNull
    public static final ao.i<String> d(@NotNull BufferedReader bufferedReader) {
        p.k(bufferedReader, "<this>");
        return ao.r.h(new j(bufferedReader));
    }

    @NotNull
    public static final String e(@NotNull Reader reader) {
        p.k(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        p.j(string, "toString(...)");
        return string;
    }
}
