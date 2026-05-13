package com.moloco.sdk.internal.services;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class D implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f47090a;

    @d(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getString$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<l0, hn.c<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47091a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47093c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, hn.c<? super f> cVar) {
            super(2, cVar);
            this.f47093c = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super String> cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return D.this.new f(this.f47093c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47091a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (!D.this.f47090a.contains(this.f47093c)) {
                return null;
            }
            try {
                return D.this.f47090a.getString(this.f47093c, "");
            } catch (ClassCastException unused) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.f47093c, null, false, 12, null);
                return null;
            }
        }
    }

    @d(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$removeKey$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47094a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47096c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, hn.c<? super g> cVar) {
            super(2, cVar);
            this.f47096c = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return D.this.new g(this.f47096c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47094a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            D.this.f47090a.edit().remove(this.f47096c).apply();
            return bn.r.f5635a;
        }
    }

    @d(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$set$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f47098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ D f47099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47100d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(T t10, D d10, String str, hn.c<? super h> cVar) {
            super(2, cVar);
            this.f47098b = t10;
            this.f47099c = d10;
            this.f47100d = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((h) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new h(this.f47098b, this.f47099c, this.f47100d, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47097a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            T t10 = this.f47098b;
            if (t10 instanceof Integer) {
                this.f47099c.f47090a.edit().putInt(this.f47100d, ((Number) this.f47098b).intValue()).apply();
            } else if (t10 instanceof String) {
                this.f47099c.f47090a.edit().putString(this.f47100d, (String) this.f47098b).apply();
            } else if (t10 instanceof Float) {
                this.f47099c.f47090a.edit().putFloat(this.f47100d, ((Number) this.f47098b).floatValue()).apply();
            } else if (t10 instanceof Boolean) {
                this.f47099c.f47090a.edit().putBoolean(this.f47100d, ((Boolean) this.f47098b).booleanValue()).apply();
            } else if (t10 instanceof Double) {
                this.f47099c.f47090a.edit().putString(this.f47100d, String.valueOf(((Number) this.f47098b).doubleValue())).apply();
            } else if (t10 instanceof Long) {
                this.f47099c.f47090a.edit().putString(this.f47100d, String.valueOf(((Number) this.f47098b).longValue())).apply();
            } else {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type: " + this.f47098b + " for key: " + this.f47100d, null, false, 12, null);
            }
            return bn.r.f5635a;
        }
    }

    public D(@NotNull SharedPreferences sharedPreferences) {
        tn.p.k(sharedPreferences, "sharedPreferences");
        this.f47090a = sharedPreferences;
    }

    @Override // com.moloco.sdk.internal.services.h0
    @Nullable
    public Object a(@NotNull String str, @NotNull hn.c<? super bn.r> cVar) {
        Object objG = p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new g(str, null), cVar);
        return objG == in.a.g() ? objG : bn.r.f5635a;
    }

    @Override // com.moloco.sdk.internal.services.h0
    @Nullable
    public <T> Object b(@NotNull String str, T t10, @NotNull hn.c<? super bn.r> cVar) {
        Object objG = p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new h(t10, this, str, null), cVar);
        return objG == in.a.g() ? objG : bn.r.f5635a;
    }

    @Override // com.moloco.sdk.internal.services.h0
    @Nullable
    public Object c(@NotNull String str, @NotNull hn.c<? super String> cVar) {
        return p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new f(str, null), cVar);
    }
}
