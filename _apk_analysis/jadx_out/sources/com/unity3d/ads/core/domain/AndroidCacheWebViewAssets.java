package com.unity3d.ads.core.domain;

import bo.d0;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import hn.c;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidCacheWebViewAssets.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidCacheWebViewAssets implements CacheWebViewAssets {

    @NotNull
    private final ConcurrentHashMap<String, File> _cached;

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidCacheWebViewAssets$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidCacheWebViewAssets.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidCacheWebViewAssets", f = "AndroidCacheWebViewAssets.kt", l = {35, 45}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
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
            return AndroidCacheWebViewAssets.this.invoke(null, this);
        }
    }

    public AndroidCacheWebViewAssets(@NotNull CacheRepository cacheRepository, @NotNull SessionRepository sessionRepository) {
        p.k(cacheRepository, "cacheRepository");
        p.k(sessionRepository, "sessionRepository");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this._cached = new ConcurrentHashMap<>();
    }

    private final String getFilename(String str, String str2) {
        return str2 + '/' + d0.h1(d0.l1(str, '?', null, 2, null), '/', null, 2, null);
    }

    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    @NotNull
    public Map<String, File> getCached() {
        return this._cached;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00f2 -> B:46:0x00f5). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.WebViewConfiguration r10, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r11) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidCacheWebViewAssets.invoke(com.unity3d.ads.core.data.model.WebViewConfiguration, hn.c):java.lang.Object");
    }
}
