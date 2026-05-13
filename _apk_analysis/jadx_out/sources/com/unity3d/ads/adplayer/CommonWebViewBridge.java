package com.unity3d.ads.adplayer;

import bn.h;
import bn.r;
import cn.w0;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import go.f;
import go.k;
import go.l;
import go.p;
import go.q;
import go.v;
import java.util.Collection;
import java.util.Set;
import jn.d;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import p000do.h0;
import p000do.i;
import p000do.k0;
import p000do.l0;
import p000do.p0;
import p000do.t;

/* JADX INFO: compiled from: CommonWebViewBridge.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CommonWebViewBridge implements WebViewBridge {

    @NotNull
    private final k<Invocation> _onInvocation;

    @NotNull
    private final l<Set<Pair<String, t<Object[]>>>> callbacks;

    @NotNull
    private final Logger logger;

    @NotNull
    private final p<Invocation> onInvocation;

    @NotNull
    private final l0 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final WebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonWebViewBridge.kt */
    @d(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {44}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {
        public int label;

        public AnonymousClass1(hn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return CommonWebViewBridge.this.new AnonymousClass1(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7, reason: invalid class name */
    /* JADX INFO: compiled from: CommonWebViewBridge.kt */
    @d(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", l = {134, 136, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 138, 139, 148}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ String $callback;
        public final /* synthetic */ String $location;
        public final /* synthetic */ String $message;
        public final /* synthetic */ JSONArray $parameters;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ CommonWebViewBridge this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1, reason: invalid class name */
        /* JADX INFO: compiled from: CommonWebViewBridge.kt */
        @d(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1", f = "CommonWebViewBridge.kt", l = {136}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {
            public final /* synthetic */ Invocation $invocation;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Invocation invocation, hn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$invocation = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                return new AnonymousClass1(this.$invocation, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    p0<r> p0VarIsHandled = this.$invocation.isHandled();
                    this.label = 1;
                    if (p0VarIsHandled.N(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return r.f5635a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, String str3, hn.c<? super AnonymousClass7> cVar) {
            super(2, cVar);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
            this.$message = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$location, this.$parameters, this.this$0, this.$callback, this.$message, cVar);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((AnonymousClass7) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a1 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:11:0x0023, B:15:0x0031, B:33:0x009d, B:35:0x00a1, B:38:0x00b1, B:18:0x0040, B:30:0x008f, B:27:0x007d), top: B:63:0x000c, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b1 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:11:0x0023, B:15:0x0031, B:33:0x009d, B:35:0x00a1, B:38:0x00b1, B:18:0x0040, B:30:0x008f, B:27:0x007d), top: B:63:0x000c, outer: #1 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass7.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$request$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonWebViewBridge.kt */
    @d(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {77, 79}, m = AdActivity.REQUEST_KEY_EXTRA)
    public static final class C44251 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C44251(hn.c<? super C44251> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    public CommonWebViewBridge(@NotNull h0 h0Var, @NotNull WebViewContainer webViewContainer, @NotNull l0 l0Var, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Logger logger) {
        tn.p.k(h0Var, "dispatcher");
        tn.p.k(webViewContainer, "webViewContainer");
        tn.p.k(l0Var, "adPlayerScope");
        tn.p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        tn.p.k(logger, "logger");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        l0 l0VarI = kotlinx.coroutines.d.i(kotlinx.coroutines.d.i(l0Var, h0Var), new k0("CommonWebViewBridge"));
        this.scope = l0VarI;
        this.callbacks = v.a(w0.f());
        k<Invocation> kVarB = q.b(0, 64, null, 5, null);
        this._onInvocation = kVarB;
        this.onInvocation = f.b(kVarB);
        i.d(l0VarI, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, JSONArray jSONArray, hn.c<? super r> cVar) {
        Object objEvaluateJavascript = this.webViewContainer.evaluateJavascript(handlerType, jSONArray, cVar);
        return objEvaluateJavascript == in.a.g() ? objEvaluateJavascript : r.f5635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, hn.c<? super r> cVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object objExecute = execute(HandlerType.CALLBACK, new JSONArray((Collection) cn.v.e(jSONArray)), cVar);
        return objExecute == in.a.g() ? objExecute : r.f5635a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @NotNull
    public p<Invocation> getOnInvocation() {
        return this.onInvocation;
    }

    @NotNull
    public final l0 getScope() {
        return this.scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleCallback(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "callbackId"
            tn.p.k(r4, r0)
            java.lang.String r0 = "callbackStatus"
            tn.p.k(r5, r0)
            java.lang.String r0 = "rawParameters"
            tn.p.k(r6, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r6)
            java.lang.Object[] r6 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r0)
            go.l<java.util.Set<kotlin.Pair<java.lang.String, do.t<java.lang.Object[]>>>> r0 = r3.callbacks
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            r2 = r1
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r2 = r2.component1()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = tn.p.f(r2, r4)
            if (r2 == 0) goto L24
            goto L3f
        L3e:
            r1 = 0
        L3f:
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 != 0) goto L44
            return
        L44:
            java.lang.Object r4 = r1.component2()
            do.t r4 = (p000do.t) r4
            int r0 = r5.hashCode()
            r2 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r0 == r2) goto L90
            r2 = 2524(0x9dc, float:3.537E-42)
            if (r0 == r2) goto L87
            r2 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r0 == r2) goto L6b
            r2 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r0 == r2) goto L62
            goto L9c
        L62:
            java.lang.String r0 = "error"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L74
            goto L9c
        L6b:
            java.lang.String r0 = "ERROR"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L74
            goto L9c
        L74:
            java.lang.Exception r5 = new java.lang.Exception
            r0 = 0
            r6 = r6[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            tn.p.i(r6, r0)
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            r4.b(r5)
            goto L9c
        L87:
            java.lang.String r0 = "OK"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L99
            goto L9c
        L90:
            java.lang.String r0 = "success"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L99
            goto L9c
        L99:
            r4.n(r6)
        L9c:
            go.l<java.util.Set<kotlin.Pair<java.lang.String, do.t<java.lang.Object[]>>>> r4 = r3.callbacks
        L9e:
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            java.util.Set r6 = cn.x0.l(r6, r1)
            boolean r5 = r4.b(r5, r6)
            if (r5 == 0) goto L9e
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(@NotNull String str) {
        tn.p.k(str, "message");
        try {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = jSONArray.get(i10);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + str).toString());
                    }
                    if (!(jSONArray2.length() == 4)) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + str).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str3 = obj3 instanceof String ? (String) obj3 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + str).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + str).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str4 = obj5 instanceof String ? (String) obj5 : null;
                    if (str4 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + str).toString());
                    }
                    String str5 = str2 + '.' + str3;
                    this.logger.debug("Unity Ads WebView calling for: " + str5 + '(' + jSONArray3 + ')');
                    i.d(this.scope, null, null, new AnonymousClass7(str5, jSONArray3, this, str4, str, null), 3, null);
                }
            } catch (JSONException e10) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: " + str, e10);
            }
        } catch (Throwable th2) {
            this.logger.error("Error handling invocation from webview (" + str + ')', th2);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            Pair[] pairArr = new Pair[2];
            String message = th2.getMessage();
            if (message == null) {
                message = th2.getClass().getSimpleName();
            }
            pairArr[0] = h.a("reason_debug", message);
            pairArr[1] = h.a("webview_invocation", str);
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, kotlin.collections.a.m(pairArr), null, null, null, 58, null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: " + str, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object request(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.Object[] r13, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.Object[]> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge.C44251
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = (com.unity3d.ads.adplayer.CommonWebViewBridge.C44251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.c.b(r14)
            goto L96
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            java.lang.Object r11 = r0.L$0
            do.t r11 = (p000do.t) r11
            kotlin.c.b(r14)
            goto L8b
        L3d:
            kotlin.c.b(r14)
            do.t r14 = p000do.v.c(r4, r5, r4)
            int r2 = r14.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            go.l<java.util.Set<kotlin.Pair<java.lang.String, do.t<java.lang.Object[]>>>> r6 = r10.callbacks
        L4e:
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            kotlin.Pair r9 = bn.h.a(r2, r14)
            java.util.Set r8 = cn.x0.n(r8, r9)
            boolean r7 = r6.b(r7, r8)
            if (r7 == 0) goto L4e
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r6.put(r11)
            r6.put(r12)
            r6.put(r2)
            r11 = 0
            int r12 = r13.length
        L73:
            if (r11 >= r12) goto L7d
            r2 = r13[r11]
            r6.put(r2)
            int r11 = r11 + 1
            goto L73
        L7d:
            com.unity3d.ads.adplayer.HandlerType r11 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            r0.L$0 = r14
            r0.label = r5
            java.lang.Object r11 = r10.execute(r11, r6, r0)
            if (r11 != r1) goto L8a
            return r1
        L8a:
            r11 = r14
        L8b:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r14 = r11.N(r0)
            if (r14 != r1) goto L96
            return r1
        L96:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], hn.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @Nullable
    public Object sendEvent(@NotNull WebViewEvent webViewEvent, @NotNull hn.c<? super r> cVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        Object objExecute = execute(HandlerType.EVENT, jSONArray, cVar);
        return objExecute == in.a.g() ? objExecute : r.f5635a;
    }
}
