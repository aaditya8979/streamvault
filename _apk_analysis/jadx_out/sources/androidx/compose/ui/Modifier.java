package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes8.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&J\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lsn/p;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "all", "other", "then", VastTagName.COMPANION, "Element", "ui_release"}, k = 1, mv = {1, 6, 0})
public interface Modifier {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lsn/p;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "all", "other", "then", "", "toString", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Modifier {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.Modifier
        public boolean all(@NotNull l<? super Element, Boolean> lVar) {
            p.k(lVar, "predicate");
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(@NotNull l<? super Element, Boolean> lVar) {
            p.k(lVar, "predicate");
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R initial, @NotNull sn.p<? super R, ? super Element, ? extends R> operation) {
            p.k(operation, "operation");
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R initial, @NotNull sn.p<? super Element, ? super R, ? extends R> operation) {
            p.k(operation, "operation");
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        @NotNull
        public Modifier then(@NotNull Modifier other) {
            p.k(other, "other");
            return other;
        }

        @NotNull
        public String toString() {
            return "Modifier";
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Modifier then(@NotNull Modifier modifier, @NotNull Modifier modifier2) {
            p.k(modifier2, "other");
            return Modifier.super.then(modifier2);
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016J\u001c\u0010\r\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "R", "initial", "Lkotlin/Function2;", "operation", "foldIn", "(Ljava/lang/Object;Lsn/p;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "all", "ui_release"}, k = 1, mv = {1, 6, 0})
    public interface Element extends Modifier {

        /* JADX INFO: compiled from: Modifier.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(@NotNull Element element, @NotNull l<? super Element, Boolean> lVar) {
                p.k(lVar, "predicate");
                return Element.super.all(lVar);
            }

            @Deprecated
            public static boolean any(@NotNull Element element, @NotNull l<? super Element, Boolean> lVar) {
                p.k(lVar, "predicate");
                return Element.super.any(lVar);
            }

            @Deprecated
            public static <R> R foldIn(@NotNull Element element, R r10, @NotNull sn.p<? super R, ? super Element, ? extends R> pVar) {
                p.k(pVar, "operation");
                return (R) Element.super.foldIn(r10, pVar);
            }

            @Deprecated
            public static <R> R foldOut(@NotNull Element element, R r10, @NotNull sn.p<? super Element, ? super R, ? extends R> pVar) {
                p.k(pVar, "operation");
                return (R) Element.super.foldOut(r10, pVar);
            }

            @Deprecated
            @NotNull
            public static Modifier then(@NotNull Element element, @NotNull Modifier modifier) {
                p.k(modifier, "other");
                return Element.super.then(modifier);
            }
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(@NotNull l<? super Element, Boolean> lVar) {
            p.k(lVar, "predicate");
            return lVar.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean any(@NotNull l<? super Element, Boolean> lVar) {
            p.k(lVar, "predicate");
            return lVar.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R initial, @NotNull sn.p<? super R, ? super Element, ? extends R> operation) {
            p.k(operation, "operation");
            return operation.mo2invoke(initial, this);
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldOut(R initial, @NotNull sn.p<? super Element, ? super R, ? extends R> operation) {
            p.k(operation, "operation");
            return operation.mo2invoke(this, initial);
        }
    }

    boolean all(@NotNull l<? super Element, Boolean> lVar);

    boolean any(@NotNull l<? super Element, Boolean> lVar);

    <R> R foldIn(R initial, @NotNull sn.p<? super R, ? super Element, ? extends R> operation);

    <R> R foldOut(R initial, @NotNull sn.p<? super Element, ? super R, ? extends R> operation);

    @NotNull
    default Modifier then(@NotNull Modifier other) {
        p.k(other, "other");
        return other == INSTANCE ? this : new CombinedModifier(this, other);
    }
}
