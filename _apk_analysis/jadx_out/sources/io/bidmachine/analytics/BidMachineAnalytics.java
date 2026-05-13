package io.bidmachine.analytics;

import android.content.Context;
import android.util.Base64;
import bn.g;
import bn.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import hn.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.analytics.internal.AbstractC5326e;
import io.bidmachine.analytics.internal.C;
import io.bidmachine.analytics.internal.C5322a;
import io.bidmachine.analytics.internal.C5332k;
import io.bidmachine.analytics.internal.C5334m;
import io.bidmachine.analytics.internal.C5339s;
import java.util.Map;
import java.util.concurrent.Executors;
import jn.d;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import p000do.i;
import p000do.j2;
import p000do.l0;
import p000do.l1;
import sn.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ/\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00100\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rR!\u0010\u001f\u001a\u00020\u00198@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010,\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lio/bidmachine/analytics/BidMachineAnalytics;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lbn/r;", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;)V", "Lio/bidmachine/analytics/AnalyticsConfig;", "analyticsConfig", "configure", "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;)V", "Lio/bidmachine/analytics/ConfigureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;Lio/bidmachine/analytics/ConfigureListener;)V", "", "typeId", "", "", "getImpData", "(I)Ljava/util/Map;", "", "outPublicKey", "Lio/bidmachine/analytics/internal/s;", "a", "([B)Lio/bidmachine/analytics/internal/s;", "Ldo/l0;", "Lbn/g;", "getScope$bidmachine_android_sdk_bh_3_3_0", "()Ldo/l0;", "getScope$bidmachine_android_sdk_bh_3_3_0$annotations", "()V", "scope", "<set-?>", "b", "Ljava/lang/String;", "getSessionId$bidmachine_android_sdk_bh_3_3_0", "()Ljava/lang/String;", JsonStorageKeyNames.SESSION_ID_KEY, "c", "Lio/bidmachine/analytics/internal/s;", "getEncryptionManager$bidmachine_android_sdk_bh_3_3_0", "()Lio/bidmachine/analytics/internal/s;", "setEncryptionManager$bidmachine_android_sdk_bh_3_3_0", "(Lio/bidmachine/analytics/internal/s;)V", "encryptionManager", "<init>", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class BidMachineAnalytics {
    public static final BidMachineAnalytics INSTANCE = new BidMachineAnalytics();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final g scope = kotlin.b.b(b.f68670a);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static String sessionId = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static C5339s encryptionManager;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @d(c = "io.bidmachine.analytics.BidMachineAnalytics$configure$2", f = "BidMachineAnalytics.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f68665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AnalyticsConfig f68666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f68667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f68668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ConfigureListener f68669f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AnalyticsConfig analyticsConfig, String str, Context context, ConfigureListener configureListener, c<? super a> cVar) {
            super(2, cVar);
            this.f68666c = analyticsConfig;
            this.f68667d = str;
            this.f68668e = context;
            this.f68669f = configureListener;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            a aVar = new a(this.f68666c, this.f68667d, this.f68668e, this.f68669f, cVar);
            aVar.f68665b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM7534constructorimpl;
            Object objM7534constructorimpl2;
            in.a.g();
            if (this.f68664a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            AnalyticsConfig analyticsConfig = this.f68666c;
            try {
                Result.a aVar = Result.Companion;
                BidMachineAnalytics bidMachineAnalytics = BidMachineAnalytics.INSTANCE;
                bidMachineAnalytics.setEncryptionManager$bidmachine_android_sdk_bh_3_3_0(bidMachineAnalytics.a(Base64.decode(analyticsConfig.getBpk(), 2)));
                objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m7540isSuccessimpl(objM7534constructorimpl)) {
            }
            Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            try {
                BidMachineAnalytics.INSTANCE.a(this.f68668e, this.f68666c, this.f68669f);
                objM7534constructorimpl2 = Result.m7534constructorimpl(r.f5635a);
            } catch (Throwable th3) {
                Result.a aVar3 = Result.Companion;
                objM7534constructorimpl2 = Result.m7534constructorimpl(kotlin.c.a(th3));
            }
            if (Result.m7540isSuccessimpl(objM7534constructorimpl2)) {
            }
            Result.m7537exceptionOrNullimpl(objM7534constructorimpl2);
            return r.f5635a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldo/l0;", "a", "()Ldo/l0;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements sn.a<l0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f68670a = new b();

        public b() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 invoke() {
            return kotlinx.coroutines.d.a(j2.b(null, 1, null).plus(l1.c(Executors.newSingleThreadExecutor())));
        }
    }

    private BidMachineAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5339s a(byte[] outPublicKey) {
        C5322a c5322a = new C5322a();
        return new C5339s(c5322a, new C(outPublicKey, c5322a.getName(), null, false, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, AnalyticsConfig analyticsConfig, ConfigureListener listener) {
        C5334m.f68923a.a(context, analyticsConfig);
        C5332k.f68912a.a(context, analyticsConfig);
        if (listener != null) {
            listener.onConfigured();
        }
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig) {
        configure(context, analyticsConfig, null);
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig, ConfigureListener listener) {
        String str = analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String();
        sessionId = str;
        initialize(context);
        i.d(INSTANCE.getScope$bidmachine_android_sdk_bh_3_3_0(), null, null, new a(analyticsConfig, str, context.getApplicationContext(), listener, null), 3, null);
    }

    public static final Map<String, Map<String, Object>> getImpData(int typeId) {
        AbstractC5326e.a aVar = (AbstractC5326e.a) cn.r.d0(AbstractC5326e.a.values(), typeId);
        return aVar == null ? kotlin.collections.a.j() : C5332k.f68912a.a(aVar);
    }

    public static /* synthetic */ void getScope$bidmachine_android_sdk_bh_3_3_0$annotations() {
    }

    public static final void initialize(Context context) {
        C5332k.f68912a.b(context.getApplicationContext());
    }

    public final C5339s getEncryptionManager$bidmachine_android_sdk_bh_3_3_0() {
        return encryptionManager;
    }

    public final l0 getScope$bidmachine_android_sdk_bh_3_3_0() {
        return (l0) scope.getValue();
    }

    public final String getSessionId$bidmachine_android_sdk_bh_3_3_0() {
        return sessionId;
    }

    public final void setEncryptionManager$bidmachine_android_sdk_bh_3_3_0(C5339s c5339s) {
        encryptionManager = c5339s;
    }
}
