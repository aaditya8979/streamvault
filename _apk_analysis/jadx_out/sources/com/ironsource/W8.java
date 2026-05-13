package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class W8 implements X8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final W3 f30629a;

    /* JADX WARN: Multi-variable type inference failed */
    public W8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public W8(@NotNull W3 w32) {
        tn.p.k(w32, "connectionFactory");
        this.f30629a = w32;
    }

    public /* synthetic */ W8(W3 w32, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? L4.f29754a : w32);
    }

    private final Object b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            Result.a aVar = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new Exception("file does not exists")));
        }
        Drawable drawableCreateFromPath = Drawable.createFromPath(file.getPath());
        if (drawableCreateFromPath != null) {
            return Result.m7534constructorimpl(drawableCreateFromPath);
        }
        Result.a aVar2 = Result.Companion;
        return Result.m7534constructorimpl(kotlin.c.a(new Exception("failed to create a drawable")));
    }

    private final Object c(String str) throws IOException {
        InputStream inputStreamA = this.f30629a.a(str);
        try {
            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamA, new File(str).getName());
            on.b.a(inputStreamA, null);
            if (drawableCreateFromStream != null) {
                return Result.m7534constructorimpl(drawableCreateFromStream);
            }
            Result.a aVar = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new Exception("failed to create a drawable")));
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                on.b.a(inputStreamA, th2);
                throw th3;
            }
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.X8
    @NotNull
    public Object a(@NotNull String str) {
        tn.p.k(str, "url");
        try {
            return d(str) ? c(str) : b(str);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            Result.a aVar = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(e10));
        }
    }
}
