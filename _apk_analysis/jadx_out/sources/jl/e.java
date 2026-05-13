package jl;

import bo.f0;
import gl.a0;
import gl.f;
import gl.g;
import java.nio.charset.Charset;
import jl.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import ul.h;

/* JADX INFO: compiled from: TextContent.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f72486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f72487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final a0 f72488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final byte[] f72489d;

    public e(@NotNull String str, @NotNull f fVar, @Nullable a0 a0Var) {
        p.k(str, "text");
        p.k(fVar, "contentType");
        this.f72486a = str;
        this.f72487b = fVar;
        this.f72488c = a0Var;
        Charset charsetA = g.a(b());
        this.f72489d = h.d(str, charsetA == null ? bo.c.f5639b : charsetA);
    }

    public /* synthetic */ e(String str, f fVar, a0 a0Var, int i10, i iVar) {
        this(str, fVar, (i10 & 4) != 0 ? null : a0Var);
    }

    @Override // jl.c
    @NotNull
    public Long a() {
        return Long.valueOf(this.f72489d.length);
    }

    @Override // jl.c
    @NotNull
    public f b() {
        return this.f72487b;
    }

    @Override // jl.c.a
    @NotNull
    public byte[] d() {
        return this.f72489d;
    }

    @NotNull
    public String toString() {
        return "TextContent[" + b() + "] \"" + f0.F1(this.f72486a, 30) + '\"';
    }
}
