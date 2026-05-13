package p000do;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CoroutineName.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class k0 extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f59860c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f59861b;

    /* JADX INFO: compiled from: CoroutineName.kt */
    public static final class a implements d.c<k0> {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public k0(@NotNull String str) {
        super(f59860c);
        this.f59861b = str;
    }

    @NotNull
    public final String I() {
        return this.f59861b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && p.f(this.f59861b, ((k0) obj).f59861b);
    }

    public int hashCode() {
        return this.f59861b.hashCode();
    }

    @NotNull
    public String toString() {
        return "CoroutineName(" + this.f59861b + ')';
    }
}
