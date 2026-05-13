package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReaderJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements CharSequence {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final char[] f97946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97947c;

    public i(@NotNull char[] cArr) {
        tn.p.k(cArr, "buffer");
        this.f97946b = cArr;
        this.f97947c = cArr.length;
    }

    public char a(int i10) {
        return this.f97946b[i10];
    }

    @NotNull
    public final char[] b() {
        return this.f97946b;
    }

    public int c() {
        return this.f97947c;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public void d(int i10) {
        this.f97947c = i10;
    }

    @NotNull
    public final String e(int i10, int i11) {
        return bo.a0.y(this.f97946b, i10, Math.min(i11, length()));
    }

    public final void f(int i10) {
        d(Math.min(this.f97946b.length, i10));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int i10, int i11) {
        return bo.a0.y(this.f97946b, i10, Math.min(i11, length()));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return e(0, length());
    }
}
