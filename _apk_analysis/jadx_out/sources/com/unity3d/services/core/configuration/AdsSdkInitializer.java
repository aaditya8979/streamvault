package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import androidx.startup.Initializer;
import bn.r;
import cn.w;
import com.google.android.gms.net.CronetProviderInstaller;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.i0;
import p000do.l0;
import p000do.w0;
import sn.p;
import tn.t;

/* JADX INFO: compiled from: AdsSdkInitializer.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AdsSdkInitializer implements Initializer<r> {

    /* JADX INFO: renamed from: com.unity3d.services.core.configuration.AdsSdkInitializer$create$1, reason: invalid class name */
    /* JADX INFO: compiled from: AdsSdkInitializer.kt */
    @d(c = "com.unity3d.services.core.configuration.AdsSdkInitializer$create$1", f = "AdsSdkInitializer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, hn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return new AnonymousClass1(this.$context, cVar);
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
            ((OrientationRepository) ServiceProvider.INSTANCE.getRegistry().getService("", t.b(OrientationRepository.class))).invoke();
            try {
                CronetProviderInstaller.installProvider(this.$context);
            } catch (Throwable unused) {
            }
            return r.f5635a;
        }
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ r create(Context context) {
        create2(context);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            tn.p.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        i.d(kotlinx.coroutines.d.i(kotlinx.coroutines.d.a(w0.a()), new AdsSdkInitializer$create$$inlined$CoroutineExceptionHandler$1(i0.D8)), null, null, new AnonymousClass1(context, null), 3, null);
    }

    @Override // androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return w.m();
    }
}
