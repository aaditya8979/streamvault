package yads;

import android.util.Base64;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class hn {
    public static String a(String str) {
        Charset charset = bo.c.f5639b;
        byte[] bytes = str.getBytes(charset);
        tn.p.j(bytes, "getBytes(...)");
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            String str2 = new String(bytes, bo.c.f5639b);
            boolean z10 = ad1.f87661a;
            return str2;
        }
    }

    public static String b(String str) {
        Charset charset = bo.c.f5639b;
        byte[] bytes = str.getBytes(charset);
        tn.p.j(bytes, "getBytes(...)");
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            boolean z10 = ad1.f87661a;
            return null;
        }
    }
}
