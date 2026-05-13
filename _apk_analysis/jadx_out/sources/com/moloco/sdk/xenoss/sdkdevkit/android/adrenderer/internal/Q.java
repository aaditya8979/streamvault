package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mbridge.msdk.MBridgeConstans;
import fo.m;
import go.f;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 1)
public final class Q implements c0 {

    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1", f = "ViewVisibilityTracker.kt", l = {36}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<m<? super Boolean>, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f47913c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f47913c = view;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(m<? super Boolean> mVar, hn.c<? super bn.r> cVar) {
            return ((a) create(mVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            a aVar = new a(this.f47913c, cVar);
            aVar.f47912b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47911a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                m mVar = (m) this.f47912b;
                View view = this.f47913c;
                this.f47911a = 1;
                if (S.i(mVar, view, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0
    @NotNull
    public go.d<Boolean> a(@NotNull View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return S.f(f.j(new a(view, null)));
    }
}
