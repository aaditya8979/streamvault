package com.ironsource;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4259t1 {

    /* JADX INFO: renamed from: com.ironsource.t1$a */
    public static final class a implements OutcomeReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hn.c<bn.r> f34043a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(hn.c<? super bn.r> cVar) {
            this.f34043a = cVar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception exc) {
            tn.p.k(exc, "error");
            hn.c<bn.r> cVar = this.f34043a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(exc)));
        }

        public void onResult(@Nullable Object obj) {
            hn.c<bn.r> cVar = this.f34043a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
        }
    }

    @RequiresApi(31)
    @NotNull
    public static final OutcomeReceiver a(@NotNull hn.c<? super bn.r> cVar) {
        tn.p.k(cVar, "<this>");
        return new a(cVar);
    }
}
