package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class hw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f90582a;

    public hw0(Context context) {
        this.f90582a = context;
    }

    public final Typeface a(sw0 sw0Var) {
        try {
            File fileB = b(sw0Var);
            if (fileB.exists()) {
                return Typeface.createFromFile(fileB);
            }
            return null;
        } catch (Exception unused) {
            boolean z10 = ad1.f87661a;
            return null;
        }
    }

    public final File b(sw0 sw0Var) {
        return new File(new File(this.f90582a.getFilesDir(), "downloaded_fonts"), g43.a(sw0Var.name() + ".ttf"));
    }
}
