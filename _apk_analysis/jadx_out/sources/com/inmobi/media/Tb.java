package com.inmobi.media;

import com.ironsource.Y5;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Tb {
    public static final void a(String str) {
        tn.p.k(str, Y5.c.f30725c);
        File file = new File(str);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }

    public static final boolean a(String str, String str2, String str3) {
        tn.p.k(str, "tag");
        tn.p.k(str2, "data");
        tn.p.k(str3, Y5.c.f30725c);
        try {
            a(str3);
            File file = new File(str3);
            file.createNewFile();
            FileOutputStream fileOutputStreamFileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(file);
            byte[] bytes = str2.getBytes(bo.c.f5639b);
            tn.p.j(bytes, "getBytes(...)");
            fileOutputStreamFileOutputStreamCtor.write(bytes);
            fileOutputStreamFileOutputStreamCtor.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final String b(String str) {
        tn.p.k(str, Y5.c.f30725c);
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            try {
                return on.g.l(file, null, 1, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
