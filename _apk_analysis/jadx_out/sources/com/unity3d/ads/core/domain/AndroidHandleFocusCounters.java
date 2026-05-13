package com.unity3d.ads.core.domain;

import android.app.Activity;
import androidx.annotation.VisibleForTesting;
import bn.r;
import co.b;
import co.j;
import co.k;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import go.f;
import go.l;
import go.v;
import hn.c;
import java.util.concurrent.ConcurrentHashMap;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import sn.p;
import tn.i;
import tn.t;

/* JADX INFO: compiled from: AndroidHandleFocusCounters.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidHandleFocusCounters {

    @NotNull
    private final h0 defaultDispatcher;

    @NotNull
    private final FocusRepository focusRepository;

    @NotNull
    private final ConcurrentHashMap<String, co.a> focusTimesPerActivity;

    @NotNull
    private final AndroidGetIsAdActivity isAdActivity;

    @Nullable
    private volatile String latestKnownActivityResumed;

    @NotNull
    private final l<FocusState> previousFocusState;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final k timeSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleFocusCounters.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<FocusState, c<? super r>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = AndroidHandleFocusCounters.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull FocusState focusState, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(focusState, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String qualifiedName;
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            FocusState focusState = (FocusState) this.L$0;
            AndroidHandleFocusCounters.this.onFocusStateChange(focusState);
            Activity activity = focusState.getActivity().get();
            if (activity == null || (qualifiedName = t.b(activity.getClass()).getQualifiedName()) == null) {
                qualifiedName = "unknown_activity_name";
            }
            if (!AndroidHandleFocusCounters.this.isAdActivity.invoke(qualifiedName)) {
                return r.f5635a;
            }
            AndroidHandleFocusCounters.this.sessionRepository.incrementGlobalAdsFocusChangeCount();
            if (focusState instanceof FocusState.Focused) {
                AndroidHandleFocusCounters.this.onResume(qualifiedName);
            } else if (focusState instanceof FocusState.Unfocused) {
                AndroidHandleFocusCounters.this.onPause(qualifiedName);
            }
            return r.f5635a;
        }
    }

    public AndroidHandleFocusCounters(@NotNull SessionRepository sessionRepository, @NotNull FocusRepository focusRepository, @NotNull AndroidGetIsAdActivity androidGetIsAdActivity, @NotNull h0 h0Var, @NotNull k kVar) {
        tn.p.k(sessionRepository, "sessionRepository");
        tn.p.k(focusRepository, "focusRepository");
        tn.p.k(androidGetIsAdActivity, "isAdActivity");
        tn.p.k(h0Var, "defaultDispatcher");
        tn.p.k(kVar, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = androidGetIsAdActivity;
        this.defaultDispatcher = h0Var;
        this.timeSource = kVar;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = v.a(null);
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, h0 h0Var, k kVar, int i10, i iVar) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, h0Var, (i10 & 16) != 0 ? j.f6782a : kVar);
    }

    @VisibleForTesting
    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState) {
        FocusState value;
        FocusState focusState2;
        l<FocusState> lVar = this.previousFocusState;
        do {
            value = lVar.getValue();
            focusState2 = value;
        } while (!lVar.b(value, focusState));
        if (focusState2 == null || focusState.getClass() == focusState2.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String str) {
        String str2 = this.latestKnownActivityResumed;
        if (str2 == null || tn.p.f(str2, str)) {
            co.a aVarRemove = this.focusTimesPerActivity.remove(str);
            if (aVarRemove == null) {
                aVarRemove = this.timeSource.a();
            }
            tn.p.j(aVarRemove, "focusTimesPerActivity.re…) ?: timeSource.markNow()");
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) b.q(aVarRemove.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String str) {
        this.latestKnownActivityResumed = str;
        this.focusTimesPerActivity.put(str, this.timeSource.a());
    }

    @Nullable
    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        f.D(f.G(this.focusRepository.getFocusState(), new AnonymousClass1(null)), kotlinx.coroutines.d.a(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(@Nullable String str) {
        this.latestKnownActivityResumed = str;
    }
}
