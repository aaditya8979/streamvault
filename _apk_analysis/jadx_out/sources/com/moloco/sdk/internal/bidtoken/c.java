package com.moloco.sdk.internal.bidtoken;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import bo.a0;
import bo.d0;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.q;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p000do.g;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 1)
public final class c implements b {

    @jn.d(c = "com.moloco.sdk.internal.bidtoken.VersionPrefixedJWTokenParser$invoke$2", f = "VersionPrefixedJWTokenParser.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super g0<com.moloco.sdk.internal.bidtoken.a, q>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f45930b = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super g0<com.moloco.sdk.internal.bidtoken.a, q>> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f45930b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f45929a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            try {
                byte[] bArrDecode = Base64.decode((String) d0.U0((String) d0.T0(this.f45930b, new char[]{':'}, false, 0, 6, null).get(1), new String[]{"."}, false, 0, 6, null).get(1), 0);
                tn.p.j(bArrDecode, "decode(...)");
                return new g0.b(new com.moloco.sdk.internal.bidtoken.a(new JSONObject(a0.B(bArrDecode)).getLong(ImpressionLog.f51755y)));
            } catch (Exception e10) {
                return new g0.a(new q(e10.toString(), -1));
            }
        }
    }

    @Override // com.moloco.sdk.internal.bidtoken.b
    @Nullable
    public Object a(@NotNull String str, @NotNull hn.c<? super g0<com.moloco.sdk.internal.bidtoken.a, q>> cVar) {
        return g.g(d.f45931a, new a(str, null), cVar);
    }
}
