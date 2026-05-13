package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import bn.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: Composables.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u001a,\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a6\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\b\u001a@\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\n\u001aJ\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\f\u001aD\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u000f\u001aD\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a0\u0010\u0016\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a0\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0013\b\u0004\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a_\u0010\"\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a_\u0010$\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010#\u001an\u0010\"\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010%\u001an\u0010$\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u008f\u0001\u0010\"\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u001f\b\b\u0010'\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00102\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010(\u001a\u008f\u0001\u0010$\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u001f\b\b\u0010'\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00102\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010(\u001a\b\u0010)\u001a\u00020\u0014H\u0001\u001a\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,\"\u0011\u00100\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0011\u00104\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0017\u0010:\u001a\u0002058G¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107\"\u0011\u0010>\u001a\u00020;8G¢\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006?"}, d2 = {"T", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "calculation", "remember", "(Lsn/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "key1", "(Ljava/lang/Object;Lsn/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lsn/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lsn/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "keys", "([Ljava/lang/Object;Lsn/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Landroidx/compose/runtime/Composable;", "block", "key", "([Ljava/lang/Object;Lsn/p;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Lbn/r;", "content", "ReusableContent", "(Ljava/lang/Object;Lsn/p;Landroidx/compose/runtime/Composer;I)V", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "ReusableContentHost", "(ZLsn/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Applier;", ExifInterface.LONGITUDE_EAST, "factory", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "update", "ComposeNode", "(Lsn/a;Lsn/l;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "(Lsn/a;Lsn/l;Lsn/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/SkippableUpdater;", "skippableUpdate", "(Lsn/a;Lsn/l;Lsn/q;Lsn/p;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "Landroidx/compose/runtime/CompositionContext;", "rememberCompositionContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentComposer", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "currentRecomposeScope", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "()V", "currentCompositionLocalContext", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 6, 0})
public final class ComposablesKt {
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(final a<? extends T> aVar, l<? super Updater<T>, r> lVar, Composer composer, int i10) {
        p.k(aVar, "factory");
        p.k(lVar, "update");
        composer.startReplaceableGroup(1886828752);
        Applier<?> applier = composer.getApplier();
        p.q(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(new a<T>() { // from class: androidx.compose.runtime.ComposablesKt.ComposeNode.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // sn.a
                @NotNull
                public final T invoke() {
                    return aVar.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m1273boximpl(Updater.m1274constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(a<? extends T> aVar, l<? super Updater<T>, r> lVar, sn.p<? super Composer, ? super Integer, r> pVar, Composer composer, int i10) {
        p.k(aVar, "factory");
        p.k(lVar, "update");
        p.k(pVar, "content");
        composer.startReplaceableGroup(-548224868);
        Applier<?> applier = composer.getApplier();
        p.q(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m1273boximpl(Updater.m1274constructorimpl(composer)));
        pVar.mo2invoke(composer, Integer.valueOf((i10 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(a<? extends T> aVar, l<? super Updater<T>, r> lVar, q<? super SkippableUpdater<T>, ? super Composer, ? super Integer, r> qVar, sn.p<? super Composer, ? super Integer, r> pVar, Composer composer, int i10) {
        p.k(aVar, "factory");
        p.k(lVar, "update");
        p.k(qVar, "skippableUpdate");
        p.k(pVar, "content");
        Applier<?> applier = composer.getApplier();
        p.q(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m1273boximpl(Updater.m1274constructorimpl(composer)));
        qVar.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composer)), composer, Integer.valueOf((i10 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.mo2invoke(composer, Integer.valueOf((i10 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(final a<? extends T> aVar, l<? super Updater<T>, r> lVar, Composer composer, int i10) {
        p.k(aVar, "factory");
        p.k(lVar, "update");
        composer.startReplaceableGroup(1405779621);
        Applier<?> applier = composer.getApplier();
        p.q(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new a<T>() { // from class: androidx.compose.runtime.ComposablesKt.ReusableComposeNode.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // sn.a
                @NotNull
                public final T invoke() {
                    return aVar.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        lVar.invoke(Updater.m1273boximpl(Updater.m1274constructorimpl(composer)));
        composer.enableReusing();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(a<? extends T> aVar, l<? super Updater<T>, r> lVar, sn.p<? super Composer, ? super Integer, r> pVar, Composer composer, int i10) {
        p.k(aVar, "factory");
        p.k(lVar, "update");
        p.k(pVar, "content");
        composer.startReplaceableGroup(-692256719);
        Applier<?> applier = composer.getApplier();
        p.q(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        lVar.invoke(Updater.m1273boximpl(Updater.m1274constructorimpl(composer)));
        composer.enableReusing();
        pVar.mo2invoke(composer, Integer.valueOf((i10 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(a<? extends T> aVar, l<? super Updater<T>, r> lVar, q<? super SkippableUpdater<T>, ? super Composer, ? super Integer, r> qVar, sn.p<? super Composer, ? super Integer, r> pVar, Composer composer, int i10) {
        p.k(aVar, "factory");
        p.k(lVar, "update");
        p.k(qVar, "skippableUpdate");
        p.k(pVar, "content");
        Applier<?> applier = composer.getApplier();
        p.q(3, ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        lVar.invoke(Updater.m1273boximpl(Updater.m1274constructorimpl(composer)));
        composer.enableReusing();
        qVar.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composer)), composer, Integer.valueOf((i10 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.mo2invoke(composer, Integer.valueOf((i10 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final void ReusableContent(@Nullable Object obj, @NotNull sn.p<? super Composer, ? super Integer, r> pVar, @Nullable Composer composer, int i10) {
        p.k(pVar, "content");
        composer.startReplaceableGroup(444418301);
        composer.startReusableGroup(207, obj);
        pVar.mo2invoke(composer, Integer.valueOf((i10 >> 3) & 14));
        composer.endReusableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z10, @NotNull sn.p<? super Composer, ? super Integer, r> pVar, @Nullable Composer composer, int i10) {
        p.k(pVar, "content");
        composer.startReusableGroup(207, Boolean.valueOf(z10));
        boolean zChanged = composer.changed(z10);
        if (z10) {
            pVar.mo2invoke(composer, Integer.valueOf((i10 >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(zChanged);
        }
        composer.endReusableGroup();
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final Composer getCurrentComposer(@Nullable Composer composer, int i10) {
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    @Composable
    public static final int getCurrentCompositeKeyHash(@Nullable Composer composer, int i10) {
        return composer.getCompoundKeyHash();
    }

    @Composable
    @NotNull
    public static final CompositionLocalContext getCurrentCompositionLocalContext(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-43352356);
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        composer.endReplaceableGroup();
        return compositionLocalContext;
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final RecomposeScope getCurrentRecomposeScope(@Nullable Composer composer, int i10) {
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found".toString());
        }
        composer.recordUsed(recomposeScope);
        return recomposeScope;
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> T key(@NotNull Object[] objArr, @NotNull sn.p<? super Composer, ? super Integer, ? extends T> pVar, @Nullable Composer composer, int i10) {
        p.k(objArr, "keys");
        p.k(pVar, "block");
        composer.startReplaceableGroup(-11941951);
        T tMo2invoke = pVar.mo2invoke(composer, Integer.valueOf((i10 >> 3) & 14));
        composer.endReplaceableGroup();
        return tMo2invoke;
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull a<? extends T> aVar, @Nullable Composer composer, int i10) {
        p.k(aVar, "calculation");
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = aVar.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @Nullable Object obj2, @NotNull a<? extends T> aVar, @Nullable Composer composer, int i10) {
        p.k(aVar, "calculation");
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = aVar.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @NotNull a<? extends T> aVar, @Nullable Composer composer, int i10) {
        p.k(aVar, "calculation");
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(obj);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = aVar.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    public static final <T> T remember(@NotNull a<? extends T> aVar, @Nullable Composer composer, int i10) {
        p.k(aVar, "calculation");
        composer.startReplaceableGroup(-492369756);
        T tInvoke = (T) composer.rememberedValue();
        if (tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = aVar.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    public static final <T> T remember(@NotNull Object[] objArr, @NotNull a<? extends T> aVar, @Nullable Composer composer, int i10) {
        p.k(objArr, "keys");
        p.k(aVar, "calculation");
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (Object obj : objArr) {
            zChanged |= composer.changed(obj);
        }
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = aVar.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    @NotNull
    public static final CompositionContext rememberCompositionContext(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1165786124);
        CompositionContext compositionContextBuildContext = composer.buildContext();
        composer.endReplaceableGroup();
        return compositionContextBuildContext;
    }
}
