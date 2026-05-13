package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.f0;
import cn.v0;
import com.moloco.sdk.internal.MolocoLogger;
import go.q;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p000do.l0;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class h implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l0 f48823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final go.k<a> f48824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final go.k<a> f48825c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0636a f48826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f48827c = new a("VIDEO", 0, "videoContainer");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f48828d = new a("MRAID", 1, "mraidContainer");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f48829e = new a("STATIC", 2, "staticContainer");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a[] f48830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kn.a f48831g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f48832a;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h$a$a, reason: collision with other inner class name */
        public static final class C0636a {
            public C0636a() {
            }

            public /* synthetic */ C0636a(tn.i iVar) {
                this();
            }

            @Nullable
            public final a a(@NotNull String str) {
                p.k(str, "value");
                for (a aVar : a.values()) {
                    if (p.f(aVar.c(), str)) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        static {
            a[] aVarArrA = a();
            f48830f = aVarArrA;
            f48831g = kotlin.enums.a.a(aVarArrA);
            f48826b = new C0636a(null);
        }

        public a(String str, int i10, String str2) {
            this.f48832a = str2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f48827c, f48828d, f48829e};
        }

        @NotNull
        public static kn.a<a> b() {
            return f48831g;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f48830f.clone();
        }

        @NotNull
        public final String c() {
            return this.f48832a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.PlayListItemDisplayingEventHandler$handleEvent$1", f = "PlayListItemDisplayingEventHandler.kt", l = {34}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48833a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f48835c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f48835c = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return h.this.new b(this.f48835c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48833a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.k kVar = h.this.f48824b;
                a aVar = this.f48835c;
                this.f48833a = 1;
                if (kVar.emit(aVar, this) == objG) {
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

    public h(@NotNull l0 l0Var) {
        p.k(l0Var, "scope");
        this.f48823a = l0Var;
        go.k<a> kVarB = q.b(0, 0, null, 7, null);
        this.f48824b = kVarB;
        this.f48825c = kVarB;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return v0.d("playlistItemDisplaying");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject jSONObject) throws JSONException {
        p.k(jSONObject, "event");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, b(), jSONObject + " displaying.", false, 4, null);
        if (!p.f(jSONObject.getString("event"), f0.s0(a()))) {
            MolocoLogger.debug$default(molocoLogger, b(), "Event not supported: " + jSONObject.getString("event"), false, 4, null);
            return;
        }
        String string = jSONObject.getString("creativeType");
        a.C0636a c0636a = a.f48826b;
        p.h(string);
        a aVarA = c0636a.a(string);
        MolocoLogger.debug$default(molocoLogger, b(), aVarA + " displaying.", false, 4, null);
        if (aVarA != null) {
            p000do.i.d(this.f48823a, null, null, new b(aVarA, null), 3, null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "PlayListItemDisplayingEventHandler";
    }

    @NotNull
    public final go.k<a> c() {
        return this.f48825c;
    }
}
