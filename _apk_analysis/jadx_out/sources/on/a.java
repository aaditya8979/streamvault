package on;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: IOStreams.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final long a(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int i10) throws IOException {
        p.k(inputStream, "<this>");
        p.k(outputStream, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            outputStream.write(bArr, 0, i11);
            j10 += (long) i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(inputStream, outputStream, i10);
    }

    @NotNull
    public static final byte[] c(@NotNull InputStream inputStream) {
        p.k(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p.j(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
