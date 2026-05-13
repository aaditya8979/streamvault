package yads;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class b71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f87931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v61 f87932b;

    public b71(Context context, v61 v61Var) {
        this.f87931a = context;
        this.f87932b = v61Var;
    }

    public final a71 a(String str) {
        try {
            File fileA = this.f87932b.a();
            File parentFile = fileA.getParentFile();
            long freeSpace = parentFile != null ? parentFile.getFreeSpace() : 0L;
            byte[] bytes = str.getBytes(bo.c.f5639b);
            tn.p.j(bytes, "getBytes(...)");
            if (bytes.length >= freeSpace) {
                return new x61("Not enough space error");
            }
            on.g.m(fileA, bytes);
            return new z61(FileProvider.getUriForFile(this.f87931a, this.f87931a.getPackageName() + ".monetization.ads.inspector.fileprovider", fileA));
        } catch (Exception unused) {
            boolean z10 = ad1.f87661a;
            return new x61("Failed to save report");
        }
    }
}
