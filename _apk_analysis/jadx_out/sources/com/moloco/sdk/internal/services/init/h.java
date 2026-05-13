package com.moloco.sdk.internal.services.init;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import bo.d0;
import cn.f0;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public final class h implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f47471d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47472e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f47473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f47474c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.init.InitCacheImpl$clearAll$2", f = "InitCache.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47475a;

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return h.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47475a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            h.this.f47473b.edit().clear().commit();
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.init.InitCacheImpl$clearCache$2", f = "InitCache.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f47478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a f47479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f47480d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.acm.recorder.a aVar, com.moloco.sdk.internal.services.init.a aVar2, h hVar, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f47478b = aVar;
            this.f47479c = aVar2;
            this.f47480d = hVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new c(this.f47478b, this.f47479c, this.f47480d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47477a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            com.moloco.sdk.acm.e eVarC = this.f47478b.c("SDKInitCacheClear");
            try {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Clearing cache for cacheKey: " + this.f47479c.b(), null, false, 12, null);
                SharedPreferences.Editor editorEdit = this.f47480d.f47473b.edit();
                h hVar = this.f47480d;
                com.moloco.sdk.internal.services.init.a aVar = this.f47479c;
                tn.p.h(editorEdit);
                hVar.e(aVar, editorEdit);
                editorEdit.remove(this.f47479c.b());
                if (editorEdit.commit()) {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully cleared cache for cacheKey: " + this.f47479c.b(), null, false, 12, null);
                    this.f47478b.b(new com.moloco.sdk.acm.b("SDKInitCacheClear").e("Result", "success"));
                    this.f47478b.a(eVarC.f("Result", "success"));
                } else {
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to clear cache for cacheKey: " + this.f47479c.b(), null, false, 12, null);
                    this.f47478b.b(new com.moloco.sdk.acm.b("SDKInitCacheClear").e("Result", "failure").e("Reason", "commit_failure"));
                    this.f47478b.a(eVarC.f("Result", "failure").f("Reason", "commit_failure"));
                }
            } catch (Exception e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to clear cache for cacheKey: " + this.f47479c.b() + " with exception", e10, false, 8, null);
                com.moloco.sdk.acm.recorder.a aVar2 = this.f47478b;
                com.moloco.sdk.acm.b bVarE = new com.moloco.sdk.acm.b("SDKInitCacheClear").e("Result", "failure");
                String simpleName = e10.getClass().getSimpleName();
                tn.p.j(simpleName, "getSimpleName(...)");
                aVar2.b(bVarE.e("Reason", simpleName));
                com.moloco.sdk.acm.recorder.a aVar3 = this.f47478b;
                com.moloco.sdk.acm.e eVarF = eVarC.f("Result", "failure");
                String simpleName2 = e10.getClass().getSimpleName();
                tn.p.j(simpleName2, "getSimpleName(...)");
                aVar3.a(eVarF.f("Reason", simpleName2));
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.init.InitCacheImpl$get$2", f = "InitCache.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements p<l0, hn.c<? super Init$SDKInitResponse>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f47482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a f47483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f47484d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.recorder.a aVar, com.moloco.sdk.internal.services.init.a aVar2, h hVar, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f47482b = aVar;
            this.f47483c = aVar2;
            this.f47484d = hVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super Init$SDKInitResponse> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new d(this.f47482b, this.f47483c, this.f47484d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f47481a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            com.moloco.sdk.acm.e eVarC = this.f47482b.c("SDKInitCacheRead");
            try {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Reading cache for cacheKey: " + this.f47483c.b(), null, false, 12, null);
                h hVar = this.f47484d;
                hVar.i(this.f47483c, hVar.f47473b);
                String string = this.f47484d.f47473b.getString(this.f47483c.b(), null);
                Init$SDKInitResponse init$SDKInitResponseO = string != null ? Init$SDKInitResponse.o(Base64.decode(string, 0)) : null;
                if (init$SDKInitResponseO != null) {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully read cache for cacheKey: " + this.f47483c.b(), null, false, 12, null);
                    this.f47482b.a(eVarC.f("Result", "success"));
                    this.f47482b.b(new com.moloco.sdk.acm.b("SDKInitCacheRead").e("Result", "success"));
                } else {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Failed to read from cache (cache_miss) for cacheKey: " + this.f47483c.b(), null, false, 12, null);
                    this.f47482b.a(eVarC.f("Result", "failure").f("Reason", "cache_miss"));
                    this.f47482b.b(new com.moloco.sdk.acm.b("SDKInitCacheRead").e("Result", "failure").e("Reason", "cache_miss"));
                }
                return init$SDKInitResponseO;
            } catch (Exception e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to read cache for cacheKey: " + this.f47483c.b() + " with exception", e10, false, 8, null);
                com.moloco.sdk.acm.recorder.a aVar = this.f47482b;
                com.moloco.sdk.acm.e eVarF = eVarC.f("Result", "failure");
                String simpleName = e10.getClass().getSimpleName();
                tn.p.j(simpleName, "getSimpleName(...)");
                aVar.a(eVarF.f("Reason", simpleName));
                com.moloco.sdk.acm.recorder.a aVar2 = this.f47482b;
                com.moloco.sdk.acm.b bVarE = new com.moloco.sdk.acm.b("SDKInitCacheRead").e("Result", "failure");
                String simpleName2 = e10.getClass().getSimpleName();
                tn.p.j(simpleName2, "getSimpleName(...)");
                aVar2.b(bVarE.e("Reason", simpleName2));
                return null;
            }
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.init.InitCacheImpl$updateCache$2", f = "InitCache.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f47486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a f47487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Init$SDKInitResponse f47488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f47489e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.acm.recorder.a aVar, com.moloco.sdk.internal.services.init.a aVar2, Init$SDKInitResponse init$SDKInitResponse, h hVar, hn.c<? super e> cVar) {
            super(2, cVar);
            this.f47486b = aVar;
            this.f47487c = aVar2;
            this.f47488d = init$SDKInitResponse;
            this.f47489e = hVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new e(this.f47486b, this.f47487c, this.f47488d, this.f47489e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            boolean zCommit;
            in.a.g();
            if (this.f47485a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            com.moloco.sdk.acm.e eVarC = this.f47486b.c("SDKInitCacheWrite");
            try {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Updating cache for cacheKey: " + this.f47487c.b(), null, false, 12, null);
                boolean z10 = false;
                String strEncodeToString = Base64.encodeToString(this.f47488d.toByteArray(), 0);
                if (strEncodeToString == null || strEncodeToString.length() == 0) {
                    str = strEncodeToString;
                    zCommit = false;
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to encode SDKInitResponse for cacheKey: " + this.f47487c.b(), null, false, 12, null);
                    z10 = true;
                } else {
                    str = strEncodeToString;
                    zCommit = false;
                }
                if (!z10) {
                    zCommit = this.f47489e.f47473b.edit().putString(this.f47487c.b(), str).commit();
                }
                if (zCommit) {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully updated cache for cacheKey: " + this.f47487c.b(), null, false, 12, null);
                    this.f47486b.a(eVarC.f("Result", "success"));
                    this.f47486b.b(new com.moloco.sdk.acm.b("SDKInitCacheWrite").e("Result", "success"));
                } else {
                    String str2 = z10 ? "encoding_failure" : "commit_failure";
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to update cache for cacheKey: " + this.f47487c.b() + " with error: " + str2, null, false, 12, null);
                    this.f47486b.a(eVarC.f("Result", "failure").f("Reason", str2));
                    this.f47486b.b(new com.moloco.sdk.acm.b("SDKInitCacheWrite").e("Result", "failure").e("Reason", str2));
                }
            } catch (Exception e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to update cache for cacheKey: " + this.f47487c.b() + " with exception", e10, false, 8, null);
                com.moloco.sdk.acm.recorder.a aVar = this.f47486b;
                com.moloco.sdk.acm.e eVarF = eVarC.f("Result", "failure");
                String simpleName = e10.getClass().getSimpleName();
                tn.p.j(simpleName, "getSimpleName(...)");
                aVar.a(eVarF.f("Reason", simpleName));
                com.moloco.sdk.acm.recorder.a aVar2 = this.f47486b;
                com.moloco.sdk.acm.b bVarE = new com.moloco.sdk.acm.b("SDKInitCacheWrite").e("Result", "failure");
                String simpleName2 = e10.getClass().getSimpleName();
                tn.p.j(simpleName2, "getSimpleName(...)");
                aVar2.b(bVarE.e("Reason", simpleName2));
            }
            return r.f5635a;
        }
    }

    public h(@NotNull SharedPreferences sharedPreferences, @NotNull kotlin.coroutines.d dVar) {
        tn.p.k(sharedPreferences, "sharedPreferences");
        tn.p.k(dVar, "ioDispatcherContext");
        this.f47473b = sharedPreferences;
        this.f47474c = dVar;
    }

    @Override // com.moloco.sdk.internal.services.init.g
    @Nullable
    public Object a(@NotNull com.moloco.sdk.internal.services.init.a aVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2, @NotNull hn.c<? super Init$SDKInitResponse> cVar) {
        return p000do.g.g(this.f47474c, new d(aVar2, aVar, this, null), cVar);
    }

    @Override // com.moloco.sdk.internal.services.init.g
    @Nullable
    public Object a(@NotNull hn.c<? super r> cVar) {
        Object objG = p000do.g.g(this.f47474c, new b(null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    @Override // com.moloco.sdk.internal.services.init.g
    @Nullable
    public Object b(@NotNull com.moloco.sdk.internal.services.init.a aVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2, @NotNull hn.c<? super r> cVar) {
        Object objG = p000do.g.g(this.f47474c, new c(aVar2, aVar, this, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    @Override // com.moloco.sdk.internal.services.init.g
    @Nullable
    public Object c(@NotNull com.moloco.sdk.internal.services.init.a aVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2, @NotNull Init$SDKInitResponse init$SDKInitResponse, @NotNull hn.c<? super r> cVar) {
        Object objG = p000do.g.g(this.f47474c, new e(aVar2, aVar, init$SDKInitResponse, this, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    public final void e(com.moloco.sdk.internal.services.init.a aVar, SharedPreferences.Editor editor) {
        Iterator<String> it = aVar.c().iterator();
        while (it.hasNext()) {
            editor.remove(it.next());
        }
    }

    public final void f(com.moloco.sdk.internal.services.init.a aVar, SharedPreferences sharedPreferences) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Migrating from v0 to v1 for cache key: " + aVar.b(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Total keys in cache: " + sharedPreferences.getAll().size(), null, false, 12, null);
        Map<String, ?> all = sharedPreferences.getAll();
        tn.p.j(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            tn.p.j(key, "<get-key>(...)");
            List listU0 = d0.U0(key, new String[]{"___"}, false, 0, 6, null);
            if (tn.p.f(f0.v0(listU0), aVar.a()) && tn.p.f(f0.G0(listU0), "v0")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Number of existing V0 keys in cache: " + linkedHashMap.size(), null, false, 12, null);
        if (linkedHashMap.isEmpty()) {
            MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "No v0 cache keys found for migration for appKey: " + aVar.a(), null, false, 12, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Found v0 cache key: " + ((String) f0.s0(linkedHashMap.keySet())) + ", migrating to new key: " + aVar.b(), null, false, 12, null);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        tn.p.j(editorEdit, "editor");
        String strB = aVar.b();
        Object objS0 = f0.s0(linkedHashMap.values());
        editorEdit.putString(strB, objS0 instanceof String ? (String) objS0 : null);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) ((Map.Entry) it.next()).getKey());
        }
        editorEdit.commit();
    }

    public final void i(com.moloco.sdk.internal.services.init.a aVar, SharedPreferences sharedPreferences) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Performing migration for cache key: " + aVar.b(), null, false, 12, null);
        f(aVar, sharedPreferences);
    }
}
