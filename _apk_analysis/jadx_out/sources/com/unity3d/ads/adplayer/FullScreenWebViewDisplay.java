package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwnerKt;
import bn.g;
import bn.r;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import go.e;
import go.f;
import go.k;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import jn.d;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p000do.i;
import p000do.l0;
import sn.l;
import sn.p;
import tn.t;

/* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class FullScreenWebViewDisplay extends ComponentActivity implements IServiceComponent {

    @NotNull
    private final g adObject$delegate;

    @NotNull
    private final g dispatchers$delegate;

    @NotNull
    private String opportunityId = "";

    @NotNull
    private final g sendDiagnosticEvent$delegate;

    @Nullable
    private Map<String, ? extends Object> showOptions;

    @NotNull
    private final ActivityResultLauncher<Intent> startForResult;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1, reason: invalid class name */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ WebView $webView;
        public int label;
        public final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
        @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1", f = "FullScreenWebViewDisplay.kt", l = {155}, m = "invokeSuspend")
        public static final class C07051 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
            public int label;
            public final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07051(FullScreenWebViewDisplay fullScreenWebViewDisplay, hn.c<? super C07051> cVar) {
                super(2, cVar);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                return new C07051(this.this$0, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                return ((C07051) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, this.this$0.showOptions);
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == objG) {
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

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
        @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2", f = "FullScreenWebViewDisplay.kt", l = {161}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
            public int label;
            public final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(FullScreenWebViewDisplay fullScreenWebViewDisplay, hn.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                return new AnonymousClass2(this.this$0, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(this.this$0.opportunityId, "WebView failed to attach to FullScreenWebViewDisplay.");
                    this.label = 1;
                    if (displayMessages.emit(displayError, this) == objG) {
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
        public AnonymousClass1(WebView webView, FullScreenWebViewDisplay fullScreenWebViewDisplay, hn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$webView = webView;
            this.this$0 = fullScreenWebViewDisplay;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return new AnonymousClass1(this.$webView, this.this$0, cVar);
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
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            try {
                ViewParent parent = this.$webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.$webView);
                }
                this.this$0.setContentView(this.$webView);
                i.d(kotlinx.coroutines.d.a(this.this$0.getDispatchers().getDefault()), null, null, new C07051(this.this$0, null), 3, null);
            } catch (Throwable th2) {
                if (th2 instanceof CancellationException) {
                    return r.f5635a;
                }
                i.d(kotlinx.coroutines.d.a(this.this$0.getDispatchers().getDefault()), null, null, new AnonymousClass2(this.this$0, null), 3, null);
                this.this$0.setResult(0);
                this.this$0.finish();
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1", f = "FullScreenWebViewDisplay.kt", l = {57}, m = "invokeSuspend")
    public static final class C44261 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public int label;

        public C44261(hn.c<? super C44261> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return FullScreenWebViewDisplay.this.new C44261(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((C44261) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.this.opportunityId, "Opportunity ID not found");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$2, reason: invalid class name */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$2", f = "FullScreenWebViewDisplay.kt", l = {67}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public int label;

        public AnonymousClass2(hn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return FullScreenWebViewDisplay.this.new AnonymousClass2(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.this.opportunityId, "AdPlayer is not active. Could be because show was called while the app was in background.");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6, reason: invalid class name */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6", f = "FullScreenWebViewDisplay.kt", l = {82}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public int label;

        public AnonymousClass6(hn.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return FullScreenWebViewDisplay.this.new AnonymousClass6(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((AnonymousClass6) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                FullScreenWebViewDisplay fullScreenWebViewDisplay = FullScreenWebViewDisplay.this;
                this.label = 1;
                if (fullScreenWebViewDisplay.listenToAdPlayerEvents(this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onDestroy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onDestroy$1", f = "FullScreenWebViewDisplay.kt", l = {200}, m = "invokeSuspend")
    public static final class C44271 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public int label;

        public C44271(hn.c<? super C44271> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return FullScreenWebViewDisplay.this.new C44271(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((C44271) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayDestroyed displayDestroyed = new DisplayMessage.DisplayDestroyed(FullScreenWebViewDisplay.this.opportunityId);
                this.label = 1;
                if (displayMessages.emit(displayDestroyed, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1", f = "FullScreenWebViewDisplay.kt", l = {187}, m = "invokeSuspend")
    public static final class C44281 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public int label;

        public C44281(hn.c<? super C44281> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return FullScreenWebViewDisplay.this.new C44281(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((C44281) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(FullScreenWebViewDisplay.this.opportunityId, false);
                this.label = 1;
                if (displayMessages.emit(visibilityChanged, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$2", f = "FullScreenWebViewDisplay.kt", l = {192}, m = "invokeSuspend")
    public static final class C44292 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public int label;

        public C44292(hn.c<? super C44292> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return FullScreenWebViewDisplay.this.new C44292(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((C44292) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.DisplayDestroyed displayDestroyed = new DisplayMessage.DisplayDestroyed(FullScreenWebViewDisplay.this.opportunityId);
                this.label = 1;
                if (displayMessages.emit(displayDestroyed, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onResume$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onResume$1", f = "FullScreenWebViewDisplay.kt", l = {179}, m = "invokeSuspend")
    public static final class C44301 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public int label;

        public C44301(hn.c<? super C44301> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return FullScreenWebViewDisplay.this.new C44301(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((C44301) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(FullScreenWebViewDisplay.this.opportunityId, true);
                this.label = 1;
                if (displayMessages.emit(visibilityChanged, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onWindowFocusChanged$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onWindowFocusChanged$1", f = "FullScreenWebViewDisplay.kt", l = {210}, m = "invokeSuspend")
    public static final class C44311 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ boolean $hasFocus;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44311(boolean z10, hn.c<? super C44311> cVar) {
            super(2, cVar);
            this.$hasFocus = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return FullScreenWebViewDisplay.this.new C44311(this.$hasFocus, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((C44311) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.FocusChanged focusChanged = new DisplayMessage.FocusChanged(FullScreenWebViewDisplay.this.opportunityId, this.$hasFocus);
                this.label = 1;
                if (displayMessages.emit(focusChanged, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$openUrl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
    @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$openUrl$1", f = "FullScreenWebViewDisplay.kt", l = {135}, m = "invokeSuspend")
    public static final class C44321 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ String $opportunityId;
        public final /* synthetic */ boolean $result;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44321(String str, boolean z10, hn.c<? super C44321> cVar) {
            super(2, cVar);
            this.$opportunityId = str;
            this.$result = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return new C44321(this.$opportunityId, this.$result, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((C44321) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.OpenUrlResult openUrlResult = new DisplayMessage.OpenUrlResult(this.$opportunityId, this.$result);
                this.label = 1;
                if (displayMessages.emit(openUrlResult, this) == objG) {
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

    public FullScreenWebViewDisplay() {
        final String str = "";
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.sendDiagnosticEvent$delegate = kotlin.b.a(lazyThreadSafetyMode, new sn.a<SendDiagnosticEvent>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, t.b(SendDiagnosticEvent.class));
            }
        });
        this.adObject$delegate = kotlin.b.b(new sn.a<AdObject>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject$2
            {
                super(0);
            }

            private static final AdRepository invoke$lambda$0(g<? extends AdRepository> gVar) {
                return gVar.getValue();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @Nullable
            public final AdObject invoke() {
                Object objM7534constructorimpl;
                final FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
                final String str2 = "";
                g gVarA = kotlin.b.a(LazyThreadSafetyMode.NONE, new sn.a<AdRepository>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject$2$invoke$$inlined$inject$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.repository.AdRepository, java.lang.Object] */
                    @Override // sn.a
                    @NotNull
                    public final AdRepository invoke() {
                        IServiceComponent iServiceComponent = fullScreenWebViewDisplay;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str2, t.b(AdRepository.class));
                    }
                });
                FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this.this$0;
                try {
                    Result.a aVar = Result.Companion;
                    AdRepository adRepositoryInvoke$lambda$0 = invoke$lambda$0(gVarA);
                    UUID uuidFromString = UUID.fromString(fullScreenWebViewDisplay2.opportunityId);
                    tn.p.j(uuidFromString, "fromString(opportunityId)");
                    objM7534constructorimpl = Result.m7534constructorimpl(adRepositoryInvoke$lambda$0.getAd(ProtobufExtensionsKt.toByteString(uuidFromString)));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                    objM7534constructorimpl = null;
                }
                return (AdObject) objM7534constructorimpl;
            }
        });
        this.dispatchers$delegate = kotlin.b.a(lazyThreadSafetyMode, new sn.a<ISDKDispatchers>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.domain.ISDKDispatchers, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final ISDKDispatchers invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, t.b(ISDKDispatchers.class));
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.unity3d.ads.adplayer.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FullScreenWebViewDisplay.startForResult$lambda$7((ActivityResult) obj);
            }
        });
        tn.p.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…n to this activity.\n    }");
        this.startForResult = activityResultLauncherRegisterForActivityResult;
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers$delegate.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenToAdPlayerEvents(hn.c<? super r> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        final go.p pVarI = f.I(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, cVar2, null));
        f.D(f.G(new go.d<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements e {
                public final /* synthetic */ e $this_unsafeFlow;
                public final /* synthetic */ FullScreenWebViewDisplay this$0;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(hn.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(e eVar, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = eVar;
                    this.this$0 = fullScreenWebViewDisplay;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // go.e
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull hn.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = in.a.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.c.b(r7)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.c.b(r7)
                        go.e r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.DisplayMessage r2 = (com.unity3d.ads.adplayer.DisplayMessage) r2
                        java.lang.String r2 = r2.getOpportunityId()
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay r4 = r5.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r4)
                        boolean r2 = tn.p.f(r2, r4)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        bn.r r6 = bn.r.f5635a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, hn.c):java.lang.Object");
                }
            }

            @Override // go.d
            @Nullable
            public Object collect(@NotNull e<? super DisplayMessage> eVar, @NotNull hn.c cVar3) {
                Object objCollect = pVarI.collect(new AnonymousClass2(eVar, this), cVar3);
                return objCollect == in.a.g() ? objCollect : r.f5635a;
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB == in.a.g() ? objB : r.f5635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView(WebView webView) {
        i.d(kotlinx.coroutines.d.a(getDispatchers().getMain()), null, null, new AnonymousClass1(webView, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrl(String str, Intent intent, boolean z10) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            if (intent.resolveActivity(getPackageManager()) == null || !z10) {
                intent.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
            } else {
                this.startForResult.launch(intent);
            }
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        i.d(LifecycleOwnerKt.getLifecycleScope(this), getDispatchers().getDefault(), null, new C44321(str, Result.m7540isSuccessimpl(objM7534constructorimpl), null), 2, null);
    }

    public static /* synthetic */ void openUrl$default(FullScreenWebViewDisplay fullScreenWebViewDisplay, String str, Intent intent, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fullScreenWebViewDisplay.openUrl(str, intent, z10);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, "com.unity3d.ads");
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$7(ActivityResult activityResult) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch("com.unity3d.ads", motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object objM7534constructorimpl;
        Map<String, ? extends Object> map;
        l0 scope;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        if (tn.p.f(stringExtra, "not_provided")) {
            setResult(0);
            i.d(kotlinx.coroutines.d.a(getDispatchers().getDefault()), null, null, new C44261(null), 3, null);
            finish();
            return;
        }
        AdObject adObject = getAdObject();
        AdPlayer adPlayer = adObject != null ? adObject.getAdPlayer() : null;
        if (!((adPlayer == null || (scope = adPlayer.getScope()) == null || !kotlinx.coroutines.d.h(scope)) ? false : true)) {
            setResult(0);
            i.d(kotlinx.coroutines.d.a(getDispatchers().getDefault()), null, null, new AnonymousClass2(null), 3, null);
            finish();
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(getIntent().hasExtra("orientation"));
        if (!boolValueOf.booleanValue()) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            boolValueOf.booleanValue();
            setRequestedOrientation(getIntent().getIntExtra("orientation", -1));
        }
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        if (stringExtra2 != null) {
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                objM7534constructorimpl = null;
            }
            map = (Map) objM7534constructorimpl;
        } else {
            map = null;
        }
        this.showOptions = map;
        i.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass6(null), 3, null);
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        tn.p.j(onBackPressedDispatcher, "onBackPressedDispatcher");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new l<OnBackPressedCallback, r>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onCreate.7
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(OnBackPressedCallback onBackPressedCallback) {
                invoke2(onBackPressedCallback);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull OnBackPressedCallback onBackPressedCallback) {
                tn.p.k(onBackPressedCallback, "$this$addCallback");
            }
        }, 2, null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            i.d(kotlinx.coroutines.d.a(getDispatchers().getDefault()), null, null, new C44271(null), 3, null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @Nullable KeyEvent keyEvent) {
        return i10 == 4;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        i.d(kotlinx.coroutines.d.a(getDispatchers().getDefault()), null, null, new C44281(null), 3, null);
        if (isFinishing()) {
            i.d(kotlinx.coroutines.d.a(getDispatchers().getDefault()), null, null, new C44292(null), 3, null);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        i.d(kotlinx.coroutines.d.a(getDispatchers().getDefault()), null, null, new C44301(null), 3, null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        i.d(kotlinx.coroutines.d.a(getDispatchers().getDefault()), null, null, new C44311(z10, null), 3, null);
    }
}
