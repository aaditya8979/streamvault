package androidx.room;

import bn.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.l2;

/* JADX INFO: compiled from: RoomDatabaseExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"R", "Landroidx/room/RoomDatabase;", "Lkotlin/Function1;", "Lhn/c;", "", "block", "withTransaction", "(Landroidx/room/RoomDatabase;Lsn/l;Lhn/c;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", GAMConfig.KEY_CONTEXT, "Lkotlin/Function2;", "Ldo/l0;", "transactionBlock", "startTransactionCoroutine", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/d;Lsn/p;Lhn/c;)Ljava/lang/Object;", "Lkotlin/coroutines/c;", "dispatcher", "createTransactionContext", "room-ktx_release"}, k = 2, mv = {1, 7, 1})
public final class RoomDatabaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.coroutines.d createTransactionContext(RoomDatabase roomDatabase, kotlin.coroutines.c cVar) {
        TransactionElement transactionElement = new TransactionElement(cVar);
        return cVar.plus(transactionElement).plus(l2.a(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(transactionElement))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object startTransactionCoroutine(final RoomDatabase roomDatabase, final kotlin.coroutines.d dVar, final sn.p<? super l0, ? super hn.c<? super R>, ? extends Object> pVar, hn.c<? super R> cVar) {
        final kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1

                /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: RoomDatabaseExt.kt */
                @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                @jn.d(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", l = {97}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {
                    public final /* synthetic */ p000do.k<R> $continuation;
                    public final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    public final /* synthetic */ sn.p<l0, hn.c<? super R>, Object> $transactionBlock;
                    private /* synthetic */ Object L$0;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(RoomDatabase roomDatabase, p000do.k<? super R> kVar, sn.p<? super l0, ? super hn.c<? super R>, ? extends Object> pVar, hn.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = kVar;
                        this.$transactionBlock = pVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, cVar);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                        return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        hn.c cVar;
                        Object objG = in.a.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.c.b(obj);
                            d.b bVar = ((l0) this.L$0).getCoroutineContext().get(kotlin.coroutines.c.G8);
                            tn.p.h(bVar);
                            kotlin.coroutines.d dVarCreateTransactionContext = RoomDatabaseKt.createTransactionContext(this.$this_startTransactionCoroutine, (kotlin.coroutines.c) bVar);
                            hn.c cVar2 = this.$continuation;
                            sn.p<l0, hn.c<? super R>, Object> pVar = this.$transactionBlock;
                            this.L$0 = cVar2;
                            this.label = 1;
                            obj = p000do.g.g(dVarCreateTransactionContext, pVar, this);
                            if (obj == objG) {
                                return objG;
                            }
                            cVar = cVar2;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar = (hn.c) this.L$0;
                            kotlin.c.b(obj);
                        }
                        cVar.resumeWith(Result.m7534constructorimpl(obj));
                        return r.f5635a;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        p000do.g.e(dVar.minusKey(kotlin.coroutines.c.G8), new AnonymousClass1(roomDatabase, cVar2, pVar, null));
                    } catch (Throwable th2) {
                        cVar2.a(th2);
                    }
                }
            });
        } catch (RejectedExecutionException e10) {
            cVar2.a(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB;
    }

    @Nullable
    public static final <R> Object withTransaction(@NotNull RoomDatabase roomDatabase, @NotNull sn.l<? super hn.c<? super R>, ? extends Object> lVar, @NotNull hn.c<? super R> cVar) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(roomDatabase, lVar, null);
        TransactionElement transactionElement = (TransactionElement) cVar.getContext().get(TransactionElement.INSTANCE);
        kotlin.coroutines.c transactionDispatcher = transactionElement != null ? transactionElement.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? p000do.g.g(transactionDispatcher, roomDatabaseKt$withTransaction$transactionBlock$1, cVar) : startTransactionCoroutine(roomDatabase, cVar.getContext(), roomDatabaseKt$withTransaction$transactionBlock$1, cVar);
    }
}
