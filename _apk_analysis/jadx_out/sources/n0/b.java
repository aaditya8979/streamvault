package n0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j0.g;
import j0.m;
import kotlin.Metadata;
import n0.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NoneTransition.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Ln0/b;", "Ln0/c;", "Lbn/r;", "a", "Ln0/d;", "Ln0/d;", TypedValues.AttributesType.S_TARGET, "Lj0/g;", "b", "Lj0/g;", "result", "<init>", "(Ln0/d;Lj0/g;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d target;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g result;

    /* JADX INFO: compiled from: NoneTransition.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0010"}, d2 = {"Ln0/b$a;", "Ln0/c$a;", "Ln0/d;", TypedValues.AttributesType.S_TARGET, "Lj0/g;", "result", "Ln0/c;", "a", "", "other", "", "equals", "", "hashCode", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements c.a {
        @Override // n0.c.a
        @NotNull
        public c a(@NotNull d target, @NotNull g result) {
            return new b(target, result);
        }

        public boolean equals(@Nullable Object other) {
            return other instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(@NotNull d dVar, @NotNull g gVar) {
        this.target = dVar;
        this.result = gVar;
    }

    @Override // n0.c
    public void a() {
        g gVar = this.result;
        if (gVar instanceof m) {
            this.target.onSuccess(((m) gVar).getDrawable());
        } else if (gVar instanceof j0.d) {
            this.target.b(gVar.getDrawable());
        }
    }
}
