package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import bn.h;
import bn.r;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;
import sn.q;
import sn.s;
import sn.t;

/* JADX INFO: compiled from: MovableContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a=\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u00062\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\b\u001aO\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u001d\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\f\u001aa\u0010\u0004\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\r2#\u0010\u0003\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u000f\u001as\u0010\u0004\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00102)\u0010\u0003\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u0012\u001a=\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u00132\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0014\u0010\b\u001aO\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u00062\u001d\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0014\u0010\f\u001aa\u0010\u0014\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n2#\u0010\u0003\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0014\u0010\u000f\u001as\u0010\u0014\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n\"\u0004\b\u0003\u0010\r2)\u0010\u0003\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "content", "movableContentOf", "(Lsn/p;)Lsn/p;", "P", "Lkotlin/Function1;", "(Lsn/q;)Lsn/q;", "P1", "P2", "Lkotlin/Function2;", "(Lsn/r;)Lsn/r;", "P3", "Lkotlin/Function3;", "(Lsn/s;)Lsn/s;", "P4", "Lkotlin/Function4;", "(Lsn/t;)Lsn/t;", "R", "movableContentWithReceiverOf", "", "movableContentKey", "I", "runtime_release"}, k = 2, mv = {1, 6, 0})
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    @NotNull
    public static final p<Composer, Integer, r> movableContentOf(@NotNull final p<? super Composer, ? super Integer, r> pVar) {
        tn.p.k(pVar, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1079330685, true, new q<r, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(r rVar, Composer composer, Integer num) {
                invoke(rVar, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(@NotNull r rVar, @Nullable Composer composer, int i10) {
                tn.p.k(rVar, "it");
                if ((i10 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    pVar.mo2invoke(composer, 0);
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-642339857, true, new p<Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    composer.insertMovableContent(movableContent, r.f5635a);
                }
            }
        });
    }

    @NotNull
    public static final <P> q<P, Composer, Integer, r> movableContentOf(@NotNull q<? super P, ? super Composer, ? super Integer, r> qVar) {
        tn.p.k(qVar, "content");
        final MovableContent movableContent = new MovableContent(qVar);
        return ComposableLambdaKt.composableLambdaInstance(-434707029, true, new q<P, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Object obj, Composer composer, Integer num) {
                invoke(obj, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(P p10, @Nullable Composer composer, int i10) {
                if ((i10 & 14) == 0) {
                    i10 |= composer.changed(p10) ? 4 : 2;
                }
                if ((i10 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    composer.insertMovableContent(movableContent, p10);
                }
            }
        });
    }

    @NotNull
    public static final <P1, P2> sn.r<P1, P2, Composer, Integer, r> movableContentOf(@NotNull final sn.r<? super P1, ? super P2, ? super Composer, ? super Integer, r> rVar) {
        tn.p.k(rVar, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(1849814513, true, new q<Pair<? extends P1, ? extends P2>, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends P1, ? extends P2> pair, @Nullable Composer composer, int i10) {
                tn.p.k(pair, "it");
                if ((i10 & 14) == 0) {
                    i10 |= composer.changed(pair) ? 4 : 2;
                }
                if ((i10 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    rVar.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1200019734, true, new sn.r<P1, P2, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sn.r
            public /* bridge */ /* synthetic */ r invoke(Object obj, Object obj2, Composer composer, Integer num) {
                invoke(obj, obj2, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p22) ? 32 : 16;
                }
                if ((i11 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    composer.insertMovableContent(movableContent, h.a(p12, p22));
                }
            }
        });
    }

    @NotNull
    public static final <P1, P2, P3> s<P1, P2, P3, Composer, Integer, r> movableContentOf(@NotNull final s<? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, r> sVar) {
        tn.p.k(sVar, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-284417101, true, new q<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3>, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3> pair, @Nullable Composer composer, int i10) {
                tn.p.k(pair, "it");
                sVar.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond(), composer, 0);
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1083870185, true, new s<P1, P2, P3, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sn.s
            public /* bridge */ /* synthetic */ r invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, P3 p32, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p22) ? 32 : 16;
                }
                if ((i10 & 896) == 0) {
                    i11 |= composer.changed(p32) ? 256 : 128;
                }
                if ((i11 & 5851) == 1170 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    composer.insertMovableContent(movableContent, h.a(h.a(p12, p22), p32));
                }
            }
        });
    }

    @NotNull
    public static final <P1, P2, P3, P4> t<P1, P2, P3, P4, Composer, Integer, r> movableContentOf(@NotNull final t<? super P1, ? super P2, ? super P3, ? super P4, ? super Composer, ? super Integer, r> tVar) {
        tn.p.k(tVar, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(1876318581, true, new q<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>>, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>> pair, @Nullable Composer composer, int i10) {
                tn.p.k(pair, "it");
                tVar.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond().getFirst(), pair.getSecond().getSecond(), composer, 0);
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1741877681, true, new t<P1, P2, P3, P4, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sn.t
            public /* bridge */ /* synthetic */ r invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, obj4, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, P3 p32, P4 p42, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p22) ? 32 : 16;
                }
                if ((i10 & 896) == 0) {
                    i11 |= composer.changed(p32) ? 256 : 128;
                }
                if ((i10 & 7168) == 0) {
                    i11 |= composer.changed(p42) ? 2048 : 1024;
                }
                if ((46811 & i11) == 9362 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    composer.insertMovableContent(movableContent, h.a(h.a(p12, p22), h.a(p32, p42)));
                }
            }
        });
    }

    @ComposableInferredTarget(scheme = "[0[0]:[_]]")
    @NotNull
    public static final <R> q<R, Composer, Integer, r> movableContentWithReceiverOf(@NotNull final q<? super R, ? super Composer, ? super Integer, r> qVar) {
        tn.p.k(qVar, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(250838178, true, new q<R, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Object obj, Composer composer, Integer num) {
                invoke(obj, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(R r10, @Nullable Composer composer, int i10) {
                if ((i10 & 14) == 0) {
                    i10 |= composer.changed(r10) ? 4 : 2;
                }
                if ((i10 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    qVar.invoke(r10, composer, Integer.valueOf(i10 & 14));
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(506997506, true, new q<R, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Object obj, Composer composer, Integer num) {
                invoke(obj, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(R r10, @Nullable Composer composer, int i10) {
                if ((i10 & 14) == 0) {
                    i10 |= composer.changed(r10) ? 4 : 2;
                }
                if ((i10 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    composer.insertMovableContent(movableContent, r10);
                }
            }
        });
    }

    @NotNull
    public static final <R, P> sn.r<R, P, Composer, Integer, r> movableContentWithReceiverOf(@NotNull final sn.r<? super R, ? super P, ? super Composer, ? super Integer, r> rVar) {
        tn.p.k(rVar, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(812082854, true, new q<Pair<? extends R, ? extends P>, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends R, ? extends P> pair, @Nullable Composer composer, int i10) {
                tn.p.k(pair, "it");
                if ((i10 & 14) == 0) {
                    i10 |= composer.changed(pair) ? 4 : 2;
                }
                if ((i10 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    rVar.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(627354118, true, new sn.r<R, P, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sn.r
            public /* bridge */ /* synthetic */ r invoke(Object obj, Object obj2, Composer composer, Integer num) {
                invoke(obj, obj2, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(R r10, P p10, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p10) ? 32 : 16;
                }
                if ((i11 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    composer.insertMovableContent(movableContent, h.a(r10, p10));
                }
            }
        });
    }

    @NotNull
    public static final <R, P1, P2> s<R, P1, P2, Composer, Integer, r> movableContentWithReceiverOf(@NotNull final s<? super R, ? super P1, ? super P2, ? super Composer, ? super Integer, r> sVar) {
        tn.p.k(sVar, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1322148760, true, new q<Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2>, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2> pair, @Nullable Composer composer, int i10) {
                tn.p.k(pair, "it");
                sVar.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond(), composer, 0);
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(583402949, true, new s<R, P1, P2, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sn.s
            public /* bridge */ /* synthetic */ r invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(R r10, P1 p12, P2 p22, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p12) ? 32 : 16;
                }
                if ((i10 & 896) == 0) {
                    i11 |= composer.changed(p22) ? 256 : 128;
                }
                if ((i11 & 5851) == 1170 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    composer.insertMovableContent(movableContent, h.a(h.a(r10, p12), p22));
                }
            }
        });
    }

    @NotNull
    public static final <R, P1, P2, P3> t<R, P1, P2, P3, Composer, Integer, r> movableContentWithReceiverOf(@NotNull final t<? super R, ? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, r> tVar) {
        tn.p.k(tVar, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(838586922, true, new q<Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>>, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>> pair, @Nullable Composer composer, int i10) {
                tn.p.k(pair, "it");
                tVar.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond().getFirst(), pair.getSecond().getSecond(), composer, 0);
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(1468683306, true, new t<R, P1, P2, P3, Composer, Integer, r>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sn.t
            public /* bridge */ /* synthetic */ r invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, obj4, composer, num.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(R r10, P1 p12, P2 p22, P3 p32, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p12) ? 32 : 16;
                }
                if ((i10 & 896) == 0) {
                    i11 |= composer.changed(p22) ? 256 : 128;
                }
                if ((i10 & 7168) == 0) {
                    i11 |= composer.changed(p32) ? 2048 : 1024;
                }
                if ((46811 & i11) == 9362 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    composer.insertMovableContent(movableContent, h.a(h.a(r10, p12), h.a(p22, p32)));
                }
            }
        });
    }
}
