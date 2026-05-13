package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import c3.a;
import com.facebook.common.R$id;
import com.facebook.common.R$layout;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.d0;
import com.facebook.internal.j0;
import com.facebook.login.LoginFragment;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FacebookActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000f\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J9\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0002R(\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/FragmentActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lbn/r;", "onCreate", "Landroidx/fragment/app/Fragment;", CampaignEx.JSON_KEY_AD_K, "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "dump", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "l", "<set-?>", "o", "Landroidx/fragment/app/Fragment;", "getCurrentFragment", "()Landroidx/fragment/app/Fragment;", "currentFragment", "<init>", "()V", VastTagName.COMPANION, "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class FacebookActivity extends FragmentActivity {

    @NotNull
    public static final String PASS_THROUGH_CANCEL_ACTION = "PassThrough";

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Fragment currentFragment;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f15028p = FacebookActivity.class.getName();

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch("com.facebook", motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(@NotNull String prefix, @Nullable FileDescriptor fd2, @NotNull PrintWriter writer, @Nullable String[] args) {
        if (a.d(this)) {
            return;
        }
        try {
            p.k(prefix, "prefix");
            p.k(writer, "writer");
            f3.a aVarA = f3.a.INSTANCE.a();
            if (p.f(aVarA == null ? null : Boolean.valueOf(aVarA.a(prefix, writer, args)), Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fd2, writer, args);
        } catch (Throwable th2) {
            a.b(th2, this);
        }
    }

    @Nullable
    public final Fragment getCurrentFragment() {
        return this.currentFragment;
    }

    @NotNull
    public Fragment k() {
        Fragment fragment;
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        p.j(supportFragmentManager, "supportFragmentManager");
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("SingleFragment");
        if (fragmentFindFragmentByTag != null) {
            return fragmentFindFragmentByTag;
        }
        if (p.f("FacebookDialogFragment", intent.getAction())) {
            FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
            facebookDialogFragment.setRetainInstance(true);
            facebookDialogFragment.show(supportFragmentManager, "SingleFragment");
            fragment = facebookDialogFragment;
        } else {
            LoginFragment loginFragment = new LoginFragment();
            loginFragment.setRetainInstance(true);
            supportFragmentManager.beginTransaction().add(R$id.com_facebook_fragment_container, loginFragment, "SingleFragment").commit();
            fragment = loginFragment;
        }
        return fragment;
    }

    public final void l() {
        Intent intent = getIntent();
        d0 d0Var = d0.f15326a;
        p.j(intent, "requestIntent");
        FacebookException facebookExceptionR = d0.r(d0.v(intent));
        Intent intent2 = getIntent();
        p.j(intent2, "intent");
        setResult(0, d0.m(intent2, null, facebookExceptionR));
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        p.k(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.currentFragment;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!t.F()) {
            j0 j0Var = j0.f15387a;
            j0.e0(f15028p, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            p.j(applicationContext, "applicationContext");
            t.M(applicationContext);
        }
        setContentView(R$layout.com_facebook_activity_layout);
        if (p.f(PASS_THROUGH_CANCEL_ACTION, intent.getAction())) {
            l();
        } else {
            this.currentFragment = k();
        }
    }
}
