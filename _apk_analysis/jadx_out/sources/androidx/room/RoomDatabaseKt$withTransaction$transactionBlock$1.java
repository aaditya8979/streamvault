package androidx.room;

import bn.r;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: RoomDatabaseExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Ldo/l0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@jn.d(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", l = {56}, m = "invokeSuspend")
public final class RoomDatabaseKt$withTransaction$transactionBlock$1<R> extends SuspendLambda implements sn.p<l0, hn.c<? super R>, Object> {
    public final /* synthetic */ sn.l<hn.c<? super R>, Object> $block;
    public final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, sn.l<? super hn.c<? super R>, ? extends Object> lVar, hn.c<? super RoomDatabaseKt$withTransaction$transactionBlock$1> cVar) {
        super(2, cVar);
        this.$this_withTransaction = roomDatabase;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.$this_withTransaction, this.$block, cVar);
        roomDatabaseKt$withTransaction$transactionBlock$1.L$0 = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super R> cVar) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Throwable th2;
        TransactionElement transactionElement;
        TransactionElement transactionElementG = in.a.g();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                d.b bVar = ((l0) this.L$0).getCoroutineContext().get(TransactionElement.INSTANCE);
                tn.p.h(bVar);
                TransactionElement transactionElement2 = (TransactionElement) bVar;
                transactionElement2.acquire();
                try {
                    this.$this_withTransaction.beginTransaction();
                    try {
                        sn.l<hn.c<? super R>, Object> lVar = this.$block;
                        this.L$0 = transactionElement2;
                        this.label = 1;
                        Object objInvoke = lVar.invoke(this);
                        if (objInvoke == transactionElementG) {
                            return transactionElementG;
                        }
                        transactionElement = transactionElement2;
                        obj = objInvoke;
                    } catch (Throwable th3) {
                        th2 = th3;
                        this.$this_withTransaction.endTransaction();
                        throw th2;
                    }
                } catch (Throwable th4) {
                    transactionElementG = transactionElement2;
                    th = th4;
                    transactionElementG.release();
                    throw th;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                transactionElement = (TransactionElement) this.L$0;
                try {
                    kotlin.c.b(obj);
                } catch (Throwable th5) {
                    th2 = th5;
                    this.$this_withTransaction.endTransaction();
                    throw th2;
                }
            }
            this.$this_withTransaction.setTransactionSuccessful();
            this.$this_withTransaction.endTransaction();
            transactionElement.release();
            return obj;
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
