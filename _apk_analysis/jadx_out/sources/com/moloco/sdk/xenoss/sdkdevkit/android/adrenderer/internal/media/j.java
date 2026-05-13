package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class j implements n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f48204j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f48205k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f48206l = "MediaCacheRepository";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final o f48207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d f48208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a f48209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l f48210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final l0 f48211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, mo.a> f48212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f48213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b> f48214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final l0 f48215i;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final String b(String str) {
            return str + "TEMP";
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$getMediaFile$2", f = "MediaCacheRepository.kt", l = {373, 161}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super n.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f48217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f48218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f48219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f48220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48221f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ j f48222g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, j jVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48221f = str;
            this.f48222g = jVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super n.a> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f48221f, this.f48222g, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x019c A[Catch: all -> 0x01e6, Exception -> 0x01e9, TryCatch #5 {Exception -> 0x01e9, all -> 0x01e6, blocks: (B:57:0x0196, B:59:0x019c, B:61:0x01b1, B:64:0x01d9), top: B:90:0x0196 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01e2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 558
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFile$2", f = "MediaCacheRepository.kt", l = {373}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<l0, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f48224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f48225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f48226d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f48227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48228f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ j f48229g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48230h;

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFile$2$1$1", f = "MediaCacheRepository.kt", l = {228}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f48232b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f48233c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ File f48234d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f48235e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b f48236f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar, String str, File file, String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f48232b = jVar;
                this.f48233c = str;
                this.f48234d = file;
                this.f48235e = str2;
                this.f48236f = bVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f48232b, this.f48233c, this.f48234d, this.f48235e, this.f48236f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f48231a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a aVar = this.f48232b.f48209c;
                    String str = this.f48233c;
                    File file = this.f48234d;
                    String str2 = this.f48235e;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = this.f48236f;
                    this.f48231a = 1;
                    if (aVar.c(str, file, str2, bVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                this.f48232b.f48213g.remove(this.f48233c);
                this.f48232b.f48214h.remove(this.f48233c);
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, j jVar, String str2, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f48228f = str;
            this.f48229g = jVar;
            this.f48230h = str2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new c(this.f48228f, this.f48229g, this.f48230h, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            mo.a aVar;
            j jVar;
            String str;
            String str2;
            Object objPutIfAbsent;
            Object objPutIfAbsent2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h cVar;
            Object objG = in.a.g();
            int i10 = this.f48227e;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, j.f48206l, "Streaming media for: " + this.f48228f, null, false, 12, null);
                if (this.f48228f.length() == 0) {
                    return new h.b(n.a.AbstractC0607a.k.f48256a);
                }
                ConcurrentHashMap concurrentHashMap = this.f48229g.f48212f;
                String str3 = this.f48228f;
                Object objB = concurrentHashMap.get(str3);
                if (objB == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str3, (objB = mo.g.b(false, 1, null)))) != null) {
                    objB = objPutIfAbsent;
                }
                aVar = (mo.a) objB;
                tn.p.h(aVar);
                j jVar2 = this.f48229g;
                String str4 = this.f48228f;
                String str5 = this.f48230h;
                this.f48223a = aVar;
                this.f48224b = jVar2;
                this.f48225c = str4;
                this.f48226d = str5;
                this.f48227e = 1;
                if (aVar.c(null, this) == objG) {
                    return objG;
                }
                jVar = jVar2;
                str = str4;
                str2 = str5;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str6 = (String) this.f48226d;
                String str7 = (String) this.f48225c;
                j jVar3 = (j) this.f48224b;
                aVar = (mo.a) this.f48223a;
                kotlin.c.b(obj);
                str2 = str6;
                str = str7;
                jVar = jVar3;
            }
            try {
                g0 g0VarH = jVar.h();
                if (g0VarH instanceof g0.a) {
                    return ((g0.a) g0VarH).a();
                }
                if (!(g0VarH instanceof g0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                File fileE = jVar.e(str, (File) ((g0.b) g0VarH).a());
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, j.f48206l, "Going to download the media file to location: " + fileE.getAbsolutePath(), null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b) jVar.f48214h.get(str);
                if (jVar.f48213g.contains(str)) {
                    MolocoLogger.info$default(molocoLogger, j.f48206l, "Media file is already being downloaded, so returning in progress status for url: " + str, null, false, 12, null);
                    if (bVar == null || (cVar = bVar.d()) == null) {
                        cVar = new h.c(fileE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a());
                    }
                    return cVar;
                }
                if (jVar.f48209c.a(fileE)) {
                    return new h.a(fileE);
                }
                MolocoLogger.info$default(molocoLogger, j.f48206l, "Media file needs to be downloaded: " + str, null, false, 12, null);
                jVar.f48213g.add(str);
                ConcurrentHashMap concurrentHashMap2 = jVar.f48214h;
                Object bVar2 = concurrentHashMap2.get(str);
                if (bVar2 == null && (objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(str, (bVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b(new h.c(fileE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a()))))) != null) {
                    bVar2 = objPutIfAbsent2;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b) bVar2;
                p000do.i.d(jVar.f48211e, null, null, new a(jVar, str, fileE, str2, bVar3, null), 3, null);
                return bVar3.d();
            } finally {
                aVar.d(null);
            }
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFileStatus$1", f = "MediaCacheRepository.kt", l = {249}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<go.e<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h>, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f48239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f48239c = file;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(go.e<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h> eVar, hn.c<? super bn.r> cVar) {
            return ((d) create(eVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            d dVar = new d(this.f48239c, cVar);
            dVar.f48238b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48237a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.e eVar = (go.e) this.f48238b;
                h.a aVar = new h.a(this.f48239c);
                this.f48237a = 1;
                if (eVar.emit(aVar, this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.MediaCacheRepositoryImpl$streamMediaFileStatus$cacheDir$1", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements sn.p<go.e<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h>, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0<File, h.b> f48241b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g0<File, h.b> g0Var, hn.c<? super e> cVar) {
            super(2, cVar);
            this.f48241b = g0Var;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(go.e<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h> eVar, hn.c<? super bn.r> cVar) {
            return ((e) create(eVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new e(this.f48241b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f48240a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ((g0.a) this.f48241b).a();
            return bn.r.f5635a;
        }
    }

    public j(@NotNull o oVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d dVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a aVar, @NotNull l lVar) {
        tn.p.k(oVar, "mediaConfig");
        tn.p.k(dVar, "legacyMediaDownloader");
        tn.p.k(aVar, "chunkedMediaDownloader");
        tn.p.k(lVar, "mediaCacheLocationProvider");
        this.f48207a = oVar;
        this.f48208b = dVar;
        this.f48209c = aVar;
        this.f48210d = lVar;
        this.f48211e = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getIo());
        this.f48212f = new ConcurrentHashMap<>();
        this.f48213g = new HashSet<>();
        this.f48214h = new ConcurrentHashMap<>();
        this.f48215i = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getIo());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h a(@NotNull String str) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVarD;
        tn.p.k(str, "url");
        g0<File, h.b> g0VarH = h();
        if (g0VarH instanceof g0.a) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) ((g0.a) g0VarH).a();
        }
        if (!(g0VarH instanceof g0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        File fileE = e(str, (File) ((g0.b) g0VarH).a());
        if (fileE.exists() && this.f48209c.a(fileE)) {
            return new h.a(fileE);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = this.f48214h.get(str);
        return (bVar == null || (hVarD = bVar.d()) == null) ? new h.c(fileE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a()) : hVarD;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n
    @Nullable
    public Object a(@NotNull String str, @NotNull hn.c<? super n.a> cVar) {
        return p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new b(str, this, null), cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n
    @NotNull
    public go.d<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h> b(@NotNull String str) {
        tn.p.k(str, "url");
        g0<File, h.b> g0VarH = h();
        if (g0VarH instanceof g0.a) {
            return go.f.z(new e(g0VarH, null));
        }
        if (!(g0VarH instanceof g0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        File file = (File) ((g0.b) g0VarH).a();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str2 = f48206l;
        MolocoLogger.info$default(molocoLogger, str2, "Collecting status for media file: " + str, null, false, 12, null);
        File fileE = e(str, file);
        if (fileE.exists() && this.f48209c.a(fileE)) {
            return go.f.z(new d(fileE, null));
        }
        MolocoLogger.info$default(molocoLogger, str2, "Media file needs to be downloaded: " + str, null, false, 12, null);
        ConcurrentHashMap<String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b> concurrentHashMap = this.f48214h;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = concurrentHashMap.get(str);
        if (bVar == null) {
            MolocoLogger.info$default(molocoLogger, str2, "Download has not yet started for: " + str, null, false, 12, null);
            bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b(new h.c(fileE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a()));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVarPutIfAbsent = concurrentHashMap.putIfAbsent(str, bVar);
            if (bVarPutIfAbsent != null) {
                bVar = bVarPutIfAbsent;
            }
        }
        return bVar.g();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n
    @Nullable
    public Object b(@NotNull String str, @NotNull String str2, @NotNull hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h> cVar) {
        return p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new c(str, this, str2, null), cVar);
    }

    public final File e(String str, File file) {
        return new File(file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.a(str));
    }

    public final g0<File, h.b> h() {
        g0<File, com.moloco.sdk.internal.q> g0VarJ = j();
        if (!(g0VarJ instanceof g0.a)) {
            if (g0VarJ instanceof g0.b) {
                return new g0.b(((g0.b) g0VarJ).a());
            }
            throw new NoWhenBranchMatchedException();
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = f48206l;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to retrieve storageDir with error code: ");
        g0.a aVar = (g0.a) g0VarJ;
        sb2.append(((com.moloco.sdk.internal.q) aVar.a()).b());
        MolocoLogger.warn$default(molocoLogger, str, sb2.toString(), null, false, 12, null);
        switch (((com.moloco.sdk.internal.q) aVar.a()).b()) {
            case 100:
                return new g0.a(new h.b(n.a.AbstractC0607a.c.f48248a));
            case 101:
                return new g0.a(new h.b(n.a.AbstractC0607a.b.f48247a));
            case 102:
                return new g0.a(new h.b(n.a.AbstractC0607a.C0608a.f48246a));
            default:
                return new g0.a(new h.b(n.a.AbstractC0607a.d.f48249a));
        }
    }

    @VisibleForTesting
    @NotNull
    public final g0<File, com.moloco.sdk.internal.q> j() {
        g0<File, com.moloco.sdk.internal.q> g0VarA = this.f48210d.a();
        if (g0VarA instanceof g0.a) {
            return this.f48210d.b();
        }
        if (g0VarA instanceof g0.b) {
            return g0VarA;
        }
        throw new NoWhenBranchMatchedException();
    }
}
