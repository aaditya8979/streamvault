package n0;

import androidx.annotation.MainThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import j0.g;
import kotlin.Metadata;
import n0.b;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0003J\b\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0004"}, d2 = {"Ln0/c;", "", "Lbn/r;", "a", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public interface c {

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Ln0/c$a;", "", "Ln0/d;", TypedValues.AttributesType.S_TARGET, "Lj0/g;", "result", "Ln0/c;", "a", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f75009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f75008b = new b.a();

        /* JADX INFO: renamed from: n0.c$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Ln0/c$a$a;", "", "Ln0/c$a;", Constraint.NONE, "Ln0/c$a;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f75009a = new Companion();
        }

        @NotNull
        c a(@NotNull d target, @NotNull g result);
    }

    @MainThread
    void a();
}
