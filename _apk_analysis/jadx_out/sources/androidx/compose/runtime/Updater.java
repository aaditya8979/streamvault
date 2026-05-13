package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import bn.r;
import com.ironsource.C3978d4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\"\u001a\u00020!ø\u0001\u0001¢\u0006\u0004\b&\u0010'J7\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\b\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ5\u0010\n\u001a\u00020\u0006\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u0004\u001a\u00028\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\fJ7\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\b\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ5\u0010\u000e\u001a\u00020\u0006\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u0004\u001a\u00028\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010%\u0088\u0001\"\u0092\u0001\u00020!ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/runtime/Updater;", "T", "", "", "value", "Lkotlin/Function2;", "Lbn/r;", "block", "set-impl", "(Landroidx/compose/runtime/Composer;ILsn/p;)V", "set", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lsn/p;)V", "update-impl", "update", "Lkotlin/Function1;", "init-impl", "(Landroidx/compose/runtime/Composer;Lsn/l;)V", C3978d4.a.f31210f, "reconcile-impl", "reconcile", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/Composer;", "composer", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class Updater<T> {

    @NotNull
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m1273boximpl(Composer composer) {
        return new Updater(composer);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m1274constructorimpl(@NotNull Composer composer) {
        p.k(composer, "composer");
        return composer;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1275equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && p.f(composer, ((Updater) obj).getComposer());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1276equalsimpl0(Composer composer, Composer composer2) {
        return p.f(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1277hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* JADX INFO: renamed from: init-impl, reason: not valid java name */
    public static final void m1278initimpl(Composer composer, @NotNull final l<? super T, r> lVar) {
        p.k(lVar, "block");
        if (composer.getInserting()) {
            composer.apply(r.f5635a, new sn.p<T, r, r>() { // from class: androidx.compose.runtime.Updater$init$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Object obj, r rVar) {
                    invoke2(obj, rVar);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t10, @NotNull r rVar) {
                    p.k(rVar, "it");
                    lVar.invoke(t10);
                }
            });
        }
    }

    /* JADX INFO: renamed from: reconcile-impl, reason: not valid java name */
    public static final void m1279reconcileimpl(Composer composer, @NotNull final l<? super T, r> lVar) {
        p.k(lVar, "block");
        composer.apply(r.f5635a, new sn.p<T, r, r>() { // from class: androidx.compose.runtime.Updater$reconcile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Object obj, r rVar) {
                invoke2(obj, rVar);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t10, @NotNull r rVar) {
                p.k(rVar, "it");
                lVar.invoke(t10);
            }
        });
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m1280setimpl(Composer composer, int i10, @NotNull sn.p<? super T, ? super Integer, r> pVar) {
        p.k(pVar, "block");
        if (composer.getInserting() || !p.f(composer.rememberedValue(), Integer.valueOf(i10))) {
            composer.updateRememberedValue(Integer.valueOf(i10));
            composer.apply(Integer.valueOf(i10), pVar);
        }
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final <V> void m1281setimpl(Composer composer, V v10, @NotNull sn.p<? super T, ? super V, r> pVar) {
        p.k(pVar, "block");
        if (composer.getInserting() || !p.f(composer.rememberedValue(), v10)) {
            composer.updateRememberedValue(v10);
            composer.apply(v10, pVar);
        }
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1282toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final void m1283updateimpl(Composer composer, int i10, @NotNull sn.p<? super T, ? super Integer, r> pVar) {
        p.k(pVar, "block");
        boolean inserting = composer.getInserting();
        if (inserting || !p.f(composer.rememberedValue(), Integer.valueOf(i10))) {
            composer.updateRememberedValue(Integer.valueOf(i10));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i10), pVar);
        }
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final <V> void m1284updateimpl(Composer composer, V v10, @NotNull sn.p<? super T, ? super V, r> pVar) {
        p.k(pVar, "block");
        boolean inserting = composer.getInserting();
        if (inserting || !p.f(composer.rememberedValue(), v10)) {
            composer.updateRememberedValue(v10);
            if (inserting) {
                return;
            }
            composer.apply(v10, pVar);
        }
    }

    public boolean equals(Object obj) {
        return m1275equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m1277hashCodeimpl(this.composer);
    }

    public String toString() {
        return m1282toStringimpl(this.composer);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Composer getComposer() {
        return this.composer;
    }
}
