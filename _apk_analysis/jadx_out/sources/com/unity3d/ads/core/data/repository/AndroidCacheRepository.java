package com.unity3d.ads.core.data.repository;

import android.content.Context;
import bn.r;
import bo.d0;
import com.ironsource.D8;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import hn.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.util.Iterator;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.sequences.SequencesKt___SequencesKt;
import on.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p000do.g;
import p000do.h0;
import p000do.k0;
import p000do.l0;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: AndroidCacheRepository.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidCacheRepository implements CacheRepository {

    @NotNull
    private final File cacheDir;

    @NotNull
    private final CleanupDirectory cleanupDirectory;

    @NotNull
    private final Context context;

    @NotNull
    private final CreateFile createFile;

    @NotNull
    private final DownloadPriorityQueue downloadPriorityQueue;

    @NotNull
    private final GetCacheDirectory getCacheDirectory;

    @NotNull
    private final CacheDataSource localCacheDataSource;

    @NotNull
    private final CacheDataSource remoteCacheDataSource;

    @NotNull
    private final l0 scope;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final File webviewCacheDir;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidCacheRepository.this.new AnonymousClass2(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            boolean cleanCache = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
            if (cleanCache || !AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                File[] fileArrListFiles = AndroidCacheRepository.this.cacheDir.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
            } else {
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
                AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.cacheDir, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
            }
            if (!cleanCache && AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.webviewCacheDir, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                return r.f5635a;
            }
            File[] fileArrListFiles2 = AndroidCacheRepository.this.webviewCacheDir.listFiles();
            if (fileArrListFiles2 == null) {
                return null;
            }
            for (File file2 : fileArrListFiles2) {
                file2.delete();
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository", f = "AndroidCacheRepository.kt", l = {100}, m = "doesFileExist")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheRepository.this.doesFileExist(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class C44602 extends SuspendLambda implements p<l0, c<? super Long>, Object> {
        public int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidCacheRepository.kt */
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements l<File, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1, File.class, D8.f29123d, "isFile()Z", 0);
            }

            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull File file) {
                tn.p.k(file, "p0");
                return Boolean.valueOf(file.isFile());
            }
        }

        public C44602(c<? super C44602> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidCacheRepository.this.new C44602(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super Long> cVar) {
            return ((C44602) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            long length = 0;
            Iterator it = SequencesKt___SequencesKt.z(h.r(AndroidCacheRepository.this.cacheDir, null, 1, null), AnonymousClass1.INSTANCE).iterator();
            while (it.hasNext()) {
                length += ((File) it.next()).length();
            }
            return jn.a.e(length);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {70, 77, 89}, m = "invokeSuspend")
    public static final class C44612 extends SuspendLambda implements p<l0, c<? super CacheResult>, Object> {
        public final /* synthetic */ File $cacheDirectory;
        public final /* synthetic */ int $priority;
        public final /* synthetic */ String $url;
        public Object L$0;
        public int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidCacheRepository.kt */
        @d(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {79, 85}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements l<c<? super r>, Object> {
            public final /* synthetic */ File $cacheDirectory;
            public final /* synthetic */ go.l<CacheResult> $fileResult;
            public final /* synthetic */ String $filename;
            public final /* synthetic */ int $priority;
            public final /* synthetic */ String $url;
            public int label;
            public final /* synthetic */ AndroidCacheRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i10, go.l<CacheResult> lVar, c<? super AnonymousClass1> cVar) {
                super(1, cVar);
                this.this$0 = androidCacheRepository;
                this.$cacheDirectory = file;
                this.$filename = str;
                this.$url = str2;
                this.$priority = i10;
                this.$fileResult = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@NotNull c<?> cVar) {
                return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, cVar);
            }

            @Override // sn.l
            @Nullable
            public final Object invoke(@Nullable c<? super r> cVar) {
                return ((AnonymousClass1) create(cVar)).invokeSuspend(r.f5635a);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:24:0x0075->B:29:?, LOOP_END, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = in.a.g()
                    int r1 = r10.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.c.b(r11)
                    goto L71
                L12:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1a:
                    kotlin.c.b(r11)
                    goto L3d
                L1e:
                    kotlin.c.b(r11)
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r11 = r10.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r4 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r11)
                    java.io.File r5 = r10.$cacheDirectory
                    java.lang.String r6 = r10.$filename
                    java.lang.String r7 = r10.$url
                    int r11 = r10.$priority
                    java.lang.Integer r8 = jn.a.d(r11)
                    r10.label = r3
                    r9 = r10
                    java.lang.Object r11 = r4.getFile(r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L3d
                    return r0
                L3d:
                    com.unity3d.ads.core.data.model.CacheResult r11 = (com.unity3d.ads.core.data.model.CacheResult) r11
                    boolean r1 = r11 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                    if (r1 == 0) goto L55
                    go.l<com.unity3d.ads.core.data.model.CacheResult> r1 = r10.$fileResult
                L45:
                    java.lang.Object r0 = r1.getValue()
                    r2 = r0
                    com.unity3d.ads.core.data.model.CacheResult r2 = (com.unity3d.ads.core.data.model.CacheResult) r2
                    boolean r0 = r1.b(r0, r11)
                    if (r0 == 0) goto L45
                    bn.r r11 = bn.r.f5635a
                    return r11
                L55:
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r11 = r10.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r3 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getRemoteCacheDataSource$p(r11)
                    java.io.File r4 = r10.$cacheDirectory
                    java.lang.String r5 = r10.$filename
                    java.lang.String r6 = r10.$url
                    int r11 = r10.$priority
                    java.lang.Integer r7 = jn.a.d(r11)
                    r10.label = r2
                    r8 = r10
                    java.lang.Object r11 = r3.getFile(r4, r5, r6, r7, r8)
                    if (r11 != r0) goto L71
                    return r0
                L71:
                    com.unity3d.ads.core.data.model.CacheResult r11 = (com.unity3d.ads.core.data.model.CacheResult) r11
                    go.l<com.unity3d.ads.core.data.model.CacheResult> r0 = r10.$fileResult
                L75:
                    java.lang.Object r1 = r0.getValue()
                    r2 = r1
                    com.unity3d.ads.core.data.model.CacheResult r2 = (com.unity3d.ads.core.data.model.CacheResult) r2
                    boolean r1 = r0.b(r1, r11)
                    if (r1 == 0) goto L75
                    bn.r r11 = bn.r.f5635a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C44612.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44612(String str, File file, int i10, c<? super C44612> cVar) {
            super(2, cVar);
            this.$url = str;
            this.$cacheDirectory = file;
            this.$priority = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidCacheRepository.this.new C44612(this.$url, this.$cacheDirectory, this.$priority, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super CacheResult> cVar) {
            return ((C44612) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x009f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
            /*
                r19 = this;
                r6 = r19
                java.lang.Object r7 = in.a.g()
                int r0 = r6.label
                r8 = 0
                r9 = 3
                r10 = 2
                r1 = 1
                if (r0 == 0) goto L36
                if (r0 == r1) goto L2b
                if (r0 == r10) goto L23
                if (r0 != r9) goto L1b
                kotlin.c.b(r20)
                r0 = r20
                goto La0
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L23:
                java.lang.Object r0 = r6.L$0
                go.l r0 = (go.l) r0
                kotlin.c.b(r20)
                goto L91
            L2b:
                java.lang.Object r0 = r6.L$0
                java.lang.String r0 = (java.lang.String) r0
                kotlin.c.b(r20)
                r14 = r0
                r0 = r20
                goto L61
            L36:
                kotlin.c.b(r20)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.lang.String r2 = r6.$url
                java.lang.String r11 = r0.getFilename(r2)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
                java.io.File r2 = r6.$cacheDirectory
                java.lang.String r3 = r6.$url
                int r4 = r6.$priority
                java.lang.Integer r4 = jn.a.d(r4)
                r6.L$0 = r11
                r6.label = r1
                r1 = r2
                r2 = r11
                r5 = r19
                java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5)
                if (r0 != r7) goto L60
                return r7
            L60:
                r14 = r11
            L61:
                com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r1 == 0) goto L68
                return r0
            L68:
                go.l r0 = go.v.a(r8)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r1 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.domain.work.DownloadPriorityQueue r1 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getDownloadPriorityQueue$p(r1)
                int r2 = r6.$priority
                com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1 r3 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r12 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.io.File r13 = r6.$cacheDirectory
                java.lang.String r15 = r6.$url
                r18 = 0
                r11 = r3
                r16 = r2
                r17 = r0
                r11.<init>(r12, r13, r14, r15, r16, r17, r18)
                r6.L$0 = r0
                r6.label = r10
                java.lang.Object r1 = r1.invoke(r2, r3, r6)
                if (r1 != r7) goto L91
                return r7
            L91:
                go.d r0 = go.f.u(r0)
                r6.L$0 = r8
                r6.label = r9
                java.lang.Object r0 = go.f.v(r0, r6)
                if (r0 != r7) goto La0
                return r7
            La0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C44612.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidCacheRepository(@NotNull h0 h0Var, @NotNull GetCacheDirectory getCacheDirectory, @NotNull CacheDataSource cacheDataSource, @NotNull CacheDataSource cacheDataSource2, @NotNull Context context, @NotNull SessionRepository sessionRepository, @NotNull CleanupDirectory cleanupDirectory, @NotNull DownloadPriorityQueue downloadPriorityQueue, @NotNull CreateFile createFile) {
        tn.p.k(h0Var, "ioDispatcher");
        tn.p.k(getCacheDirectory, "getCacheDirectory");
        tn.p.k(cacheDataSource, "localCacheDataSource");
        tn.p.k(cacheDataSource2, "remoteCacheDataSource");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(sessionRepository, "sessionRepository");
        tn.p.k(cleanupDirectory, "cleanupDirectory");
        tn.p.k(downloadPriorityQueue, "downloadPriorityQueue");
        tn.p.k(createFile, "createFile");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = cacheDataSource;
        this.remoteCacheDataSource = cacheDataSource2;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.scope = kotlinx.coroutines.d.i(kotlinx.coroutines.d.i(kotlinx.coroutines.d.a(h0Var), new k0("CacheRepository")), kotlinx.coroutines.h.f73417b);
        this.cacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
        this.webviewCacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i10, c<? super CacheResult> cVar) {
        return g.g(this.scope.getCoroutineContext(), new C44612(str, file, i10, null), cVar);
    }

    private final File initCacheDir(String str) {
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        File cacheDir = this.context.getCacheDir();
        tn.p.j(cacheDir, "context.cacheDir");
        File fileInvoke = getCacheDirectory.invoke(cacheDir, str);
        fileInvoke.mkdirs();
        return fileInvoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object clearCache(@NotNull c<? super r> cVar) {
        return g.g(this.scope.getCoroutineContext(), new AnonymousClass2(null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doesFileExist(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = (com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.c.b(r6)
            r0.label = r3
            java.lang.Object r6 = r4.retrieveFile(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            boolean r5 = r6 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            java.lang.Boolean r5 = jn.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.doesFileExist(java.lang.String, hn.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getCacheSize(@NotNull c<? super Long> cVar) {
        return g.g(this.scope.getCoroutineContext(), new C44602(null), cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getFile(@NotNull String str, @Nullable JSONArray jSONArray, int i10, @NotNull c<? super CacheResult> cVar) {
        return getFileInternal(this.cacheDir, str, jSONArray, i10, cVar);
    }

    @NotNull
    public final String getFilename(@NotNull String str) {
        tn.p.k(str, "url");
        String strF1 = d0.f1(d0.h1(d0.l1(str, '?', null, 2, null), '/', null, 2, null), '.', "");
        if (!(!d0.u0(strF1))) {
            return StringExtensionsKt.getSHA256Hash(str);
        }
        return StringExtensionsKt.getSHA256Hash(str) + '.' + strF1;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getWebviewFile(@NotNull String str, @NotNull String str2, @NotNull c<? super CacheResult> cVar) {
        File fileInvoke = this.createFile.invoke(this.webviewCacheDir, str2);
        fileInvoke.mkdirs();
        return getFileInternal(fileInvoke, str, null, 0, cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(@NotNull CachedFile cachedFile) {
        tn.p.k(cachedFile, "cachedFile");
        File file = cachedFile.getFile();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return file.delete();
            }
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object retrieveFile(@NotNull String str, @NotNull c<? super CacheResult> cVar) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.cacheDir, str, null, null, cVar, 12, null);
    }
}
