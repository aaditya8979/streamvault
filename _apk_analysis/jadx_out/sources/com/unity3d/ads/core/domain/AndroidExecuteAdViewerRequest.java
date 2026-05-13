package com.unity3d.ads.core.domain;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import bn.r;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import hn.c;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import jn.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p000do.g;
import p000do.h0;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {

    @NotNull
    private final GetCachedAsset getCachedAsset;

    @NotNull
    private final HttpClientProvider httpClientProvider;

    @NotNull
    private final h0 ioDispatcher;

    /* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {28, 29}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super HttpResponse>, Object> {
        public final /* synthetic */ Object[] $parameters;
        public final /* synthetic */ RequestType $type;
        public int label;
        public final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$parameters = objArr;
            this.this$0 = androidExecuteAdViewerRequest;
            this.$type = requestType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass2(this.$parameters, this.this$0, this.$type, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super HttpResponse> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM7534constructorimpl;
            Object objInvoke;
            WebResourceResponse webResourceResponseInvoke$default;
            InputStream data;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Object objD0 = cn.r.d0(this.$parameters, 1);
                byte[] bArrC = null;
                String str = objD0 instanceof String ? (String) objD0 : null;
                if (str == null) {
                    str = "";
                }
                if (!(str.length() > 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                try {
                    Result.a aVar = Result.Companion;
                    Uri uri = Uri.parse(str);
                    tn.p.j(uri, "parse(this)");
                    objM7534constructorimpl = Result.m7534constructorimpl(uri);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                    objM7534constructorimpl = null;
                }
                Uri uri2 = (Uri) objM7534constructorimpl;
                if (uri2 != null) {
                    if (!(this.$type == RequestType.GET)) {
                        uri2 = null;
                    }
                    if (uri2 != null && (webResourceResponseInvoke$default = GetCachedAsset.invoke$default(this.this$0.getCachedAsset, uri2, null, 2, null)) != null && (data = webResourceResponseInvoke$default.getData()) != null) {
                        tn.p.j(data, "data");
                        bArrC = on.a.c(data);
                    }
                }
                byte[] bArr = bArrC;
                if (bArr != null) {
                    return new HttpResponse(bArr, 0, null, null, null, null, 0L, 126, null);
                }
                HttpClientProvider httpClientProvider = this.this$0.httpClientProvider;
                this.label = 1;
                objInvoke = httpClientProvider.invoke(this);
                if (objInvoke == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return obj;
                }
                kotlin.c.b(obj);
                objInvoke = obj;
            }
            HttpRequest httpRequestCreateRequest = this.this$0.createRequest(this.$type, this.$parameters);
            this.label = 2;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, httpRequestCreateRequest, false, this, 2, null);
            return objExecute$default == objG ? objG : objExecute$default;
        }
    }

    public AndroidExecuteAdViewerRequest(@NotNull h0 h0Var, @NotNull HttpClientProvider httpClientProvider, @NotNull GetCachedAsset getCachedAsset) {
        tn.p.k(h0Var, "ioDispatcher");
        tn.p.k(httpClientProvider, "httpClientProvider");
        tn.p.k(getCachedAsset, "getCachedAsset");
        this.ioDispatcher = h0Var;
        this.httpClientProvider = httpClientProvider;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        Map<String, List<String>> mapJ;
        Map<String, List<String>> mapJ2;
        String str = (String) cn.r.d0(objArr, 1);
        if (!(!(str == null || str.length() == 0))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            JSONArray jSONArray = (JSONArray) cn.r.d0(objArr, 2);
            Integer num = (Integer) cn.r.d0(objArr, 3);
            Integer num2 = (Integer) cn.r.d0(objArr, 4);
            if (jSONArray == null || (mapJ = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                mapJ = kotlin.collections.a.j();
            }
            return new HttpRequest(str, null, requestType, null, mapJ, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = (String) cn.r.d0(objArr, 2);
        JSONArray jSONArray2 = (JSONArray) cn.r.d0(objArr, 3);
        Integer num3 = (Integer) cn.r.d0(objArr, 4);
        Integer num4 = (Integer) cn.r.d0(objArr, 5);
        if (jSONArray2 == null || (mapJ2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
            mapJ2 = kotlin.collections.a.j();
        }
        return new HttpRequest(str, null, requestType, str2, mapJ2, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    @Nullable
    public Object invoke(@NotNull RequestType requestType, @NotNull Object[] objArr, @NotNull c<? super HttpResponse> cVar) {
        return g.g(this.ioDispatcher, new AnonymousClass2(objArr, this, requestType, null), cVar);
    }
}
